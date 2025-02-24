//Group 3 Members: Nathan Y., Phoebe Y., Aditya S., Ujjwal R. 

public class Matrix {

    // Method to multiply two matrices (if they are compatible)
    public static Double[][] multiply(Double[][] a, Double[][] b) {
        // Check if multiplication is possible (columns of a must equal rows of b)
        if (a[0].length != b.length) {
            return null; // Return null if the matrices have incompatible sizes
        }

        // Create result matrix with dimensions [a.length][b[0].length]
        Double[][] result = new Double[a.length][b[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                result[i][j] = 0.0; // Initialize the result matrix element to 0
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j]; // Sum product of a row and b column
                }
            }
        }
        return result; // Return the result matrix
    }
}