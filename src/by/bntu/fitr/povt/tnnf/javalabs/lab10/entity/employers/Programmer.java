package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.logic.Manager;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;
import org.apache.log4j.Logger;

public class Programmer extends Employer {

    private final static Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(Employer.class);
    }

    private static final boolean DEFAULT_STATE_PROGRAMMER = true;
    private static final int DEFAULT_ROWS_COUNT = 0;

    private boolean isWriteCode;
    private int rowsCount;

    public Programmer() {
        super();
        this.isWriteCode = DEFAULT_STATE_PROGRAMMER;
        this.rowsCount = DEFAULT_ROWS_COUNT;
    }

    public Programmer(boolean isWriteCode) {
        this.isWriteCode = isWriteCode;
    }

    public Programmer(String name, int salary, int age, int experience, boolean isWriteCode) {
        super(name, salary, ProfessionType.PROGRAMMER, age, experience);
        this.isWriteCode = isWriteCode;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public boolean isWriteCode() {
        return isWriteCode;
    }

    public void setWriteCode(boolean writeCode) {
        isWriteCode = writeCode;
    }


    public int writeCode(){
        if (this.isWriteCode) {
            this.rowsCount++;
        }
        return this.rowsCount;
    }

    @Override
    public Integer getSalary(){
        int salary = super.getSalary()* this.rowsCount;
        LOGGER.info("Get programme salary"+salary);
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                super.toString() +
                "isWriteCode=" + isWriteCode +
                '}';
    }
}
