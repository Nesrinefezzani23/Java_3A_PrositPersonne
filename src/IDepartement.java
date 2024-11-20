import java.util.TreeSet;

abstract public interface IDepartement<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String nom);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void displayDepartement();
    TreeSet<T> trierDepartementById();
}





