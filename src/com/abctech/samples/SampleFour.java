package com.abctech.samples;
class Worker {
    void Sweep(){
        System.out.println("Sweeping");
    }
    void Clean(){
        System.out.println("Cleaning");
    }
    void Wash(){
        System.out.println("Washing");
    }
}
class Supervisor{
    Worker w=new Worker();
    void Sweep(){
        w.Sweep();
    }
    void Clean(){
        w.Clean();
    }
    void Wash(){
        w.Wash();
    }
}
public class SampleFour {
    public static void main(String[] args) {
        Supervisor s=new Supervisor();
        s.Sweep();
        s.Clean();
        s.Wash();
    }
}
