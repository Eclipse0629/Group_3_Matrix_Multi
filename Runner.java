//Group 3 Members: Nathan Y., Phoebe Y., Aditya S., Ujjwal R. 

public class Runner {

    public static void main(String[] args) {
        // Define two matrices m1 and m2
        Double[][] m1 = {
            {1.0, 2.0, 3.0, 5.0},
            {4.0, 5.0, 6.0, 7.0},
            {7.0, 8.0, 9.0, 9.0}
        };

        Double[][] m2 = {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {4.0, 5.0, 6.0, 7.0, 8.0},
            {7.0, 8.0, 9.0, 10.0, 11.0},
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };

        // Call the multiply method from the Matrix class to multiply matrices m1 and m2
        Double[][] m3 = Matrix.multiply(m1, m2);

        // Check if the multiplication was successful (null means matrices were incompatible)
        if (m3 != null) {
            // StringBuilder to format and print the result matrix m3
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m3.length; i++) {
                for (int j = 0; j < m3[i].length; j++) {
                    sb.append(String.format("%5s", m3[i][j])).append(" "); // Formatting with 5 spaces
                }
                sb.append("\n");
            }
            System.out.println(sb);
        } else {
            System.out.println("Matrix multiplication not possible due to incompatible sizes.");
        }
    }
}
