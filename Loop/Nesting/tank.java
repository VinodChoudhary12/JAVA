 class Test {

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.createPattern();
    }

}

class Pattern {
    void createPattern() {
        int n = 5; // Number of rows
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }


            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(num + " ");
            }
            num += 2;


            System.out.println();
        }
    }
}


