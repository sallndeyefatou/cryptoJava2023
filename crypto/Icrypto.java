package crypto;

import javax.crypto.*;

/**
 * Cette interface définit une méthode générique pour générer une clé secrète
 * utilisée pour le chiffrement et le déchiffrement de données.
 */
public interface Icrypto {
    
    /**
     * Cette méthode permet de générer une clé secrète pour l'algorithme de chiffrement spécifié
     * et de l'enregistrer dans le fichier spécifié.
     *
     * @param algo l'algorithme de chiffrement pour lequel la clé doit être générée
     * @param filePath le chemin d'accès complet au fichier où la clé générée sera enregistrée
     * @return la clé secrète générée, ou null si une erreur s'est produite
     */
    public SecretKey genKey(String algo, String filePath);
}
