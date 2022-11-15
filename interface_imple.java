interface animal3{
    void name();
}
interface  flower{
    void name1();
}
class butterfly implements animal3,flower{

    public void name() {
        System.out.println(" ");
    }


    public void name1() {
        System.out.println(" ");
    }
}
public class interface_imple {
    public static void main(String[] args) {
        butterfly b1=new butterfly();
        butterfly b2=new butterfly();
                b1.name();
               b2.name1();
    }
}
