package core.functional_style;

import core.functional_style.exceptions.NoCellVariantsException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

public class OldStyle {

    private static final List<Integer> ALL_DIGITS = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    private final String input = "12345 789\n987 54321\n91827364 ";

    private int table[][] = new int[9][9];

    private boolean noTableAction = true;

    private void initTableCellsFromInput() {
        String[] rows = input.split("\\n");
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                char c = rows[i].toCharArray()[j];
                if (c == ' ') {
                    table[i][j] = 0;
                } else if (Character.getNumericValue(c) <= 9 && Character.getNumericValue(c) >= 0) {
                    table[i][j] = Character.getNumericValue(c);
                } else
                    throw new RuntimeException("Wrong input format");

            }
    }

    private void trySolveSudoku() {
        noTableAction = true;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                if (isNotSolvedCell(i, j))
                    trySolveCell(i, j);
            }
    }

    private boolean isNotSolvedCell(int i, int j) {
        return !isSolvedCell(i, j);
    }

    private void trySolveCell(int i, int j) {
        int solvedCell = tryFindSolvedCell(i, j);
        if (solvedCell > 0) {
            table[i][j] = solvedCell;
            noTableAction = false;
        }
    }

    private boolean isSolvedCell(int str, int col) {
        return table[str][col] != 0;
    }

    private int tryFindSolvedCell(int str, int col) {
        List<Integer> variants = getCellVariants(str, col);
        if (isMany(variants))
            return 0;
        if (variants.isEmpty())
            throw new NoCellVariantsException();
        return getSingle(variants);
    }

    private Integer getSingle(List<Integer> variants) {
        return variants.get(0);
    }

    private boolean isMany(List<Integer> variants) {
        return variants.size() > 1;
    }

    private List<Integer> getCellVariants(int str, int col) {
        List<Integer> variants = new ArrayList<>(ALL_DIGITS);
        Set<Integer> variantsToExclude = new HashSet<>();
        variantsToExclude.addAll(getSolvedByRow(col));
        variantsToExclude.addAll(getSolvedByColumn(str));
        variantsToExclude.addAll(getSolvedBySector(str, col));
        variants.removeAll(variantsToExclude);
        return variants;
    }

    private List<Integer> getSolvedByRow(int col) {
        List<Integer> variants = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            if (isSolvedCell(i, col))
                variants.add(table[i][col]);
        return variants;
    }

    private List<Integer> getSolvedBySector(int str, int col) {
        int mini, maxi, minj, maxj;
        List<Integer> variants = new ArrayList<>();

        if (str <= 2) {
            mini = 0;
            maxi = 2;
        } else if (str <= 5) {
            mini = 3;
            maxi = 5;
        } else {
            mini = 6;
            maxi = 8;
        }
        if (col <= 2) {
            minj = 0;
            maxj = 2;
        } else if (col <= 5) {
            minj = 3;
            maxj = 5;
        } else {
            minj = 6;
            maxj = 8;
        }

        for (int i = mini; i <= maxi; i++)
            for (int j = minj; j <= maxj; j++) {
                if (isSolvedCell(i, j))
                    variants.add(table[i][j]);
            }
        return variants;
    }

    private List<Integer> getSolvedByColumn(int str) {
        List<Integer> variants = new ArrayList<>();
        for (int j = 0; j < 9; j++)
            if (isSolvedCell(str, j))
                variants.add(table[str][j]);
        return variants;
    }

}
