package draft;

import java.io.IOException;

public class Matrix {
    int age;
    String name;
    int[][] matrix;

//    Matrix(int age, String name, int[][] matrix) {
//        this.age = age;
//        this.name = name;
//        this.matrix = matrix;
//    }

    public void output() throws Exception {
        //matrix = this.matrix;
        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.println(matrix[i][j]);
                }
            }
        } catch (Exception e) {
            System.out.println("Вы не ввели матрицу");
        }
    }
}
