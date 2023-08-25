package algorithm.algorithm.effective_java.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) {
		// Car car = Car.INSTANCE;

	}
}

// public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
// 	InvocationTargetException {
// 	Constructor<CarEnum> declaredConstructor = CarEnum.class.getDeclaredConstructor();
// 	declaredConstructor.setAccessible(true);
// 	CarEnum carEnum = declaredConstructor.newInstance();
// }

// Car car = Car.INSTANCE;
// car.move();

// CarStaticFactory car2 = CarStaticFactory.getInstance();
// car2.move();

// CarEnum carEnum = CarEnum.INSTANCE;
// carEnum.move();
