import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jbl = new JLabel("成績");
    private JButton jbt = new JButton("評定");
    private JButton jbtn = new JButton("Exit");
    private TextField tf = new TextField();
    private JLabel jbl1 = new JLabel(" ");
    private  Container cp;
    private int count = 0;

    public MainFrame(){
        init(); }

        private void init(){
            cp = this.getContentPane();
            cp.setLayout(null);
            this.setSize(600, 500);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jbt.setBounds(250,250,80,20);
            jbtn.setBounds(400,250,80,20);
            jbl.setBounds(250,200,80,20);
            tf.setBounds(350,200,80,20);
            jbl1.setBounds(430,200,80,20);
            jbt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int v1 = Math.round(Float.parseFloat(tf.getText()));
                    if(90<=v1 && v1>=100){
                        jbl1.setText("A");
                    }else{
                        if(80<=v1 && v1>=89){
                            jbl1.setText("B");
                        }else {
                            if(70<=v1 && v1>=79){
                                jbl1.setText("C");
                            }else{
                                if(60<=v1 && v1>=69){
                                    jbl1.setText("D");
                                }else{
                                    jbl1.setText("E");
                                }
                                jbtn.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.exit(0);
                                    }
                                });
                            }

                            }
                        }
                    }

            });
            cp.add(jbl);
            cp.add(jbt);
            cp.add(jbtn);
            cp.add(tf);
            cp.add(jbl1);
    }
}
