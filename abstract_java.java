abstract  class motorbike{
    abstract void brake();
}
class  sportsbike extends motorbike{
    public void brake(){
        System.out.println("sportsbike brake");
    }
}
class  mountainbike extends motorbike{
    public void  brake(){
        System.out.println("mountainbike brake");
    }
}
 class abstract_java{
    public static void main(String[] args) {
        mountainbike m1=new mountainbike();
        m1.brake();
        sportsbike s1=new sportsbike();
        s1.brake();
    }
}
