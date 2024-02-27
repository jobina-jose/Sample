class myexception extends Exception{
	String s1;
	myexception(String s2){
		s1=s2;
	}
	public String toString() {
		return ("output String="+s1);
	}
}
public class Newclass {

	public static void main(String[] args) {
		try {
			throw new myexception("custom message");
		}
		catch(myexception e) {
			System.out.println(e);
		}

	}

}
