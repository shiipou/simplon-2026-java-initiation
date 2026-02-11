package fr.simplon.exercises;

/**
 * Exercice 2: Opérations arithmétiques
 * 
 * Objectif: Apprendre à effectuer des calculs simples
 */
public class Exercise02ArithmeticOperations {
    
    /**
     * Additionne deux nombres
     * @param a premier nombre
     * @param b second nombre
     * @return la somme de a et b
     */
    public int add(int a, int b) {
        int somme = a + b;
        return somme;
    }
    
    /**
     * Soustrait deux nombres
     * @param a premier nombre
     * @param b second nombre
     * @return la différence entre a et b
     */
    public int subtract(int a, int b) {
        int result = a - b;
        return result;

    }
    
    /**
     * Multiplie deux nombres
     * @param a premier nombre
     * @param b second nombre
     * @return le produit de a et b
     */
    public int multiply(int a, int b) {
        int result = a * b;
        return result;

    }
    
    /**
     * Divise deux nombres (division entière)
     * @param a dividende
     * @param b diviseur
     * @return le quotient de a divisé par b
     */
    public int divide(int a, int b) {
        int result = a / b;
        return result;

    }
    
    /**
     * Calcule le reste de la division
     * @param a dividende
     * @param b diviseur
     * @return le reste de a divisé par b
     */
    public int modulo(int a, int b) {
        int result = a % b;
        return result;
    }
}
