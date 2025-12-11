public class Mister extends Person {
    Mister(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("M. %s", name);
    }
}
