import java.util.Scanner;

public class Fillorderinfo implements Fromconsole{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void inputFromConsole(Order order ){
        order.set_clientName(prompt("Имя клиента: "));
        order.set_product(prompt("Продукт: "));
        order.set_qnt(Integer.parseInt(prompt("Кол-во: ")));
        order.set_price(Integer.parseInt(prompt("Цена: ")));
    }

    public String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    
}