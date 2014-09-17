package com.securecodetips.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectingController {
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public  void redirectUrl(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		String url="";
		 url=request.getParameter("url");
		 ArrayList<String> list = new ArrayList<String>() {{
			    add("https://en.wikipedia.org/wiki/Grammar");
			    add("https://en.wikipedia.org/wiki/Physics");
			    add("https://en.wikipedia.org/wiki/Mathematics");
			    add("https://en.wikipedia.org/wiki/Literature");
			}};
		 try {
			//if(list.contains(url))
			response.sendRedirect(url);
			// else
			//response.sendRedirect("showFaculty.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 

}
}
