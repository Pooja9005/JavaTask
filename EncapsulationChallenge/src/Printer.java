public class Printer {

    private int tonerLevel;
    private  int pagesPrinted;
    private boolean Duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <= 100) ? tonerLevel : -1;
        Duplex = duplex;
    }

    public int addToner(int tonerAmount ){
        if (tonerAmount > 100 || tonerAmount < 0){
            return -1;
        }
        tonerLevel += -1;
        return tonerLevel;
    }

    public int printPages(int pages){

        int jobPages = (Duplex) ? (pages / 2) +(pages % 2) : pages;
        pagesPrinted = jobPages;
        return  jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
