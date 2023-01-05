package com.example.inclassactivitytwo;

public class Employee {

    private String name;
    private Double salary;
    private String jobTime;

    public Employee(String name, Double salary, String jobTime) {
        this.name = name;
        this.salary = salary;
        this.jobTime = jobTime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", jobTime='" + jobTime + '\'' +
                '}';
    }
}
