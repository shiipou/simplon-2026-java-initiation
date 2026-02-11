package fr.simplon.exercises;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union, intersection, différence)
 */
public class Exercise10SetOperations {
    
    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        boolean isContain = false;

        for(int i = 0; i < array.length; i++){
            if(value == array[i]){
                isContain = true;
                break;
            }
        }

        return isContain;

    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
        int[] arrToReturn = new int[0];

        for(int i = 0; i < array1.length; i++){
            if( 
                !(contains(array2, array1[i])) && 
                !(contains(arrToReturn, array1[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array1[i];
                arrToReturn = cp;
            }            
        }

        for(int i = 0; i < array2.length; i++){
            if(
                !(contains(arrToReturn, array2[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array2[i];
                arrToReturn = cp;
            }            
        }

        return arrToReturn;

    }

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
        int[] arrToReturn = new int[0];

        for(int i = 0; i < array1.length; i++){
            if( 
                (contains(array2, array1[i])) && 
                !(contains(arrToReturn, array1[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array1[i];
                arrToReturn = cp;
            }            
        }

        for(int i = 0; i < array2.length; i++){
            if(
                (contains(array1, array2[i])) && 
                !(contains(arrToReturn, array2[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array2[i];
                arrToReturn = cp;
            }            
        }

        return arrToReturn;

    }
    
    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
         int[] arrToReturn = new int[0];

        for(int i = 0; i < array1.length; i++){
            if( 
                !(contains(array2, array1[i])) && 
                !(contains(arrToReturn, array1[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array1[i];
                arrToReturn = cp;
            }            
        }

        return arrToReturn;

    }
    
    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] arrToReturn = new int[0];

        for(int i = 0; i < array1.length; i++){
            if( 
                !(contains(array2, array1[i])) && 
                !(contains(arrToReturn, array1[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array1[i];
                arrToReturn = cp;
            }            
        }

        for(int i = 0; i < array2.length; i++){
            if(
                !(contains(array1, array2[i])) && 
                !(contains(arrToReturn, array2[i]))
            ){
                int[] cp = new int[arrToReturn.length + 1];
                for(int j = 0; j < arrToReturn.length; j++){
                    cp[j] = arrToReturn[j];
                }
                cp[arrToReturn.length] = array2[i];
                arrToReturn = cp;
            }            
        }

        return arrToReturn;

    }
    
    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        boolean isSubset = false;
        int index = 0;
        if(array1.length == 0){
            return true;// un array vide est un sous ensemble d'un tableau non vide ?
        }
        for(int i=0; i<array2.length; i++){
           if((i + array1.length) >= array2.length){            
            break;
           }

            if(array1[index] == array2[i]){
                isSubset = true;
                index++;
                if(index >= array1.length){
                    break;
                }

                for(int j = index; j < array1.length; j++){
                    if(array1[index] == array2[i+index]){
                        isSubset = true;
                    }else{
                        isSubset = false;
                        index = 0;
                        break;
                    }
                }
            }else{
                isSubset = false;
                index = 0;
            }
        }

        return isSubset;

    }
    
    /**
     * Supprime les doublons d'un tableau
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        
        return intersection(array, array);

    }
    
    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        int[] arrUnion = union(array, new int[0]);
        return arrUnion.length;

    }
}
