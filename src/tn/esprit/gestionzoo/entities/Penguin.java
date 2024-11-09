package tn.esprit.gestionzoo.entities;

public final  class Penguin  extends  Aquatic {
    protected float swimmingDepth;
    public Penguin(String name, int age) {
        super("Oiseau", name, age, false, "Régions Polaires");
    }
    @Override
    public String toString() {
        return super.toString() + ", Type: Pingouin";
    }
}
