import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] z = new long[8];

        for (int i = 0; i < z.length; i++) {

            z[i] = 21-2 * i;


        }
        System.out.println(Arrays.toString(z));

        float[] x = new float[8];

        float min = -11.0f;
        float max = 3.0f;

        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * (max - min) + min);
        }
        System.out.println(Arrays.toString(x));




    }
}