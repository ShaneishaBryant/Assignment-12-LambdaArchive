import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Lumos", 50, "Illusion", false));
        spells.add(new Spell("Vaporize", 90, "Necromancy", true));
        spells.add(new Spell("Hellfire", 100,"Evocation",true));
        spells.add(new Spell("Polymorph", 60, "Transmutation", false));
        spells.add(new Spell("Shadow Step", 70, "Illusion", false));
        spells.add(new Spell("Shield Charm", 30,"Abjuration", false));
        spells.add(new Spell("Memory Wipe", 50, "Enchantment", true));
        spells.add(new Spell("Avada Kedarva", 100, "Necromancy", true));
        spells.add(new Spell("Detect Magic", 10,"Divination", false));
        spells.add(new Spell("Healer", 30,"Restoration", false));


        System.out.println("======INTERGALACTIC ARCHIVE OF FORBIDDEN SPELLS======= ");



        //STREAM PIPELINE//
        String specificSchool = "Necromancy";

        //.stream() converts arrayList into a stream
        //.filter() checks if match exist
        //.collect() gathers all matching spells into brand-new list

        List<Spell> filteredSpells = spells.stream()
                .filter(spell -> spell.getSchool().equals(specificSchool))
                .sorted((Comparator.comparingInt(Spell::getPowerLevel)).reversed())
                .collect(Collectors.toList());

        for(Spell spell : filteredSpells){
            System.out.println(spell);
        }
    }
}
