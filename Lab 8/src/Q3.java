import java.util.*;
public class Q3 {
	 public static void main(String[] args) {
	        Map<Integer,Student> map=new Hashtable<Integer,Student>();
	        map.put(1,new Student(99, "Adhwa", "Wes150014", "huhu",68));
	        map.put(2,new Student(106, "ali", "Wes15067", "gg",89));

	      /*  Iterator iterator = map.entrySet().iterator();
	        while(iterator.hasNext())
	        {
	            Map.Entry pair = (Map.Entry)iterator.next();
	            System.out.println(pair.getKey() + " = "+ pair.getValue());
	        }
	      */

	        /*Will show the value in the hash*/
	        map.keySet().forEach((key) -> {
	        	System.out.println(map.get(key));
	        });

	}


	    static class Student{
	        int id;
	        int siblings;
	        String name, matric_no, address;

	        public Student (int id, String name, String matric_no, String address, int siblings){
	            this.id = id;
	            this.name = name;
	            this.matric_no = matric_no;
	            this.address = address;
	            this.siblings = siblings;
	        }
	        
	        /*will invoke map.get(key) which translate the object to string*/
	        public String toString(){
	            return (""+id +" "+ name+ " "+matric_no+" "+ address+" "+siblings);
	        }
	    }
}
