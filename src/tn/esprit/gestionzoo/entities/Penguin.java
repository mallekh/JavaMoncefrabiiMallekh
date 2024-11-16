package tn.esprit.gestionzoo.entities;

public final  class Penguin  extends  Aquatic {
    protected float swimmingDepth;
    public Penguin(String name, int age,Float S) {
        super("Oiseau", name, age, false, "Régions Polaires");
        this.swimmingDepth=S;
    }
    @Override
    public String toString() {
        return super.toString() + ", Type: Pingouin";
    }
    @Override
    public  void swim()
    {
        System.out.println("je suis un penguin ");
    }
    public Float getMaxSwimmingDepth(){
        return   swimmingDepth;

    }
}
