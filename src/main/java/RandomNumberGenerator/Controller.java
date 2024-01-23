// package RandomNumberGenerator;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import java.util.concurrent.ThreadLocalRandom;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
// import org.springframework.boot.SpringApplication;

// @RestController
// public class Controller {


// @GetMapping("/generate")
// public ResponseEntity<Integer> generateRandomNumber() {
//     int randomNumber = ThreadLocalRandom.current().nextInt(3000, 444101);
//     return ResponseEntity.ok(randomNumber);
// }
// }

package RandomNumberGenerator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@RestController
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    static {
        try {
            // Set up file handler for logging (append mode)
            FileHandler fileHandler = new FileHandler("randomNumberGenerator.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/generate")
    public ResponseEntity<Integer> generateRandomNumber() {
        int randomNumber = ThreadLocalRandom.current().nextInt(3000, 444101);

        // Log the generated random number
        logger.info("Generated random number: " + randomNumber);

        return ResponseEntity.ok(randomNumber);
    }
}

