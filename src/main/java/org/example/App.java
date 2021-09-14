 /*
  *  UCF COP3330 Fall 2021 Assignment 20 Solution
  *  Copyright 2021 Blake Baez
  */
 package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String state, county;
            double order, stateTax, countyTax, totalTax, finalTax, total;

            System.out.print("What is the order amount? ");
            order = scan.nextDouble();
            System.out.print("What state do you live in? ");
            state = scan.next();

            if(state.equalsIgnoreCase("Wisconsin")) {
                stateTax = .05;

                System.out.print("What county do you live in? ");
                county = scan.next();

                if(county.equalsIgnoreCase("Eau Claire")) {
                    countyTax = .005;
                }
                else if (county.equalsIgnoreCase("Dunn")) {
                    countyTax = .004;
                }
                else {
                    countyTax = 0;
                }

                totalTax = stateTax + countyTax;
            }
            else if (state.equalsIgnoreCase("Illinois")) {
                totalTax = .08;
            }
            else {
                System.out.printf("The total is $%.2f.\n", order);
                return;
            }

            finalTax = order * totalTax;
            total = order + finalTax;

            System.out.printf("The tax is $%.2f.\n", finalTax);
            System.out.printf("The total is $%.2f.\n", total);
        }
    }