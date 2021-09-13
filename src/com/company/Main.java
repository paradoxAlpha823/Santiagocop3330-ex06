/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("What age do you wish to retire? ");
        String s2 = x.nextLine();
        Integer num2 = null;
        try {
            num2 = Integer.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }

        int age = num1;
        int rage = num2;

        int mat=rage-age;
        Calendar cal= Calendar.getInstance();
        int ral = cal.get(Calendar.YEAR);
        int mal = ral+mat;
        if(mat>0)
        {
            System.out.println("You have "+mat+" years left until you can retire.\r\n"+"It's "+ral+", so you can retire in "+mal);
            System.exit(0);
        }else
        {
            System.out.println("You can already retire.");
            System.exit(0);
        }

    }
}

