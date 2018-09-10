package cn.zenquan;

import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 100;
    double y = 100;

    double degree = 3.14/3;

    //画窗口
    public void paint(Graphics g) {
        System.out.println("窗口被画一次");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        if(y>500-40-30||y<40+40){
            degree = -degree;
        }
        if(x<40||x>865-40-30){
            degree = 3.14 - degree;
        }
    }
    //窗口
    void lanchFrame(){
        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);
        //重画窗口
        while (true)
        {
            repaint();
            try{
                Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //主函数
    public static void main(String[] args) {
        BallGame2 game = new BallGame2();
        game.lanchFrame();
    }
}
