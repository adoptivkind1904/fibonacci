package nils.rest.fibonacci;

//import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.net.URL;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nils.rest.fibonacci.HelloController;

/**import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
*/
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

/**		@LocalServerPort
	@Value("${local.server.port}")
	private int port;

private URL base;

	@Autowired
	private TestRestTemplate template;

    @BeforeEach
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }
    */
    
    @Test
    public void fibonacciTest() {
    	assertEquals(0, HelloController.calcFibonacci(0));
    	assertEquals(1, HelloController.calcFibonacci(1));
    	assertEquals(1, HelloController.calcFibonacci(2));
    	assertEquals(2, HelloController.calcFibonacci(3));
    	assertEquals(3, HelloController.calcFibonacci(4));
    	assertEquals(5, HelloController.calcFibonacci(5));
    	assertEquals(8, HelloController.calcFibonacci(6));
    	assertEquals(13, HelloController.calcFibonacci(7));
    	assertEquals(21, HelloController.calcFibonacci(8));
    	assertEquals(34, HelloController.calcFibonacci(9));
    	assertEquals(55, HelloController.calcFibonacci(10));
    	assertEquals(89, HelloController.calcFibonacci(11));
    	assertEquals(144, HelloController.calcFibonacci(12));
    	assertEquals(233, HelloController.calcFibonacci(13));
    	assertEquals(377, HelloController.calcFibonacci(14));
    }
}
