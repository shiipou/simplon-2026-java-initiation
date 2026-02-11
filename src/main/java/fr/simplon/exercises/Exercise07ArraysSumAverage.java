package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un tableau
 */
public class Exercise07ArraysSumAverage {
    
    /**
     * Calcule la somme de tous les éléments d'un tableau
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
        int result = 0;

        for(int i = 0; i < array.length; i++){
            result += array[i];
        }

        return result;

    }
    
    /**
     * Calcule la moyenne des éléments d'un tableau
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        int result = 0;

        for(int i = 0; i < array.length; i++){
            result += array[i];
        }

        double resultDouble = result / array.length;

        return resultDouble;

    }
    
    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        double average = average(array);

        int total = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > average){
                total++;
            }
        }

        return total;
    }
    
    /**
     * Calcule la somme des nombres pairs dans un tableau
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        int result = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                result += array[i];
            }

        }

        return result;

    }
    
    /**
     * Calcule le produit de tous les éléments d'un tableau
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
        int result = 1;

        for(int i = 0; i < array.length; i++){
            result *= array[i];
        }

        return result;

    }
}
