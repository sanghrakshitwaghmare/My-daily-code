class overloading
 {
	 public static void text(int a, int b)
	 {
		 System.out.println("sum is "+ a+b);
	 }
	 
	 public static void text(int a)
	 {
		 System.out.println("a is "+ a);
	 }
	 
	 public static void main(String[] args)
	 {
		 text(5,6);
		 text(5);
	 }
	 
}