import javax.swing.*;
import java.awt.*;

/**
 * Created by Nodyke on 21.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("First");
        Canvas c=new Canvas();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
