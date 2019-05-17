package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.search;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchEmployerBySalary implements SearchStrategy {
    @Override
    public List<Employer> search(List<Employer> employers) {
        employers.sort(Comparator.comparing(Employer::getSalary));
        return employers;
    }
}
