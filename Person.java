/*
Méthodes et structure typique d'une classe

- explorer l'héritage

Par : David Crowley
Date : 3 décembre 2025
*/

public class Person {
    protected String name;
    protected Job job;
    protected Residence residence;

    Person(String name, Job job, Residence residence) {
        this.name = name;
        this.job = job;
        this.residence = residence;
    }

    Person(String name) {
        this(name, null, null);
    }

    Person() {
        this("Insérer Nom", null, null);
    }

    @Override
    public String toString() {
        return name;
    }
}


