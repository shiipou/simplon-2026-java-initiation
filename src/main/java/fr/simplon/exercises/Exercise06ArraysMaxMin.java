package fr.simplon.exercises;

/**
 * Exercice 6: Tableaux - Recherche du maximum et minimum
 * 
 * Objectif: Apprendre à trouver le plus grand et le plus petit élément d'un tableau
 */
public class Exercise06ArraysMaxMin {
    
    /**
     * Trouve le maximum dans un tableau
     * @param array le tableau
     * @return la valeur maximale
     */
    public int findMax(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                max = array[i];
                continue;
            }
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;

    }
    
    /**
     * Trouve le minimum dans un tableau
     * @param array le tableau
     * @return la valeur minimale
     */
    public int findMin(int[] array) {
        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                min = array[i];
                continue;
            }
            
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;

    }
    
    /**
     * Trouve l'index du maximum dans un tableau
     * @param array le tableau
     * @return l'index de la valeur maximale (le premier si plusieurs)
     */
    public int findMaxIndex(int[] array) {
        int max = 0;
        int indexOfMax = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                max = array[i];
                continue;
            }
            if(array[i] > max){
                max = array[i];
                indexOfMax = i;
            }
        }

        return indexOfMax;


    }
    
    /**
     * Trouve l'index du minimum dans un tableau
     * @param array le tableau
     * @return l'index de la valeur minimale (le premier si plusieurs)
     */
    public int findMinIndex(int[] array) {
         int min = 0;
         int indexOfMin = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                min = array[i];
                indexOfMin = i;
                continue;
            }
            
            if(array[i] < min){
                min = array[i];
                indexOfMin = i;
            }
        }

        return indexOfMin;

    }
    
    /**
     * Calcule la différence entre le max et le min
     * @param array le tableau
     * @return la différence max - min
     */
    public int range(int[] array) {
        int max = findMax(array);
        int min = findMin(array);

        return max - min;

    }
}
