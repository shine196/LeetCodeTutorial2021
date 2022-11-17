package JavaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExam {
	public static void main(String[] args) {// no generics
		
		
//		HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
//		Nó chứa các key duy nhất.
//		Nó có thể có 1 key là null và nhiều giá trị null.
//		Nó duy trì các phần tử KHÔNG theo thứ tự.
		
		Random random = new Random();
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(100);			
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted +"+ Arrays.toString(arr));
		
		String[] words = {"ace", "boom", "crew", "dog", "eon"};  

	      List<String> wordList = Arrays.asList(words);  
	      
	      
	      List<Integer> list = new ArrayList<Integer>();
	       list =Arrays.stream(arr).boxed().collect(Collectors.toList());
		for (int i : list) {
			System.out.println(i);
		}
		
		
		
		
//		MapExam mapExam = new MapExam();
//		Map map = new HashMap(); 
//		map.put(1, "A");
//		map.put("B", "b");
//		map.put(2, "PHP");
//		map.put(4, "Python");
//		Set set = map.keySet();
//        for (Object key : set) {
//            System.out.println(key + " " + map.get(key));
//        }
//        
//        mapTest();
	}
	
	private static void mapTest(){
		 Map<Integer, String> map = new HashMap<Integer, String>(); // use Generics
	        map.put(100, "A"); 
	        map.put(101, "B");
	        map.put(102, "C");
	        // show map
	        Set<Integer> set = map.keySet();
	        for (Integer key : set) {
	            System.out.println(key + " " + map.get(key));
	        }
	        
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	}
	
}
