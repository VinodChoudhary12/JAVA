class Test {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Iteration " + i);
            System.out.flush(); // Clear the buffer and print immediately
            try {
                Thread.sleep(1000); // Wait for one second
            } catch (InterruptedException e) 
			{
                e.printStackTrace();
            }
            System.out.print("\r"); // Move the cursor to the beginning of the line
        }
        System.out.println("Finished!");
    }
}