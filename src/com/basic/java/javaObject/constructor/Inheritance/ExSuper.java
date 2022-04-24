package com.basic.java.javaObject.constructor.Inheritance;

public class ExSuper extends Child{

    int z;
    ExSuper(int x, int y, int z ){
        super(x, y);
        this.z = z;
    }



    public static void main(String[] args) {
        ExSuper exsuper = new ExSuper(1, 2, 3);
        System.out.println("X = " + exsuper.x);
        System.out.println("Y = " + exsuper.y);
        System.out.println("Z = " + exsuper.z);
    }


}
