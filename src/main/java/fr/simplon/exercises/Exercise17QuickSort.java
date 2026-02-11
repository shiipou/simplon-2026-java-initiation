package fr.simplon.exercises;

/**
 * Exercice 16: Tri par insertion (Insertion Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de cartes
 */
public class Exercise17QuickSort {


    /**
     *                        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     *          [1, 2, 3, 4, 5]                            [6, 7, 8, 9, 10]
     *        [1, 2]        [4, 5]                       [6, 7]        [9, 10] 
     * pour séparer :
     *  à gauche => start 0 ; end indexPivot -1
     *  à droite => start indexPivot+1 ; end array.length
     * 
     * tant que end > 2 on continue sinon le tableau est trié
     */
    public int[] recursiveSort(int[] array, int startIndex, int endIndex){
        
        int indexOfValuePivot = endIndex;
        int valuePivot = array[endIndex];
        int i = startIndex-1;
        int valueTmp = 0;

        // first loop to split array in two part.
        // left side => value smaller than pivot
        // right side => value bigger than pivot
        for(int j=startIndex; j < endIndex; j++){
            if(array[j] > valuePivot){
                continue; 
            }else{ 
                i++;        
                valueTmp = array[i];        
                array[i] = array[j];
                array[j] = valueTmp;
            }
        }

        valueTmp = array[i+1];
        array[i+1] = valuePivot;
        array[indexOfValuePivot] = valueTmp;
        indexOfValuePivot = i+1;

        //if array is not alread sorted
        if(i-endIndex != startIndex-1){

            int indexStartOfLeftSide = 0;
            int indexEndOfLeftSide = indexOfValuePivot-1;
            int indexStartOfRigthSide = indexOfValuePivot+1;
            int indexEndOfRigthSide = endIndex;
            
            // sorted the left side
            if(indexEndOfLeftSide - indexStartOfLeftSide >= 1){
                array = recursiveSort(array, indexStartOfLeftSide, indexEndOfLeftSide);
            }

            // sorted the rigth side
            if(indexEndOfRigthSide - indexStartOfRigthSide >= 1){
                array = recursiveSort(array, indexStartOfRigthSide, indexEndOfRigthSide);
            }
        }


        return array;
    }
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] quickSort(int[] array) {
    
    array = recursiveSort(array, 0, array.length-1);
    return array;  

    }
    
    
}
