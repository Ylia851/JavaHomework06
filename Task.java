import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Notebook implements Comparable<Notebook> {

    private int id;
    private int year;
    private int member;
    private int price;
    private String model;
    private String OC;
    private String color;

    public Notebook(int id, int year, int member, int price, String model, String OC, String color) {
        this.id = id;
        this.year = year;
        this.member = member;
        this.price = price;
        this.model = model;
        this.OC = OC;
        this.color = color;
    }

    public Notebook(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public Notebook(String model) {
        this(0, 0, 0, 0, model, null, null);
    }

    public Notebook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOC() {
        return OC;
    }

    public void setOC(String OC) {
        this.OC = OC;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id && year == notebook.year && Objects.equals(model, notebook.model)
                && Objects.equals(OC, notebook.OC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, model, OC);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", year=" + year +
                ", member=" + member +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", OC='" + OC + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Notebook o) {
        return Integer.compare(this.year, o.year);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook(1, "name1"));
        set.add(new Notebook(1, "name1"));
        set.add(new Notebook(1, 2020, 100, 1000, "Samsung", "intel", "black"));
        set.add(new Notebook(2, 2021, 120, 1100, "Lenovo", "AMD", "blue"));
        for (Notebook c : set) {
            System.out.println(c);
        }
        System.out.println("--------------------");
        Set<Notebook> treeMap = new TreeSet<>(set);
        treeSet.add(new Notebook(1, 2020, 100, 1000, "Samsung", "intel", "black"));
        treeSet.add(new Notebook(1, 2021, 100, 1000, "Asus", "intel", "black"));
        treeSet.add(new Notebook(1, 2021, 100, 1500, "Aser", "AMD", "red"));
        treeSet.add(new Notebook(1, 2019, 80, 750, "Samsung", "Intel", "black"));
        for (Notebook c : treeSet) {
            System.out.println(c);
        }

    }
}
