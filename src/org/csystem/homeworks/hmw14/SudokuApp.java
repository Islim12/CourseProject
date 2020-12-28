package org.csystem.homeworks.hmw14;

import java.util.Scanner;

public class SudokuApp {
    public static void run()
    {
        Sudoku sd = new Sudoku();

        sd.getSdkMatrix();

        if (sd.isValid())
            System.out.println("Valid.");
        else
            System.out.println("Invalid.");
    }
}

class Sudoku {
    private int[][] m_sdm;

    private void fillSudoku()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Start entering the numbers: ");

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                m_sdm[i][j] = kb.nextInt();
    }

    private boolean rowConstraint()
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                int ctrl = j + 1;
                while (ctrl < 9) {
                    if (m_sdm[i][j] == m_sdm[i][ctrl])
                        return false;
                    ctrl++;
                }
            }
        return true;
    }

    private boolean columnConstraint()
    {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                int ctrl = i + 1;
                while (ctrl < 9) {
                    if (m_sdm[i][j] == m_sdm[ctrl][j])
                        return false;
                    ctrl++;
                }
            }
        return true;
    }

    public Sudoku()
    {
        m_sdm = new int[9][9];
    }

    public void read()
    {
        fillSudoku();
    }

    public boolean isValid()
    {
        return rowConstraint() && columnConstraint();
    }

    public void getSdkMatrix()
    {
        m_sdm = new int[][]{{3, 6, 7, 5, 1, 9, 8, 4, 2},
                {8, 4, 2, 3, 7, 6, 9, 1, 5},
                {5, 9, 1, 4, 8, 2, 7, 6, 3},
                {1, 8, 5, 9, 2, 4, 3, 7, 6},
                {9, 3, 6, 7, 5, 1, 2, 8, 4},
                {2, 7, 4, 6, 3, 8, 5, 9, 1},
                {6, 2, 3, 8, 4, 7, 1, 5, 9},
                {4, 5, 8, 1, 9, 3, 6, 2, 7},
                {7, 1, 9, 2, 6, 5, 4, 3, 8}};
    }
}