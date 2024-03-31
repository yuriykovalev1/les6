import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Writetofile implements Filewriters {

    @Override
    public void saveToJson(ArrayList<String> outtxt) {

        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + outtxt.get(0) + "\",\n");
            writer.write("\"product\":\"" + outtxt.get(1) + "\",\n");
            writer.write("\"qnt\":" + outtxt.get(2) + ",\n");
            writer.write("\"price\":" + outtxt.get(3) + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveToTxt(ArrayList<String> outtxt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveToTxt'");
    }

}