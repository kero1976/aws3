package domain.entities;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserEntityTest {

	@Test
	public void test正常系() {
		UserEntity entity = new UserEntity("山田太郎", 20);
		assertThat(entity.getAge()).isEqualTo(20);
		assertThat(entity.getName()).isEqualTo("山田太郎");
	}
}
