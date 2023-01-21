public class Main {

    public static void main(String[] args){

        Car car = new Car();
        car.setMake("Parchle");
        car.setModel("Crera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describCar();

        Car targa = new Car();
        targa.setMake("Parchle");
        targa.setModel("Crera");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("black");

        targa.describCar();

    }
}
