public class Task3 {
    public static void main(String[] args) {
        int Matrix[][] = new int[10][10];
        int sum = 0;

        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix.length; j++){
                if(i==j)
                {
                    Matrix[i][j] = i;
                    sum+= Matrix[i][j];
                }else {
                    Matrix[i][j]=0;
                }
                System.out.print(Matrix[i][j]);
            }
            System.out.println();
        }
    }
}
