package 객체지향.example8;

import 객체지향.inner.FrameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 콜백(call back) -> 거꾸로 부른다. -> 니가 오세요 ~
// 시스템이 어플리케이션을 호출하는 경우
public class WindowEx extends JFrame {

    private Pan pan = new Pan();
    Toolkit t;

    private int x = -100, y = -100;
    private int turn=-1;
    private static int state=0;
    public WindowEx (){
        // this. -> JFrame 에 있는 함수들 까지 접근할 수 있음 왜냐? 해당 객체가 JFrame을 상속받았기 때문
        this.add(pan);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

                WindowEx.this.dispose();
                // 익명클래스도 내부 클래스 따라서 외부 클래스의 자원을 사용할 수 있다.


            }
        }); // 매개변수로 받은 객체를 윈도우 리스너로 등록
        t = Toolkit.getDefaultToolkit();
        this.setBounds(new Rectangle(new Point(0,0), t.getScreenSize()));
        this.setVisible(true);
    }

    public class Pan extends Canvas {

        final int SIZE = 50;
        public Pan(){

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e){
                    WindowEx.this.x = e.getX();
                    WindowEx.this.y = e.getY();
                    System.out.println("x=" + WindowEx.this.x);
                    System.out.println("y=" + WindowEx.this.y);
                    repaint();
                }

            });

            this.setBackground(Color.cyan);
        }

        public void gamePan(Graphics g){
            for(int i=SIZE; i<t.getScreenSize().getHeight()-SIZE*2; i+= SIZE){
                for(int j=SIZE; j<t.getScreenSize().getWidth()-SIZE*2; j+=SIZE){
                    g.drawRect(j,i, 50, 50);
                }
            }
        }

        public void stone(Graphics g){
            state=1;
            g.setColor(turn==-1?Color.black:Color.white);
            g.fillOval(x-25, y-25, 50, 50);
            turn*=-1;
        }

        public void paint(Graphics g){
            if(state==0)
                gamePan(g);
            stone(g);
        }

        public void update(Graphics g){
            paint(g);
        }


    }


    public static void main(String[] args) {
        WindowEx windowEx = new WindowEx();
    }


}
