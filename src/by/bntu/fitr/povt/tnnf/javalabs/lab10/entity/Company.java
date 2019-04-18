package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import java.util.Arrays;

public class Company {
    public static final int DEFAULT_EMPOLOER_AMOUNT = 5;


    public Employer masOfEmployers[] = new Employer[DEFAULT_EMPOLOER_AMOUNT];
    public int countOfEmployers = 0;
    public String name;
//    public Employer employer1;
//    public Employer employer2;
//    public Employer employer3;
//    public Employer employer4;
//    public Employer employer5;
    public int salaryOfEmp;
    public int bonus;

    public StatAboutEmpSalary statAboutEmpSalary = new StatAboutEmpSalary();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public void addEmployer(Employer emp1) {
        masOfEmployers[countOfEmployers++] = emp1;
        statAboutEmpSalary.addEmployer(emp1);
    }


    public Company(Company company) {
        this.name = company.name;
        this.countOfEmployers = company.countOfEmployers;
        this.masOfEmployers = company.masOfEmployers;
        this.salaryOfEmp = company.salaryOfEmp;
        this.bonus = company.bonus;
    }

    @Override
    public String toString() {
        return "Company{" +
                "masOfEmployers=" + Arrays.toString(masOfEmployers) +
                ", countOfEmployers=" + countOfEmployers +
                ", name='" + name + '\'' +
                ", salaryOfEmp=" + salaryOfEmp +
                ", bonus=" + bonus +
                '}';
    }
public void giveSalary(int middleSalary){
    for (Employer employer:masOfEmployers
         ) { employer.salary+=middleSalary;

    }
}
    public int doBonus(Employer employer){
        return employer.salary + 100;
    }
}
