package com.company;
// just does some calculations with the Vectors. Should it be in the DasCalculation class? Who knows. Not Me. Its Late. I can run System.currentTimeInMillis() to check? AHAHAH thats system time you dingus.
public class Vector {
    double x=0, y=0,z=0;
    public Vector (double x, double y, double z){
        double Magnitude =Math.sqrt(x*x+y*y+z*z);// finding the magnitude of the vector
        if (Magnitude>0){
        this.x = x/Magnitude;
    this.y=y/Magnitude;
    this.z=z/Magnitude;

    }}
    Vector Product(Vector V){ //returns normal vector
        Vector Product = new Vector(y*V.z - z*V.y, z*V.x - x*V.z, x*V.y-y*V.x);
        return Product;

    }
}
