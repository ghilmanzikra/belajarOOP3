class Product {

    int id;
    String name;
    double price;
    int quantity;
    double total;

    Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Total: " + total);
    }
}
