import java.security.NoSuchAlgorithmException;

import javax.crypto.*;

public interface Icrypto{
    /**
     * 
     * @param algo
     * @param keySize
     * @return la cle
     * @throws NoSuchAlgorithmException
     */
    public SecretKey genKey(String algo, int keySize) throws NoSuchAlgorithmException;

    //public String saveKey(SecretKey key, String filePath);

    //public SecretKey getKey(String filePath);
}

