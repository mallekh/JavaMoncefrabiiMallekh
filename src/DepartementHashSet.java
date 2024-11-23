import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    // Ajouter un département
    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté avec succès.");
        } else {
            System.out.println("Département déjà existant.");
        }
    }

    // Rechercher un département par nom
    @Override
    public boolean rechercheDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un département par objet
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    // Supprimer un département
    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé avec succès.");
        } else {
            System.out.println("Département introuvable.");
        }
    }

    // Afficher tous les départements
    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            System.out.println("Liste des départements :");
            for (Departement d : departements) {
                System.out.println(d);
            }
        }
    }

    // Trier les départements par ID
    @Override
    public TreeSet<Departement> trierDepartementByid() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
