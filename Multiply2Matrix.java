class Multiply2Matrix{
    public static void main(String[] args) {
        int[][] m1 = {{2,3,4},{1,1,1},{2,2,2}};
        int[][] m2 = {{2,1,9},{4,3,2},{1,7,9}};
        System.out.println("First matrix is ");
        for(int i =0; i<=2; i++){
            for(int j =0; j<=2; j++){
                System.out.print(m1[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Secong matrix is ");
        for(int i =0; i<=2; i++){
            for(int j =0; j<=2; j++){
                System.out.print(m2[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Result obtain by multiplying two matrix is as follows : ");
	for(int i =0; i<=2; i++){
            for(int j =0; j<=2; j++){
                System.out.print(m1[i][j]*m2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}