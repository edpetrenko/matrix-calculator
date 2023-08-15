package edpetrenko.zad3oop;

public class Matrix {
    
    private int height;
    private int width;
    private int[][] matrix;
    
    Matrix(){
        
    }
    Matrix(int[][] matrix){
        this.matrix = matrix;
        this.height = matrix.length;
        this.width = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (this.width < matrix[i].length) {
                    this.width = matrix[i].length;
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
}
