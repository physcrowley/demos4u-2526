/*
Démontrer quelques éléments de base de Java
Par : David Crowley
Date : 17 novembre 2025
*/

public class Menu {
    /** Liste d'items pour les choix de menu */
    String[] items = {
        "Manger",
        "Jouer",
        "Dormir",
        "Boire"
    };

    /**
     * Vérifie si le choix fait partie des éléments de {@code this.items}
     * @param choice texte à valider
     * @return le texte 'choice' si valide, 'null' sinon
     */
    String validateStr(String choice) {
        for (String i : items) {
            if (choice.equalsIgnoreCase(i)) {
                return choice;
            }
        }
        return null;
    }

    /**
     * Point d'entrée du programme
     * @param args pas utilisés
     */
    public static void main(String[] args) {
        Menu q = new Menu();
        IO.println("ACTIONS");
        for (String c : q.items) {
            IO.println("   " + c);
        }
        String answer = IO.readln("Que voulez-vous faire > ");
        answer = q.validateStr(answer);
        if (answer == null) {
            IO.println("pas un choix valide");
        } else {
            IO.println("OK");
        }
    }

}
