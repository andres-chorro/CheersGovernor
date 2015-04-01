package game;

import java.util.ArrayList;

public class Entity {
	private int baseNumber;
	private String pronounciation;
	private ArrayList<String> rules;
	
	public Entity(int baseNumber, String pronounciation) {
		this.baseNumber = baseNumber;
		this.pronounciation = pronounciation;
		rules = new ArrayList<String>();
	}
	

	
	public int getBaseNumber() {
		return baseNumber;
	}
	
	public String getPronounciation() {
		return pronounciation;
	}
	
	public void setPronounciation(String pronounciation) {
		this.pronounciation = pronounciation;
	}
	
	public void setRule(String rule){
		rules.add(rule);
	}
	
	public ArrayList<String> getRules() {
		return rules;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += pronounciation;
		s += "\n";
		for(String rule : rules){
			s += rule;
			s += "\n";
		}
		return s;
	}
}
