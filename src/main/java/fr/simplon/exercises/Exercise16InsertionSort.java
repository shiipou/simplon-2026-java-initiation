package fr.simplon.exercises;

/**
 * Exercice 16: Tri par insertion (Insertion Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de cartes
 */
public class Exercise16InsertionSort {
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] insertionSort(int[] array) {
        int valueToMove = 0;
        int indexToMove = 0;
        for(int i=1; i < array.length; i++){
            valueToMove = array[i];
            indexToMove = i;
            for(int j=i-1; j >= 0; j--){
                if(array[j] > valueToMove){
                    array[j+1] = array[j];
                    indexToMove = j;
                }             
            
            }
            array[indexToMove] = valueToMove;
            
        }

        return array;

    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] insertionSortDescending(int[] array) {
        int valueToMove = 0;
        int indexToMove = 0;
        for(int i=1; i < array.length; i++){
            valueToMove = array[i];
            indexToMove = i;
            for(int j=i-1; j >= 0; j--){
                if(array[j] < valueToMove){
                    array[j+1] = array[j];
                    indexToMove = j;
                }             
            
            }
            array[indexToMove] = valueToMove;
            
        }

        return array;

    }
    
    /**
     * Compte le nombre de décalages effectués pendant le tri par insertion
     * @param array le tableau à trier
     * @return le nombre de décalages effectués
     */
    public int countShifts(int[] array) {
        int valueToMove = 0;
        int indexToMove = 0;
        int totalMove = 0;
        for(int i=1; i < array.length; i++){
            valueToMove = array[i];
            indexToMove = i;
            for(int j=i-1; j >= 0; j--){
                if(array[j] > valueToMove){
                    array[j+1] = array[j];
                    indexToMove = j;
                    totalMove++;
                }             
            
            }
            array[indexToMove] = valueToMove;
            
        }

        return totalMove;

    }
    
    /**
     * Insère un élément à sa place dans un tableau déjà trié
     * @param sortedArray le tableau trié
     * @param element l'élément à insérer
     * @return un nouveau tableau avec l'élément inséré à la bonne place
     */
    public int[] insertIntoSorted(int[] sortedArray, int element) {
        int[] newArr = new int[sortedArray.length+1];
        boolean elementInserted = false;

        if(newArr.length == 1){
            newArr[0] = element;
            return newArr;
        }

        for(int i=0; i < sortedArray.length; i++){
            if( !elementInserted && element > sortedArray[i] ){
                newArr[i] = sortedArray[i];
            }
            if( !elementInserted && element < sortedArray[i] ){
                newArr[i] = element;
                elementInserted = true;
            }
            if(elementInserted){
                newArr[i+1] = sortedArray[i];
            }

        }

        if(!elementInserted){
            newArr[newArr.length-1] = element;
        }

        return newArr;

    }
}
