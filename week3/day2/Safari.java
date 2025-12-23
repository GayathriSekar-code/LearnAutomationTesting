package week3.day2;

public class Safari extends Browser {

    public void readerMode() {
        System.out.println("Reader mode enabled");
    }

    public void fullScreenMode() {
        System.out.println("Full screen mode enabled in Safari");
    }

    public static void main(String[] args) {

        Safari s = new Safari();

        s.openURL();          
        s.readerMode();      
        s.fullScreenMode();   
        s.navigateBack();     
        s.closeBrowser();     
    }
}
