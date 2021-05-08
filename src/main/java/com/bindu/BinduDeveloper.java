package com.bindu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinduDeveloper {
	@RequestMapping("languages")

	public List<Languages> getLanguages(){
		
	
		
		List<Languages> languages = new ArrayList<>();
		
		Languages L1 = new Languages();
		L1.setLId(1);
		L1.setLname("JAVA");
		L1.setLexp(8);
		
		Languages L2 = new Languages();
		L2.setLId(2);
		L2.setLname("SQL");
		L2.setLexp(12);
		
		Languages L3 = new Languages();
		L3.setLId(3);
		L3.setLname("PYTHON");
		L3.setLexp(8);
		
		Languages L4 = new Languages();
		L4.setLId(4);
		L4.setLname("C");
		L4.setLexp(2);
		
		languages.add(L1);
		languages.add(L2);
		languages.add(L3);
		languages.add(L4);
		
		System.out.println("Responding to request");

		return languages;
		
	}
}
