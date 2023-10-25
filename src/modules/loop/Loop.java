package modules.loop;

import modules.ModuleStructure;

import java.util.Arrays;
import java.util.List;

public class Loop extends ModuleStructure {
    public Loop(List<String> ignoredArgs_) {
        super(ignoredArgs_);
        int[] arr = new int[]{1, 2, 3, 4};
        contains(1, arr);
        contains2(1, arr);
        rev(arr);
        rev2(arr);
    }

    private static boolean contains(int item, int[] items) {
        return Arrays.stream(items).anyMatch(i -> i == item);
    }

    private static boolean contains2(int item, int[] items) {
        for (int i : items) {
            if (i == item) {
                return true;
            }
        }
        return false;
    }

    private static int[] rev(int[] items) {
        int[] res = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            res[i] = items[items.length - 1 - i];
        }
        return res;
    }

    private static boolean rev2(int[] items) {
        int[] copy = Arrays.copyOf(items, items.length);
        for (int i = 0; i < copy.length; i++) {
            items[i] = copy[copy.length - 1 - i];
        }
        return true;
    }
}
