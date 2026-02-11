package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux existants
 */
public class Exercise09ArrayTransformations {
    
    /**
     * Double tous les éléments d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        int length = array.length;
        int[] newArr = new int[length];

        for(int i = 0; i < length; i++){
            newArr[i] = array[i] * 2;
        }

        return newArr;

    }
    
    /**
     * Filtre les nombres pairs d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int length = array.length;
        int[] newArr = new int[0];

        for(int i = 0; i < length; i++){
            int number = array[i];
            if(array[i] % 2 == 0){
                int[] arrCp = new int[newArr.length + 1];
                for(int j = 0; j < newArr.length; j++){
                    arrCp[j] = newArr[j];
                }
                arrCp[newArr.length] = number;
                newArr = arrCp;
            }
        }

        return newArr;

    }
    
    /**
     * Copie un tableau dans l'ordre inverse
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int index = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverseArray[index] = array[i];
            index++;
        }
        return reverseArray;
    }
    
    /**
     * Concatène deux tableaux
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] newArr = new int[length1 + length2];
        int index = 0;

        for(int i = 0; i < length1; i++){
            newArr[index] = array1[i];
            index++;
        }
        for(int i = 0; i < length2; i++){
            newArr[index] = array2[i];
            index++;
        }

        return newArr;

    }
    
    /**
     * Extrait une sous-partie d'un tableau
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int lengthOfNewArr = (end - 1) - start;
        int[] newArr = new int[lengthOfNewArr];
        int index = 0;

        for(int i = start; i < end; i++){
            
            newArr[index] = array[i];
            index++;
            
        }

        return newArr;

    }
}
