package Day10.Assigment.Qustion2;

public class ScienceStudent extends Student{

   int phisicsMarks;
    int chemistryMarks;
    int mathsMarks;

    public int getPhisicsMarks() {
        return phisicsMarks;
    }

    public void setPhisicsMarks(int phisicsMarks) {
        this.phisicsMarks = phisicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    @Override
    public double getPercentage() {
        double total=(getChemistryMarks()+getMathsMarks()+getChemistryMarks())/3;
        return total;
    }
    public void details(){
        System.out.println(getName());
        System.out.println(getAddress());
    }
}
