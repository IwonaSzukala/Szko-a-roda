package Main;

import javax.swing.*;
import java.awt.*;

    public class Rameczka extends JFrame
    {
        public Rameczka()
        {

            super("<3");



            this.setBounds(100, 50, 300, 100);


            this.setDefaultCloseOperation(3);
            //this.pack();
        }
        public static void main(String[] args)
        {
            new Rameczka().setVisible(true);
        }
    }

