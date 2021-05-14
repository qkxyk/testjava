package hx.xzc.chapter03;
public class jackException extends Exception {
	/**
	 * @param message
	 */
	public jackException(String message) {
		System.out.println(message);
		//super(message);
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("异常类测试");
	}
}
