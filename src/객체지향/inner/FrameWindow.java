package 객체지향.inner;

import javax.swing.*;
import java.awt.*;

public class FrameWindow extends JFrame {
    public class Pan extends Canvas {
        public Pan(){
            this.setBounds(10,10,50,50); // Canvas.setBounds()
            FrameWindow.this.setBounds(10, 10, 50, 50); // JFrame.setBounds()
        }


    }

}
