import java.util.Arrays;

public class Zoo {
    Animal[] animals ;
    String name;
    String city;
    int nbCages;
    Zoo(){
      //  this.animals=animals;
        this.name="";
        this.city="";
        this.nbCages=0;

    }
    Zoo(String name,String city,int nbCages)
    {

        this.name=name;
        this.city=city;
        this.nbCages=nbCages;

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }
}
