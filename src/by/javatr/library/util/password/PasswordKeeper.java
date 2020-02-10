package by.javatr.library.util.password;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PasswordKeeper {

    public static String generateHash(String name, String password){
        String resultHash = "";
        byte[] salt = name.getBytes();
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] encoded = factory.generateSecret(spec).getEncoded();
            resultHash = new String(encoded, UTF_8);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            //LOGGER.error(e.getMessage()
        }
        return resultHash;
    }
}
