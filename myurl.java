import javax.print.DocFlavor;
import java.net.*;
public class myurl {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=prime+number+program+in+java&rlz=1C1CHBF_enIN1004IN1004&oq=&aqs=chrome.0.35i39i362l8.2352896079j0j7&sourceid=chrome&ie=UTF-8");
            System.out.println("protocol:" + url.getProtocol());
            System.out.println("Host name:" + url.getHost());
            System.out.println("port number:" + url.getPort());
            System.out.println("file name:" + url.getFile());
        } catch (Exception e) {


            System.out.println(e);
        }
    }
}




