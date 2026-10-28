package Pruebas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class buclefor {
	public static void main(String []args) {
		
		int[] nums = new int[5];
		for (int i=0; i < nums.length; i++){
		    nums[i] = i; }
		    System.out.print(Arrays.toString(nums)); //[0, 1, 2, 3, 4]
		    //or use for (:) as for each loop
		for(int i : nums){
		    System.out.print(i);  //01234
		}
		//you may compare for(:) loop with foreach loop in PHP and other language.

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
		    //do something with itr.next();
		    //for example itr.remove();
		}
		
		//using foreach loop
		for( String s : list){
		    //do something with s
		    // s is local String variable
		    //modify s does not modify the list
		}


	}
		
		
		

}
