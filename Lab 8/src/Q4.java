import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c; char f;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		f = FirstRepeatedCharacther(input.next());
		System.out.println("The First repeated word is "+ f);
	}
	
	public static char FirstRepeatedCharacther(String Word){
		HashMap<Character, Integer> Tester = new HashMap<Character,Integer>();
		for(int i = 0 ; i < Word.length() ; i++){
			char c = Word.charAt(i);
			if(Tester.containsKey(c)){
				Tester.put(c, Tester.get(c)+1);
			}else{
				Tester.put(c, 1);
			}
		}
		
		for (int i = 0 ; i < Word.length() ; i++){
			char c = Word.charAt(i);
            if (Tester.get(c) > 1) {
                return c;
            }
		}
		 throw new RuntimeException("Undefined behaviour");
	}
}
