package modules.circle;

import modules.ModuleStructure;

import java.util.List;
import java.util.Objects;

import static java.lang.Double.parseDouble;

public class CircleCalc extends ModuleStructure {
    public CircleCalc(List<String> args) {
        super(args);
        String mode = args.get(1);
        try {
            double num = parseDouble(args.get(2));
            CircleModule cm;
            if (Objects.equals(mode, "r")){
                cm = CircleModule.fromRadius(num);
            }else if (Objects.equals(mode, "d")){
                cm = CircleModule.fromDurchmesser(num);
            }else if (Objects.equals(mode, "v")){
                cm = CircleModule.fromVolume(num);
            }else if (Objects.equals(mode, "u")){
                cm = CircleModule.fromUmfang(num);
            }else {
                System.out.println("Invalid first value");
                return;
            }
            System.out.println("Durchmesser: "+cm.getDurchmesser());
            System.out.println("Radius: "+cm.getRadius());
            System.out.println("Umfang: "+cm.getUmfang());
            System.out.println("Volume: "+cm.getVolume());
        }catch (Exception e) {
            System.out.println("Second value wasnt a number");
        }
    }
}
