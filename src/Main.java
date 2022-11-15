import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {-1.5,2.5,3.5,-4.5,5.5,-6.5,7.5,8.5,-9.5,10.5,-11.5,12.5,-13.5,14.5,15.5};
        int result = 0;
        int pozitiveNumbers = 0;

        for (double firstNum: numbers
             ) {

            if (firstNum < 0){
                continue;
            }else if (firstNum >= 0){
                pozitiveNumbers++;
                result+=firstNum;
            }

        }

        System.out.println("Среднее арифметическое число равна " + result+" / "
                +pozitiveNumbers+" = "+(result / pozitiveNumbers));

        int[] number = {42, 31, -14,-3, 24,15,27, 7, 2, 4, 9};

        method(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }
    public static void method(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int minNum = nums[i];
            int min_i = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<minNum){
                    minNum=nums[j];
                    min_i=j;
                }
            }
            if (i != min_i){
                int kkk = nums[i];
                nums[i]=nums[min_i];
                nums[min_i]=kkk;
            }

        }
    }
    }
