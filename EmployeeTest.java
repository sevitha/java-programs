

public class EmployeeTest
{
 public static void main(String[] args){
 Employee ob1=new Employee();
 Employee ob2=new Employee();
 ob1.getFirst_Name();
 ob1.getLast_Name();
 ob1.getsalary();
  ob2.getFirst_Name();
 ob2.getLast_Name();
 ob2.getsalary();
 System.out.println("Annual income of employee1 "+ob1.First_Name+" "+ob1.Last_Name+" is  "+ob1.salary*12);
  System.out.println("Annual income of employee2 "+ob2.First_Name+" "+ob2.Last_Name+" is  "+ob2.salary*12);
 ob1.salary=13.2*ob1.salary;
 ob2.salary=13.2*ob2.salary;
System.out.println("Salary after increment :Employee 1:"+ob1.First_Name+" "+ob1.Last_Name+" is "+ob1.salary);
System.out.println("Salary after increment :Employee 2:"+ob2.First_Name+" "+ob2.Last_Name+" is "+ob2.salary);
}
}