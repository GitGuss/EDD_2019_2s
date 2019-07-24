/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Menu {

    public Menu() {

        Scanner n = new Scanner(System.in);
        int X;
        do {
            System.out.println("*******Selection an option*****");
            System.out.println("1. Algorithm the day of the week of any date");
            System.out.println("2. Know prime number with the algorithm Criba Eratostenes");
            System.out.println("3. Exit");

            X = n.nextInt();

            try {
                switch (X) {
                    case 1:
                        String decision1 = "y";
                        while (decision1.equals("y") | decision1.equals("Y")) {
                            algoritmo1();
                            System.out.println("do you whant continue y/n");
                            decision1 = n.next();

                        }
                        break;
                    case 2:
                        String decision2 = "y";
                        while (decision2.equals("y") | decision2.equals("Y")) {
                            algoritmo2();
                            System.out.println("do you whant continue y/n");
                            decision2 = n.next();

                        }
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                n.nextLine();

            }

        } while (X != 3);

    }

    public static void algoritmo1() {

        Scanner entry = new Scanner(System.in);
        int day, month, year;

        System.out.println("Please enter de day:");
        day = entry.nextInt();
        System.out.println("Please enter de month:");
        month = entry.nextInt();
        System.out.println("Please enter de Year:");
        year = entry.nextInt();

        Date fecha = new Date(year - 1900, month - 1, year);
        switch (fecha.getDay()) {
            case 0:
                System.out.println("The day of the week is:");
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("The day of the week is:");
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("The day of the week is:");
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is:");
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is:");
                System.out.println("Trusday");
                break;
            case 5:
                System.out.println("The day of the week is:");
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("The day of the week is:");
                System.out.println("Sarturday");
                break;
        }

    }

    public static void algoritmo2() {

        Scanner entrar = new Scanner(System.in);
        int number;

        System.out.println("Enter the number:");
        number = entrar.nextInt();

        System.out.print(" The numbers prime are:");
        System.out.println("minor or equal that " + number);
        CribaEratostenes g = new CribaEratostenes();
        g.cribadeEratostenes(number);

    }

}
