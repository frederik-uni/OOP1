package modules.read;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;
import java.util.Scanner;

@ModuleDescription("No input")
public class TwoNums extends ModuleStructure {
    public TwoNums(List<String> ignoredArgs_) {
        super(ignoredArgs_);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Int1: ");
        int int1 = scanner.nextInt();
        System.out.print("Int2: ");
        int int2 = scanner.nextInt();
        scanner.close();
        System.out.println(int1 +" "+int2);
    }
}
