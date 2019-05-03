package by.bntu.fitr.povt.tnnf.javalabs.lab10.controller;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.*;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.companys.ITCompany;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Cleaner;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Designer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Programmer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers.Tester;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProjectComplexity;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.TypeCleaningTool;
import org.apache.log4j.Logger;


public class Controller {

    private  final static Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        ITCompany company = new ITCompany("IT");
        Cleaner cleaner = new Cleaner("Misha",300,55,1, TypeCleaningTool.RAG);
        Designer designer = new Designer("Macks", 600,22, 3, 11);
        Programmer programmer = new Programmer("Alex", 800, 22, 3, true);
        Tester tester = new Tester("Vlad", 550, 20, 2, 3);

        Team firstTeam = new Team();
        firstTeam.addEmployerInTeam(designer);
        firstTeam.addEmployerInTeam(programmer);
        firstTeam.addEmployerInTeam(tester);

        Team secondTeam = new Team();
        secondTeam.addEmployerInTeam(cleaner);

        company.addTeam(firstTeam);
        company.addTeam(secondTeam);

        Manager.calculateCommonSalary(company);
        Manager.calculateMiddleSalary(company);
        Manager.calculateTeamSalary(firstTeam);

        Project project = new Project();

        int costProject = Manager.calculateProjectCost(firstTeam);

        Customer customer = new Customer( "Nikita", project, ProjectComplexity.EASY);
        customer.getProject().setCost(costProject);

    }
}
