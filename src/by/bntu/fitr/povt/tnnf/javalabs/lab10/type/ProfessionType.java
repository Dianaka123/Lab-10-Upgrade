package by.bntu.fitr.povt.tnnf.javalabs.lab10.type;

public enum ProfessionType {
    GAMEDEVELOPER("game developer"),
    FULL_STACK_DEVELOPER("full stack developer"),
    BACKEND_DEVELOPER(" backend developer"),
    FRONTEND_DEVELOPER("frontend developer"),
    DISIGNER("disigner"),
    MANAGER("manager"),
    SEO("seo"),
    ECONOMIST("economist"),
    CLEANER("claener"),
    UNEMPLOYED("unemployed"),
    TESTER("tester"),
    PROGRAMMER ("programmer");

    private String type;

    ProfessionType(String type) {
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
        return "ProfessionType{" +
                "type='" + type + '\'' +
                '}';
    }
}
