package modules.converter;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Requires int")
public class CtoF extends ModuleStructure {

    public CtoF(List<String> args) {
        super(args);
        System.out.println(convertCtoF(parseInt(args.get(1))));
    }

    private double convertCtoF(double c) {
        //c = (5/9) * f - 32
        return c * ((double) 9 / 5)  + 32;
    }
}
