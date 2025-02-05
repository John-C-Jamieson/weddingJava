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

		System.out.println("DB_URL: " + System.getProperty("DB_URL"));
		System.out.println("DB_USERNAME: " + System.getProperty("DB_USERNAME"));
		System.out.println("DB_PASSWORD: " + System.getProperty("DB_PASSWORD"));

		SpringApplication.run(WeddingJavaApplication.class, args);
	}
}
