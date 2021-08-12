package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\t\n ~~~~~~Welcome to our university criterion checker~~~~~~\n");

        //asking for user input
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the following details\n KCSE score(Out of 100):");
        float kcseScore= input.nextInt();

        System.out.println("Interview questions scores(out of 10): ");
        float interviewScore= input.nextInt();

        System.out.println("Confidence level scores(out of 10): ");
        float confidenceScore= input.nextInt();

        //KCSE condition
        if(kcseScore>=65)
        {
            System.out.println("KCSE: pass");
        }
        else{
            System.out.println("KCSE: fail");
        }

        //INTERVIEW condition
        if(interviewScore>=6)
        {
            System.out.println("Interview: pass");
        }
        else{
            System.out.println("Interview: fail");
        }

        //CONFIDENCE condition
        if(confidenceScore>=5)
        {
            System.out.println("Confidence: High");
        }
        else{
            System.out.println("Confidence: Low");
        }

        // check if all condtions are met
        if(kcseScore>=65 && interviewScore>=6 && confidenceScore>=5 )
        {
            System.out.println("Congratulations you have been admitted to the university");
        }
        else{
            System.out.println("One or more conditions not met! Please try again");
        }




    }
}
