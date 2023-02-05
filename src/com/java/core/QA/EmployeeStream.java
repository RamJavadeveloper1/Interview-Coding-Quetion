package com.java.core.QA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employeee> empList = new ArrayList<Employeee>();
        // empId,name,deptid,empStatus,salary,age,Gender
        empList.add(new Employeee(101, "Alice", 10134, "active", 2000, 30, "Male"));
        empList.add(new Employeee(102, "Anush", 10134, "active", 5000, 40, "Female"));
        empList.add(new Employeee(103, "Harris", 10265, "inactive", 6000, 32, "Female"));
        empList.add(new Employeee(104, "Charles", 10265, "inactive", 4000, 44, "Female"));
        empList.add(new Employeee(105, "Rakesh", 10311, "active", 3500, 27, "Female"));
        empList.add(new Employeee(106, "Imran", 10311, "inactive", 3500, 29, "Male"));
        empList.add(new Employeee(107, "Abhishek", 10434, "active", 3500, 34, "Male"));

        // 1. Print Number of employees working in each department using java8 stream
        // API

        /*
         * Output
         * 10434=1
         * 10134=2
         * 10311=2
         * 10265=2
         */

        empList.stream().collect(Collectors.groupingBy(e -> e.getDeptId())).entrySet()
                .forEach(e -> System.out.println(e.getValue()));
        // 2. Print Youngest Male employee from above list using java8 stream API
        // Output = Imram

        empList.stream().filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparingInt(e -> e.getAge())).get().getName();

        // 3. Count frequency of elements in below list using java8 stream API
      //   String charArr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'A', 'B', 'C', 'A' };
         
        // Map
       //  Arrays.stream(charArr.chars().collect((Supplier<R>) Collectors.groupingBy(Object::toString,Collectors.counting())));
         
        // find highest salary of employee
        
        String s=empList.stream().max(Comparator.comparingDouble(e->e.getSalary())).get().getName();
      //   System.out.println("Emploee Highets pay employee :: " + s);
        
         
  // how many male and female employee there in organization? 
          Map<String, Long> MaleFemaleCount=empList.stream().collect(Collectors
                  .groupingBy(Employeee:: getGender, Collectors.counting()));
          System.out.println(MaleFemaleCount);
          
         empList.stream().map(e->e.getDeptId()).distinct().forEach(System.out::println);
                  
       
          
         // nth highest salary 
         //skip is used for find the nth highets salary 
          int highetSal=empList.stream().map(e-> e.getSalary()).sorted((x,y)-> y-x).skip(1).findFirst().get();
         System.out.println("2nd Highest Salary  :: " + highetSal);
         
         // find the dept occuration 
         
         Map<Integer, Long> FindTheCountOfDeptId =empList.stream().collect(Collectors.groupingBy(Employeee:: getDeptId, Collectors.counting()));
         
           FindTheCountOfDeptId.entrySet().forEach((k) -> System.out.println("Dept Id :: "+k.getKey()+ " DeptCount :: " + k.getValue()));
      //  Character c = Character.valueOf(charArr);

    }

}

class Employeee {
    private int empId;
    private String name;
    private int deptId;
    private String empStatus;
    private int salary;
    private String gender;
    private int age;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employeee(int empId, String name, int deptId, String empStatus, int salary, int age, String gender) {
        super();
        this.empId = empId;
        this.name = name;
        this.deptId = deptId;
        this.empStatus = empStatus;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employeee [empId=" + empId + ", name=" + name + ", deptId=" + deptId + ", empStatus=" + empStatus
                + ", salary=" + salary + ", gender=" + gender + ", age=" + age + "]";
    }

}
