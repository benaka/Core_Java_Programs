package com.ben.dsa;

//Determine 9*9 Sudoku board is valid
//1.Each row must contain the digit 1-9 without repetition
//2.Each column must contain the digit 1-9 without repetition
//3.Each of the nine 3*3 sub-boxes of grid must contain the digits 1-9 without repetition

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoko
{
    public static void main(String[] args)
    {
        char[][] sudokuBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        HashSet[] rowSet = new HashSet[9];
        HashSet[] colSet = new HashSet[9];
        HashSet[] gridSet = new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rowSet[i]=new HashSet();
            colSet[i]=new HashSet();
            gridSet[i]=new HashSet();
        }

        for(int i=0; i<9; i++)
        {
            for(int j=0;j<9;j++)
            {
                int gridNo=(i/3)*3+j/3;
                if(sudokuBoard[i][j]!='.')
                {
                    boolean isPresentInRow= rowSet[i].contains(sudokuBoard[i][j]);
                    boolean isPresentInCol= colSet[j].contains(sudokuBoard[i][j]);
                    boolean isPresentInGrid= gridSet[gridNo].contains(sudokuBoard[i][j]);
                    if(isPresentInRow || isPresentInCol || isPresentInGrid)
                    {
                        System.out.println("Not a Valid Sudoku Board");
                    }
                    rowSet[i].add(sudokuBoard[i][j]);
                    colSet[j].add(sudokuBoard[i][j]);
                    gridSet[gridNo].add(sudokuBoard[i][j]);
                }
            }
        }
    }
}
