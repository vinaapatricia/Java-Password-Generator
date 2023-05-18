package Test;

import static org.junit.jupiter.api.Assertions.assertEquals; //buat periksa dua objek. dari JUnit

import Menu.Generator;
import Menu.Huruf;
import Menu.passwordStrength;

class GeneratorTest {

	private final passwordStrength password = new passwordStrength("Rahasiaaaa");
	private final Huruf firstHuruf = new Huruf(true, false, false, false);
	private final Huruf secondHuruf = new Huruf(false, true, true, true);
	private final Generator generator = new Generator(true, false, false, false);

	void test1() {
		assertEquals("Rahasiaaaa", password.toString());
	}

	void test2() {
		assertEquals(firstHuruf.getHuruf(), Huruf.hurufBesar);
	}

	void test3() {
		assertEquals(secondHuruf.getHuruf(), Huruf.hurufKecil + Huruf.angka + Huruf.simbol);
	}

	void test4() {
		assertEquals(generator.Huruf.getHuruf(), Huruf.hurufBesar);
	}

	void test5() {
		assertEquals(generator.Huruf.getHuruf().length(), 26);
	}

}
