package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProjectComplexity;

import java.util.Random;

public class Customer {
    private static final int MIDDLE_NORMAL_SALARY = 340;

    private static int customsAmount;

    private String name;
    private Project project;
    private ProjectComplexity projectComplexity;
    private Random random = new Random();


    static {
        customsAmount = 0;
    }

    {
        if (customsAmount < 3){
            customsAmount++;
        }
    }

    public Customer() {
        this.project =new Project();
        name = "no name";
        projectComplexity = ProjectComplexity.NONE;
    }

    public Customer(String name, Project project,  ProjectComplexity projectComplexity) {
        this.name = name;
        this.project = project;
        this.projectComplexity = projectComplexity;
    }

    public Customer(Customer customer, Project project) {
        name = customer.name;
        projectComplexity = customer.projectComplexity;
        this.project = project;
    }



    public ProjectComplexity getProjectComplexity() {
        return projectComplexity;
    }


    public void setTypeProject(ProjectComplexity type) {
        ProjectComplexity choiseType = ProjectComplexity.NONE;
        switch (type) {
            case HARD:
                choiseType = ProjectComplexity.HARD;
                break;
            case EASY:
                choiseType = ProjectComplexity.EASY;
                break;
            case MIDDLE:
                choiseType = ProjectComplexity.MIDDLE;
                break;
        }
        this.projectComplexity = choiseType;
    }

    public int getCountCustomer(){
        return customsAmount;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String doReview(double middleSalary){
        String review = "";
        if (middleSalary>= MIDDLE_NORMAL_SALARY){
            review = "WOOOW!!!!" ;
        }
        else{
            review = "OH MY GOD!!! YOU'RE STUPID COMPANY!!!!";
        }
        return review;
    }

    @Override
    public String toString() {
        return name + " \n" +
                "(" + project.getCost() + "$" + ")" +
                " -- " + project.getCountMonth() + "month\n " +
                " Type of project: " + projectComplexity;
    }
}

