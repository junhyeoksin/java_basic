package com.basic.java.javaObject.constructor;

/**
 * 생성자에서 다른 생성자 호출하가 (this)
 */
public class Car {


    private String color;
    private String gearType;
    private int door;

    Car(){
        this("white", "twoType", 1);
    }
    Car(String color){
        this(color, "treeType", 5);
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue", "oneType", 2);
        Car car3 = new Car("yello");
//        Car car3 = new ();
        System.out.println("car1의 color==" + car1.color + "car1의 gearType==" + car1.gearType + " car1의 door==" + car1.door);
        System.out.println("car2의 color==" + car2.color + "car2의 gearType==" + car2.gearType + " car2의 door==" + car2.door);
        System.out.println("car3의 color==" + car3.color + "car3의 gearType==" + car3.gearType + " car3의 door==" + car3.door);

    }
}


