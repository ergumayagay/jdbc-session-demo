package org.tap.sessiondemo;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private HttpSession session;
	
	
	@PostMapping(value = "/send")
	public void sendMessage(@RequestParam String message) {
		session.setAttribute("message", message);
	}

	
	@GetMapping(value = "/read")
	public String readMessage() {
		return (String) session.getAttribute("message");
	}


}
