/*
 * painting chess desk with w and b chars
 */

package com.homeWork;

public class ChessBoard {

    public static void main(String[] args) {

        char[][] board = new char[8][8];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)){
                    board[i][j] = 'B';
                } else {
                    board[i][j] = 'W';
                }
            }
        }

        for (char[] el : board){
            for(char ch: el){
                System.out.print (ch + " ");
            }
            System.out.println();
        }


    }
}
