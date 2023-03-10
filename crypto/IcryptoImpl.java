package crypto;

import javax.crypto.SecretKey;
/**
 * @author DIENG Khaly
 */
public class IcryptoImpl implements Icrypto {

    /**
     * Génère une clé secrète pour l'algorithme de chiffrement spécifié
     *
     * @param algo      l'algorithme de chiffrement pour lequel la clé doit être générée
     * @param keySize  la taille dela clé 
     * @return la clé secrète générée, ou null si une erreur s'est produite
     */
    @Override
    public SecretKey genKey(String algo, int keySize) {

        // Récupérer une instance du générateur de clé pour l'algorithme spécifié

        // Initialiser le générateur de clé pour générer une clé de chiffrement de 128 bits

        // Générer une clé secrète pour l'algorithme spécifié

        return null;
    }
    
}
