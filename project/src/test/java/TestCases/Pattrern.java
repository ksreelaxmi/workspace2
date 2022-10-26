package TestCases;

public class Pattrern {

	public  void main(int[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr= {13579,
//				2468,
//				111315,
//				1012,
//				17};
		int ar[]=args;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]%2==0) {
					
				}
			}
		}
		System.out.println("Method is executed");
		


	}
	public static void main(String[] args) {
		Pattrern p=new Pattrern();
		int[] arr= {13579,
				2468,
				111315,
				1012,
				17};
		p.main(arr);
	}

}
