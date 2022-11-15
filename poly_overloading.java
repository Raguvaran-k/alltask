 class pattern{
    public  void  display(){
       for (int i=0;i<10;i++){
            System.out.print("*");
        }
    }
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}
class poly_overloading{
    public static void main(String[] args) {
        pattern d1=new pattern();
        d1.display();
       System.out.println("\n");
        d1.display('#');
    }
}
