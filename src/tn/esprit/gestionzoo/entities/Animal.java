package tn.esprit.gestionzoo.entities;
public  class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal (){
        this.family="";
        this.name="";
        this.age=0;
        this.isMammal=true;

    }
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }


    public String getName() {
        return name;
    }
}
