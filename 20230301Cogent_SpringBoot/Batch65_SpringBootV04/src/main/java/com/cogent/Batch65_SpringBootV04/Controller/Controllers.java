package com.cogent.Batch65_SpringBootV04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cogent.Batch65_SpringBootV04.Repository.MyRepo;
import com.cogent.Batch65_SpringBootV04.Service.MyServiceClass;

@Controller 
@RequestMapping("/api/home") // base url or root api endpoint
public class Controllers {
	
	@Autowired
	MyServiceClass serviceClass;
	@Autowired
	MyRepo myRepo;
	
	 @GetMapping("/hello" )
	    @ResponseBody
	    public String hello()
	    {
	    	
	    	int res=serviceClass.factorial(8);
	        return "Hello All ,Exporing Stereotype Annotations "+ res;
	    }
	 
	 @GetMapping("/repo" )
	 @ResponseBody
	 public String myRepo()
    {
    	
    	String res = myRepo.disp();
		System.out.println("Success!");
		return "this is repo " + res;
    }

	 
	 @RequestMapping(value = "info", method = RequestMethod.GET)
	 @ResponseBody
	 public String getPath() {
		 return "success Get info of http method";
	 }


}
