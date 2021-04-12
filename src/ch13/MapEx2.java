package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("강호동", 86);
		map.put("수지", 74);
		map.put("김석현", 92);
		map.put("이광수", 66);
		
		Set<String> keySet= map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}
