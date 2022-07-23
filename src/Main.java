
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task4() {
        int[] weight1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < weight1.length; i++)
            if (weight1[i] % 2 == 0) {


                System.out.print(weight1[i]);
            }
            else
                System.out.print(weight1[i] + 1);
    }

    public static void task1() {
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        int a = i[0];
        System.out.println(i[1]);

        double[] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));

        int[] weights = new int[12];
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);


    }


    public static void task2() {
        int[] weight = {1, 2, 3};
        {
            for (int i = 0; i < weight.length; i++)
                System.out.print(weight[i] + ",");
        }
        System.out.println();

        double[] sum = {1.57, 7.654, 9.986};
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + ",");
        }   System.out.println();

        int[] weight1 = {90, 91, 93, 92, 85, 87, 84, 83};
        for (int i = 0; i < weight1.length; i++) {
            System.out.print(weight1[i]);
            if (i < weight1.length - 1)
                System.out.print(",");
        }
        System.out.println();

    }
    public static void task3 () {
        int[] weight = new int[]{1, 2, 3};
        for (int i = weight.length - 1; i > -1; i--) {
            System.out.print(weight[i]);
            if (i > 0)
                System.out.print(",");
        }
        System.out.println();
        double[] mass = {1.57, 7.654, 9.986};
        for (int i = mass.length - 1; i > -1; i--) {
            System.out.print(mass[i]);
            if (i > 0)
                System.out.print(",");
        }
        System.out.println();
        int[] weight1 = {90, 91, 93, 92, 85, 87, 84, 83};
        for (int i = weight1.length - 1; i > -1; i--) {
            System.out.print(weight1[i]);
            if (i > 0)
                System.out.print(",");
        }
        System.out.println();
    }
}

