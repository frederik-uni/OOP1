package modules.loop;

import modules.ModuleStructure;

import java.util.List;

public class Fib extends ModuleStructure {
    public Fib(List<String> ignoredArgs_) {
        super(ignoredArgs_);
        for (int i : fib(5)) {
            System.out.println(i);
        }
    }

    protected int[] fib(int n) {
        int[] data = new int[n];
        data[0] = 0;
        data[1] = 1;
        for (int i = 2; i < n; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data;
    }
}
