package com.abctech.samples;
class Piolt{
void takeoff() {
    System.out.println("plane is takingoff");
}
void fly(){
    System.out.println("plane flying");
}
void land(){
    System.out.println("plane is landing");
}
}
class CargoPiolt extends Piolt {
    void fly() {
        System.out.println("CP flying at low height");
    }
}
    class PassengerPiolt extends Piolt {
      void fly(){
          System.out.println("pp flying at medium height");
      }
    }
    class FighterPiolt extends Piolt {
    void fly(){
        System.out.println("fp flying at high height ");
    }
    }
class Airport{
void permit(Piolt ref){
ref.takeoff();
ref.fly();
ref.land();
}
}
public class Sample3 {
    public static void main(String[] args) {
        CargoPiolt cp = new CargoPiolt();
        Airport a = new Airport();
        a.permit(cp);
        PassengerPiolt pp = new PassengerPiolt();
        a.permit(pp);
        FighterPiolt fp = new FighterPiolt();
        a.permit(fp);
    }
}


