package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;

public class Programmer extends Employer {

    private static final boolean DEFAULT_STATE_PROGRAMMER = true;

    private boolean isWriteCode;

    public Programmer() {
        super();
        this.isWriteCode = DEFAULT_STATE_PROGRAMMER;
    }

    public Programmer(boolean isWriteCode) {
        this.isWriteCode = isWriteCode;
    }

    public Programmer(String name, int salary, int age, int experience, boolean isWriteCode) {
        super(name, salary, ProfessionType.PROGRAMMER, age, experience);
        this.isWriteCode = isWriteCode;
    }

    public boolean isWriteCode() {
        return isWriteCode;
    }

    public void setWriteCode(boolean writeCode) {
        isWriteCode = writeCode;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                super.toString() +
                "isWriteCode=" + isWriteCode +
                '}';
    }
}
