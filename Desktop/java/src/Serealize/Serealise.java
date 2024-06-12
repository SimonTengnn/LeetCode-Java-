package src.Serealize;
import java.io.*;
public class Serealise {
    public static void main(String[] args) {

            File file=null;
            Object obj = new Object();
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(obj);
                oos.flush();
                oos.close();
                fos.close();

            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
               //  throw new RuntimeException(e);
            }


    }

}
