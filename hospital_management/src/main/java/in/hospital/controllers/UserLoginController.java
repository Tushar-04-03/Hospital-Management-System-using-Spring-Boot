package in.hospital.controllers;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.hospital.entities.UserLogin;
import in.hospital.services.UserLoginService;

@RestController
@RequestMapping("/api/user_login")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@PostMapping("/signup")
	public String createUserAccount(@RequestBody UserLogin userLogin) {
		return userLoginService.signup(userLogin);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody UserLogin userLogin) {
		return userLoginService.login(userLogin.getEmail(),userLogin.getPassword());
	}
	
}
    


