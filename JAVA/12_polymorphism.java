
public class PolymorphismSumExample {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public double sum(double[] nums) {
        double total = 0;
        for (double num : nums) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        PolymorphismSumExample summer = new PolymorphismSumExample();

        System.out.println("Sum of 7 and 13 (int): " + summer.sum(7, 13));
        System.out.println("Sum of 15.75 and 24.25 (double): " + summer.sum(15.75, 24.25));
        System.out.println("Sum of 10, 20, 30 (int): " + summer.sum(10, 20, 30));
        System.out.println("Sum of 8.2f and 1.8f (float): " + summer.sum(8.2f, 1.8f));
        System.out.println("Sum of int array {10, 20, 30, 40}: " + summer.sum(new int[]{10, 20, 30, 40}));
        System.out.println("Sum of double array {2.5, 3.5, 4.0, 5.0}: " + summer.sum(new double[]{2.5, 3.5, 4.0, 5.0}));
    }
}
