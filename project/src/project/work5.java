package project;
import java.util.Scanner ;
public class work5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int a = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println("10����:"+ ~a);
		System.out.println("2����:"+Integer.toBinaryString(~a));
		
		
		
	}
}
