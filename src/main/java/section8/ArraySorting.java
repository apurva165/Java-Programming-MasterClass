package section8;

public class ArraySorting {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 40;
        arr[1] = 30;
        arr[2] = 6;
        arr[3] = 4;
        arr[4] = 28;
        arr[5] = 22;
        arr[6] = 236;
        arr[7] = 243;
        arr[8] = 233;
        arr[9] = 23;

        traverseArray(arr);
        bubbleSortDesc(arr);
        bubbleSortAsc(arr);
        selectionSortAce(arr);
        selectionSortDesc(arr);
        traverseArray(arr);
    }


    public static void traverseArray(int[] myArray) {
        System.out.println("Traversing Array");
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void bubbleSortDesc(int[] array) {
        int temp = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSortAsc(int[] array) {
        int temp = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionSortDesc(int[] array) {
        int currentMin = 0;
        int tempNum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j] < array[currentMin]) {
                    tempNum = array[currentMin];
                    array[currentMin] = array[j];
                    array[j] = tempNum;
                    currentMin++;
                }
            }
        }

    }

    public static void selectionSortAce(int[] array) {
        int currentMin = 0;
        int tempNum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j] > array[currentMin]) {
                    tempNum = array[currentMin];
                    array[currentMin] = array[j];
                    array[j] = tempNum;
                    currentMin++;
                }
            }
        }

    }


}
