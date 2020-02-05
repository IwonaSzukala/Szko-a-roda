package rysowanie;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        this.setTitle("Rysowanie");
        this.setBounds(250, 300, 500, 400);

        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    private PanelRysowiak panelDoRysowania = new PanelRysowiak();
}
class PanelRysowiak extends JPanel
{
    public PanelRysowiak()
    {
        super();

        this.add(new JButton("Test") {
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Napis", 225, 55);
        g.drawImage(new ImageIcon("serca.gif").getImage(), 40, 70, null);
        g.drawRect(40, 40, 403, 304);
        g.drawLine(40, 60, 443, 60);
        Graphics2D g2 = (Graphics2D) g;
        System.out.println(i++);
    }

    public static int i = 0;

    }
