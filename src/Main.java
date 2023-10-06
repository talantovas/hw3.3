public class Main {
    public static void main(String[] args) {
        double[] array = {8.05, 2.5, -4.0, 2.0, 3.5, 6.10, -7.0, 1.66, 2.0, 3.5, -1.0, 2.0, -1.5, -2.0, 4.4};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double n = array[i];
            array[i] = array[minIndex];
            array[minIndex] = n;
        }

        System.out.print("Отсортированный массив: ");
        for (double num : array) {
            System.out.print(num + " ");
        }


        double positive = 0.0;
        boolean negative = false;
        int positiveCount = 0;

        for (double num : array) {
            if (num < 0) {
                negative = true;
            } else if (negative) {
                positive += num;
                positiveCount++;
            }
        }

        double average = positive / positiveCount;

        System.out.println("Average = " + average);
    }
}