package com.securecodetips.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HashPasswordTest {
	
	@RequestMapping(value="/hashtest", method=RequestMethod.GET)
	public @ResponseBody  String testBCryptHash(HttpServletRequest request, HttpSession session){
        String password=request.getParameter("pass");
        
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     	String hashedPassword = passwordEncoder.encode(password);
     	
     	Md5PasswordEncoder passwordEncoderm = new Md5PasswordEncoder();
		String hashedPasswordm = passwordEncoderm.encodePassword(password, null);
		
		return "The value encoded with BCrypt is: "+hashedPassword+"</br>The value encoded with MD5 is: "+hashedPasswordm ;
}
	
}