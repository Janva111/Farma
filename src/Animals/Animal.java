package Animals;

public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    public Animal(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialCare(String specialCare) {
        this.specialCare = specialCare;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    @Override
    public String toString() {
        return "Animals.Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
