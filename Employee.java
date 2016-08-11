import java.util.Scanner;
public class Employee
{
 String First_Name;
 String Last_Name;
 double salary;
Employee()
{
 First_Name="";
 Last_Name="";
 salary=0.0;
}
public void getFirst_Name()
{
System.out.println("enter  first name");
 Scanner fn =new Scanner(System.in);
 First_Name=fn.next();
}
public void getLast_Name()
{
System.out.println("enter last name");
Scanner ln =new Scanner(System.in);
Last_Name=ln.next();
}
public void getsalary()
{double c;
 System.out.println("enter your salary");
Scanner si=new Scanner(System.in);
c=si.nextDouble();
if(c>0){ 
setsalary(c);}
else
{
System.out.println("Enter a valid salary");
getsalary();
}
}
public void setsalary(double c)
{
salary=c;
}
}