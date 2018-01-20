package com.company;

import java.awt.*;

public class ExtraPolygon {
    Color color;
  double[] x,y,z;
  int poly = 0;
        public ExtraPolygon(double[] x, double[] y, double[] z, Color c) {
            this.color = color;
            this.x = x;
            this.z = z;
            this.y=y;
            makeEinPoly();
        }
    void makeEinPoly(){ //method for constructing new polygons
            double[] newX = new double[x.length]; //array for Xpos dependent on points in x
            double[] newY = new double[x.length]; //same but for Y. whooo would have BELIEVED IT
            for (int i=0; i<x.length; i++ ){// for each pass, newX changed into CalcX. I think it is named calcX. Not sure. Cba. I am bored. what is life?
                newX[i] = 500 + 50* DasCalculation.calculatePosX(Screen.ViewPoint,Screen.View,x[i],y[i],z[i]);
                newY[i] = 500 + 50* DasCalculation.calculatePosY(Screen.ViewPoint,Screen.View,x[i],y[i],z[i]);
            }
            poly = Screen.PolyNum;
            Screen.PolyDraw[Screen.PolyNum] = new PolygonObject(newX,newY,color);
    }
    void cycle(){
        double[] newX = new double[x.length];
        double[] newY = new double[x.length];
        for (int i=0; i<x.length; i++ ){
            newX[i] = 500 + 50* DasCalculation.calculatePosX(Screen.ViewPoint,Screen.View,x[i],y[i],z[i]);
            newY[i] = 500 + 50* DasCalculation.calculatePosY(Screen.ViewPoint,Screen.View,x[i],y[i],z[i]);
        }

        Screen.PolyDraw[poly] = new PolygonObject(newX,newY,color);
        Screen.PolyNum --; // changing polygon -- so need to decrease polynum so wont get any errors.
    }

}