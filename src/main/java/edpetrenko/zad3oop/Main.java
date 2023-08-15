package edpetrenko.zad3oop;

public class Main {
    
    static int[][] randFull(int h, int w){
        int[][] matrix = new int[h][w];
        for(int i = 0 ;i < h; i++){
            for(int j = 0 ;j < w; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
        return matrix;
    }
    
    static int width(int[][] matrix){
        int w = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (w < matrix[i].length) {
                    w = matrix[i].length;
                }
            }
        return w;
    }
    
    static boolean check(int[][] m1, int[][] m2, int w1, int w2){
        if(m1.length == m2.length){
            if(w1 == w2){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    static int[][] plus(int[][] m1, int[][] m2){
        int w1 = width(m1);
        int w2 = width(m2);
        if(!check(m1,m2,w1,w2)){
            System.out.println("Разные размеры матрицы");
            return null;
        }else{
        int[][] sum = new int[m1.length][w1];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < w1; j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
      }
    }
    
    static void print(int[][] matrix){
        System.out.println("");
        int w = width(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < w; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    static int[][] multiSolo(int[][] matrix, int k){
        int[][] result = new int[matrix.length][width(matrix)];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < width(matrix);j++){
                result[i][j] = matrix[i][j]*k;
            }
        }
        return result;
    }
    
    static int[][] multiTwin(int[][] m1, int[][] m2){
        
        int w1 = width(m1);
        int w2 = width(m2);
        
        if(w1 != m2.length){
            System.out.println("Умножение невозможно");
            return null;
        }
        
        int[][] result = new int[m1.length][w2];
        int temp = 0;
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < w2; j++){
                for(int k = 0; k < m1[0].length; k++){
                    temp += m1[i][k] * m2[k][j];
                }
                result[i][j] = temp;
                temp = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        Matrix m1 = new Matrix(randFull(3,2));
        Matrix m2 = new Matrix(randFull(2,3));
        
        print(m1.getMatrix());
        print(m2.getMatrix());
        //print(plus(m1.getMatrix(), m2.getMatrix()));
        //print(multiSolo(m1.getMatrix(),5));
        print(multiTwin(m1.getMatrix(),m2.getMatrix()));
        
    }
}
