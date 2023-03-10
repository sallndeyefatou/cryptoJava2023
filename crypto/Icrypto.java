package crypto;
/**
 * @author DIENG Khaly
 */
import javax.crypto.*;

/**
 * Cette interface définit une méthode générique pour générer une clé secrète
 * utilisée pour le chiffrement et le déchiffrement de données.
 */
public interface Icrypto {
    
    /**
     * Cette méthode permet de générer une clé secrète pour l'algorithme de chiffrement spécifié
     *
     * @param algo l'algorithme de chiffrement pour lequel la clé doit être générée
     * @param keySize la taille de la clé
     * @return la clé secrète générée, ou null si une erreur s'est produite
     */
    public SecretKey genKey(String algo, int keySize);
}
