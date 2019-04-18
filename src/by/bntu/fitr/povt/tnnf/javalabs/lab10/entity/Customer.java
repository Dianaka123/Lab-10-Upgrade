package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;

import java.util.Random;

public class Customer {
    public static int customsAmount;
    public String name;
    public int priceOfProject;
    public String deadline;
    public int age;
    public String typeOfProject;
    public int task;
    public int countOfTasks = 3;
    Random random = new Random();
    public int middleNormalSalary = 340;
    public String review;

    static {
        customsAmount = 0;
    }

    {
        customsAmount++;
    }

    public Customer() {
        name = "no name";
        priceOfProject = 300;
        deadline = "no limit";
        age = 0;
        typeOfProject = "No project";
    }

    public Customer(String name, int priceOfProject, String deadline, int age, String typeOfProject) {
        this.name = name;
        this.priceOfProject = priceOfProject;
        this.deadline = deadline;
        this.age = age;
        this.typeOfProject = typeOfProject;
    }

    public Customer(Customer customer) {
        name = customer.name;
        priceOfProject = customer.priceOfProject;
        deadline = customer.deadline;
        age = customer.age;
       typeOfProject = customer.typeOfProject;
    }

    public int giveCustoms(){
        task  = random.nextInt(countOfTasks);
        return task;
    }
    public String doReview(double middleSalary){
        if (middleSalary>=middleNormalSalary){
           review = "WOOOW!!!!" ;
        }
        else{
            review = "OH MY GOD!!! YOU'RE STUIPID COMPANY!!!!";
        }
        return review;
    }

    @Override
    public String toString() {
        return name + " " + age + " years " + "(" + priceOfProject + "$" + ")" + " -- " + deadline + " " + " Type of project: " +
                typeOfProject;
    }
}
