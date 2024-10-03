import java.util.Arrays;

public class Zoo {
    private Animal[] animals;  // Tableau d'animaux
    private int animalCount;    // Compteur d'animaux
    String name;
    String city;
    int nbCages;

    // Constructeur par défaut
    Zoo() {
        this.animals = new Animal[10]; // Initialise un tableau de taille fixe
        this.animalCount = 0;          // Initialise le compteur d'animaux à 0
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

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        // Vérifie si l'animal est déjà présent dans le zoo
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo."); // Avertir que l'animal existe déjà
            return false; // L'animal ne peut pas être ajouté
        }

        // Vérifie si le tableau a de la place
        if (animalCount < animals.length) {
            animals[animalCount] = animal;  // Ajoute l'animal à la première case disponible
            animalCount++;                   // Incrémente le compteur d'animaux
            return true;                    // Retourne true pour indiquer que l'ajout a réussi
        }

        System.out.println("Le zoo est plein. Impossible d'ajouter cet animal."); // Avertir que le zoo est plein
        return false; // Retourne false si le tableau est plein
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal); // Cherche l'animal dans le zoo
        if (index != -1) { // Si l'animal est trouvé
            // Décale tous les animaux suivants d'une position vers la gauche
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null; // Nullifie la dernière case
            animalCount--; // Décrémente le compteur d'animaux
            System.out.println("Animal supprimé avec succès.");
            return true; // Retourne true pour indiquer que la suppression a réussi
        }
        System.out.println("L'animal n'existe pas dans le zoo."); // Avertir que l'animal n'est pas trouvé
        return false; // Retourne false si l'animal n'est pas trouvé
    }

    // Méthode pour afficher les animaux
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour chercher un animal par son nom
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

}
