package by.bntu.fitr.povt.tnnf.javalabs.lab10.logic;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Team;
import org.apache.log4j.Logger;


public class Manager {
    private final static Logger LOGGER;

    static {
         LOGGER = Logger.getLogger(Manager.class);
    }

    public static int calculateCommonSalary(Company company) {
        LOGGER.debug("method calculateCommonSalary");
        int allSalary = 0;
        if (company != null) {
            for (Team team :
                    company.getTeams()) {
                if (team != null) {
                    for (Employer employer :
                            team.getEmployers()) {
                        if (employer != null) {
                            allSalary += employer.getSalary();
                            LOGGER.debug(" calculate salary: " + allSalary);
                        }
                        else {
                            LOGGER.error("employer = null");
                        }
                        LOGGER.debug("Calculate salary = "+ allSalary);
                    }
                }
                else {
                    LOGGER.warn("Team = null");
                    allSalary = -1;
                }

            }
            LOGGER.info("Common company salary = " + allSalary);
        } else {
            LOGGER.error("Company = null");
            allSalary = -1;
        }
        return allSalary;
    }

    public static int calculateMiddleSalary(Company company) {
        LOGGER.debug("method calculateMiddleSalary");
        int middleSalary;
        if (company != null && countCompanyEmployer(company)!= 0) {
            middleSalary = calculateCommonSalary(company)/ countCompanyEmployer(company);
            LOGGER.info("calculate company middle salary = " + middleSalary);
        }
        else{
            LOGGER.error("company = null or countCompanyEmployer = 0");
            middleSalary = -1;
        }
        return middleSalary;
    }

    private static int countCompanyEmployer(Company company){
        LOGGER.debug("method countCompanyEmployer");
        int count = 0;
        if (company != null) {
            for (Team team:
                    company.getTeams()) {
                if (team != null) {
                    count += team.getEmployers().size();
                    LOGGER.debug("count: "+ count);
                }
                else {
                    LOGGER.warn("company team = null");
                }
            }
            LOGGER.info("Count company employer = " +  count);
        }
        else {
            LOGGER.error(" company = null");
            count = -1;
        }
        return count;
    }


    public static int calculateTeamSalary(Team team){
        LOGGER.debug("method calculateTeamSalary");
        int teamSalary = 0;
        if (team != null) {
            for (Employer employer:
                    team.getEmployers()) {
                if (employer != null) {
                    LOGGER.debug("teamSalary: " + teamSalary);
                    teamSalary += employer.getSalary();
                }
                else {
                    LOGGER.error("employer = null");
                }
            }
            LOGGER.info("calculate teamSalary("+ team.getTeamname() + ") Team Salary = " + teamSalary);
        }
        else {
            LOGGER.error("team = null");
            teamSalary = -1;
        }
        return teamSalary;
    }


    public static int calculateProjectCost(Team team){
        LOGGER.debug("method calculateProjectCost");
        int projectCost;
        if (team != null){
                projectCost = calculateTeamSalary(team) * team.getProject().getCountMonth();
                LOGGER.info("Project cost: " + projectCost);
        }
        else {
            projectCost = -1;
        }
        return projectCost;
    }


}
