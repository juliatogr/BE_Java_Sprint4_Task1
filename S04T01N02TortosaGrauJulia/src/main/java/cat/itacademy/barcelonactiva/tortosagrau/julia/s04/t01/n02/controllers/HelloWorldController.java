package cat.itacademy.barcelonactiva.tortosagrau.julia.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value ="/HelloWorld")
	public String saluda(@RequestParam(required = false) String nom) {
		return "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}
	
	@GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable(name = "nom", required = false) String nom) {
		return "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}
}
