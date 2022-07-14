package com.generation.personalblog.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.personalblog.model.Usuario;
import com.generation.personalblog.model.UsuarioLogin;
import com.generation.personalblog.repository.UsuarioRepository;

@Service
public class UserService {

	@Autowired
	private UsuarioRepository repository;
	
	public Optional<Usuario> RegisterUser(Usuario usuario) {
		if (repository.findByEmail(usuario.getEmail()).isPresent())
			return Optional.empty();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String passwordEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(passwordEncoder);
		
		return Optional.of(repository.save(usuario));
	}
	
	public Optional<UsuarioLogin> Login(Optional<UsuarioLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByEmail(user.get().getEmail());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				String auth = user.get().getEmail() + ":" + user.get().getSenha();
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodeAuth);
				
				user.get().setToken(authHeader);
				user.get().setEmail(usuario.get().getEmail());
				
				return user;
			}
		}
		
		return null;
	}
	
	/**
	 *  Atualizar Usuário
	 * 
	 *  Checa se o usuário já existe no Banco de Dados através do método findById, 
	 *  porquê não é possíve atualizar 1 usuário inexistente. 
	 *  Se não existir retorna um Optional vazio.
	 *  
	 *  isPresent() -> Se um valor estiver presente retorna true, caso contrário
	 *  retorna false.
	 * 
	 */
	public Optional<Usuario> atualizarUsuario(Usuario usuario) {
		
		if(repository.findById(usuario.getId()).isPresent()) {
			
			/**
			 * Cria um Objeto Optional com o resultado do método findById
			 */
			Optional<Usuario> buscaUsuario = repository.findByEmail(usuario.getEmail());
			
			/**
			 * Se o Usuário existir no Banco de dados e o Id do Usuário encontrado no Banco for 
			 * diferente do usuário do Id do Usuário enviado na requisição, a Atualização dos 
			 * dados do Usuário não pode ser realizada.
			 */
			if ( (buscaUsuario.isPresent()) && ( buscaUsuario.get().getId() != usuario.getId()))
				throw new ResponseStatusException(
						HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

			/**
		 	* Se o Usuário existir no Banco de Dados e o Id for o mesmo, a senha será criptografada
		 	* através do Método criptografarSenha.
		 	*/
			usuario.setSenha(criptografarSenha(usuario.getSenha()));

			/**
		 	* Assim como na Expressão Lambda, o resultado do método save será retornado dentro
		 	* de um Optional, com o Usuario persistido no Banco de Dados ou um Optional vazio,
			* caso aconteça algum erro.
			* 
			* ofNullable​ -> Se um valor estiver presente, retorna um Optional com o valor, 
			* caso contrário, retorna um Optional vazio.
		 	*/
			return Optional.ofNullable(repository.save(usuario));
			
		}
		
		/**
		 * empty -> Retorna uma instância de Optional vazia, caso o usuário não seja encontrado.
		 */
		return Optional.empty();
	
	}
	
	/**
	*  Método Criptografar Senhas.
	*   
	*  Instancia um objeto da Classe BCryptPasswordEncoder para criptografar
	*  a senha do usuário.
	*
	*  O método encode retorna a senha criptografada no formato BCrypt. Para mais detalhes,
	*  consulte a documentação do BCryptPasswordEncoder.
	* 
	*/
	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(senha);

	}
}