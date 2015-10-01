package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창식"));
		ballad.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", ballad);
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		map.put("댄스", dance);
		
		System.out.println("-----<< 멜론 장르별 차트 >>-----");
		
		printMap(map);
		
		ballad.set(2, new Music("지우고 지워도", "차민경"));
		
		System.out.println("-----<< 발라드 3위 곡 변경>>-----");
		
		printMap(map);
		
		ballad.remove(0);
		
		System.out.println("-----<< 발라드 1위 곡 삭제 >>-----");
		
		printMap(map);
		
	}
	
	public static void printMap(Map<String,List<Music>> map) {
		int i = 1;
		int j = 1;
		for(String key : map.keySet()) {
			List<Music> list = map.get(key);
			if (i == 1) {
				System.out.println("[발라드]");
			}
			else {
				System.out.println("[댄스]");
			}
			for (Music l : list) {
				System.out.print(j + ". ");
				System.out.println(l.toString());
				j++;
			}
			i++;
			j = 1;
		}
/*		i = 1;
		System.out.println("[댄스]");
		for(String key : map.keySet()) {
			System.out.print(i + ". ");
			System.out.println(key.toString());
			i++;
		}
		*/
	}

}
