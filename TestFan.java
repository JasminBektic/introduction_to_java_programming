
public class TestFan {

	public static void main(String[] args) {
		
		Fan myFan1 = new Fan(4, 10, "yellow", true);
		System.out.println(myFan1.toString());
		Fan myFan2 = new Fan(2, 5, "blue", false);
		System.out.println(myFan2.toString());
	}
}
