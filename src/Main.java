import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Lumos", 50, "Illusion", false));
        spells.add(new Spell("Vaporize", 93, "Necromancy", true));
        spells.add(new Spell("Hellfire", 95,"Necromancy",true));
        spells.add(new Spell("Polymorph", 60, "Transmutation", false));
        spells.add(new Spell("Shadow Step", 70, "Illusion", false));
        spells.add(new Spell("Shield Charm", 90,"Necromancy", false));
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

        List<String> mostPowerfulSpells = spells.stream()
                .filter(spell -> spell.getSchool().equalsIgnoreCase(specificSchool))
                .sorted(Comparator.comparingInt(Spell::getPowerLevel).reversed())
                .map(spell -> spell.getName()) //Why does it want to replace with method reference?
                .limit(3)
                .collect(Collectors.toList());

        if(mostPowerfulSpells.isEmpty()){
            System.out.println("No forbidden spells found for this school in the archive.");
        }else {
            for (String name : mostPowerfulSpells) {
                System.out.println(name);
            }
        }
    }
}
