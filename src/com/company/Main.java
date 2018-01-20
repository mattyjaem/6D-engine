package com.company;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main extends JFrame{
    static JFrame F = new Main();
    Screen ScreenObject = new Screen();

    public Main()
    {
        add(ScreenObject);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }

    public static void main(String[] args)
    {

    }
}