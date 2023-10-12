package modules.hw;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Optional int")
public class HelloThread extends ModuleStructure {
    public HelloThread(List<String> args) {
        super(args);
        int n;
        try {
            n = parseInt(args.get(1));
        } catch (Exception e) {
            n = 10;
        }

        for (int i = 0; i < n; i++) {
            HelloThreadModule thread = new HelloThreadModule();
            thread.start();
        }
    }
}
