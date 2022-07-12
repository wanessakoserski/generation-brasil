package com.generation.gameconsult.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generation.gameconsult.model.User;
import com.generation.gameconsult.model.UserLogIn;
import com.generation.gameconsult.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	// encriptar e salvar senha
	public User RegisterUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String passwordEncoder = encoder.encode(user.getPassword());
		user.setPassword(passwordEncoder);
		
		return repository.save(user);
	}
	
	public Optional<UserLogIn> Login(Optional<UserLogIn> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<User> User = repository.findByEmail(user.get().getEmail());
		
		if(User.isPresent()) {
			if(encoder.matches(user.get().getPassword(), User.get().getPassword())) {
				String auth = user.get().getEmail() + ":" + user.get().getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setUsername(User.get().getUsername());
				
				return user;
			}
		}
		
		return null;
	}
	
}
