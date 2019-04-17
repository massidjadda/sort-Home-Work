package SortWork;



public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        boolean sorted=false;



        int Array[] = {5, 1, 20, 17, -1, 24, 18, 99, 78, -40, 3, 8};
        while(sorted==false) {
            sorted = true;


            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    temp = Array[i + 1];
                    Array[i + 1] = Array[i];
                    Array[i] = temp;
                    sorted = false;
                }

            }
        }

            for (int A:Array) {
                System.out.println(A);

            }

        }

    }
