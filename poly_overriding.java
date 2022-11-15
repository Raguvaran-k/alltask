class language{
    public  void displayinfo(){
        System.out.println("common english language");
    }
}
class java extends language{
    @Override
    public void displayinfo() {
        System.out.println("java progreamming lauguage");
    }
}
class poly_overriding{
    public static void main(String[] args) {
        java j1=new java();
        j1.displayinfo();
        language l1=new language();
        l1.displayinfo();
    }
}