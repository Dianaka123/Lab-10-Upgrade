package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

public class Employer {
    public static int employerAmount;
    public String name;
    public int salary;
    public String typeOfWork;
    public int age;
    public int numOfExperience;
    public String weAreFriends;
    public String fail;

    static {
        employerAmount = 0;
    }

    {
        employerAmount++;
    }


    public Employer() {
        name = "no name";
        salary = 0;
        typeOfWork = "no job";
        age = 0;
        numOfExperience = 0;
    }

    public Employer(String name, int salary, String typeOfWork, int age, int numOfExperience) {
        this.name = name;
        this.salary = salary;
        this.typeOfWork = typeOfWork;
        this.age = age;
        this.numOfExperience = numOfExperience;
    }

    public Employer(Employer employer) {
        name = employer.name;
        salary = employer.salary;
        typeOfWork = employer.typeOfWork;
        age = employer.age;
        numOfExperience = employer.numOfExperience;
    }

    public String makeFail() {
        fail = "UUUPPPS";
        return fail;
    }

    public String stayFriend() {
        weAreFriends = "Hello! Now we are friends!";
        return weAreFriends;
    }

    @Override
    public String toString() {
        return name + " " + age + " years " + "(" + salary + "$" + ")" + " -- " + typeOfWork + " " + "Experience = " +
                numOfExperience + " " + "years";
    }


}
