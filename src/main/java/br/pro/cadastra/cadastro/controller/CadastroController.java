package br.pro.cadastra.cadastro.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Ola Mundo";
	}
}
