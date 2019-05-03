package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

public class Project {

    private static final int DEFAULT_COST = 0;
    private static final int DEFAULT_COUNT_MONTH = 3;

    private int cost;
    private int countMonth;


    public Project() {
        this.countMonth = DEFAULT_COUNT_MONTH;
        this.cost = DEFAULT_COST;
    }

    public Project(int cost, int countMonth) {
        this.cost = cost;
        this.countMonth = countMonth;
    }

    public Project(Project project) {
        this.cost = project.cost;
        this.countMonth = project.countMonth;
    }

    public int getCountMonth() {
        return countMonth;
    }

    public void setCountMonth(int countMonth) {
        this.countMonth = countMonth;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                ", cost=" + cost +
                ", countMonth=" + countMonth +
                '}';
    }
}
