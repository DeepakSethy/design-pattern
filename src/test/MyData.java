package test;

public interface MyData {
	default void print(String str) {
		if(!isNull(str)) {
			System.out.println(""+ str);
		}
	}
	
	static boolean isNull(String str) {
		System.out.println("Interaface null check");
		return str == null ? true : "".equals(str) ? true :false;
	}
}
