package fr.simplon.exercises;

/**
 * Exercice 12: Comparaison et échange d'éléments
 * 
 * Objectif: Apprendre les opérations de base nécessaires pour le tri
 */
public class Exercise12SwappingElements {
    Exercise06ArraysMaxMin exercise06ArraysMaxMin = new Exercise06ArraysMaxMin();
    
    /**
     * Échange deux éléments dans un tableau
     * @param array le tableau
     * @param i premier index
     * @param j second index
     */
    public int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
        

    }
    
    /**
     * Décale un élément vers la gauche
     * @param array le tableau
     * @param fromIndex position source (plus grande)
     * @param toIndex position destination (plus petite)
     * @return le tableau modifié
     */
    public int[] shiftLeft(int[] array, int fromIndex, int toIndex) {
        /**cp = 5 and tmp = 5
         * index 4 = 5 to index 2 = 3 
         * [1, 2, 5, 3, 4, 6]
         */
        if(fromIndex == toIndex){
            return array;
        }
        int valueToMove = array[fromIndex];
        int valueTocopie = 0;
        int valueTmp = 0;
        boolean copie = false;

        for(int i=0; i < array.length; i++){
            if( i == toIndex){
                valueTocopie = array[i];
                array[i] = valueToMove;
                copie = true;
                continue;
            }

            if(copie){
                valueTmp = array[i];
                array[i] = valueTocopie;
                valueTocopie = valueTmp;
                if(i == fromIndex){
                    copie = false;
                }
                
            }
            
        }
        return array;

    }
    
    /**
     * Décale un élément vers la droite
     * @param array le tableau
     * @param fromIndex position source (plus petite)
     * @param toIndex position destination (plus grande)
     * @return le tableau modifié
     */
    public int[] shiftRight(int[] array, int fromIndex, int toIndex) {
        if(fromIndex == toIndex){
            return array;
        }
         int valueToMove = array[fromIndex];
        int valueTocopie = 0;
        int valueTmp = 0;
        boolean copie = false;

        for(int i=array.length; i >= 0; i--){
            if( i == toIndex){
                valueTocopie = array[i];
                array[i] = valueToMove;
                copie = true;
                continue;
            }

            if(copie){
                valueTmp = array[i];
                array[i] = valueTocopie;
                valueTocopie = valueTmp;
                if(i == fromIndex){
                    copie = false;
                }
                
            }
            
        }
        return array;

    }
    
    /**
     * Place le plus petit élément au début du tableau
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveSmallestToFront(int[] array) {
        int smallerIndex = exercise06ArraysMaxMin.findMinIndex(array);
        int[] arrModified = shiftLeft(array, smallerIndex, 0);
        return arrModified;
    }
    
    /**
     * Place le plus grand élément à la fin du tableau
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveLargestToEnd(int[] array) {
        int biggerIndex = exercise06ArraysMaxMin.findMaxIndex(array);
        return shiftRight(array, biggerIndex, array.length -1);
    }
    
    /**
     * Vérifie si deux éléments adjacents sont dans le bon ordre
     * @param array le tableau
     * @param i l'index du premier élément
     * @return true si array[i] <= array[i+1], false sinon
     */
    public boolean isInOrder(int[] array, int i) {
       return array[i] <= array[i+1];

    }
    
    /**
     * Échange tous les éléments adjacents qui ne sont pas dans le bon ordre
     * (une seule passe)
     * @param array le tableau
     * @return le tableau après une passe
     */
    public int[] bubblePass(int[] array) {
        int indexToPassed = -2;
        for(int i=0; i < array.length-1; i++){
            if(indexToPassed == i){
                continue;
            }
            if(!(isInOrder(array, i))){
                int tmp = array[i+1];
                array[i+1] = array[i];
                array[i] = tmp;
                indexToPassed = i+1;
            }
        }
        return array;

    }
    
    /**
     * Compte le nombre de paires d'éléments adjacents mal ordonnées
     * @param array le tableau
     * @return le nombre de paires où array[i] > array[i+1]
     */
    public int countInversions(int[] array) {
        int total = 0;

        for(int i=0; i < array.length-1; i++){
            if(!(isInOrder(array, i))){
                total++;
            }
        }
        return total;

    }
}
