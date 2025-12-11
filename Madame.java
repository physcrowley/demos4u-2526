public class Madame extends Person {
    Madame(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mme " + name;
    }
}
