package modules.uncatego;

public class ElectricCar extends Car implements Electric {
    public ElectricCar(int range) {
        super(EngineType.Elektro);
        this.range = range;
    }

    private int range;

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public void setRange(int range) {
        this.range = range;
    }
}
