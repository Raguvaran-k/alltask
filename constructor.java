public class constructor {
    private String name;
    private String fathername;
    private String mothername;
    private long mobilenumber;
    private String email;

  //  public constructor() {

  //  }

    public constructor(String name, String fathername, String mothername, long mobilenumber, String email) {
        this.name = name;
        this.fathername = fathername;
        this.mothername = mothername;
        this.mobilenumber = mobilenumber;
        this.email = email;
    }

    public static void main(String[] args) {
        constructor pr = new constructor("ragu", "kri", "malar", 9585252723l, "ragu8214@gmail.com");
//System.out.println(pr);

    }
}
