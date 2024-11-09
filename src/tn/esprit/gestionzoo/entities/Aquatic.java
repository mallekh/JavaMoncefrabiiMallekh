package tn.esprit.gestionzoo.entities;

public abstract sealed class Aquatic extends  Animal permits Dolphin ,Penguin {
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim(){
        System.out.println("this aquatic animal is swiming ");
    }
}
