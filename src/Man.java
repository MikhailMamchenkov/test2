public class Man {
    private String name;
    private String position;
    private int age;
    private double growth;

    public Man(String name, String position, int age, double growth) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }
}