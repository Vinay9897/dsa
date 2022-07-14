package striver;

class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 7 }, { 8, 10, 12, 14 }, { 16, 18, 20, 22 } };
        int row = mat.length;
        int col = mat[0].length;
        int search = 15;
        boolean response = find(mat, row, col, search);
        System.out.println(response);
    }

    public static boolean find(int[][] mat, int row, int col, int search) {

        for (int i = 0; i < row; i++) {
            int a = 0;
            if (mat[i][a] <= search && mat[i][col - 1] > search) {
                for (int j = 0; j < col; j++) {
                    if (mat[i][j] == search) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}