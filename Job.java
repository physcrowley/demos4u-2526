public interface Job {
    void work();
}


class Engineer implements Job {

    @Override
    public void work() {
        IO.println("Je fais de l'ingénierie.");
    }

}