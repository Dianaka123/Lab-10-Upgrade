package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.search;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Team;

import java.util.List;

public interface SearchStrategy {
    List<Employer> search(List<Employer> employers);
}
