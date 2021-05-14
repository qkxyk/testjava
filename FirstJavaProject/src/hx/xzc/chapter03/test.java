package hx.xzc.chapter03;

public class test {
	public static void read() throws jackException {
		throw new jackException("出错了");
	}

	public static void main(String[] args) {

		try {
			read();
		} catch (jackException e) {
			System.out.println("设计出错");
		}
	}
}
