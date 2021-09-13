/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class madLib {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adj = sc.nextLine();
        System.out.print("Enter an adverb: ");
        String adv = sc.nextLine();
        System.out.print("The "+noun+" wants to "+verb+" "+adv+" so that it is more "+adj+ "! ");



    }
}
