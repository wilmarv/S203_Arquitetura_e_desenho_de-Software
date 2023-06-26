package br.inatel.labs.labads.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.labs.labads.padraosoa.model.entity.MyMessage;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public MyMessage processarGetHello() {
		MyMessage msg = new MyMessage();
		msg.setInfo("Olá, padrão arquitetural SOA");
		return msg;
	}
}
