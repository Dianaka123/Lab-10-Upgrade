import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Team;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.companys.ITCompany;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Cleaner;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Designer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Programmer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Tester;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.search.SearchEmployerByName;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.TypeCleaningTool;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    private Company company = new ITCompany("My Company");
    private Company newCompany = new Company("Comp", new SearchEmployerByName());
    private Team firstTeam = new Team();
    private Team secondTeam = new Team();

    @Before
    public void initialization() {
        Cleaner cleaner = new Cleaner("Misha", 40, 55, 1, TypeCleaningTool.RAG);
        Designer designer = new Designer("Macks", 60, 22, 3, 11);
        Programmer programmer = new Programmer("Alex", 10, 22, 3, true);
        Tester tester = new Tester("Vlad", 10, 20, 2, 3);


        firstTeam.addEmployerInTeam(designer);
        firstTeam.addEmployerInTeam(programmer);
        firstTeam.addEmployerInTeam(tester);

        programmer.writeCode();

        secondTeam.addEmployerInTeam(cleaner);

        company.addTeam(firstTeam);
        company.addTeam(secondTeam);


    }

    @Test
    public void calculateCommonSalary() {
        int salary = Manager.calculateCommonSalary(company);
        assertEquals(120, salary);
    }

    @Test
    public void calculateCommonSalaryEmptyCompany() {
        int salary = Manager.calculateCommonSalary(newCompany);
        assertEquals(0, salary);
    }

    @Test
    public void calculateCommonSalaryIfCompanyEqualsNull() {
        int salary = Manager.calculateCommonSalary(null);
        assertEquals(-1, salary);
    }


    @Test
    public void calculateMiddleSalary() {

        int middleSalary = Manager.calculateMiddleSalary(company);
        assertEquals(30, middleSalary);
    }


    @Test
    public void calculateMiddleSalaryForEmptyCompany() {
        int middleSalry = Manager.calculateMiddleSalary(newCompany);
        assertEquals(-1, middleSalry);
    }

    @Test
    public void calculateMiddleSalaryForNullCompany() {
        int middleSalry = Manager.calculateMiddleSalary(null);
        assertEquals(-1, middleSalry);
    }

    @Test
    public void calculateTeamSalary() {
        int teamSalary = Manager.calculateTeamSalary(firstTeam);
        assertEquals(80, teamSalary);
    }

    @Test
    public void calculateTeamSalaryEqualNull() {
        int teamSalary = Manager.calculateTeamSalary(null);
        assertEquals(-1, teamSalary);
    }

    @Test
    public void calculateEmptyTeamSalary() {
        Team team = new Team();
        int teamSalary = Manager.calculateTeamSalary(team);
        assertEquals(0, teamSalary);
    }

    @Test
    public void calculateProjectCost(){
        int cost = Manager.calculateProjectCost(firstTeam);
        assertEquals(80*3,cost);
    }

    @Test
    public void calculateProjectCostNull(){
        int cost = Manager.calculateProjectCost(null);
        assertEquals(-1,cost);
    }

    @Test
    public void calculateProjectCostEmptyTeam(){
        Team team = new Team();
        int cost = Manager.calculateProjectCost(team);
        assertEquals(0,cost);
    }
}
