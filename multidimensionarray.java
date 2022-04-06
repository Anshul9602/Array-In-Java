public class multidimensionarray {
    public static void main(String[] args) {
        int num[][], i, j;
        num = new int[2][3];
        num[0][0] = 102;
        num[0][1] = 103;
        num[0][2] = 104;
        num[1][0] = 106;
        num[1][1] = 107;
        num[1][2] = 108;

        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
                System.out.print(" ");
                // this is use for space in the array items

            }
            System.out.println(" ");
        }
    }
}
