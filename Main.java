public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 1, 1, 0};
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == 0){
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }


      int arr2[] = new int[8];
      for(int i = 0; i < arr2.length; i++){
          arr2[i] = i * 3;
          System.out.println("arr2[" + i + "] = " + arr2[i]);
      }

      int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
      for(int i = 0; i < arr3.length; i++){
          if(arr3[i] < 6){
              arr3[i] = arr3[i] * 2;
              System.out.println("arr3[" + i + "] = " + arr3[i]);
          }
      }

      int [][] arr4 = new int [5][5];
      for(int i = 0; i < arr4.length; i++){
          for(int j = 0; j < arr4.length; j++){
              if(i == j || (i + j) == arr4.length - 1){
                  arr4[i][j] = 1;
                  System.out.print(arr4[i][j] + " ");
              }
          }
          System.out.println();
      }

      int[] arr5 = {5, 11, 8, 6, 33, 1, 45, 4, 73};
      int max = arr5[0];
      int min = arr5[0];
      for (int i = 1; i < arr5.length; i ++){
          if(arr5[i] > max){
              max = arr5[i];
          }
          if(arr5[i] < min){
              min = arr5[i];
          }
      }
      System.out.println("Максимальное число в Array5: " + max);
      System.out.println("Минимальное число в Array5: " + min);




    }




}
