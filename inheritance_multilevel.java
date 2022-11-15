class Animal1{
    public void  eat(){
        System.out.println("i can eat");
}
}
class  Dog1 extends Animal1{
    public void eat() {
        super.eat();
        System.out.println("i eat dog food");
    }
    public void  bark(){
        System.out.println("i can bark");
    }
}
class cat extends Animal1{
    public void eat() {
        super.eat();
        System.out.println("i eat cat food");
    }
    public void  bark() {
        System.out.println("i can bark");
    }

    }
    class inheritance_multilevel{
        public static void main(String[] args) {
            Dog1 labrador=new Dog1();
            labrador.eat();
            labrador.bark();
            cat arabic=new cat();
            arabic.eat();
            arabic.bark();
        }

    }
