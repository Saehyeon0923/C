package project;
import java.util.Scanner ;
public class work5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		int a = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println("10진수:"+ ~a);
		System.out.println("2진수:"+Integer.toBinaryString(~a));
		
		
		
	}
}
