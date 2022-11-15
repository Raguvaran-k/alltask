import java.util.Scanner;

public class odd_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the odd number range:");
        int n=sc.nextInt();
        //int n=10;
        System.out.println("odd"+"      "+"even");
        for (int i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.println(i);
            }

                else{
                    System.out.print(i+"  ");
                }



        }
    }
}