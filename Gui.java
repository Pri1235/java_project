import javax.swing.*;
//import java.applet.*;
import java.awt.event.*;

public class Gui {
    public static void main(String[] args) {
        JLabel background;

        HuffmanCode h = new HuffmanCode();
        JFrame f = new JFrame("Source Coding");

        JLabel label = new JLabel("Enter a String");
        label.setBounds(115, 70, 150, 30);
        final JTextField tf = new JTextField();
        tf.setBounds(110, 100, 150, 35);
        tf.setBorder(null);

        JButton b = new JButton("Run");
        b.setBounds(135, 150, 100, 35);
        b.setBorder(null);

        JLabel lab = new JLabel("OUTPUT");
        lab.setBounds(150, 100, 300, 300);
        JTextArea i = new JTextArea();
        i.setBounds(40, 270, 500, 95);

        // Container c= f.getContentPane();

        ImageIcon img = new ImageIcon("C:\\Users\\Pranita Gavali\\OneDrive\\Desktop//p7.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(-15, -15, 400, 500);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String val = tf.getText();
                String b = h.createHuffmanTree(val);
                System.out.println(val);
                // h.createHuffmanTree(val);
                i.setText(b);

            }

        });

        f.add(tf);
        f.add(b);
        f.add(i);
        f.add(label);
        f.add(lab);
        f.add(background);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setVisible(true);
        // making the frame visible

        // function calling

    }

}
