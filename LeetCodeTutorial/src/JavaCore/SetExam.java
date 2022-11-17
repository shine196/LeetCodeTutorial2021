package JavaCore;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	
	public static void main(String[] args) {
		Set<Integer> setH =  new HashSet<Integer>() ; //chỉ chứ 1 phần tử duy nhất
		
		//HashSet 
		
//		LinkerSet Chỉ chứa các phần tử duy nhất giống như HashSet.
//			Cho phép các phần tử null.
//			Duy trì thứ tự chèn.
		
		//TreeSetChỉ chứa các phần tử duy nhất giống như HashSet.
		//Thời gian truy xuất nhanh.
		//Duy trì thứ tự tăng dần, 
		//
		setH.add(1);
		setH.add(1); // trùng thì không.
		setH.add(2);
		setH.add(3);
		setH.add(4);
		
		Iterator<Integer> iterator = setH.iterator(); // nếu cần dùng các hàm
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		
//		for (Integer integer : setH) {
//			System.out.println(integer);
//		}
		
		
		System.out.println("SetH có 1 hay ko:"+setH.contains(1));
		System.out.println("SetH có 0 hay ko:"+setH.contains(0));
	}
}
