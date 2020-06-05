package com.abctech.samples;

import java.util.Scanner;
class Guesser {
    int gnum;
    int guessNum(){
        System.out.println("guesser ! kindly guess the nos");
        Scanner scan =new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}
class Player{
    int pnum;
    int guessNum(){
        System.out.println("player ! kindly guess the nos");
        Scanner scan =new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void CollectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
    num FromPlayer1 = p1.guessNum();
    num FromPlayer2 = p2.guessNum();
    num FromPlayer3 = p3.guessNum();
}
void Compare()
{
    if(numFromGuesser == numFromPlayer1){
        System.out.println("player1! wins ");
    }
    else if (numFromGuesser == numFromPlayer2){
        System.out.println("player2! wins ");
    }
    else if (numFromGuesser == numFromPlayer3){
        System.out.println("player3! wins ");
    }
    else {
        System.out.println("game lost!Try again! ");
    }
}
}
public class SampleSix {
    public static void main(String[] args) {
        Umpire u =new Umpire();
        u.CollectNumFromGuesser();
        u.CollectNumFromPlayers();
        u.Compare();
    }
}
