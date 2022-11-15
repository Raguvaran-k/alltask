public class expection_java {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
       // int c=0;
        try {
            int arr []=null;
           System.out.println(arr[1]);
         // int c = a / b;
        //  System.out.println("try block");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occuard");
        }catch (NullPointerException e){
            System.out.println("null point error occuard");
        }catch (Exception e){
            System.out.println("error occuard");
        }

          //  System.out.println(c);
        System.out.println("End of program");
        }
    }


