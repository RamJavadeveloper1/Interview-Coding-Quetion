package com.java.core.QA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamclass {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        // empId,name,deptid,empStatus,salary,age,Gender
        empList.add(new Employee(101, "Alice", 10134, "active", 2000, 30, "Male"));
        empList.add(new Employee(102, "Anush", 10134, "active", 5000, 40, "Female"));
        empList.add(new Employee(103, "Harris", 10265, "inactive", 6000, 32, "Female"));
        empList.add(new Employee(104, "Charles", 10265, "inactive", 4000, 44, "Female"));
        empList.add(new Employee(105, "Rakesh", 10311, "active", 3500, 27, "Female"));
        empList.add(new Employee(106, "Imran", 10311, "inactive", 3500, 29, "Male"));
        empList.add(new Employee(107, "Abhishek", 10434, "active", 3500, 34, "Male"));

        Map<Integer, List<Employee>> emp = empList.stream().collect(Collectors.groupingBy(e -> e.getDeptId()));
        System.out.println(emp);

        // 1. Print Number of employees working in each department using java8 stream
        // API

        /*
         * Output
         * 10434=1
         * 10134=2
         * 10311=2
         * 10265=2
         */

//            2. Print Youngest Male employee from above list using java8 stream API
        // Output = Imram

        String s = empList.stream().filter(e -> e.getGender().equalsIgnoreCase("male"))
                .min(Comparator.comparingInt(e -> e.getAge())).get().getName();// .findFirst().get().getName();
        System.out.println(s);

//            3.    Count frequency of elements in below list using java8 stream API
        // String charArr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'A', 'B', 'C', 'A' };

        // map.put("a", "123");

        // 123 -> 234 ,

// map.put("b", "789");
        
        

        /*
         * int count = 1;
         * HashMap<Character, Integer> map = new HashMap<>();
         * 
         * for (int i = 0; i < charArr.length(); i++) {
         * 
         * if (map.contains(charArr[i])) {
         * map.put(charArr[i], map.get("").intValue() + 1);
         * } else {
         * map.put("" + charArr[i] + "", 1);
         * }
         * 
         * }
         */
         
        
        
        /*
         * Output
         * A=3
         * B=2
         * C=2
         * D=1
         * E=1
         * F=1
         * G=1
         */

    }
}

class Employee {
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

    public Employee(int empId, String name, int deptId, String empStatus, int salary, int age, String gender) {
        super();
        this.empId = empId;
        this.name = name;
        this.deptId = deptId;
        this.empStatus = empStatus;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }


}
