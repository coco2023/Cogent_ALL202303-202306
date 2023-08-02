package com.cogent.Batch65_SpringBootV04.Repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:/application.properties")
public class MyRepo {
	@Value("100")
	int info;    //to Assing Value to Varable...
	
    @Value("${db.port}")  //New
    private String portno;
    
    @Value("${server.port}")  //New
    private String apacheserver_port;

    
    public String disp() {
		System.out.println("port number read is "+portno);
		System.out.println("apacheserver_port number read is "+apacheserver_port);
		System.out.println("new apacheserver_port number read is "+apacheserver_port);
		return "this is " + apacheserver_port;
	}

	

}
