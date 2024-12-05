package Class_02;

public class App {
    public static void main(String[] args) throws Exception {

        vehicle vehicleOne = new vehicle("Honda", "CBR", 200);
        System.out.println(vehicleOne.toString());

        car carOne = new car("Honda", "CBR", 200, 4);
        System.out.println(carOne.toString());

        motorcycle motorcycleOne = new motorcycle("Honda", "CBR", 200, true);
        System.out.println(motorcycleOne.toString());

        vehicle vehicleTwo = new motorcycle("Honda", "CBR", 200, true);
        System.out.println(vehicleTwo.toString());
        System.out.println(vehicleOne.equals(vehicleTwo));

            


    

    }
}
