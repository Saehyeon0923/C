package project;
import java.util.* ;
public class work4 {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
       
        int a,b,c,d ;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
       
        c = c+d ;
        b = b+(c/60);
        c = c%60 ;
        a = a+(b/60);
        b = b%60;
        a = a%24;
        
        System.out.println(a + " " + b + " " + c);
 
    }
 
}
 