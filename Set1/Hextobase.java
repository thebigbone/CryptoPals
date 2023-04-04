import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.DecoderException;

public class Hextobase {
    String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
    char[] hexChars = hex.toCharArray();
    byte[] decodedHex;
    byte[] encodedHexB64;

    public Hextobase() throws DecoderException {
        decodedHex = Hex.decodeHex(hexChars);
        encodedHexB64 = Base64.encodeBase64(decodedHex);
    }

    public static void main(String[] args) {
        try {
            Hextobase hb = new Hextobase();
            System.out.println("Decoded hex: " + new String(hb.decodedHex));
            System.out.println("Base64 from decoded hex: " + new String(hb.encodedHexB64));
        } catch (DecoderException e) {
            System.out.println("Error decoding hex string: " + e.getMessage());
        }
    }
}