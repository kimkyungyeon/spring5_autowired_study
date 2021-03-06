package spring5_autowired_study.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberDao {
	
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(),member);
	}
	
	public Collection<Member> selectAll(){
		return map.values();
	}
	
	/*
	 * public void showList() { for(Entry<String, Member> e : map.entrySet()) {
	 * 
	 * } }
	 */
	
//	public Map<String, Member> showList(){
//		return map;
//	}
}
