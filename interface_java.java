interface book{
    void  ride();
}
class tamil implements book{
    public void ride(){
        System.out.println("you are riding a tamil");
    }
}
class  english implements book{
    public void ride() {
        System.out.println("you are watching a riding");
    }
}
class  teacher{
    public void checking(book b){
        System.out.println("checking");
        b.ride();
    }
}
public class interface_java {
    public static void main(String[] args) {
        teacher m= new teacher();
         tamil t=new tamil();
        english e=new english();
        m.checking(t);
        m.checking(e);
    }
}
