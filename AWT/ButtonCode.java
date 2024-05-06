package AWT;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ButtonCode {


    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        frame.setSize(300, 200);
        frame.setLayout(null);
        button.setBounds(100, 80, 100, 40); // (x, y, width, height)
        frame.add(button);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        frame.setVisible(true);
    }
    
}




