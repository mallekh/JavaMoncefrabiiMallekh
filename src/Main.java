public class Main {
    public static void main(String[] args) {
       /* Animal lion =new Animal();
        Zoo myZoo=new Zoo();
        lion.family="aziz";
        lion.name="lion";
        lion.age=21;
        lion.isMammal=true;
       //  System.out.println(lion.family);
        // lajout du tableau animal??*/
        Animal lion =new Animal("filedae","lion",23,true);
        Animal tiger =new Animal("filedae","tiger",24,true);
        Animal[] animals  = new Animal[25];
        animals[0]= lion;
        animals[1]= tiger;




        Zoo myZoo=new Zoo("bouderbela","gafsa",40);
       System.out.println( myZoo);
       //System.out.println(myZoo.toString() );
       System.out.println(lion.toString() );
       System.out.println();


    }
}
