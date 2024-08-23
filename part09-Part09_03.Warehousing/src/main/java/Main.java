

public class Main {

    public static void main(String[] args) {
        // the usual:
ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
pwh.takeFromWarehouse(7); //expected:<5.0> but was:<0.0>
    }

}
