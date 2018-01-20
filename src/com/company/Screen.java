package com.company;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Screen extends JPanel implements KeyListener{
    double sleep = 1000/30, LastRefresh = 0;//can set refresh rate
    static int PolyNum = 0;
    static PolygonObject[] PolyDraw = new PolygonObject[100];
    static double[] ViewPoint = new double[]{10,10,10};
    static double[] View = new double[]{5,0,0};
    ExtraPolygon Thingy = new ExtraPolygon(new double[]{2, 4, 2}, new double[]{2, 4, 6},new double[]{5, 5, 5}, Color.black);

    public Screen()
    {
    addKeyListener(this);
    setFocusable(true);
    }

    public void paintComponent(Graphics g)
    {
        g.clearRect(0,0,1920,1080);
        g.drawString(System.currentTimeMillis() + "", 20, 20);
        Thingy.cycle();
        for (int i=0;i<PolyNum; i++)
            PolyDraw[i].drawPolygon(g);
            timer();
    }
    void timer(){
        while(true){
            if((System.currentTimeMillis()-LastRefresh)> sleep){
                LastRefresh = System.currentTimeMillis();
                repaint();
                break;
            }else
                {
                try{
                    Thread.sleep((long)(sleep -(System.currentTimeMillis()-LastRefresh)));
                }catch(Exception e){
            }
        }
    }
}
// this section deals with our key inputs for manipulating the camera positions. Deal with it.

    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            ViewPoint[0] --;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            ViewPoint[0] ++;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            ViewPoint[1] ++;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            ViewPoint[1] --;
        }
    }


    public void keyPressed(KeyEvent e) {

    }


    public void keyReleased(KeyEvent e) {

    }
}