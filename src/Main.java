import modules.Module;
import modules.circle.CircleCalc;
import modules.hw.HelloThread;
import modules.prime.IsPrime;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Module> modules = new ArrayList<>();

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        register();
        Collections.reverse(modules);
        List<String> arr;
        //TODO: add help
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available modules: " + modules.stream().map(Module::getName).collect(Collectors.joining(", ")));

            System.out.print("Please insert args: ");

            String res = scanner.nextLine();
            arr = Arrays.asList(res.split(" "));
        } else {
            arr = Arrays.asList(args);
        }
        if (arr.isEmpty()) {
            System.out.println("No module selected");
            return;
        }
        String m = arr.get(0);
        Optional<Module> module = modules.stream().filter(item -> Objects.equals(item.getName(), m)).findFirst();
        if (!module.isPresent()) {
            System.out.println("No module found");
        } else {
            module.get().run(arr);
        }
    }

    private static void register() {
        modules.add(new Module(HelloThread.class, "Requires int"));
        modules.add(new Module(IsPrime.class, "Requires int"));
        modules.add(new Module(CircleCalc.class, "Requires char(r, d, u, v) and double"));
    }
}