   class animal{
        protected String name;
        protected void display(){
            System.out.println("I am an animal," );
        }
    }
    class Dog extends animal{
        public void getinfo(){
            System.out.println("My name is"+name);
        }
    }
    class tiger extends animal{
    public void getinfo(){
        System.out.println("my name is"+name);
    }
    }
    class  inheritance{
        public static void main(String[] args) {
            Dog labrador=new Dog();
            labrador.name="Rocky";
            labrador.display();
            labrador.getinfo();
            tiger tiger=new tiger();
            tiger.name="milky";
            tiger.display();
            tiger.getinfo();
        }
    }
 /* class  Animal{
       public void eat(){
           System.out.println("i can eat");
       }
   }
class Dog extends Animal{
    public void eat() {
        super.eat();
        System.out.println("i eat dog food");
    }
    public void bark() {
        System.out.println("i can bark");
    }

    }
    class  inheritance{
        public static void main(String[] args) {
            Dog labrador=new Dog();
            labrador.eat();
            labrador.bark();

        }
    }*/

