package lambda;

public class StringJoinnerFunctionalInterfaceImpl {

	public static void main(String[] args) {
		StringJoinerFunctionalInterface ref=(String str,String ptr) ->{
			return str+ " " +ptr;
		};
		System.out.println(ref.StringJoiner("Rukmini", "Chebrolu"));
	}

}
