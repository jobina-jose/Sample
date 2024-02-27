class invalidproduct extends Exception{
public invalidproduct(String s) {
	super(s);
}
}
public class Example1 {
void productCheck(int waight) throws invalidproduct{
	if(waight<100) {
		throw new invalidproduct("product invalid");
	}
}
	public static void main(String[] args) {
		Example1 obj=new Example1();
		try {
			obj.productCheck(60);
		}
		catch(invalidproduct ex) {
			System.out.println("caught the exception");
			System.out.println(ex.getMessage());
		}

	}

}
