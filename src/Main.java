import modules.Module;
import modules.ModuleManager;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ArrayList<Module<?>> modules = ModuleManager.getInstance().getModules();
        List<String> arr;
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available modules: " + modules.stream().map(Module::getName).map(Main::firstLower).collect(Collectors.joining(", ")));

            System.out.print("Please insert args: ");

            String res = scanner.nextLine();
            arr = Arrays.asList(res.split(" "));
            // Closes System.in
            //scanner.close();
        } else {
            arr = Arrays.asList(args);
        }
        if (arr.isEmpty()) {
            System.out.println("No module selected");
            return;
        }
        String m = arr.get(0).toLowerCase();
        Optional<Module<?>> module = modules.stream().filter(item -> Objects.equals(item.getName().toLowerCase(), m)).findFirst();
        if (!module.isPresent()) {
            System.out.println("No module found");
        } else {
            module.get().run(arr);
        }
    }

    private static String firstLower(String s) {
        return s.subSequence(0, 1).toString().toLowerCase() + s.substring(1);
    }
}