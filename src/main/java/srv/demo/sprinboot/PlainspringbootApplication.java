package srv.demo.sprinboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlainspringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(PlainspringbootApplication.class, args);
		welcome();
	}
	public static String welcome(){
		System.out.println("Inside Welcome Method");
		return "Hello User";
	}
}
