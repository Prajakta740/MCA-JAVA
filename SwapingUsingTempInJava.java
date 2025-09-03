class SwapingUsingTempInJava{
    public static void main(String[] args) {
    int a = 5, b = 10, temp;
	System.out.println("Before swapping the values :");
	System.out.println("a = "+a+" b = "+b);
	temp = a;
	a = b;
	b = temp;
	System.out.println("Before swapping the values :");
	System.out.println("a = "+a+" b = "+b);
    }
}

