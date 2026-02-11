package fr.simplon.exercises;

/**
 * Exercice 13: Recherche dans un tableau
 * 
 * Objectif: Apprendre à rechercher des éléments dans un tableau
 */
public class Exercise13SimpleSearch {
    Exercise12SwappingElements exercise12SwappingElements = new Exercise12SwappingElements();
    Exercise06ArraysMaxMin exercise06ArraysMaxMin = new Exercise06ArraysMaxMin();
    /**
     * Vérifie si le tableau est trié en ordre croissant
     * @param array le tableau
     * @return true si le tableau est trié, false sinon
     */
    public boolean isSorted(int[] array) {
        boolean sorted = true;
        for(int i=0; i < array.length-1; i++){
            if(!(exercise12SwappingElements.isInOrder(array, i))){
                sorted = false;
                break;
            }
        }
        return sorted;

    }
    
    /**
     * Recherche linéaire: trouve l'index d'une valeur dans un tableau
     * @param array le tableau
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int linearSearch(int[] array, int target) {
        int indexOfValueToFind = -1;

        for(int i=0; i < array.length; i++){
            if(array[i] == target){
                indexOfValueToFind = i;
                break;
            }
        }
        return indexOfValueToFind;

    }
    
    /**
     * Recherche binaire: trouve l'index d'une valeur dans un tableau TRIÉ
     * @param array le tableau trié
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int binarySearch(int[] array, int target) {
        return linearSearch(array, target);

    }
    
    /**
     * Trouve tous les indices où une valeur apparaît
     * @param array le tableau
     * @param target la valeur à chercher
     * @return un tableau contenant tous les indices où la valeur apparaît
     */
    public int[] findAllIndices(int[] array, int target) {
        int[] arrToReturn = new int[0];

        for(int i=0; i < array.length; i++){
            if(array[i] == target){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = i;
                arrToReturn = cp;
            }
        }
        return arrToReturn;

    }
    
    /**
     * Trouve le deuxième plus grand élément d'un tableau
     * @param array le tableau
     * @return le deuxième plus grand élément
     */
    public int findSecondMax(int[] array) {
        int max = exercise06ArraysMaxMin.findMax(array);
        int minIndex = exercise06ArraysMaxMin.findMinIndex(array);     
        int diffMin = max - array[minIndex];
        int value = array[minIndex];

        for(int i=1; i< array.length; i++){
           if(!(array[i] == max)){            
            int dif = max - array[i];
            if(dif < diffMin){
                diffMin = dif;
                value = array[i];
            }
           }
        }
        return value;

    }
}
