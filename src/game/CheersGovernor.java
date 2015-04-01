package game;

public class CheersGovernor {
	private static final int LIST_SIZE = 21;
	private static final String[] NAMES = { "ONE", "TWO", "THREE", "FOUR",
			"FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE",
			"THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
			"EIGHTEEN", "NINETEEN", "TWENTY", "TWENTYONE" };
	
	private static Entity[] theList = new Entity[21];
	
	public static void main(String[] args) {
		for (int i = 0; i < LIST_SIZE; i++) {
			Entity e = new Entity(i + 1, NAMES[i]);
			theList[i] = e;
		}
		swap(7, 14);
		swap(1, 20);
		swap(7, 2);
		printList();
	}

	private static void printList() {
		for (Entity e : theList) {
			System.out.println(e);
		}
	}
	
	/**
	 * Swaps the positions of two entities with base numbers a and b.
	 * @param a
	 * @param b
	 */
	private static void swap(int a, int b){
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
}
