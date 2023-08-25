package algorithm.algorithm.java_standard.functionalInterface;

import java.util.function.Supplier;

public class SupplierUse {
	public static void main(String[] args) {
		Supplier<Integer> supplierI = () -> 10;

		System.out.println(supplierI.get());

		Supplier<String> supplierS = () -> "Hello Supplier";

		System.out.println(supplierS.get());
	}
}
