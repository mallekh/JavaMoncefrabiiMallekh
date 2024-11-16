
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

       /* Animal lion =new Animal();
        Zoo myZoo=new Zoo();
        lion.family="aziz";
        lion.name="lion";
        lion.age=21;
        lion.isMammal=true;
        System.out.println(lion.family);
        // lajout du tableau animal??*/
       /* Animal lion =new Animal("filedae","lion",23,true);
        Animal tiger =new Animal("filedae","tiger",24,true);
        Animal[] animals  = new Animal[25];
        animals[0]= lion;
        animals[1]= tiger;





        Zoo myZoo=new Zoo("bouderbela","gafsa",40);
       System.out.println( myZoo);
       //System.out.println(myZoo.toString() );
       System.out.println(lion.toString() );
       System.out.println();*/
      /*s  Zoo zoo = new Zoo("National Zoo", "New York", 10);


        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);


        System.out.println(zoo.addAnimal(lion));
        System.out.println(zoo.addAnimal(elephant));
        System.out.println(zoo.addAnimal(eagle));
        zoo.displayAnimals();

        System.out.println(zoo);
        int index = zoo.searchAnimal(lion);
        System.out.println("Index de l'animal cherché: " + index);


        Animal identicalLion = new Animal("Felidae", "Lion", 5, true);


        int identicalIndex = zoo.searchAnimal(identicalLion);
        System.out.println("Index de l'animal identique cherché: " + identicalIndex);*/
        Zoo zoo = new Zoo("National Zoo", "New York", 10);
        try {
            Dolphin dolphin = new Dolphin("Dauphin", 5);
            zoo.addAnimal(dolphin);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal identicalLion = new Animal("Felidae", "Lion", 4, true); // Même nom mais age différent


       // System.out.println(zoo.addAnimal(lion));    // true
       // System.out.println(zoo.addAnimal(elephant)); // true
       // System.out.println(zoo.addAnimal(identicalLion)); // false, animal déjà présent


        zoo.displayAnimals();

/*
        for (int i = 0; i < 8; i++) {
            System.out.println(zoo.addAnimal(new Animal("Family " + i, "Animal " + i, i + 1, true)));
        }*/


      /*  zoo.displayAnimals();
        // Supprimer un animal
        boolean removedLion = zoo.removeAnimal(lion);
        System.out.println("Suppression de Lion réussie: " + removedLion); // true


        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        boolean removedTiger = zoo.removeAnimal(tiger);
        System.out.println("Suppression de Tiger réussie: " + removedTiger); // false


        Zoo zoo1 = new Zoo("Zoo National", "Paris", 10);
        Zoo zoo2 = new Zoo("Zoo Safari", "Lyon", 8);

        // Ajout d'animaux dans les zoos
        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));

        zoo2.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo2.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo2.addAnimal(new Animal("Felidae", "Lion", 5, true));

        // Test de la méthode isZooFull pour chaque zoo
        System.out.println("Le zoo1 est-il plein ? " + zoo1.isZooFull());
        System.out.println("Le zoo2 est-il plein ? " + zoo2.isZooFull());


        //Penguin P =new Penguin();
        //  Dolphin D = new Dolphin();
        // Terrestrial T= new Terrestrial();

        // Test de la méthode comparerZoo
        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est " + zooAvecPlusAnimaux.getname() + " avec " + zooAvecPlusAnimaux.getNombreAnimaux() + " animaux.");*/
       // Dolphin dolphin = new Dolphin("Flipper", 5);
      //  Penguin penguin = new Penguin("Pingu", 3);

        // Afficher les informations sur les animaux
       // System.out.println(dolphin.toString());
       // System.out.println(penguin.toString());
        Aquatic dolphin = new Dolphin( "Dauphin", 8);
        Aquatic shark = new Dolphin("Requin", 15);
        Aquatic clownfish = new Dolphin("Poisson-clown" ,2);

        // Ajout des animaux aquatiques au zoo
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(shark);
        zoo.addAquaticAnimal(clownfish);
        Dolphin dolphin1 = new Dolphin("Dauphin1", 8);
        Penguin penguin1 = new Penguin("Pingouin1", 5, 20.0f);
        Penguin penguin2 = new Penguin("Pingouin2", 3, 25.5f);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

       // zoo.allSwim();
        System.out.println("Profondeur maximale des pingouins : " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
        Dolphin dolphin4 = new Dolphin("Dauphin1", 5);
        Dolphin dolphin5 = new Dolphin("Dauphin1", 5);

        // Création d'un dauphin différent
        Dolphin dolphin6= new Dolphin("Dauphin2", 7);

        // Test de la méthode equals()
        System.out.println("Dolphin1 est égal à Dolphin2 ? " + dolphin4.equals(dolphin1)); // true
        System.out.println("Dolphin1 est égal à Dolphin3 ? " + dolphin1.equals(dolphin6)); // false


    }
}

