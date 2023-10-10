package modules;

import modules.circle.CircleCalc;
import modules.hw.HelloThread;
import modules.prime.IsPrime;

import java.util.ArrayList;
import java.util.Collections;

public class ModuleManager {
    private static ModuleManager instance;
    private final ArrayList<Module> modules = new ArrayList<>();

    public ModuleManager() {
        register();
        Collections.reverse(modules);
    }

    public static ModuleManager getInstance() {
        if (instance == null){
            instance = new ModuleManager();
        }
        return instance;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    private void register() {
        modules.add(new Module(Help.class, ""));
        modules.add(new Module(HelloThread.class, "Optional int"));
        modules.add(new Module(IsPrime.class, "Requires int"));
        modules.add(new Module(CircleCalc.class, "Requires char(r, d, u, v) and double"));
    }
}
