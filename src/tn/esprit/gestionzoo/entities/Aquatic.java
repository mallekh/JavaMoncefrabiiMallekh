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




    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Vérifie si c'est la même instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Vérifie si l'objet est non nul et du même type
        }
        Aquatic other = (Aquatic) obj; // Conversion en Aquatic

        // Vérifie l'égalité des attributs pertinents
        return name.equals(other.name) &&
                age == other.age &&
                habitat.equals(other.habitat);
    }
public abstract void swim();

}
