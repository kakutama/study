package q01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question_01Test {

	@Test
	void test() {
		Question_01 q = new Question_01();
		assertEquals(5, q.getCnt(5));
	}

	@Test
	void test2() {
		String bin = "1111110";
		// 2進数から10進数
		int dec = Integer.parseInt(bin,2);


	}

}
