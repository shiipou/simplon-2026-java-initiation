package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {
    
    /**
     * Inverse une chaîne de caractères
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        char[] stringSplitted = str.toCharArray();
        String inverseString = "";

        for(int i = stringSplitted.length -1; i >= 0; i--){
            inverseString += stringSplitted[i];
        }

        return inverseString;

    }
    
    /**
     * Vérifie si une chaîne est un palindrome
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        String reverseString = reverseString(str);
        boolean isPalindrome = false;

        if(str.equalsIgnoreCase(reverseString)){
            isPalindrome = true;
        }

        return isPalindrome;

    }
    
    /**
     * Compte le nombre de voyelles dans une chaîne
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        char[] strArray = str.toLowerCase().toCharArray();
        int vowelsTotal = 0;

        for(int i = 0; i < strArray.length; i++){
            char letter = strArray[i];
            for(int j = 0; j < vowels.length; j++){
                char vowel = vowels[j];
                if(letter == vowel){
                    vowelsTotal++;
                    break;
                }
            }
        }
        return vowelsTotal;

    }
    
    /**
     * Compte le nombre de mots dans une chaîne
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        String[] strSplitted = str.split(" ");
        return strSplitted.length;

    }
    
    /**
     * Met la première lettre de chaque mot en majuscule
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String[] strSplitted = str.split(" ");
        String sentence = "";

        for(int i = 0; i < strSplitted.length; i++){
            String word = strSplitted[i];
            String wordWithFirstUppercase = word.substring(0, 1).toUpperCase() + word.substring(1);
            
            sentence += wordWithFirstUppercase + " ";
            
        }

        return sentence.trim();

    }
}
