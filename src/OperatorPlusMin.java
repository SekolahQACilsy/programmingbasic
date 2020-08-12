
public class OperatorPlusMin {
	public static void main(String[] args) {
		int value=8;
		
		System.out.println(value++);//8
		System.out.println(value);//9
		System.out.println(++value);//10
		System.out.println(value);//10
				
		System.out.println("\n" +value--);//10
		System.out.println(value);//9
		System.out.println(--value);//8
		System.out.println(value);//8
	}

}
