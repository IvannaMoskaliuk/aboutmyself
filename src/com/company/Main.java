/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Moskaliuk Ivanna KNUTE
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte age = 21;
        short height = 160;
        int distance = 1318000;
        long number = 380_934_342_024L;
        float weight = 51.5f;
        double weightCat = 7.5;
        char myMark = 'B';
        boolean isStudent = true;

        String aboutMyself = "My name is Ivanna.\n I am " + age + " years old."
                 + "\nMy height is " + height + " sm.\n Distanse from me to " +
                "Bratislava is " + distance + " m.\nMy telephone number is " +
                number + ".\n My weight is " + weight + " kg.\nI have a cat." +
                " It weighs " + weightCat + " kg.\n I study in KNUTE at 5th" +
                " year - " + isStudent + "\nMy mark in Uni is - " + myMark;

        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());
    }
}
