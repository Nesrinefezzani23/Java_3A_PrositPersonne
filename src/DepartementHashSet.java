import java.util.HashSet;
import java.util.TreeSet;

abstract public class DépartementHashSet implements IDepartement<Département> {
    private HashSet<Département> Départements;

    public DépartementHashSet() {
        this.Départements = new HashSet<>();
    }

    @Override
    public void ajouterDépartement(Département d) {
        if (Départements.add(d)) {
            System.out.println("Département ajouté : " + d);
        } else {
            System.out.println("Le département existe déjà : " + d);
        }
    }

    @Override
    public boolean rechercherDépartement(String nom) {
        for (Département d : Départements) {
            if (d.getNomDépartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDépartement(Département d) {
        return Départements.contains(d);
    }

    @Override
    public void supprimerDépartement(Département d) {
        if (Départements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("Le département n'existe pas : " + d);
        }
    }

    @Override
    public void displayDépartement() {
        if (Départements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            System.out.println("Liste des départements :");
            for (Département d : Départements) {
                System.out.println(d);
            }
        }
    }

    @Override
    public TreeSet<Département> trierDépartementById() {
        TreeSet<Département> sortedDépartements = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedDépartements.addAll(Départements);
        return sortedDépartements;
    }
}
