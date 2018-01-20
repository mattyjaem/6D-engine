package com.company;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class PolygonObject {
    Polygon P;
    Color c;

    public PolygonObject(double[] x, double[] y, Color c)
    {
        Screen.PolyNum++;
        P = new Polygon();
        for (int i = 0; i<x.length; i++)
            P.addPoint((int)x[i],(int)y[i]);
        this.c = c;
    }

    void drawPolygon(Graphics g)
    {
        g.setColor(c);
        g.drawPolygon(P);
    }
}