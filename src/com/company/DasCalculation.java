package com.company;
//class for doing all the calcstuffs.exe
public class DasCalculation {
    static double DrawThingX, DrawThingY;
    static double calculatePosX(double[] ViewPoint, double[] View, double x , double y, double z){ //for calculating the position of X. The clue is in the name ya dingus
        setStuff(ViewPoint, View, x, y, z);
        return DrawThingX;
    }
    static double calculatePosY(double[] ViewPoint, double[] View, double x , double y, double z){ //for calculating the position of Y. The clue is still in the name ya dingus
        setStuff(ViewPoint, View, x, y, z);
        return DrawThingY;
    }
    static void setStuff(double[] ViewPoint, double[] View, double x, double y, double z){
    Vector ViewVector = new Vector(View[0]-ViewPoint[0],View[1]-ViewPoint[1],View[2]-ViewPoint[2] );
    Vector DirectionVector= new Vector(1,1,1);
    Vector Plane1 = ViewVector.Product(DirectionVector);
    Vector Plane2 = ViewVector.Product(Plane1);
    Vector ViewToPoint = new Vector (x- ViewPoint[0], y- ViewPoint[1], z- ViewPoint[2]);
    double t = ((ViewVector.x*View[0]) + ViewVector.y*View[1] + ViewVector.z*View[2]
            - (ViewVector.x* ViewPoint[0] + ViewVector.y*ViewPoint[1]+ ViewVector.z*ViewPoint[2]))
            /(ViewVector.x*ViewToPoint.x + ViewVector.y*ViewToPoint.y + ViewVector.z*ViewToPoint.z);
    x = ViewPoint[0] + ViewToPoint.x*t;
    y = ViewPoint[1] + ViewToPoint.y*t;
    z = ViewPoint[2] + ViewToPoint.z*t;

    if (t>=0){
        DrawThingX = Plane2.x*x + Plane2.y*y + Plane2.z*z;
        DrawThingY = Plane1.x*x + Plane1.y*y + Plane1.z*z;
    }

    }
}
