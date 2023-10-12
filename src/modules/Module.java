package modules;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Module<T extends ModuleStructure> {
    public final String description;
    private final String name;
    private final Class<T> clazz;

    public Module(Class<T> clazz, String description) {
        this.clazz = clazz;
        this.name = clazz.getSimpleName();
        this.description = description;
    }

    public void run(List<String> args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.clazz.getConstructor(List.class).newInstance(args);
    }

    public String getName() {
        return name;
    }
}
