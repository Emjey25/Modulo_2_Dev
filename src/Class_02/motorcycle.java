package Class_02;

public class motorcycle extends vehicle{ 

    public boolean hasSidecar;

    public motorcycle(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public motorcycle(String brand, String model, int maxspeed, boolean hasSidecar) {
        super(brand, model, maxspeed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "motorcycle{" + "hasSidecar=" + hasSidecar + '}';}

    


    
}
