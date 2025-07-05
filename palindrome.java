import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,a; 
        while (n>0) {
            a=n%10;
            sum=sum*10+a;
            n=n/10;
        }System.out.println(sum);
    }

}
