import java.util.Arrays;

public class Lesson02 {
    public static void main(String[] args) {
        doTask01();
        doTask02();
        doTask03();
        doTask04();
        doTask05();
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void doTask01(){
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task01:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {arr[i]=0;} else {arr[i] =1;}
        }
        printArray(arr);
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void doTask02(){
        int[] arr = new int[8];
        System.out.println("Task02:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3*i;
        }
        printArray(arr);
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void doTask03() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task03:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <6) {arr[i]=arr[i]*2;}
        }
        printArray(arr);
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void doTask04() {
        int[][] intQuadArray = new int[6][6];
        System.out.println("Task04:");
        for (int i=0; i < intQuadArray.length; i++){
            for (int j=0; j < intQuadArray[i].length; j++){
                intQuadArray[i][j] = 0;
                if (i==j || i+j==intQuadArray.length-1){
                    intQuadArray[i][j] = 1;
                }
            }
        }
        printQuadArray(intQuadArray);
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void doTask05() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task05:");
        printArray(arr);
        int[] minElement = findMin(arr);
        System.out.printf("Min element's index: %d. Min element's value: %d \n", minElement[0], minElement[1]);
        int[] maxElement = findMax(arr);
        System.out.printf("Max element's index: %d. Max element's value: %d \n", maxElement[0], maxElement[1]);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    private static void printQuadArray(int[][] myQuadArray){
        for (int i=0; i < myQuadArray.length; i++){
            printArray(myQuadArray[i]);
        }
    }

    private static int[] findMin(int[] myArray){
        int[] minElement = new int[] {0, myArray[0]};
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] < minElement[1]) {
                minElement[0] = i;
                minElement[1] = myArray[i];
            }
        }
        return minElement;
    }

    private static int[] findMax(int[] myArray){
        int[] maxElement = new int[] {0, myArray[0]};
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] > maxElement[1]) {
                maxElement[0] = i;
                maxElement[1] = myArray[i];
            }
        }
        return maxElement;
    }

}
