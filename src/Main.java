public class Main {
    public static void main(String[] args) {


        long[] z = new long[8];
        for (int i = 0; i < z.length; i++) {
            z[i] = 21 - 2 * i;
        }


        float[] x = new float[16];
        float min = -11.0f;
        float max = 3.0f;
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * (max - min) + min);
        }

        double[][] n = new double[8][16];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {

                n[i][j] = calculateElement(z[i], x[j]);
            }
        }


        printMatrix(n);
    }


    public static double calculateElement(long zValue, float xValue) {
        if (zValue == 17) {
            return Math.atan(Math.cos(Math.pow(Math.tan(xValue), Math.log(Math.abs(xValue)) + 1)));
        } else if (zValue == 9 || zValue == 11 || zValue == 13 || zValue == 15) {
            return Math.exp(Math.pow(Math.tan(xValue) / (0.5 + Math.tan(xValue)), 2));
        } else {
            return 4 * Math.cbrt(Math.tan(Math.pow(xValue, 2.0 / (3.0 * xValue))));
        }
    }


    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double v : row) {

                System.out.printf("%8.3f ", v);
            }
            System.out.println();
        }
    }
}