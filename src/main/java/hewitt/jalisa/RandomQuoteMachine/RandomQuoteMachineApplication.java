package hewitt.jalisa.RandomQuoteMachine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomQuoteMachineApplication {
	private static final Logger logger = LogManager.getLogger(RandomQuoteMachineApplication.class);


	public static void main(String[] args) {
		logger.info("::::::::::Start of Main Method::::::::::::");
		SpringApplication.run(RandomQuoteMachineApplication.class, args);
		logger.info("::::::::::End of Main Method::::::::::::");

	}
}
