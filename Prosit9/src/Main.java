public class Main {
    public static void main(String[] args) {
        SocieteArrayList gestion = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(1, "Ben Ali", "Hassan", "Informatique", 2);
        Employe e2 = new Employe(2, "Trabelsi", "Sarra", "Marketing", 3);
        Employe e3 = new Employe(3, "Zouari", "Mounir", "Finance", 1);

        // Ajouter des employés
        gestion.ajouterEmploye(e1);
        gestion.ajouterEmploye(e2);
        gestion.ajouterEmploye(e3);

        // Afficher la liste des employés
        gestion.displayEmploye();

        // Rechercher un employé
        System.out.println("Recherche de l'employé 'Ben Ali' : " + gestion.rechercherEmploye("Ben Ali"));

        // Trier les employés par ID
        gestion.trierEmployeParId();
        gestion.displayEmploye();

        // Trier les employés par nom, département et grade
        gestion.trierEmployeParNomDépartementEtGrade();
        gestion.displayEmploye();

        // Supprimer un employé
        gestion.supprimerEmploye(e2);
        gestion.displayEmploye();
    }
}

