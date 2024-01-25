class employee
{ 
  public static void main(String args[])
  {
     String ename="B.Saikiran",eid="19P71A0461",edesignation="Software Developer",edept="IT";
     int present_days=23,emp_exper=5;
     double work_days=25,actual_salary=25000,salary_recv,hike_salary, total_salary;
     System.out.println("Employee Name: "+ename);
     System.out.println("Employee ID: "+eid);
     System.out.println("Employee Designation: "+edesignation);
     System.out.println("Employee Department: "+edept);
     salary_recv=present_days/work_days*actual_salary;
     System.out.println("No of Working days: "+(int)work_days);
     System.out.println("No of Days present : "+present_days);
     System.out.println("Employee Actual Salary: "+actual_salary);
     System.out.println("Employee Recived Salary: "+salary_recv);
     if(emp_exper>=10)
     {
      hike_salary=50/100.0*actual_salary;
     }
     else
     {
      hike_salary=25/100.0*actual_salary;
     }
     total_salary=hike_salary+actual_salary;
     System.out.println("Employee salary before hike: "+actual_salary);
     System.out.println("Hike Given: "+hike_salary);
     System.out.println("Employee salary After hike: "+total_salary);
  }
}

     
     