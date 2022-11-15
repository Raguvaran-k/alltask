class constant{
    String variables;


    public void key(){
        System.out.println("keys words");

    }
}
class letter extends constant{
    public void display(){
        System.out.println("the key words are" + variables);
    }
}
public class inharitanc {
    public static void main(String[] args) {
        letter obj=new letter();
        obj.variables="a,e,i,o,u";
        obj.key();
        obj.display();
    }
}
