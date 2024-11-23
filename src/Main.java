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

        // Trier les egestionDepartements.displayDepartement();
        //
        //        // Trier par ID
        //        System.out.println("Tri par ID : " + gestionDepartements.trierDepartementById());mployés par nom, département et grade
        gestion.trierEmployeParNomDépartementEtGrade();
        gestion.displayEmploye();

        // Supprimer un employé
        gestion.supprimerEmploye(e2);
        gestion.displayEmploye();
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 20);
        Departement d2 = new Departement(2, "Mathématiques", 15);
        Departement d3 = new Departement(3, "Physique", 10);

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        // Afficher les départements
        gestionDepartements.displayDepartement();

        // Rechercher un département par nom
        System.out.println("Recherche 'Mathématiques': " + gestionDepartements.rechercheDepartement("Mathématiques"));

        // Supprimer un département
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();

        // Trier par ID
        System.out.println("Tri par ID : " + gestionDepartements.trierDepartementByid());
    }
}

