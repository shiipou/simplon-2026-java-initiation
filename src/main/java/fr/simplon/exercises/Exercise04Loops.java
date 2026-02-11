package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {
    
    /**
     * Calcule la somme des nombres de 1 à n
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++){
            result += i;
        }

        return result;

    }
    
    /**
     * Inverse un nombre (ex: 123 -> 321)
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        String inverseInString = String.valueOf(number);
        String[] inverseArray = inverseInString.split("");
        String inverse = "";
        
        for(int i = (inverseArray.length - 1); i >= 0; i--){
            inverse += inverseArray[i];
        }
        int inverseInt = Integer.parseInt(inverse);
        return inverseInt;
    }
    
    /**
     * Calcule la factorielle d'un nombre (n!)
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;

    }
    
    /**
     * Compte le nombre de chiffres dans un nombre
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {
        String numberTonString = String.valueOf(number);
        String[] numberSplited = numberTonString.split("");

        return numberSplited.length;

    }
    
    /**
     * Vérifie si un nombre est premier
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
        int num = number;
        System.out.println(num);
        boolean isPrime = true;

        if(number <= 1){
            return false;
        }
        if(number == 2){
            return true;
        }
        for(int i = 2; i < number; i++){
            
            if(number % i == 0){
                isPrime = false;
                break;
            }
            
        }
        return isPrime;

    }
}
