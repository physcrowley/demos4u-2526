/* Démonstration de concepts de la programmation orientée objet

CONCEPTS

Éléments static:
    mot-clé : static
    idée: attribut ou méthode appartenant directement à la classe,
            non aux instances de la classe

Heritage:
    mot-clés: class, extends, protected, this(), this., super(), @Override
    terminologie: parent, enfant, supplanter, polymorphisme
    idée: un enfant 'est un' objet du type parent, tout en ayant la
            spécificité définie dans sa propre classe
    contrainte: héritage singulier : une seule classe parent à part Object
                (qui est toujours hérité par défaut)

Composition:
    mot-clés: interface, abstract, implements
    terminologie: interfaces, classes abstraites, polymorphisme,
                    expressions lambda, injection de dépendances 
    idée: un objet 'as une' instance d'un autre objet qui lui fourni
            une partie de ses comportements et attributs
    contrainte: implémentation multiple : une classe peut implémenter
                plusieurs interfaces; MAIS peut seulement hérité d'une
                seule classe abstraite (héritage singulier)

Par : David Crowley
Date : 3 décembre 2025
*/

public class Person {
    protected String name;
    protected Job job;
    protected Residence residence;
    private static int population = 0;

    Person(String name, Job job, Residence residence) {
        this.name = name;
        this.job = job;
        this.residence = residence;

        population++;
    }

    Person(String name) {
        this(name, null, null);
    }

    Person() {
        this("Insérer Nom", null, null);
    }

    public static int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return name;
    }
}

/* Diagramme de classe UML
 * 
 * class Person
 * ---------------------------------------
 * ~name: String
 * ~job: Job
 * ~residence: Residence
 * ---------------------------------------
 * +Person(String, Job, Residence): Person
 * +Person(String): Person
 * +Person(): Person
 * +toString(): String
 * 
 */
