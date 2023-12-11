package modules.date;

import modules.ModuleDescription;
import modules.ModuleStructure;

import java.util.List;

import static java.lang.Integer.parseInt;

@ModuleDescription("Requires string, date in format day.month.year")
public class PersonBrithdate extends ModuleStructure {
    public PersonBrithdate(List<String> args) {
        super(args);
        try {
            Person p = new Person(args.get(1), args.get(2));
            System.out.println(p);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
