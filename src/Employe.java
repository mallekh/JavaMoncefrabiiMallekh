public class Employe {
    private   int id ;
    private String nom;
    private String prenom;
    private String nomdepartement;
    private int grade ;
    public  Employe(){}
    public Employe( int id,String nom,String prenom,String nomdepartement,int grade)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomdepartement=nomdepartement;
        this.grade=grade;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomdepartement() {
        return nomdepartement;
    }

    public void setNomdepartement(String nomdepartement) {
        this.nomdepartement = nomdepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomdepartement='" + nomdepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public boolean equals(Object obj )
    {
        if (this == obj ) return true;
        if (obj == null  || getClass() !=obj.getClass()) return  false;
        Employe employe =(Employe) obj;
        return id == employe.id && java.util.Objects.equals(nom, employe.nom);
    }
}
