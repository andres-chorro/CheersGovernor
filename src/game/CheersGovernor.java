package game;

public class CheersGovernor {
	private static final int LIST_SIZE = 21;
	private static final String[] NAMES = { "ONE", "TWO", "THREE", "FOUR",
			"FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE",
			"THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
			"EIGHTEEN", "NINETEEN", "TWENTY", "TWENTYONE" };
	
	private Entity[] theList = new Entity[LIST_SIZE];
	
	/**
	 * Creates a new standard game of cheers governor.
	 */
	public CheersGovernor() {
		for (int i = 0; i < LIST_SIZE; i++) {
			Entity e = new Entity(i + 1, NAMES[i]);
			theList[i] = e;
		}
		swap(7, 14);
	}
	
	/**
	 * Swaps the positions of two entities with base numbers a and b.
	 * @param a
	 * @param b
	 */
	public void swap(int a, int b){
		Entity entityA = null;
		Entity entityB = null;
		int indexA = -1;
		int indexB = -1;
		for (int i = 0; i < LIST_SIZE; i++){
			if(theList[i].getBaseNumber() == a){
				entityA = theList[i];
				indexA = i;
			}
			else if(theList[i].getBaseNumber() == b){
				entityB = theList[i];
				indexB = i;
			}
		}
		theList[indexA] = entityB;
		theList[indexB] = entityA;
	}
	
	/**
	 * Add rule: change the name of an element.
	 * @param baseNumber the number to 
	 * @param name
	 */
	public void rename(int baseNumber, String name) {
		for (Entity e : theList){
			if (e.getBaseNumber() == baseNumber)
				e.setName(name);
		}
	}
	
	/**
	 * Add rule: Miscellaneous rule
	 * @return
	 */
	public void miscRule(int baseNumber, String rule){
		for (Entity e : theList){
			if(e.getBaseNumber() == baseNumber)
				e.addRule(rule);
		}
	}
	
	public Entity[] getTheList() {
		return theList;
	}
	
	public String listString() {
		String s = "";
		for(Entity e: theList){
			s += e;
		}
		return s;
	}
}
