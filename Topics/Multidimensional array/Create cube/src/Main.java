class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] cube = new int[3][3][3];

        for (int i = 0; i < 3; i++) {        // "layer" dimension
            for (int j = 0; j < 3; j++) {    // row
                for (int k = 0; k < 3; k++) { // column
                    // Each 2D plane is:
                    // Row 0: [0, 1, 2]
                    // Row 1: [3, 4, 5]
                    // Row 2: [6, 7, 8]
                    cube[i][j][k] = j * 3 + k;
                }
            }
        }

        return cube;
    }
}