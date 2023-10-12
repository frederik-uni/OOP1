package modules.nums;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Requires int")
public class GetFakultaet extends ModuleStructure {
    public GetFakultaet(List<String> args) {
        super(args);
        try {
            System.out.println(fak(parseInt(args.get(1))));
        } catch (Exception e) {
            System.out.println("Not a valid number");
        }
    }

    public int fak(int num) {
        int res = 1;
        for (int i = num; i > 0; i -= 1) {
            res *= i;
        }
        return res;
    }
}
