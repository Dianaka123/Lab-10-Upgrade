package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.employers;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.type.ProfessionType;

public class Designer extends Employer {
    private int countDrawPicture;

    public Designer() {
        super();
        this.countDrawPicture = 0;
    }

    public Designer(int countDrawPicture){
        super();
        this.countDrawPicture = countDrawPicture;
    }

    public Designer(String name, int salary, int age, int experience, int countDrawPicture) {
        super(name, salary, ProfessionType.DISIGNER, age, experience);
        this.countDrawPicture = countDrawPicture;
    }

    public Designer(Designer designer) {
        super(designer);
        this.countDrawPicture = designer.countDrawPicture;
    }

    public int getCountDrawPicture() {
        return countDrawPicture;
    }

    public void setCountDrawPicture(int countDrawPicture) {
        if (countDrawPicture > 0) {
            this.countDrawPicture = countDrawPicture;
        }
    }

    @Override
    public String toString() {
        return "Designer{" +
                super.toString()+
                "countDrawPicture=" + countDrawPicture +
                '}';
    }
}
