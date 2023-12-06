package modules.uncatego;

public enum EngineType {
    Diesel,
    Benzin,
    Elektro;

    public String info() {
        return switch (this) {
            case Diesel -> "Diesel";
            case Benzin -> "Benzin";
            case Elektro -> "Elektro";
        };
    }
}
