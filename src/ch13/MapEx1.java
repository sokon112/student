package ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id_0123", "홍길동");
		map.put("id_0124", "김길동");
		map.put("id_0125", "최길동");
		map.put("id_0126", "홍길동");
		
		System.out.println(map.get("id_0123"));
		System.out.println(map.containsKey("id_0124"));
		System.out.println(map.containsValue("최길동"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.remove("id_0126"));
		
		Set<String> keyValue = map.keySet();
		System.out.println(keyValue);
		
		Collection<String> values=map.values();
		System.out.println(values);
	}
}
