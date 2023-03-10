package crypto;

import javax.crypto.SecretKey;

public class IcryptoImpl implements Icrypto {

    /**
     * Génère une clé secrète pour l'algorithme de chiffrement spécifié
     * et l'enregistre dans le fichier spécifié.
     *
     * @param algo      l'algorithme de chiffrement pour lequel la clé doit être générée
     * @param filePath  le chemin d'accès complet au fichier où la clé générée sera enregistrée
     * @return la clé secrète générée, ou null si une erreur s'est produite
     */
    @Override
    public SecretKey genKey(String algo, String filePath) {

        // Récupérer une instance du générateur de clé pour l'algorithme spécifié

        // Initialiser le générateur de clé pour générer une clé de chiffrement de 128 bits

        // Générer une clé secrète pour l'algorithme spécifié

        // Enregistrer la clé dans le fichier spécifié

        return null;
    }
    
}
