package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {

    private static final int DEFAULT_COUNT_EMPLOYER_IN_TEAM = 15;
    private static final Project DEFAULT_PROJECT = new Project();
    private static final ArrayList<Employer> DEFAULT_EMPLOYERS = new ArrayList<>();
    private static final String DEFAULT_TEAMNAME = "no name";

    private static int countTeamEmployer = 0;


    private Project project;
    private String teamname;
    private List<Employer> employers;


    public Team() {
        this.project = DEFAULT_PROJECT;
        this.employers = new ArrayList<>();
        this.teamname = DEFAULT_TEAMNAME;
    }

    public Team(Project project, String teamname, ArrayList<Employer> employers) {
        this.project = project;
        this.teamname = teamname;
        this.employers = employers;
    }

    public Team(Project project, String teamname) {
        this.project = project;
        this.teamname = teamname;
        this.employers = DEFAULT_EMPLOYERS;
    }

    public Team(Team team) {
        this.project = team.project;
        this.employers = team.employers;
        this.teamname = team.teamname;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        if (project != null) {
            this.project = project;
        }
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        if (teamname != null) {
            this.teamname = teamname;
        }
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        if (employers != null) {
            this.employers = employers;
        }
    }

    public void setEmployer(int index , Employer employer){
        if (employer != null ) {
            this.employers.set(index,employer);
        }
    }

    public Employer getEmployer(int index){
        return employers.get(index);
    }

    public  void addEmployerInTeam(Employer employer){
        this.employers.add(employer);
    }

    public void deliteEmployerByIndex(int index){
        if (index < getSize()) {
            this.employers.remove(index);
        }
    }

    public void deliteEmployer(Employer employer){
        this.employers.remove(employer);
    }

    public int getSize(){
        return this.employers.size();
    }

    @Override
    public String toString() {
        return "Team{" +
                "project=" + project +
                ", teamname='" + teamname + '\'' +
                ", employers=" + Arrays.toString(employers.toArray()) +
                '}';
    }
}
