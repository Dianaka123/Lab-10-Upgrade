package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;

public class Employer {

    private static final String FAIL = "UUUPPPS";
    private static final String WE_ARE_FRIENDS = "Hello! Now we are friends!";
    private static final String DEFAULT_NAME_EMPLOYER = "no name";

//    private static int employerAmount = 0;

    private String name;
    private int salary;
    private ProfessionType professionType;
    private int age;
    private int experience;


//    {
//        employerAmount++;
//    }


    public Employer() {
        name = DEFAULT_NAME_EMPLOYER;
        salary = 0;
        professionType = ProfessionType.UNEMPLOYED;
        age = 0;
        experience = 0;
    }

    public Employer(String name, int salary, ProfessionType professionType, int age, int experience) {
        this.name = name;
        this.salary = salary;
        this.professionType = professionType;
        this.age = age;
        this.experience = experience;
    }

    public Employer(Employer employer) {
        name = employer.name;
        salary = employer.salary;
        professionType = employer.professionType;
        age = employer.age;
        experience = employer.experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String makeFail() {
        return FAIL;
    }

    public String stayFriend() {
        return WE_ARE_FRIENDS;
    }

//    public int getCountCompanyEmployer() {
//        return employerAmount;
//    }

    @Override
    public String toString() {
        return name + " " + age + " years " + "(" + salary + "$" + ")" + " -- " + professionType + " " + "Experience = " +
                experience + " " + "years";
    }


}
