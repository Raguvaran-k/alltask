import java.util.Scanner;

public class bitw_java {
    public static void main(String[] args) {
       // int a;
      //  int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a&b;
        System.out.println("enter the bitwise ANDoperator:"+c);
        int d=a|b;
        System.out.println("enter the bitwise OR operator:"+d);
        int f=a^b;
        System.out.println("enter the bitwiseE EX- operator:"+f);
        int g=a<<1;
        System.out.println("enter the bitwise left operator:"+g);
        int h=a>>2;
        System.out.println("enter the bitwise right operator:"+h);


    }
}
