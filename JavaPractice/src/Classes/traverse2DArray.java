package Classes;

public class traverse2DArray {

    public void majorOrder(char[][] letters) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                System.out.print(letters[i][j]);
            }
        }
    }

    public void columnOrder(char[][] letters) {
        for (int i = 0; i < letters[0].length; i++) {
            for (int j = 0; j < letters.length; j++) {
                System.out.print(letters[j][i]);
            }
        }
    }

}
