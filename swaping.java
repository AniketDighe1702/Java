package Demo;

public class intro {

	public static void main(String[] args) {
		int x = 5;
        int y = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);

       
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}

}
