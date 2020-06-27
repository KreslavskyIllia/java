public class Main {

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    public static void methodOne(){
        final int size = 10000000;
        float[] arr = new float[size];
        fillArrWithOne(arr);
        long a = System.currentTimeMillis();
        calculation(arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void methodTwo(){
        final int size = 10000000;
        final int half = size / 2;
        float[] arr = new float[size];
        fillArrWithOne(arr);
        long a = System.currentTimeMillis();
        float[] halfArr1 = new float[half];
        float[] halfArr2 = new float[half];
        System.arraycopy(arr, 0, halfArr1, 0, half);
        System.arraycopy(arr, half, halfArr2, 0, half);
        calculation(halfArr1);
        calculation(halfArr2);
        System.arraycopy(halfArr1, 0, arr, 0, half);
        System.arraycopy(halfArr2, 0, arr, half, half);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void fillArrWithOne (float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
