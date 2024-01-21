package Recursion.NQueenProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class index {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] bd : board) {
            Arrays.fill(bd, '.');
        }
        solveNQueensUtil(board, 0, result);
        return result;
    }

    private void solveNQueensUtil(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(constructSolution(board));
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(isValid(board, row, i)) {
                board[row][i] = 'Q';
                solveNQueensUtil(board, row + 1, result);
                board[row][i] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
            if(col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q') {
                return false;
            }
            if(col + (row - i) < board.length && board[i][col + (row - i)] == 'Q') {
                return false;
            }
           
        }
        return true;
    }

    private List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }


    public static void main(String[] args) {
        index solution = new index();
        int n = 4; // Change this to your desired value of N
        List<List<String>> result = solution.solveNQueens(n);

        // Display the result
        for (List<String> solutionBoard : result) {
            for (String row : solutionBoard) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    
}
