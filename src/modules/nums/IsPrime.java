package modules.nums;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Requires int")
public class IsPrime extends ModuleStructure {
    public IsPrime(List<String> args) {
        super(args);
        try {
            System.out.println(is_prime(parseInt(args.get(1))));
        } catch (Exception e) {
            System.out.println("Not a valid number");
        }
    }

    public static boolean is_prime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        int end = (int) Math.ceil(Math.sqrt(num));
        for (int i = 3; i < end; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
