import java.util.Scanner;

// Represents the Tic-Tac-Toe game board
class Board {
    private char[][] grid;
    
    public Board() {
        grid = new char[3][3];
        initializeBoard();
    }
    
    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = '-';
            }
        }
    }
    
    public void displayBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == '-';
    }
    
    public void markCell(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }
    
    public boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (grid[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean hasWon(char symbol) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] == symbol && grid[row][1] == symbol && grid[row][2] == symbol) {
                return true;
            }
        }
        
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] == symbol && grid[1][col] == symbol && grid[2][col] == symbol) {
                return true;
            }
        }
        
        // Check diagonals
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }
        
        return false;
    }
}

// Represents the players
class Player {
    private String name;
    private char symbol;
    
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    public String getName() {
        return name;
    }
    
    public char getSymbol() {
        return symbol;
    }
    
    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", enter the row and column (0-2) to place your symbol: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] {row, col};
    }
}

// Main class to control the game flow
 class TicTacToeGame {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    
    public TicTacToeGame() {
        board = new Board();
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        currentPlayer = player1;
    }
    
    public void play() {
        while (true) {
            board.displayBoard();
            int[] move = currentPlayer.makeMove();
            int row = move[0];
            int col = move[1];
            
            if (board.isCellEmpty(row, col)) {
                board.markCell(row, col, currentPlayer.getSymbol());
                
                if (board.hasWon(currentPlayer.getSymbol())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                } else if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
                
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
        
        board.displayBoard();
        System.out.println("Game Over!");
    }
    
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.play();
    }
}
