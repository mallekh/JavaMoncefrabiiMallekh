import java.util.Comparator;
import java.util.List ;
import java.util.ArrayList;
public class SocieteArrayList implements  IGestion {
    private List<Employe> employeList = new ArrayList<>();
    @Override
    public void ajouterEmploye( Object o) {
        if( o instanceof  Employe)
        {
            employeList.add((Employe)o);
            System.out.println("Ajout de l'employe avec succes ");
        }else {
            System.out.println("une Erreur est survenu lors de l'ajout");
        }

    }

    @Override
    public void displayEmploye() {
        if (employeList.isEmpty()){
            System.out.println(" la  liste est vide ");
        }
        else {
            for (Employe e : employeList){
                System.out.println(e);

            }
        }

    }

    @Override
    public void supprimerEmploye(Object o) {
        if(o instanceof Employe)
        {
            if(employeList.remove(o)){
                System.out.println("suppresion avec succes");
            }else {
                System.out.println("erreur survenu lorss de las suppression de lemploye");
            }
        }

    }

    @Override
    public boolean rechercherEmploye(Object o) {
        if (o instanceof  Employe)
        {
            return employeList.contains(o);


        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e: employeList)
        {
            if(e.getNom().equals(nom)){
                return true ;
            }
        }
        return false;
    }

    @Override
    public void trierEmployeParId() {
        employeList.sort(Comparator.comparingInt(Employe::getId));
        System.out.println("liste trie par id ");

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employeList.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomdepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println("Liste triée par nom, département et grade.");

    }
}
