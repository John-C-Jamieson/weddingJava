package ca.johnjamieson.weddingjava;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeddingJavaApplication
{
	public static void main(String[] args)
	{
		// Load the .env file
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

		// Set each .env variable as a system property
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(WeddingJavaApplication.class, args);
	}
}
