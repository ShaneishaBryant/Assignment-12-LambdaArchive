public class Spell {
    private String name;
    private int powerLevel;
    private String school;
    private boolean isDangerous;

    public Spell(String name, int powerLevel, String school, boolean isDangerous){
        this.name = name;
        setPowerLevel(powerLevel);
        this.school = school;
        this.isDangerous = isDangerous;
    }

    public String getName(){return name;}
    public int getPowerLevel(){return powerLevel;}
    public String getSchool(){return school;}
    public boolean isDangerous(){return isDangerous;}

    //powerLevel setter with validation logic
    public void setPowerLevel(int powerLevel){
        if (powerLevel < 0){
            throw new IllegalArgumentException("Power level cannot be negative.");
        }
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "Spell: " + name + " | Power Level: " + powerLevel +
                " | School of Magic: " + school + " | Dangerous? " + isDangerous;
    }




}
