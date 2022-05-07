
public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {5,4,3,2,1};
		int temp;
//		arr[0] = 5;
//		arr[1] = 4;
//		arr[2] = 3;
//		arr[3] = 2;
//		arr[4] = 1;
		
		for ( int i = 0 ; i < 5/2 ; i++)
		{
			temp = arr[i];
			arr[i] = arr[4 - i];
		    arr[4 - i] = temp;
		}
		System.out.println("Array after reverse : ");
		
		for ( int i  = 0 ; i < 5 ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
