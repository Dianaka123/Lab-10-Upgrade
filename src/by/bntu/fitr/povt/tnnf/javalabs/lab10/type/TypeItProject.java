package by.bntu.fitr.povt.tnnf.javalabs.lab10.type;

public enum TypeItProject {
    WEBSITE("website"),
    GAME("game"),
    SOFT("software");

    private String type;

    TypeItProject(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TypeItProject{" +
                "type='" + type + '\'' +
                '}';
    }
}
