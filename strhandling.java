import javax.xml.crypto.Data;

/*class car {
        private String name;

        public String getName() {

            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

 public class strhandling {
        public static void main(String[] args) {
           car N = new car();
            N.setName("bmw");
            System.out.println(N.getName());

        }
    }*/

class car{
    private String name;
    private int yearmodel;
    private String brand;
    private int pricemodel;
    private int numbermodel;

      //public car(String b, int year, int price, int number) {
        //yearmodel = year;
        //brand = b;
        //pricemodel = price;
       //  numbermodel = number;
     // }

      public int getYearmodel() {
          return yearmodel;
      }

      public int getPricemodel() {
          return pricemodel;
      }

      public int getNumbermodel() {
          return numbermodel;
      }

      public String getBrand() {
          return brand;
      }

      public void setYearmodel(int yearmodel) {
          this.yearmodel = yearmodel;
      }

      public void setPricemodel(int pricemodel) {
          this.pricemodel = pricemodel;
      }

      public void setNumbermodel(int numbermodel) {
          this.numbermodel = numbermodel;
      }

      public void setBrand(String brand) {
          this.brand = brand;
      }
  }
  public class strhandling {
      public static void main(String[] args) {
          //car c=new car("bmw",2018,342673,564);
car c=new car();
c.setYearmodel(2014);
         System.out.println(c.getYearmodel());
car s=new car();
s.setBrand("bmw");
         System.out.println(s.getBrand());
          car d=new car();
         d.setNumbermodel(342);
          System.out.println(d.getNumbermodel());
          car n=new car();
          n.setPricemodel(856744);
         System.out.println(n.getPricemodel());
      }
}


