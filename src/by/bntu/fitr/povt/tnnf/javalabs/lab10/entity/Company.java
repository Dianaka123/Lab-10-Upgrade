package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

    private static final int DEFAULT_COUNT_TEAM = 3;

    private ArrayList<Team> team;
    private String name;


    public Company(String name) {
        this.name = name;
        this.team = new ArrayList<Team>();
    }


    public Company(Company company) {
        this.name = company.name;
        this.team = company.team;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        if (team != null) {
            this.team = team;
        }
    }

    public void addTeam(Team team){
        this.team.add(team);
    }

    public void deliteTeam(Team team){
        this.team.remove(team);
    }

    public void deliteTeamByIndex(int index){
        this.team.remove(index);
    }

    @Override
    public String toString() {
        return  " name company = " + name + '\'' +
                "teams: " + Arrays.toString(team.toArray()) +
                '}';
    }

}