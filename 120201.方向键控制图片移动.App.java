import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane=new JLabel();
    JLabel label_bgimg=new JLabel();
    int CELL=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CELL,CELL,CELL);
                }if (e.getKeyCode()==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CELL,CELL,CELL);
                }if (e.getKeyCode()==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-CELL,label_plane.getY(),CELL,CELL);
                }if (e.getKeyCode()==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+CELL,label_plane.getY(),CELL,CELL);
                }

            }
        });

    }
    //显示窗体方法
    void go(){
        //飞机图片路径引用
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        //飞机位置、大小
        label_plane.setBounds(200,200,CELL,CELL);
        myPanel.add(label_plane);
        //背景图片路径引用
        java.net.URL bgimgURL = App.class.getResource("img/background.png");
        label_bgimg.setIcon(new ImageIcon(bgimgURL));
        //背景位置、大小
        label_bgimg.setBounds(0,0,512,720);
        myPanel.add(label_bgimg);

        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("模拟开飞机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
