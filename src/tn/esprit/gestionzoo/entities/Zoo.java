
package tn.esprit.gestionzoo.entities;
import java.util.Arrays;


public class Zoo {
    private Animal[] animals;
    private int animalCount;
    private String name;
    private String city;
    int nbCages;
    private Animal[] aquaticAnimals = new Animal[10];

    // Constructeur par défaut
    Zoo() {
        this.animals = new Animal[10];
        this.animalCount = 0;
        this.name = "";
        this.city = "";
        this.nbCages = 0;
    }

    // Constructeur paramétré
   public Zoo(String name, String city, int nbCages) {
        this.animals = new Animal[10]; // Initialise un tableau de taille fixe
        this.animalCount = 0;          // Initialise le compteur d'animaux à 0
        this.name = name;
        this.city = city;
        this.nbCages = nbCages;
    }

    public int getNombreAnimaux() {
        return animalCount;
    }
    public String getname(){return name;}
    // Méthode pour ajouter un animal
    public void addAnimal(Animal animal) throws ZooFullException {

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");

        }


        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;

        }

        throw new ZooFullException("Le zoo est plein. Impossible d'ajouter " + animal.getName() + ".");
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {

            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            System.out.println("Animal supprimé avec succès.");
            return true;
        }
        System.out.println("L'animal n'existe pas dans le zoo.");
        return false;
    }


    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(Arrays.copyOf(animals, animalCount)) + // Affiche uniquement les animaux ajoutés
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNombreAnimaux() > z2.getNombreAnimaux()) {
            return z1;
        } else {
            return z2;
        }
    }
    public boolean isZooFull() {
        return animalCount >= nbCages;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        // Parcourt le tableau pour trouver un emplacement vide
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println(aquatic.getName() + " a été ajouté au zoo !");
                return;
            }
        }
        // Si le tableau est plein
        System.out.println("Le tableau des animaux aquatiques est plein. Impossible d'ajouter " + aquatic.getName());
    }
    public void displayAquaticAnimals() {
        System.out.println("Liste des animaux aquatiques :");
        for (Animal aquatic : aquaticAnimals) {
            if (aquatic != null) {
                System.out.println("- " + aquatic);
            }
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Animal aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                maxDepth = Math.max(maxDepth, penguin.getMaxSwimmingDepth());
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;

        for (Animal aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphins++;
            } else if (aquatic instanceof Penguin) {
                penguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }


}
