package tech.project.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import tech.project.api.entity.Tasks;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTaskSucess() {
		var tasks = new Tasks( "todo1", "desctodo1",false, 2 );

		webTestClient
				.post()
				.uri("/tasks")
				.bodyValue(tasks)
				.exchange()
				.expectStatus().isOk();
	}


}
