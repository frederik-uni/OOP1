package modules;

import java.util.List;

public abstract class ModuleStructure {
    protected List<String> args;

    public ModuleStructure(List<String> args) {
        this.args = args;
    }
}
