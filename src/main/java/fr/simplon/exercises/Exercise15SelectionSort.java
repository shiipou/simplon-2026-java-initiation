package fr.simplon.exercises;

/**
 * Exercice 15: Tri par sélection (Selection Sort)
 * 
 * Objectif: Apprendre un algorithme de tri efficace basé sur la sélection du minimum
 */
public class Exercise15SelectionSort {
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri par sélection
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] selectionSort(int[] array) {
        
        for(int i = 0; i < array.length-1; i++){
            int value = array[i];
            int minValue = array[i];
            int indexOfMinValue = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < minValue){
                    minValue = array[j];
                    indexOfMinValue = j;
                }
            }
            if(indexOfMinValue != i){
                array[i] = minValue;
                array[indexOfMinValue] = value;
            }
        }

        return array;

    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri par sélection
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] selectionSortDescending(int[] array) {
        
         for(int i = 0; i < array.length-1; i++){
            int value = array[i];
            int maxValue = array[i];
            int indexOfMaxValue = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] > maxValue){
                    maxValue = array[j];
                    indexOfMaxValue = j;
                }
            }
            if(indexOfMaxValue != i){
                array[i] = maxValue;
                array[indexOfMaxValue] = value;
            }
        }

        return array;

    }
    
    /**
     * Trouve les k plus petits éléments d'un tableau (non triés entre eux)
     * @param array le tableau
     * @param k le nombre d'éléments à trouver
     * @return un tableau contenant les k plus petits éléments
     */
    public int[] findKSmallest(int[] array, int k) {
        int[] arrSorted = selectionSort(array);
        int[] arrSmaller = new int[k];

        for(int i = 0; i < k; i++){
            arrSmaller[i] = arrSorted[i];
        }

        return arrSmaller;

    }
    
    /**
     * Compte le nombre de comparaisons effectuées pendant le tri par sélection
     * @param array le tableau à trier
     * @return le nombre de comparaisons
     */
    public int countComparisons(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length-1; i++){
            int value = array[i];
            int minValue = array[i];
            int indexOfMinValue = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < minValue){
                    minValue = array[j];
                    indexOfMinValue = j;
                }
                total++;
            }
            if(indexOfMinValue != i){
                array[i] = minValue;
                array[indexOfMinValue] = value;
                
            }
        }

        return total;

    }
}
