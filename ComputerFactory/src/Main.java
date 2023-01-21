public class Main {

    public static void main(String[] args){

        ComputerCase theCase = new ComputerCase("2208","dell",
                "240");
        Moniter theMoniter = new Moniter("27 inch Beast","Acer",27,
                "2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("81-200","Asus",
                4,6,"v2.44");
        PersonalComputer thrPC = new PersonalComputer("2208","Dell",
                theCase,theMoniter,theMotherBoard);

//        thrPC.getMoniter().drawPixelAt(10,10,"red");
//        thrPC.getMotherBoard().loadProgram("Windowa OS");
//        thrPC.getComputerCase().pressPowerButton();
        thrPC.powerUp();

    }
}
