package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

public class StatAboutEmpSalary {
        public static final int FIRSTRANGE = 100;
        public static final int SECONDRANGE = 300;
        public Employer topSalary[][] = new Employer[3][5];
        public int countOnFirstLine = 0;
        public int countOnSecondLine = 0;
        public int countOnThirdLine = 0;

        public void addEmployer(Employer employer){
            if ( employer.salary <FIRSTRANGE){
                topSalary[0][countOnFirstLine++] = employer;
            }
            else if (employer.salary <SECONDRANGE ){
                topSalary[1][countOnSecondLine++] = employer;
            }
            else{
                topSalary[2][countOnThirdLine++] = employer;
            }
        }

        public StringBuffer getLine(int number){
            int countInLine;
            StringBuffer mass = new StringBuffer();
            if (number == 1){
                countInLine = countOnFirstLine;
            } else if(number == 2){
                countInLine = countOnSecondLine;
            } else {
                countInLine = countOnThirdLine;
            }
            for (int i = 0; i < countInLine; i++){
                mass.append(topSalary[number-1][i] + "\n");
            }
            return mass;
        }
    }

