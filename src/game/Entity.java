package game;

import java.util.ArrayList;

public class Entity {
	private int baseNumber;
	private String name;
	private ArrayList<String> rules;
	
	public Entity(int baseNumber, String pronounciation) {
		this.baseNumber = baseNumber;
		this.name = pronounciation;
		rules = new ArrayList<String>();
	}
	

	
	public int getBaseNumber() {
		return baseNumber;
	}
	
	public String getPronounciation() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addRule(String rule){
		rules.add(rule);
	}
	
	public ArrayList<String> getRules() {
		return rules;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += name;
		s += "\n";
		for(String rule : rules){
			s += rule;
			s += "\n";
		}
		return s;
	}
}
