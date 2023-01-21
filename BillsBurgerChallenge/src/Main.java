public class Main {

    public static void main(String[] args) {

        Item coke =new Item("drink","coke",1.50);
        coke.priceItem();
        coke.setSize("LARGE");
        coke.priceItem();

        Item avoCado = new Item("Topping","avoCado",1.50);
        avoCado.priceItem();


    }
}
