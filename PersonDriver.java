/*
Une classe pilote pour la classe Person
Par : David Crowley
Date : 3 décembre 2025
*/

public class PersonDriver {
    public static void main(String[] args) {
        // une instance de Person
        Person me = new Person();
        Person you = new Person("Chartruse", "Chad");
        you.setFirst("Aquamarine"); 

        IO.println("Moi : " + me);
        IO.println("Toi : " + you);
    }

}
