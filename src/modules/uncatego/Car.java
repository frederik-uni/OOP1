package modules.uncatego;

class Car {
    private final EngineType engine;

    public Car(EngineType engine) {
        this.engine = engine;
    }

    public String info() {
        return this.engine.info();
    }
}
