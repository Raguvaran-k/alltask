public class fruits {
    public  int legcount;
    public  void  display(){
        System.out.println("I am an fruits,");
        System.out.println("I have"+legcount +"legs,");
    }

}
class Main{
    public static void main(String[] args) {
        fruits a=new fruits();
        a.legcount=5;
        a.display();
    }
}
