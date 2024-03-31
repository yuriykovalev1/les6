import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.util.Scanner;
import java.util.ArrayList;

public class Order {

    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public void set_clientName(String clientName) {
        this.clientName = clientName;
    }

    public void set_product(String product) {
        this.product = product;

    }

    public void set_qnt(int qnt) {
        this.qnt = qnt;

    }

    public void set_price(int price) {
        this.price = price;
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public ArrayList<String> getOrder() {
        ArrayList<String> orderlist = new ArrayList<>();
        orderlist.add(clientName);
        orderlist.add(product);
        orderlist.add(String.valueOf(qnt));
        orderlist.add(String.valueOf(price));
        return orderlist;

    }

    @Override
    public String toString() {

        return String.format("Имя клиента %s продукт %s", clientName, product);
    }

}