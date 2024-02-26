 class ArraySumCalculator {
    private int[] array;
    
    public ArraySumCalculator(int[] array) {
        this.array = array;
    }
    
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 1, 4, 15 };
        ArraySumCalculator calculator = new ArraySumCalculator(numbers);
        int sum = calculator.calculateSum();
        System.out.println("Sum of array elements: " + sum);
    }
}