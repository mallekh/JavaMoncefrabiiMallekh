import java.util.Scanner;
public class Zoomanagment {

    int nbrCages=0;
    String zooName="";
   public static void main (String[] args )
    {

        Zoomanagment myZoo=new Zoomanagment();//instansiation du classe
      //  System.out.println(myZoo.zooName);
      //  System.out.println(myZoo.nbrCages);
        Scanner myobj =new Scanner(System.in);
        System.out.println("donner le nom du zoo ");
        myZoo.zooName=myobj.nextLine();
        System.out.print("donner le nombre de cages ");
        myZoo.nbrCages=myobj.nextInt();
        System.out.println("nom du zoo :" + myZoo.zooName);
        System.out.println("nombre de cage :" + myZoo.nbrCages);


    }



}
