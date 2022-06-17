package Day10.Assigment.Qustion2;

public class HistoryStudent extends Student{

  int  historyMarks;
   int civicsMarks;

    public int getHistoryMarks() {
        return historyMarks;
    }

    public void setHistoryMarks(int historyMarks) {
        this.historyMarks = historyMarks;
    }

    public int getCivicsMarks() {
        return civicsMarks;
    }

    public void setCivicsMarks(int civicsMarks) {
        this.civicsMarks = civicsMarks;
    }

    @Override
    public double getPercentage() {
        double to=(getCivicsMarks()+getHistoryMarks())/2;
        return to;
    }
    public void details(){
        System.out.println(getName());
        System.out.println(getAddress());
    }
}
