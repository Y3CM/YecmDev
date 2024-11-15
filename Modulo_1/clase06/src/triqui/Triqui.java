package triqui;

import java.util.Scanner;

public class Triqui {
    public static void startGame(){
        // Implement the game logic here
        System.out.println("Welcome to Triqui!");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
        System.out.println("Enter your move (row col):");

        var player = 'X';
        var board = initializeBoard();
        var scanner = new Scanner(System.in);
        var isFinished = false;
        do {
            showBoard(board);
        System.out.printf("Jugador %c ingresa tu movimiento: %n", player);
        System.out.print("Fila (1-3): ");
        var row = scanner.nextInt() - 1;
        System.out.print("Columna (1-3): ");
        System.out.println();
        var column = scanner.nextInt() - 1;

       if( makeMove(board,row,column,player)){
            if (checkWinner(board,player)) {
                showBoard(board);
                System.out.println("El jugador " + player + " ha ganado");
                isFinished = true;
            }else{
                player = player == 'X'? 'O' : 'X';
            }
       }else{
        System.err.println("Move failed. Intenta de nuevo");
       }
        } while (!isFinished);
        
                scanner.close();
                    }

                        private static boolean checkWinner(char[][] board, char player) {
                            for ( var row : board) {
                                if (row[0] == player && row[1] == player && row[2] == player) {
                                    return true;
                                }
                            }
                            for (int i = 0; i < board[0].length; i++) {
                                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                                    return true;
                                }
                            }

                            for (int i = 0; i < board[0].length; i++) {
                                if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                                    return true;
                                }
                            }

                            for (int i = 0; i < board[0].length; i++) {
                                if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                                    return true;
                                }
                            }
                            return false;
                        }
                
                    private static boolean makeMove(char[][] board, int row, int column, char player) {
                        if (board[row][column] != ' '){
                            return false;
                        }
                        board[row][column] = player;
                        return true;
            }
        
                    private static void showBoard(char[][] board) {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        System.out.print(board[i][j]+ " ");
                        if (j < board[i].length - 1) {
                            System.out.print("| ");
                        }
                    }
                    System.out.println();
                    if (i < board[i].length - 1) {
                        System.out.println("---------");
                    }
                }       
              
            }
        
            private static char[][] initializeBoard() {   
        var board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] =' ';
            }
        }

        return board;
    }
}
