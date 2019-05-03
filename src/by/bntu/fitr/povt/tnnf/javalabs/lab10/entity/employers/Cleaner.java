package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.TypeCleaningTool;

import java.lang.reflect.Type;
import java.util.Arrays;

//pattern Стратегия
public class Cleaner extends Employer {


    private TypeCleaningTool cleaningTool;


    public Cleaner() {
        super();
        this.cleaningTool = TypeCleaningTool.BUCKET;
    }

    public Cleaner(TypeCleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public Cleaner(String name, int salary, int age, int experience, TypeCleaningTool cleaningTool) {
        super(name, salary,ProfessionType.CLEANER, age, experience);
        this.cleaningTool = cleaningTool;
    }


    @Override
    public String toString() {
        return "Cleaner{" +
                "cleaningTool=" + Arrays.toString(TypeCleaningTool.values()) +
                '}';
    }
}
