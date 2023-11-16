//Chapter 6 lab assignment
//Filename: Volunteer.java
//Name:Tiffany Ledbetter
//Date: 11/10/2023

import java.util.Scanner;

public class VolunteerEntry 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);

        Volunteer volunteer1 = getVolunteerInfo(input);
        displayVolunteerInfo(volunteer1);

        Volunteer volunteer2 = getVolunteerInfo(input);
        displayVolunteerInfo(volunteer2);

        input.close();
    }

    private static Volunteer getVolunteerInfo(Scanner input) 
    {
        System.out.print("Enter volunteer's name: ");
        String name = input.nextLine();

        int daysWorked = 0;
        while (true) 
        {
            System.out.print("Enter the number of days worked for the week (1-4): ");
            daysWorked = input.nextInt();

            if (daysWorked >= 1 && daysWorked <= 4) 
            {
                break;            } 
            else 
            {
                System.out.println("Invalid entry. Please enter a number of days between 1 and 4.");
                input.nextLine();            }
        }

        Volunteer volunteer = new Volunteer(name, daysWorked);
        int totalHoursNum = 0;

        for (int day = 1; day <= daysWorked; day++) 
        {
            int workedTime = 0;
            while (workedTime < 1 || workedTime > 6) 
            {
                System.out.print("Enter the number of hours worked on day " + day + " (1-6): ");
                workedTime = input.nextInt();
            }
            totalHoursNum += workedTime;
            input.nextLine();        }

        volunteer.setTotalHoursNum(totalHoursNum);
        return volunteer;
    }

    private static void displayVolunteerInfo(Volunteer volunteer) 
    {
        System.out.println("Date: " + volunteer.getTimeDate());
        System.out.println("Volunteer's name: " + volunteer.getName());
        System.out.println("Volunteer's ID: " + volunteer.getId());
        System.out.println("Number of days volunteered: " + volunteer.getDaysWorked());
        System.out.println("Total hours volunteered: " + volunteer.getTotalHoursNum());
    }
}
