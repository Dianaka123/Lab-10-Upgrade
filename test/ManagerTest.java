//package testLogic;
//
//import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
//import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
//import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;
//import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;
//import org.junit.Test;
//import static org.junit.Assert.*;

//public class ManagerTest {
//
//    private Company company = new Company("My Company");
//
//
//    @Test
//    public void calculateCommonSalary() {
//        company.addEmployer(new Employer("vasya", 10, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 20, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 10, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 50, ProfessionType.ECONOMIST,21,2));
//        int salary = Manager.calculateCommonSalary(company);
//        assertEquals(90, salary);
//    }
//
//    @Test
//    public void calculateCommonSalaryEmptyCompany() {
//        int salary = Manager.calculateCommonSalary(company);
//        assertEquals(0, salary);
//    }
//
//    @Test
//    public void calculateCommonSalaryIfCompanyEqualsNull() {
//        int salary = Manager.calculateCommonSalary(null);
//        assertEquals(-1, salary);
//    }
//
//    @Test
//    public void calculateCommonSalaryIfInCompanyOnePerson() {
//        company.addEmployer(new Employer("vasya", 150, ProfessionType.ECONOMIST,21,2));
//        int salary = Manager.calculateCommonSalary(company);
//        assertEquals(150, salary);
//    }
//
//    @Test
//    public void calculateMiddleSalary() {
//        company.addEmployer(new Employer("vasya", 10, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 20, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 10, ProfessionType.ECONOMIST,21,2));
//        company.addEmployer(new Employer("vasya", 50, ProfessionType.ECONOMIST,21,2));
//        int middleSalary = Manager.calculateMiddleSalary(company);
//        assertEquals(90/4, middleSalary);
//    }
//
//    @Test
//    public void calculateMiddleSalaryIfInCompanyOnePerson() {
//        company.addEmployer(new Employer("vasya", 20, ProfessionType.ECONOMIST,21,2));
//        int middleSalry = Manager.calculateMiddleSalary(company);
//        assertEquals(20,middleSalry);
//    }
//
//    @Test
//    public void calculateMiddleSalaryForEmptyCompany() {
//        int middleSalry = Manager.calculateMiddleSalary(company);
//        assertEquals(-1,middleSalry);
//    }
//
//    @Test
//    public void calculateMiddleSalaryForNullCompany() {
//        int middleSalry = Manager.calculateMiddleSalary(null);
//        assertEquals(-1,middleSalry);
//    }
//
//
//}
