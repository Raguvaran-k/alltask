
 class  polygon{
    public void render(){
        System.out.println("rentering polygon..");
    }
 }
 class square extends polygon{

     public void render() {
         System.out.println("rendering square..");
     }
 }
 class circle extends polygon{
     public void render() {
         System.out.println("rendering circle..");
     }
     }

class polymorphism{
    public static void main(String[] args) {
        square s1=new square();
        s1.render();
        circle c1=new circle();
        c1.render();
    }
}
