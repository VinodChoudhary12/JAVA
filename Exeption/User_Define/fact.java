import java.util.Scanner;

class Board {
    private char[] grid;

    public Board() {
        grid = new char[9];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            grid[i] = '-';
        }
    }

    public void displayBoard() {
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    public boolean isCellEmpty(int position) {
        return grid[position] == '-';
    }

    public void markCell(int position, char symbol) {
        grid[position] = symbol;
    }

    public boolean hasWon(char symbol) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (grid[i] == symbol && grid[i + 1] == symbol && grid[i + 2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (grid[i] == symbol && grid[i + 3] == symbol && grid[i + 6] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (grid[0] == symbol && grid[4] == symbol && grid[8] == symbol) {
            return true;
        }
        if (grid[2] == symbol && grid[4] == symbol && grid[6] == symbol) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        for (char cell : grid) {
            if (cell == '-') {
                return false;
            }
        }
        return true;
    }
}

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

    public int makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", enter the position (0-8) to place your symbol: ");
        int position = scanner.nextInt();
        return position;
    }
}

class AIPlayer extends Player {
    public AIPlayer() {
        super("AI Player", 'O');
    }

    @Override
    public int makeMove(Board board) {
        return minimax(board, 0, true);
    }

    private int minimax(Board board, int depth, boolean isMaximizingPlayer) {
        if (board.hasWon('X')) {
            return -1;
        } else if (board.hasWon('O')) {
            return 1;
        } else if (board.isFull()) {
            return 0;
        }

        if (isMaximizingPlayer) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board.isCellEmpty(i)) {
                    board.markCell(i, getSymbol());
                    int score = minimax(board, depth + 1, false);
                    board.markCell(i, '-');
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board.isCellEmpty(i)) {
                    board.markCell(i, 'X');
                    int score = minimax(board, depth + 1, true);
                    board.markCell(i, '-');
                    bestScore = Math.min(score, bestScore);
                }
            }
            return bestScore;
        }
    }
}

public class TicTacToeGame {
    private Board board;
    private Player player1;
    private AIPlayer player2;
    private Player currentPlayer;

    public TicTacToeGame() {
        board = new Board();
        player1 = new Player("Player 1", 'X');
        player2 = new AIPlayer();
        currentPlayer = player1;
    }

    public void play() {
        while (true) {
            board.displayBoard();

            if (currentPlayer == player1) {
                int position = currentPlayer.makeMove(board);
                if (board.isCellEmpty(position)) {
                    board.markCell(position, currentPlayer.getSymbol());
                    if (board.hasWon(currentPlayer.getSymbol())) {
                        System.out.println(currentPlayer.getName() + " wins!");
                        break;
                    } else if (board.isFull()) {
                        System.out.println("It's a draw!");
                        break;
                    }
                    currentPlayer = player2;
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            } else {
                int position = currentPlayer.makeMove(board);
                if (board.isCellEmpty(position)) {
                    board.markCell(position, currentPlayer.getSymbol());
                    if (board.hasWon(currentPlayer.getSymbol())) {
                        System.out.println(currentPlayer.getName() + " wins!");
                        break;
                    } else if (board.isFull()) {
                        System.out.println("It's a draw!");
                        break;
                    }
                    currentPlayer = player1;
                }
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
