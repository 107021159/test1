import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jbl = new JLabel(" ");
    private JButton jb1 = new JButton("add");
    private JButton jb2 = new JButton("sub");
    private Container cp;
    private int count = 0;

    public MainFrame() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.setLayout(null);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbl.setBounds(180,40,80,25);
        jb1.setBounds(100, 70, 80, 25);
        jb2.setBounds(200, 70, 80, 25);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.jbl.setText(Integer.toString(count));
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                MainFrame.this.jbl.setText(Integer.toString(count));
            }
        });
        cp.add(jbl);
        cp.add(jb1);
        cp.add(jb2);
    }
}

