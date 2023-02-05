package exercice1;

public class Matrix {
	//declaration part
	
	private final int rows;
    private final int columns;
    private final int[][] elements;

    //constructor with two parameters
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }
    // Method return the number of rows
    public int getRows() {
        return this.rows;
    }

 // Method return the number of columns
    public int getColumns() {
        return this.columns;
    }
 // A setter 

    public void setElement(int i, int j, int value) {
        this.elements[i][j] = value;
    }

    // a method of Matrix type to add
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Impossible d'additionner ces matrices");
            return null;
        }

        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    

 // a method of Matrix type to multiply
    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            System.out.println("Impossible de multiplier ces matrices");
            return null;
        }
        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.elements[i][k] * other.elements[k][j];
                }
                result.elements[i][j] = sum;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
		Matrix matrix = new Matrix(4, 6);
		System.out.println(matrix.getColumns());
	}

}
