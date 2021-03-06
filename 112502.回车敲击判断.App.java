import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(textArea_A.getText().equals("麻花腾")){
                        textArea_B.setText("回答正确");
                    }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        textArea_B.setText("");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setText("猜猜谁是最丑的人？提示：麻花腾");
        textArea_A.setBounds(100,100,256,128);
        textArea_B.setBounds(100,300,256,128);
        textArea_A.setBackground(Color.pink);
        textArea_B.setBackground(Color.yellow);

        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("我是魔镜");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
