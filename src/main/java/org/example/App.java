package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print( "What is your name?" );
        String str= sc.nextLine();
        System.out.print( "Hello,"+str);
        System.out.print(", nice to meet you!");
    }
}
