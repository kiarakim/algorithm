package algo.effective_java.item3;

public class CarStaticFactory {


	private static final CarStaticFactory INSTANCE = new CarStaticFactory();
	private CarStaticFactory(){}
	public static CarStaticFactory getInstance(){
		return INSTANCE;
	}

	public void move(){}


	// 싱글턴임을 보장해주는 readResolve 메서드
	private Object readResolve(){
		// 진짜 Car을 반환하고 가짜 Car은 가비지 컬렉터에 맡긴다.
		return INSTANCE;
	}
}
