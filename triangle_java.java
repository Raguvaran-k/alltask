public class triangle_java {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >=i; j--) {
             //   for (j = 5; j >= 1; j--) {
                    System.out.print(i+" ");
                }
                System.out.println();

            }

        }
    }


