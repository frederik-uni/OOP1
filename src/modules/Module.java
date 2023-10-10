package modules;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Module<T extends ModuleStructure> {
    private final String name;
    private final Class<T> aClass;
    public final String description;
    public Module(Class<T> aClass, String description) {
        this.aClass = aClass;
        this.name = aClass.getSimpleName();
        this.description = description;
    }
    public ModuleStructure run(List<String> args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return aClass.getConstructor(List.class).newInstance(args);
    }

    public String getName() {
        return name;
    }
}
