import java.util.Scanner;

public class mark_java {

    public static void main(String[] args) {
       System.out.println("welcome to total calculation of 5 subject");
        Scanner sc=new Scanner(System.in);
        int tamil=23;
        int english=34;
        int match=56;
        int soc=89;
        int sci=56;
         int total=tamil+english+match+sci+soc;
         float percentage=total/5f;
         if (percentage<=50) {
             System.out.println("pass");
         }
         else if (percentage>=51) {
            System.out.println("fail");
         }
         else if (tamil<50) {
             System.out.println("pass");
         }
         else if (english<=50) {
             System.out.println("fail ");
         }
         else if (match<50) {
             System.out.println(" ");
         }
         else if (soc<35) {
             System.out.println("soc");
         }
         else if (sci<5) {
             System.out.println("sci");


         }

         }


    }

