import javax.swing.*;
import java.awt.*;



public class TestScreen extends JFrame{
    public static Graphics g2d = new Graphics2D();

    public static void main(String[] args){
        Graphics2D g2d;


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BasicEx ex = new BasicEx();
                ex.setVisible(true);
            }
        });

    }

}


class BasicEx extends JFrame {

    private int[] data;

    public BasicEx() {
        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}