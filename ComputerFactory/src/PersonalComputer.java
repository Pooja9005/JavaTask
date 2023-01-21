public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Moniter moniter;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,
                            Moniter moniter, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.moniter = moniter;
        this.motherBoard = motherBoard;
    }
    private void drawLogo(){
        moniter.drawPixelAt(1200,50,"yello");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Moniter getMoniter() {
//        return moniter;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
