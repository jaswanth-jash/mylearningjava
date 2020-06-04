package com.abctech.samples;
abstract class Bird{
    abstract void fly();
        abstract void eat();
    }
abstract class Eagle extends Bird{
    void eat(){
        System.out.println("eagle is eating");
    }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("flying");
    }
    void eat(){
        System.out.println("eating");
    }
}
class GoldenEagle extends Eagle{
    void fly(){
        System.out.println("files on oceans");
    }
}
class SerpentEagle extends Eagle{
    void fly(){
        System.out.println("files on mountains");
    }
}
class Jumaji{
    void permit(Bird ref){
        ref.fly();
        ref.eat();
    }
}

public class SampleFive {
    public static void main(String[] args) {
        GoldenEagle ge =new GoldenEagle();
        SerpentEagle se =new SerpentEagle();
        Sparrow s= new Sparrow();
        Jumaji j =new Jumaji();
        j.permit(ge);
        j.permit(se);
        j.permit(s);
    }
}
