import java.lang.Math;

public class Main {

    static float opt1(float x) {
        return (float) Math.sin(Math.log(Math.pow((2*Math.PI*(4+Math.abs((float) x))), 2)));
    }
    static float opt2(float x) {
        return (float) Math.pow(((Math.pow(1./3., Math.pow(1./3., x)))/1.)/4., 2);
    }
    static float opt3(float x) {
        return (float) Math.log(Math.pow(Math.sin(Math.log(Math.pow((3./(Math.cos(x)+1)), 2))), 2));
    }
    static void matrixOut(float[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Объявление массивов из условия
        short[] z = {6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        float[] x = new float[15];
        float xMin = -7.0f, xMax = 3.0f;
        float[][] z1 = new float[10][15];

        // Заполнение массива x рандомными числами
        for (short i = 0; i < x.length; i++) {
            x[(int) i] = (float) (xMin + Math.random()*(xMax-xMin));
        }

        // Выполнение основной части задания
        for(int i = 0; i < z.length; i++) {
            for(int j = 0; j < x.length; j++) {
                short zI = z[i];
                float xJ = x[j];

                switch (zI) {
                    case 12 -> z1[i][j] = opt1(xJ);
                    case 8, 14, 18, 20, 22 -> z1[i][j] = opt2(xJ);
                    case 6, 10, 16, 24 -> z1[i][j] = opt3(xJ);
                }
            }
        }
        matrixOut(z1);
    }

}


