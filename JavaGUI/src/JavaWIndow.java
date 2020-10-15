import javax.swing.JFrame;
 
public class JavaWIndow {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     
        MyWindow window = new MyWindow("Character Creator");
 
        // Set the program to close when the window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}