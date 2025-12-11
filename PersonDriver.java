/*
Une classe pilote pour la classe Person.

C'est le point d'entrée (méthode main) pour le programme
qui utilise Person.

Par : David Crowley
Date : 3 décembre 2025
*/

public class PersonDriver {
    public static void main(String[] args) {
        /* HÉRITAGE
        Relation "A est un(e) B"

        Mot-clé : extends
        Ici : Mister est une Person; Madame est une Person
        */
      
        /* 
         * Parce que chaque enfant EST UNE Person, on
         * peut les regrouper dans une collection du type
         * parent.
         * Avoir plusieurs formes de Person s'appelle le
         * POLYMORPHISME.
         */
        Person[] people = {
            new Person("Jacob"),
            new Mister("Xavier"),
            new Madame("Isla")
        };

        for (Person person : people) {
            IO.println(person);
        }
    }

}
