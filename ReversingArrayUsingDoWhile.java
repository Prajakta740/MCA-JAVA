class ReversingArrayUsingDoWhile{
    public static void main(String[] args) {
	int i =6;
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        do{
		System.out.println(arr[i]);
		i--;
        }while(i>=0);
    }
}