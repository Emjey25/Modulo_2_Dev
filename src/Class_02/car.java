package Class_02;

public class car extends vehicle {

    public int numPuertas;

    public car(String brand, String model, int maxspeed, int numPuertas) {
        super(brand, model, maxspeed);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "car{" + "numPuertas=" + numPuertas + '}';}

    

    


    
    
    
}
