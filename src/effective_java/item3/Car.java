package effective_java.item3;

import java.io.Serializable;

public class Car implements Serializable {
	public final transient Car INSTANCE = new Car();

	private Car() {
	}

	private Object readResolve() {
		return INSTANCE;
	}
}

// public void move() {
//
// }
