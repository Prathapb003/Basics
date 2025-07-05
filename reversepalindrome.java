import java.util.Scanner;
public class reversepalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,a; 
        int b=n;
        while (n>0) {
            a=n%10;
            sum=sum*10+a;
            n=n/10;
    }if(b==sum){
        System.out.println("Palidrome");
    }else
    System.out.println("not palidrome");
    }
        
}
