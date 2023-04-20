package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroContatosController {

	@RequestMapping(value = "/admin/cadastro-contatos")
	public ModelAndView cadastroContatos() {
		// WEB-INF/views/admin/cadastro-contatos.jsp
		ModelAndView modelAndView = new ModelAndView("admin/cadastro-contatos");
		return modelAndView;
	}

}
