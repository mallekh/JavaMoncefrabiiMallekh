import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private int animalCount;
    String name;
    String city;
    int nbCages;

    // Constructeur par défaut
    Zoo() {
        this.animals = new Animal[10];
        this.animalCount = 0;
        this.name = "";
        this.city = "";
        this.nbCages = 0;
    }

    // Constructeur paramétré
    Zoo(String name, String city, int nbCages) {
        this.animals = new Animal[10]; // Initialise un tableau de taille fixe
        this.animalCount = 0;          // Initialise le compteur d'animaux à 0
        this.name = name;
        this.city = city;
        this.nbCages = nbCages;
    }

    public int getNombreAnimaux() {
        return animalCount;
    }
    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }


        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }

        System.out.println("Le zoo est plein. Impossible d'ajouter cet animal.");
        return false;
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

}
