import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class FileReader1 {
    public static void main(String args[]) {
        String filename = "/Users/shamahussaini/Documents/abc.txt";
        String filename2 = "/Users/shamahussaini/Documents/xyz.txt";
        HashSet <String> al = new HashSet<String>();
        HashSet <String> al1 = new HashSet<String>();
        HashSet <String> diff1 = new HashSet<String>();
        HashSet <String> diff2 = new HashSet<String>();
        String str = null;
        String str2 = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            while ((str = in.readLine()) != null) {
                al.add(str);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename2));
            while ((str2 = in.readLine()) != null) {
                al1.add(str2);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str3 : al) {
            if (!al1.contains(str3)) {
                diff1.add(str3);
            }
        }
        for (String str5 : al1) {
            if (!al.contains(str5)) {
                diff2.add(str5);
            }
        }
        for (String str4 : diff1) {
            System.out.println("Removed Path: "+str4);
        }
        for (String str4 : diff2) {
            System.out.println("Added Path: "+str4);
        }


    }

}