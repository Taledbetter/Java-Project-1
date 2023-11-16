//Chapter 6 lab assignment
//Filename: Volunteer.java
//Name:Tiffany Ledbetter
//Date: 11/10/2023


import java.time.LocalDate;

public class Volunteer
{
      private String name;
      private int id;
      private int daysWorked;
      private int totalHoursNum = 0;
      private LocalDate timeDate;
      private static int dayCount = 0;
      
      public Volunteer(String name, int daysWorked)
   {
      this.name = name;
      this.id = dayCount++;
      this.daysWorked = daysWorked;
      this.timeDate = LocalDate.now();
    }   
   public LocalDate getTimeDate() 
   {
        return timeDate;
    }

    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getDaysWorked() 
    {
        return daysWorked;
    }

    public int getTotalHoursNum() 
    {
        return totalHoursNum;
    }

    public void setTotalHoursNum(int totalHoursNum) 
    {
        this.totalHoursNum = totalHoursNum;
    }
}