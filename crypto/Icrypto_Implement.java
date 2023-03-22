import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Icrypto_Implement implements Icrypto {

    @Override
    public SecretKey genKey(String algo, int keySize) throws NoSuchAlgorithmException {
        //récuperation
        final KeyGenerator gen = KeyGenerator.getInstance("AES");
        //Initialisation
        gen.init(256);
        //l'exploitation
        SecretKey key = gen.generateKey();
        return key;
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'genKey'");
    }

//    @Override
//    public String saveKey(SecretKey key, String filePath) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'saveKey'");
//    }

//    @Override
//    public SecretKey getKey(String filePath) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'getKey'");
//    }
    
}
