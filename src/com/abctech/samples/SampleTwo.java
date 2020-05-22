package com.abctech.samples;

class Plane {
    void takeoff() {
        System.out.println("plane is taking off");
    }

    void fly() {
        System.out.println("plane is flying");
    }

    void land() {
        System.out.println("plane is landing");
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("cp files at low height");
    }

    void carryGoods() {
        System.out.println("cp carries goods");
    }
}

class PassengerPlane extends Plane {
    void fly() {
        System.out.println("pp files at medium  height");
    }

    void carryPassengers() {
        System.out.println("pp carries passengers");
    }
}

class FighterPlane extends Plane {
    void fly() {
        System.out.println("cp files at high height");
    }

    void carryWeapons() {
        System.out.println("cp carries weapons");
    }
}

public class SampleTwo {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.carryPassengers();

        FighterPlane fp = new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    }
}

