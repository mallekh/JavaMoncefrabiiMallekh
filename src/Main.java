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


        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal identicalLion = new Animal("Felidae", "Lion", 4, true); // Même nom mais age différent


        System.out.println(zoo.addAnimal(lion));    // true
        System.out.println(zoo.addAnimal(elephant)); // true
        System.out.println(zoo.addAnimal(identicalLion)); // false, animal déjà présent


        zoo.displayAnimals();


        for (int i = 0; i < 8; i++) {
            System.out.println(zoo.addAnimal(new Animal("Family " + i, "Animal " + i, i + 1, true)));
        }


        zoo.displayAnimals();
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
        zoo2.addAnimal( new Animal("Felidae", "Lion", 5, true));
        zoo2.addAnimal(new Animal("Felidae", "Lion", 5, true));

        // Test de la méthode isZooFull pour chaque zoo
        System.out.println("Le zoo1 est-il plein ? " + zoo1.isZooFull());
        System.out.println("Le zoo2 est-il plein ? " + zoo2.isZooFull());

        // Test de la méthode comparerZoo
        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est " + zooAvecPlusAnimaux.name + " avec " + zooAvecPlusAnimaux.getNombreAnimaux() + " animaux.");
    }


    }

