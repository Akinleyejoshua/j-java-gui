import javax.swing.*;

public class GUI{
    public static void main(String[] arg){
        JFrame f = new JFrame();

        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40);

        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}