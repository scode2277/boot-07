package it.corso.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import it.corso.model.Utente;
import jakarta.validation.Valid;

// localhost:8080
@Controller
@RequestMapping("/")
public class IndexController
{
	@GetMapping
	public String getPage(Model model)
	{
		Utente utente = new Utente();
//		utente.setNome("Laura");
//		utente.setEta(45);
//		utente.setUsername("abc");
//		utente.setPassword("def");
		
		model.addAttribute("utente", utente);
		return "index";
	}
	
	@PostMapping
	public String formManager(@Valid @ModelAttribute("utente") Utente utente)
	{
		System.out.println(utente.getUsername());
		return "redirect:/";
	}
}