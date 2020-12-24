package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import david.augusto.luan.domain.SetUp;

@SpringBootTest
class SpringBootHelloWorldApplicationTests {

	private SetUp setUp;

	@Test
	void containEmployee() {
		setUp = new SetUp();
		assertEquals(3, setUp.getEmployees().size());
	}
}
