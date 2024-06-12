package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.first.Entity.Player;
import com.example.first.Repositories.Repository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	
	Repository pdetails = context.getBean(Repository.class);
	
	Player p1 = new Player();
	p1.setPlayerId(1);
	p1.setPlayerName("Rohit");
	p1.setTeamname("Mumbai");
	
	pdetails.save(p1);
	System.out.println("inserted success");
	}

}
