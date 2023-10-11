package modules;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

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
        for(Class clazz : findAllClassesUsingClassLoader("")) {
            if (clazz == null) {
                continue;
            }
            if (clazz.isAnnotationPresent(ModuleDescription.class)) {
                ModuleDescription annotation = (ModuleDescription)clazz.getAnnotation(ModuleDescription.class);
                this.modules.add(new Module(clazz, annotation.value()));
            }
        }
    }

    public Set<Class> findAllClassesUsingClassLoader(String packageName) {
        String path = packageName.replaceAll("[.]", "/");
        if (!path.startsWith(".")) {
            path = "."+path;
        }
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        Set<Class> res = new HashSet<>();
        for (String s: reader.lines().collect(Collectors.toSet())) {
            if(s.endsWith(".class")) {
                res.add(getClass(s, packageName));
            }else {
                res.addAll(findAllClassesUsingClassLoader(packageName + "."+s));
            }
        }
        return res;
    }

    private Class getClass(String className, String packageName) {
        try {
            String name = packageName + "."
                    + className.substring(0, className.lastIndexOf('.'));
            if (name.startsWith(".")) {
                name = name.substring(1);
            }
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }
}
