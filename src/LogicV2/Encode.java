package LogicV2;

import java.util.Base64;

public class Encode {

    //<editor-fold desc="Base 64">
    public static String Encode_Base64(String string) {
        try {
            String result = string;
            String encodeBytes = Base64.getEncoder().encodeToString((string).getBytes());
//            System.out.println("Base64: " + encodeBytes);
            return encodeBytes;
        } catch (Exception e) {
            //System.out.println("Error Encode base64");
            return string;
        }
    }

    public static String Decode_Base64(String string) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(string);
//            System.out.println("Encode: " + new String(decodedBytes));
            return new String(decodedBytes);
        } catch (Exception e) {
            //System.out.println("Error decode_base64");
            return string;
        }
    }
//</editor-fold>

}
