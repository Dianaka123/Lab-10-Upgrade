package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;

public class Employer {

    private static final String FAIL = "UUUPPPS";
    private static final String WE_ARE_FRIENDS = "Hello! Now we are friends!";
    private static final String DEFAULT_NAME_EMPLOYER = "no name";


    private String name;
    private int salary;
    private ProfessionType professionType;
    private int age;
    private int experience;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16) {
            this.age = age;
        }
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        }
    }

    public Integer getSalary() {
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


    public ProfessionType getProfessionType() {
        return professionType;
    }

    public void setProfessionType(ProfessionType professionType) {
        this.professionType = professionType;
    }

    @Override
    public String toString() {
        return name + " " + age + " years " + "(" + salary + "$" + ")" + " -- " + professionType + " " + "Experience = " +
                experience + " " + "years";
    }


}
