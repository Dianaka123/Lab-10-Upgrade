package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.search.SearchStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {

    private static final int DEFAULT_COUNT_TEAM = 3;

    private List<Team> teams;
    private String name;
    private SearchStrategy searchStrategy;

    public Company(String name, SearchStrategy searchStrategy) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.searchStrategy = searchStrategy;
    }


    public Company(Company company) {
        this.name = company.name;
        this.teams = company.teams;
        this.searchStrategy = company.searchStrategy;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        if (teams != null) {
            this.teams = teams;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public List<Employer> doSearch(List<Employer> employers){
        return this.searchStrategy.search(employers);
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public List<Employer> getAllEmployer() {
        List<Employer> employers = new ArrayList<>();
        for (Team team:
             this.teams) {
            employers.addAll(team.getEmployers());
        }
        return employers;
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }

    public void deliteTeam(Team team){
        this.teams.remove(team);
    }

    public void deliteTeamByIndex(int index){
        this.teams.remove(index);
    }

    @Override
    public String toString() {
        return  " name company = " + name + '\'' +
                "teams: " + Arrays.toString(teams.toArray()) +
                '}';
    }

}