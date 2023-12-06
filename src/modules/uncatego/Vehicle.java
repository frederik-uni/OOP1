package modules.uncatego;

public class Vehicle {
    private final String brand;
    private final String model;
    private final int year;

    public Vehicle(String brand, String model, int year, EngineType engine) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle objCast = ((Vehicle) obj);
        return objCast.brand.equals(this.brand) && objCast.year == this.year && objCast.model.equals(this.model);
    }

    @Override
    public String toString() {
        return String.format("Marke: %s Model: %s Year: %d", brand, model, year);
    }

    public String getBrand() {
        return brand;
    }
}
