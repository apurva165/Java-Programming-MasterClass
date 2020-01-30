package section7.encapasulationchallenge;

public class Printer {
    private  int tonerLevel;
    private  int numOfPagePrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numOfPagePrinted , boolean isDuplexPrinter) {
        if(tonerLevel >= 100){
            System.out.println("replace toner");
        }
        this.tonerLevel = tonerLevel;
        this.numOfPagePrinted = numOfPagePrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagePrinted() {
        return numOfPagePrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
