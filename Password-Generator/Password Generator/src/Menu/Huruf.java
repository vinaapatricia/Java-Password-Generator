package Menu;

public class Huruf {

	public static final String hurufBesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String hurufKecil = "abcdefghijklmnopqrstuvwxyz";
	public static final String angka = "1234567890";
	public static final String simbol = "!@#$%^&*()-_=+\\/~?";

	private final StringBuilder pool;

	public Huruf(boolean includeHurufBesar, boolean includeHurufKecil, boolean includeAngka,
			boolean includeSimbol) {

		pool = new StringBuilder();

		if (includeHurufBesar)
			pool.append(hurufBesar);

		if (includeHurufKecil)
			pool.append(hurufKecil);

		if (includeAngka)
			pool.append(angka);

		if (includeSimbol)
			pool.append(simbol);

	}

	public String getHuruf() {
		return pool.toString();
	}
}
