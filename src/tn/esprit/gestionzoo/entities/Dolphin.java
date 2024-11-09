package tn.esprit.gestionzoo.entities;

public final class Dolphin extends  Aquatic {
    protected float swimmingSpeed;
    public Dolphin(String name, int age) {
        super("Cétacé", name, age, true, "Océan");
    }
    @Override
    public String toString() {
        return super.toString() + ", Type: Dauphin";
    }

    @Override
    public void swim() {
        System.out.println("the dolphin is swiming  ");
    }
}
