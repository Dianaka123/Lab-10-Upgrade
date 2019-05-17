package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.search;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Team;

import java.util.*;

public class SearchEmployerByName implements SearchStrategy {


    @Override
    public List<Employer> search(List<Employer> employers) {
        employers.sort(Comparator.comparing(Employer::getName));
        return employers;
    }
}
