package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
        int[][] matrice = new int[rows][cols];

        for(int i=0; i < rows; i++){
            int[] row = new int[cols];
                for(int j=0; j < rows; j++){
                    row[j] = 0;
                }
                matrice[i] = row;
            
        }

        return matrice;

    }
    
    /**
     * Calcule la somme de tous les éléments d'une matrice
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
        int total = 0;

        for(int i=0; i < matrix.length; i++){
            int[] row = matrix[i];
            for(int j=0; j < row.length; j++){
                total += row[j];
            }
        }

        return total;

    }
    
    /**
     * Trouve le maximum dans une matrice
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
        int max = 0;
        
        for(int i=0; i < matrix.length; i++){
            int[] row = matrix[i];
            for(int j=0; j < row.length; j++){
                if(i == 0){
                    max = row[j];
                    continue;
                }
                if(row[j] > max){
                    max = row[j];
                }
            }
        }

        return max;

    }
    
    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        /**
         * [[1, 2, 3] 00 => 00; 01 => 10; 
         *  [4, 5, 6]
         * ]
         * 
         * [[1, 4]
         *  [2, 5]
         *  [3, 6]
         * ]
         */
        int[][] arrTransposed = new int[matrix[0].length][matrix.length];

        for(int i=0; i < matrix.length; i++){
            int[] row = matrix[i];
            for(int j=0; j < row.length; j++){
                arrTransposed[j][i] = matrix[i][j];
                
            }
        }

        return arrTransposed;

    }
    
    /**
     * Retourne la diagonale principale d'une matrice carrée
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
        /**
         * [[0,0,0,0]
         *  [0,0,0,0]
         *  [0,0,0,0]
         *  [0,0,0,0]
         * ]
         */
        int[] arrDiag = new int[matrix.length];

        for(int i=0; i < matrix.length; i++){
            int[] row = matrix[i];
            for(int j=0; j < row.length; j++){
                
                if(i == j){
                    arrDiag[i] = matrix[i][j];
                }
                
            }
        }

        return arrDiag;

    }
    
}
