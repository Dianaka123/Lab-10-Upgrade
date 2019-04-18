package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;

import java.util.Random;

public class Customer {
    private static int customsAmount;
    private String name;
    private int priceOfProject;
    private String deadline;
    private int age;
    private TypeOfProject typeOfProject;
    private int task;
    private int countOfTasks = 3;
    Random random = new Random();
    private int middleNormalSalary = 340;
    private String review;

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
        typeOfProject = TypeOfProject.NONE;
    }

    public Customer(String name, int priceOfProject, String deadline, int age, TypeOfProject typeOfProject) {
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

    public TypeOfProject getTypeOfProject() {
        return typeOfProject;
    }


    public void setTypeProject(String type){
        TypeOfProject typeOfProject = TypeOfProject.NONE;
        if (checkTypeOfProject(type,"hard")){
            typeOfProject = TypeOfProject.HARD;
        }
        else if (checkTypeOfProject(type, "easy")){
            typeOfProject = TypeOfProject.EASY;
        }
        else if (checkTypeOfProject(type,"middle")){
            typeOfProject = TypeOfProject.MIDDLE;
        }
        this.typeOfProject = typeOfProject;
    }

    private boolean checkTypeOfProject( String newType, String defaultType){
        boolean isDefaultType = false;
            if (newType.equalsIgnoreCase(defaultType)){
                isDefaultType = true;
            }
        return isDefaultType;
    }


    @Override
    public String toString() {
        return name + " " + age + " years " + "(" + priceOfProject + "$" + ")" + " -- " + deadline + " " + " Type of project: " +
                typeOfProject;
    }
}

enum TypeOfProject{
    NONE,
    EASY,
    HARD,
    MIDDLE
}