package modules.loop;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;
@ModuleDescription("Requires int")

public class Fib extends ModuleStructure {
    public Fib(List<String> args) {
        super(args);
        for (int i : fib(Integer.parseInt(args.get(1)))) {
            System.out.println(i);
        }

        System.out.println(steps(Integer.parseInt(args.get(1))));
    }

    protected int[] fib(int n) {
        int[] data = new int[n];
        data[0] = 1;
        data[1] = 1;
        for (int i = 2; i < n; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data;
    }

    protected int steps(int num) {
        int steps = 0;
        while(num > 1) {
            num /= 2;
            steps += 1;
        }

        return steps;
    }
}
