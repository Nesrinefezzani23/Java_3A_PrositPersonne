public class Département {
    int id;
    String nomDépartement;
    int nbrEmployés;

    public Département(){}
    public Département(int id, String nomDépartement, int nbrEmployés) {
        this.id = id;
        this.nomDépartement = nomDépartement;
        this.nbrEmployés = nbrEmployés;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDépartement() {
        return nomDépartement;
    }

    public void setNomDépartement(String nom) {
        this.nomDépartement = nomDépartement;
    }

    public int getNombreEmployes() {
        return nbrEmployés;
    }

    public void setNombreEmployes(int nbrEmployés) {
        this.nbrEmployés = nbrEmployés;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nomDépartement + '\'' +
                ", nombreEmployes=" + nbrEmployés +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Département departement) {
            return id == departement.id && nomDépartement.equals(departement.nomDépartement);
        }
        return false;
    }

}
