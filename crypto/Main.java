package crypto;

import javax.crypto.SecretKey;
/**
 * @author DIENG Khaly
 */
public class Main {

    public static void main(String[] args) {

        // Créer une instance de la classe IcryptoImpl
        IcryptoImpl crypto = new IcryptoImpl();

        // Générer une clé secrète pour l'algorithme AES et la taille de 128
        SecretKey key = crypto.genKey("AES", 128);

        // Vérifier si la clé a été générée avec succès
        if (key != null) {
            System.out.println("Clé générée avec succès!");
        } else {
            System.out.println("Erreur lors de la génération de la clé.");
        }
    }

}
