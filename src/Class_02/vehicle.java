package Class_02;

public class vehicle {
   
    public String brand;
    public String model;
    public int Maxspeed;


    public vehicle() {
        brand = "N/A";
        model = "N/A";
        Maxspeed = 0;
    }


    public vehicle(String brand, String model, int maxspeed) {
        this.brand = brand;
        this.model = model;
        Maxspeed = maxspeed;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public int getMaxspeed() {
        return Maxspeed;
    }


    public void setMaxspeed(int maxspeed) {
        Maxspeed = maxspeed;
    } 

    @Override
    public String toString() {
        return "vehicle [brand=" + brand + ", model=" + model + ", Maxspeed=" + Maxspeed + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        vehicle other = (vehicle) obj;
        return Maxspeed == other.Maxspeed && 
               brand.equals(other.brand) && 
               model.equals(other.model);
    }
}
