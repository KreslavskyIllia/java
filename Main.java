public class Main {

    public static int SumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Wrong array size");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].length != 4) {
                    throw new MyArraySizeException("Wrong array size");
                }
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e2) {
                    throw new MyArrayDataException((String.format("%s is not a number. Array cell [%s][%s]", array[i][j], i, j)));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "3"},
                {"4", "5", "6", "3"},
                {"7", "8", "9", "-"},
                {"10", "11", "12", "13"},
        };

        int sum;
        try{
            sum = SumArray(array);
            System.out.println("Сумма чисел преобразованного массива: " +sum);
        } catch (MyArraySizeException e1) {
            System.out.println(e1);
        } catch (MyArrayDataException e2){
            System.out.println(e2);
        }
    }
}
