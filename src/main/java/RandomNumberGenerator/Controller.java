package RandomNumberGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@RestController
public class Controller {

// 	@RequestMapping("/gjenero")
// 	public int index() {
// //		String style = "\"color:white;font-size:10rem;position: absolute; top: 30%;left: 50%;-moz-transform: translateX(-50%) translateY(-50%);-webkit-transform: translateX(-50%) translateY(-50%);transform: translateX(-50%) translateY(-50%);\"";
// //		return "<!doctypehtml><html><head><title>RandomNumber</title></head><body style=\"background:black\"><h1 style="
// //				+ style + ">" + new Random().nextInt(1000001) + "</h1></body></html>";

// 		return new Random().nextInt(1000001);
// 	}
@GetMapping("/generate")
public ResponseEntity<Integer> generateRandomNumber() {
    int randomNumber = ThreadLocalRandom.current().nextInt(3000, 444101);
    return ResponseEntity.ok(randomNumber);
}
}
