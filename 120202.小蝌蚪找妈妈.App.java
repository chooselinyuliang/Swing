import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_son = new JLabel();
    JLabel jLabel_mom = new JLabel();
    JLabel jLabel_bag = new JLabel();
    int son = 64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == e.VK_UP){
                    label_son.setBounds(label_son.getX(),label_son.getY()-son,son,son);
                }
                if(e.getKeyCode() == e.VK_DOWN){
                    label_son.setBounds(label_son.getX(),label_son.getY()+son,son,son);
                }
                if(e.getKeyCode() == e.VK_LEFT){
                    label_son.setBounds(label_son.getX()-son,label_son.getY(),son,son);
                }
                if(e.getKeyCode() == e.VK_RIGHT){
                    label_son.setBounds(label_son.getX()+son,label_son.getY(),son,son);
                }
                if(label_son.getX()==768 && label_son.getY()==320){
                    JOptionPane.showMessageDialog(null,"恭喜小蝌蚪成功找到妈妈！");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        java.net.URL imgURLmom = App.class.getResource("img/mother.png");
        jLabel_mom.setIcon(new ImageIcon(imgURLmom));
        jLabel_mom.setBounds(768,320,64,64);
        java.net.URL imgURLson = App.class.getResource("img/son.png");
        label_son.setIcon(new ImageIcon(imgURLson));
        label_son.setBounds(320,320,64,64);
        java.net.URL imgURLbg = App.class.getResource("img/background.png");
        jLabel_bag.setIcon(new ImageIcon(imgURLbg));
        jLabel_bag.setBounds(0,0,1024,786);
        myPanel.setFocusable(true);
        myPanel.add(label_txt);
        myPanel.add(label_son);
        myPanel.add(jLabel_mom);
        myPanel.add(jLabel_bag);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,786);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
