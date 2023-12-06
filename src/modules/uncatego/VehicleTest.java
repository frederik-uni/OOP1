package modules.uncatego;

import modules.ModuleStructure;

import java.util.List;

public class VehicleTest extends ModuleStructure {
    public VehicleTest(List<String> ignoredArgs_) {
        super(ignoredArgs_);
        Vehicle o1 = new Vehicle("Audi", "A4", 2002, EngineType.Benzin);
        Vehicle o2 = new Vehicle("Audi", "A5", 2002, EngineType.Benzin);
        Vehicle o3 = new Vehicle("Audi", "A4", 2002, EngineType.Benzin);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1);

    }
}
