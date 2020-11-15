import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Set Collection Test")
public class JunitSetCollectionTest {

	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	// Set Collection 요구사항1
	// Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
	@Test
	public void testCheckSetSize() {
		int size = numbers.size();
		System.out.println("numbers size : " + size);
	}

	// Set Collection 요구사항1
	// Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
	// JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	void contains(int index) {
		assertThat(numbers.contains(index)).isTrue();
	}

}
