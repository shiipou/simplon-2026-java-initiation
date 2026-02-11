package fr.simplon.exercises;

/**
 * Exercice 14: Tri à bulles (Bubble Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri le plus simple
 */
public class Exercise14BubbleSort {
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri à bulles
     * @param array le tableau à trier
     * @return le tableau trié (modifier le tableau en place)
     */
    public int[] bubbleSort(int[] array) {
        
        boolean isSorted = false;

        while(!isSorted){
            int modification = 0;
             for(int i=0; i < array.length-1; i++){
                
                if(array[i] > array[i+1]){
                    int tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                   modification++;
                }
            }
            if(modification == 0){
                isSorted = true;
            }
        }
       
        return array;

    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri à bulles
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] bubbleSortDescending(int[] array) {
        
        boolean isSorted = false;

        while(!isSorted){
            int modification = 0;
             for(int i=0; i < array.length-1; i++){
                
                if(array[i] < array[i+1]){
                    int tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                   modification++;
                }
            }
            if(modification == 0){
                isSorted = true;
            }
        }
       
        return array;

    }
    
    /**
     * Compte le nombre d'échanges effectués pendant le tri à bulles
     * @param array le tableau à trier
     * @return le nombre d'échanges effectués
     */
    public int countSwaps(int[] array) {
         boolean isSorted = false;
        int total = 0;
        while(!isSorted){
            int modification = 0;
             for(int i=0; i < array.length-1; i++){
                
                if(array[i] > array[i+1]){
                    int tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                   modification++;
                   total++;
                }
            }
            if(modification == 0){
                isSorted = true;
            }
        }
       
        return total;

    }
    
    /**
     * Trie uniquement les k premiers éléments d'un tableau avec le tri à bulles
     * @param array le tableau
     * @param k le nombre d'éléments à trier
     * @return le tableau avec les k premiers éléments triés
     */
    public int[] partialBubbleSort(int[] array, int k) {
         boolean isSorted = false;        
        while(!isSorted){
            int modification = 0;
            for(int i=0; i < k; i++){                
                if(array[i] > array[i+1]){
                    int tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                    modification++;
                }
            }
            if(modification == 0){
                isSorted = true;
            }
          
        }
       
        return array;

    }
}
