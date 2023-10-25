package modules.loop;

import modules.ModuleStructure;

import java.util.Arrays;
import java.util.List;

public class StringFromChar extends ModuleStructure {
    public StringFromChar(List<java.lang.String> ignoredArgs_) {
        super(ignoredArgs_);
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        build_fast('c', 715900000);
        System.out.println(System.currentTimeMillis() - start2);
    }
    public String build_slow(char c, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public String build_fast(char c, int n) {
        char[] ch = new char[n];
        Arrays.fill(ch, c);
        return new String(ch, 0, n);
    }
}
