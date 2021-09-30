package com.mashreq.ConsumeSoapWebService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		@RequestMapping("/")
		public String displayHome() {
			return "home.jsp";
		}
		
		public static void main(String[] args) {
			String name="Naveen 172745789";
			char ch[]=name.toCharArray();String word="";
			for(int i=name.length()-1;i>=0;i--) {
				word+=ch[i];
				System.out.println(ch[i]);
			}
			System.out.println("Word is"+word 1);
		}
}
