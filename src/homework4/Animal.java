package homework4;

public class Animal implements AnimalActions {
    private String name;
    private static int count;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    @Override
    public String run(String name, int distance) {
        return null;
    }

    @Override
    public String swim(String name, int distance) {
        return null;
    }

}
