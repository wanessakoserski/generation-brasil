let nome = document.querySelector('#nome');
let email = document.querySelector('#email');
let parte = document.querySelector('#parte');
let sugestao = document.querySelector('#sugestao');
//let enviar = document.querySelector('#enviar');

let nomeOk = false;
let emailOk = false;
let textoOk = false;

function validarNome() {
    let caixa = document.querySelector('#nome-mensagem');
    if(nome.value.length <= 2) {
       caixa.innerHTML = 'Nome inválido';
       caixa.style.color = 'red';
    } else {
        nomeOk = true;
        caixa.innerHTML = '';
    }
}

function validarEmail() {
    let caixa = document.querySelector('#email-mensagem');
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        caixa.innerHTML = 'Email inválido';
        caixa.style.color = 'red';
    } else {
        emailOk = true;
        caixa.innerHTML = '';
    }
}

function validarTexto() {
    let caixa = document.querySelector('#assunto-mensagem');
    if(parte.value.length < 3 || sugestao.value.length < 3) {
        caixa.innerHTML = 'Por favor, insira sua sugestão';
    } /*else if(parte.value.length > 150) {
        caixa.innerHTML = 'Texto inserido é muito grande';
    } */ else {
        textoOk = true;
        caixa.innerHTML = '';
    }
}

function enviar() {
    if(nomeOk && emailOk && textoOk) {
        alert('Formulário enviado com sucesso');
    } else {
        alert('Preencha, antes de enviar');
    }
}