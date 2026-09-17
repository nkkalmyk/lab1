import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] z = new long[8];
        for (int i = 0; i < z.length; i++) {
            z[i] = 21 - 2 * i;
        }
        System.out.println(Arrays.toString(z));


        float[] x = new float[16];
        float min = -11.0f;
        float max = 3.0f;
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * (max - min) + min);
        }
        System.out.println(Arrays.toString(x));

        double[][] n = new double[8][16];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {

                float currentX = x[j];

                if (z[i] == 17) {
                    n[i][j] = Math.atan(Math.cos(Math.pow(Math.tan(currentX), Math.log(Math.abs(currentX)) + 1)));
                } else if (z[i] == 9 || z[i] == 11 || z[i] == 13 || z[i] == 15) {
                    n[i][j] = Math.exp(Math.pow(Math.tan(currentX) / (0.5 + Math.tan(currentX)), 2));
                } else {

                    n[i][j] = 4 * Math.cbrt(Math.tan(Math.pow(currentX, 2.0 / (3.0 * currentX))));
                }
            }
        }


        for (double[] row : n) {
            for (double v : row) {
                System.out.printf("%8.3f ", v);
            }
            System.out.println();
        }
    }
}