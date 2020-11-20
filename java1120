import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel myPanel=new JPanel();
    private JLabel label_Mouse=new JLabel();
     JLabel label_Background=new JLabel();
     JLabel label_graed=new JLabel();
     int i=0;

    public App() {
        label_Mouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_Mouse.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),57,53);
                i++;
                label_graed.setText("You Score:"+String.valueOf(i));
            }
        });
    }

    void go(){
        myPanel.setLayout(null);
        java.net.URL imgURL1=App.class.getResource("Moze.gif");
        label_Mouse.setIcon(new ImageIcon(imgURL1));
        java.net.URL imgURL2=App.class.getResource("Background.jpg");
        label_Background.setIcon(new ImageIcon(imgURL2));
        label_Mouse.setBounds(100,100,57,53);
        label_Background.setBounds(0,0,1024,720);
        label_graed.setBounds(100,-20,200,100);
        label_graed.setBounds(0,0,500,100);
        label_graed.setFont(new Font("Arial",Font.BOLD,40));
        label_graed.setForeground(Color.yellow);
        myPanel.add(label_graed);
        myPanel.add(label_Mouse);
        myPanel.add(label_Background);
        JFrame frame = new JFrame("大满贯打地鼠 V1.0");
        frame.setBounds(100,100,1024,720);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
