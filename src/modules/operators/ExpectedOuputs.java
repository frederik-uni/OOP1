package modules.operators;

import modules.ModuleStructure;

import java.util.List;

public class ExpectedOuputs extends ModuleStructure {
    public ExpectedOuputs(List<String> ignoredArgs_) {
        super(ignoredArgs_);
        function();
        System.out.println(swap(2, 4));
    }

    public void function() {
        assert (63 & 31) == 31;
        assert (13 | 11) == 15;
        assert (15 ^ 7) == 8;
        assert (7 << 2) == 28;
        assert (~(byte) 127) == -128;
        System.out.println();
        System.out.println(13 | 11);
        System.out.println(15 ^ 7);
        System.out.println((7 << 2));
        System.out.println(~(byte) 127);
    }

    public String swap(int a, int b) {
        //a=0001 <= 1
        //b=0010 <= 2

        //a=0011 <= a ^ b
        //b=0010 <= nothing

        //b=0001 <= a^b
        //a=0010 <= a^b

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return a + " " + b;
    }
}
