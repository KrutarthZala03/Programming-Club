import java.util.Scanner;


public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kz = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = kz.nextLine();
		s = s.trim();
		int num=0,space = 1,charc = 0 ,c = 0;
		
		for ( int i = 0 ; i < s.length(); i++ )
		{
			if (s.charAt(i) <= '9' && s.charAt(i) >= '0'  )
			{
				num++;
			}
			else if ( s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				space++;
			}
			else if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				charc++;
			}
		}
		
		if ( s.length() == 0 )
		{
			space = c;
		}	
		
		System.out.println("The numbers in this string are : " + num);
		System.out.println("The words in this string are : " +(space + 1));
		System.out.println("The characters in this string are : " + charc);
		
		
	}

}
