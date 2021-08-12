package br.com.alura.escolalura.escolalura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.alura.escolalura.escolalura.models.Aluno;
import br.com.alura.escolalura.escolalura.models.Habilidade;
import br.com.alura.escolalura.escolalura.repositorys.AlunoRepository;

@Controller
public class GeolocalizacaoController {
	
//	@Autowired
//	private AlunoRepository repository;
	
	@GetMapping("/geolocalizacao/iniciarpesquisa")
	public String inicializarPesquisa() {
		return "geolocalizacao/pesquisar";
	}
	
}
