import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Item implements Comparator<Item>  {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    public int compare(Item e1, Item e2) {
        return 0;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductComparatorDemo {

    public static void main(String[] args) {
        List<Item> p1 = new ArrayList<>();
        p1.add(new Item(7, "Soap", 100.50));
        p1.add(new Item(4, "Perfume", 600.85));
        p1.add(new Item(8, "Gel", 300.45));
        p1.add(new Item(1, "Cup", 200.14));

        System.out.println("Original list of items:");
        for (Item item : p1) {
            System.out.println(item);
        }

        Comparator<Item> priceComparator = new Comparator<Item>() {
            public int compare(Item e1, Item e2) {
                return Double.compare(e1.getPrice(), e2.getPrice());
            }
        };
        Collections.sort(p1, priceComparator);
        System.out.println("\nItems sorted based on price: " + p1);

        Comparator<Item> nameComparator = new Comparator<Item>() {
            @Override
            public int compare(Item e1, Item e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        Collections.sort(p1, nameComparator);
        System.out.println("\nItems sorted by name: " + p1);

        Comparator<Item> idComparator = new Comparator<Item>() {
            public int compare(Item e1, Item e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        };
        Collections.sort(p1, idComparator);
        System.out.println("\nItems sorted based on id: " + p1);
    }
}
