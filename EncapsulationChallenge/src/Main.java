public class Main {

    public static void main(String[] args) {

       // Printer printer = new Printer(50,true);
        Printer printer = new Printer(50,false);
        System.out.println("Initial pages count " + printer.getPagesPrinted());

        int pagePrinted = printer.printPages(3);
        System.out.printf("Current job pages %d, printed total :%d %n",
                (pagePrinted),printer.getPagesPrinted());

        pagePrinted = printer.printPages(10);
        System.out.printf("Current job pages %d, printed total :%d %n",
                (pagePrinted),printer.getPagesPrinted());

    }
}
