package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;

public class Tester extends Employer {

    private static final int DEFAULT_CONT_TEST_PROJECT = 1;

    private int countTestProject;

    public Tester() {
        this.countTestProject = DEFAULT_CONT_TEST_PROJECT;
    }

    public Tester(int countTestProject) {
        this.countTestProject = countTestProject;
    }

    public Tester(String name, int salary, int age, int experience, int countTestProject) {
        super(name, salary, ProfessionType.TESTER, age, experience);
        this.countTestProject = countTestProject;
    }

    public int getCountTestProject() {
        return countTestProject;
    }

    public void setCountTestProject(int countTestProject) {
        if (countTestProject > 0) {
            this.countTestProject = countTestProject;
        }
    }

    @Override
    public String toString() {
        return "Tester{" +
                super.toString() +
                "countTestProject=" + countTestProject +
                '}';
    }
}
