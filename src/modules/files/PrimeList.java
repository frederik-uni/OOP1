package modules.files;

import modules.ModuleDescription;
import modules.ModuleStructure;
import modules.nums.IsPrime;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Requires string, int")
public class PrimeList extends ModuleStructure {
    public PrimeList(List<String> args) {
        super(args);
        writeToFile(args.get(1), primeGenerator(parseInt(args.get(2))));
        primeGeneratorv2(args.get(1), parseInt(args.get(2)));
    }

    public ArrayList<Integer> primeGenerator(int end) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        for(int i = 3; i < end; i +=2) {
            if (IsPrime.is_prime(i)) {
                items.add(i);
            }
        }
        return items;
    }

    public void primeGeneratorv2(String path, int end) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(path));
            ps.println(1);
            ps.println(2);
            for(int i = 3; i < end; i +=2) {
                if (IsPrime.is_prime(i)) {
                    ps.println(i);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void writeToFile(String path, ArrayList<Integer> data) {
        try(FileWriter file = new FileWriter(path);) {
            for(Integer s: data) {
                file.write(String.format("%d\n", s));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
