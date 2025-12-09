import java.util.Arrays;

public class Main {

    /**
     * Задача: Move Zeroes (переместить все нули в конец массива)
     * -------------------------------------------------------------
     * Дано: целочисленный массив nums, содержащий нули и не-нули. :contentReference[oaicite:0]{index=0}
     * Требуется: модифицировать массив на месте — так, чтобы:
     * 1) все нули оказались в конце массива;
     * 2) порядок ненулевых элементов (относительно друг друга) остался тем же, что и в исходном массиве.
     * <br>
     * Вход / Выход — примеры:
     * Input: nums = [0, 1, 0, 3, 12]
     * После вызова moveZeroes(nums), nums должен стать [1, 3, 12, 0, 0]
     * <br>
     * Input: nums = [0]
     * После вызова — nums остаётся [0]
     * <br>
     * Замечание: метод ничего не возвращает — модификация происходит in-place (в самом массиве)
     */
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 3, 0, 9, 2};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int posNoZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != posNoZero) {
                    int timeVar = nums[i];
                    nums[i] = nums[posNoZero];
                    nums[posNoZero] = timeVar;
                }
                posNoZero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}