/*
Une démonstration (à lancer avec JavaWiz ou Python Tutor) pour illustrer
la création d'un groupe de String qui servent de références et comment
certaines opérations (comme 'new' et les entrées) forcent la création
d'objets en duplicata même si le texte exacte existe dans le pool.

Par : David Crowley
Date : 3 décembre 2025
*/

import java.io.*;

public class StringPool {

    public static void main(String[] args) {
        String a1 = "ceci";
        String a2 = "ceci";
        String a3 = a1;
        String a4 = new String(a1);
        String a5 = new String("ceci");
        String a6 = StringPool.autoInput("ceci");
    }

    static String autoInput(String input) {
        // enregistrer l'entrée standard et le remplacer avec un texte spécifique
        InputStream original = System.in;
        InputStream temp = new ByteArrayInputStream(input.getBytes());
        System.setIn(temp);

        String inputRead = IO.readln(); // utilise System.in avec notre entrée

        System.setIn(original); // réinitialiser l'entrée au terminal

        return inputRead;
    }

}
