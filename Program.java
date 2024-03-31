public class Program {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Укажите параметры заказа:");
        Fillorderinfo fo = new Fillorderinfo();
        fo.inputFromConsole(order);
        // order.inputFromConsole();
        Writetofile wf = new Writetofile();
        wf.saveToJson(order.getOrder());
        // order.saveToJson();
        System.out.println(order);
    }

}