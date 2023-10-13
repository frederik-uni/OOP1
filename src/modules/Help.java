package modules;

import java.util.List;

public class Help extends ModuleStructure {
    public Help(List<String> args) {
        super(args);
        for (Module<?> module : ModuleManager.getInstance().getModules()) {
            System.out.println(module.getName() + "       " + module.description);
        }
    }
}
