package week3.day2;

public class Edge extends Browser {

    public void takeSnap() {
        System.out.println("Snapshot taken in Edge");
    }

    public void clearCookies() {
        System.out.println("Cookies cleared in Edge");
    }

    public static void main(String[] args) {

        Edge e = new Edge();

        e.openURL();        
        e.takeSnap();       
        e.clearCookies();   
        e.navigateBack();   
        e.closeBrowser();   
    }
}
