import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private JButton jbt=new JButton("add");
    private JButton jbtn=new JButton("Exit");
    private JButton jbtu=new JButton("U");
    private JButton jbtd=new JButton("D");
    private JButton jbtl=new JButton("L");
    private JButton jbtr=new JButton("R");
    private JButton jbt2=new JButton("CLONE");
    private Container cp;
    private int count=0;
    private JLabel jlb= new JLabel();
    private ImageIcon icn=new ImageIcon("123.png");
    ArrayList<RoleAshe>asList=new ArrayList<>();
    public MainFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setIcon(icn);
        jlb.setBounds(90,50,icn.getIconWidth(),icn.getIconHeight());
        jbt.setBounds(0,0,80,25);
        jbtn.setBounds(80,0,80,25);
        jbtu.setBounds(160,0,80,25);
        jbtd.setBounds(240,0,80,25);
        jbtl.setBounds(320,0,80,25);
        jbtr.setBounds(400,0,80,25);
        jbt2.setBounds(480,0,80,25);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
            }
        });
        jbtu.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getY() - 5 > 0) {
                    jlb.setLocation(jlb.getX(),jlb.getY()-5);
                }
            }
        });
        jbtd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getY() + 5 < 500) {
                    jlb.setLocation(jlb.getX(), jlb.getY() +5);
                }
            }
        });
        jbtr.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getX() + 5 < 600) {
                    jlb.setLocation(jlb.getX()+5, jlb.getY() );
                }
            }
        });
        jbtl.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getX() - 5 > 0) {
                    jlb.setLocation(jlb.getX()-5, jlb.getY());
                }
            }
        });
        jbt2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asList.add(new RoleAshe());
                cp.add(asList.get(asList.size() - 1));
                cp.repaint();
            }
        });
        cp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3){
                    boolean selectFlag = false;
                    RoleAshe tmpAshe = new RoleAshe();
                    int i = 0;
                    while(i<asList.size()&& selectFlag == false){
                        tmpAshe = asList.get(i);
                        if(tmpAshe.getSelectStatus()==true){
                            selectFlag = true;
                        }
                        i++;
                    }
                    if(selectFlag == true){
                        tmpAshe.setLocation(e.getX(),e.getY());
                        tmpAshe.setselectStatus(false);
                    }
                }
            }
        });
        cp.add(jbt);
        cp.add(jbtn);
        cp.add(jlb);
        cp.add(jbtu);
        cp.add(jbtd);
        cp.add(jbtr);
        cp.add(jbtl);
        cp.add(jbt2);
    }
}
