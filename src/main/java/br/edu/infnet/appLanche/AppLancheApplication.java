package br.edu.infnet.appLanche;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLancheApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppLancheApplication.class, args);
		
		System.out.println(Arrays.toString(args));
	}

}
