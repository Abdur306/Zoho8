
import java.util.Scanner;
 public class RectAngle {
	public static void main(String[] args) {
		
		RectangleArea.read_input();
		
	
		}
		public static int display(int l,int b) {
			 System.out.println(l+" "+b);
			int result=l*b;
			System.out.println(result);
		return result;
		}
}
class RectangleArea extends RectAngle{
	
	RectAngle rt=new RectAngle();
	static void read_input() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter l & b");
		int l=s.nextInt();
		int b=s.nextInt();
		//System.out.println(l+" "+b); 
		RectAngle.display(l, b);
	}
}
