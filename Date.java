import java.util.Scanner;
public class Date{
int month;
int date;
int year;
Date()
{
month=0;
date=0;
year=0;
}
void getmonth()
{
System.out.println("enter the month:");
Scanner xx=new Scanner(System.in);
month=xx.nextInt();
}
void getdate()
{
System.out.println("enter the date");
Scanner yy=new Scanner(System.in);
date=yy.nextInt();
}
void getyear()
{
System.out.println("enter the year");
Scanner zz=new Scanner(System.in);
year=zz.nextInt();
}
void displayDate()
{
System.out.printf("%d / %d / %d",month,date,year);
}
}