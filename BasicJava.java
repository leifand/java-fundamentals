import java.util.*;

public class BasicJava {

    public static void main(String[] args) {

      BasicJava thisObj = new BasicJava();
      thisObj.printOneToTwoFiftyFive();
      thisObj.printOddsFrom1to255();
      thisObj.sumAndPrint1to255();

      int arr1[] = {5, 4, 3, 2, 1, 0};
      thisObj.iterateArray(arr1);

      int arr2[] = {-100, 3, -7, 0, 10, -5};
      System.out.println(thisObj.findMax(arr2));

      int arr3[] = thisObj.oddArray();
      thisObj.iterateArray(arr3);

      int arr4[] = {10, 20, 30, 40, 50, 60, 70};
      int arr5[] = thisObj.greaterThanY(arr4, 35);
      thisObj.iterateArray(arr5);
    }

    public void printOneToTwoFiftyFive() {

      for (int i = 1; i <= 255; i++) {
        System.out.println(i);
      }
    }

    public void printOddsFrom1to255() {

      for (int i = 1; i <= 255; i++) {
        if (i % 2 != 0) System.out.println(i);
      }
    }

    public void sumAndPrint1to255() {

      int sum = 0;
      for (int i = 1; i <= 255; i++) {
        System.out.println(i);
        sum += i;
      }
      System.out.println("sum: " + sum);
    }

    public void iterateArray(int[] arr) {

      int size = arr.length;
      for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
      }
    }

    public int findMax(int[] arr) {

      int max = Integer.MIN_VALUE;
      for (int element : arr) {
        if (element > max) max = element;
      }
      return max;
    }

    public float getAverage(int[] arr) {

      int size = arr.length;
      int sum = 0;
      for (int i = 0; i < size; i++) {
        sum =+ arr[i];
      }
      return sum/size;
    }

    public int[] oddArray() {

      int size = 128;
      int[] retArray = new int[size];
      int pos = 0;
      for (int i = 1; i <= 255; i++) {
        if (i % 2 != 0 && pos < size) {
          retArray[pos] = i;
          pos++; // this is a hack
        }
      }
      return retArray;
    }

    public int[] greaterThanY(int[] arr, int y) {

      int count = 0;
      for (int element : arr) {
        if (element > y) count++;
      }

      int[] retArray = new int[count];
      count = 0;
      for (int element : arr) {
        if (element > y) {
          retArray[count] = element;
          count++;
        }
      }
      return retArray;
    }

    // final two methods taken from Dojo solutions in interest of time
    public void squareValues(int[] givenArray){
        int length = givenArray.length;

        for (int i = 0; i < length; i++){
            givenArray[i] *= givenArray[i];
        }

        System.out.println(givenArray);
    }

    public void eliminateNegatives(int[] array) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(array[i] < 0) {
                myArray.add(0);
            } else {
                myArray.add(array[i]);
            }
        }

        System.out.println(myArray);
    }
  }
