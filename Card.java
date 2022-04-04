public class Card {
    private int value;
    private String cardFace;
	
    
    /** default constructor
     * This constructor should assign a random value [2-11] to value.
     * Initialize cardFace with the value + the call from helper method makeCardSuit()
     */
    public Card() {
		this.value = (int) ((Math.random()*10)+2);
		this.cardFace = makeCardSuit();
	}
    
    
    
    /** makeCardSuit()
     * This method returns a random suit string for the card face. 
     * Make a random number [1-4] and return either "H", "D", "C", "S" or the unicode values below
     * Heart char      ""+'\u2665'
     * Diamond char    ""+'\u2666'
     * Club char       "" +'\u2663'
     * Spade char      "" +'\u2660'    
     */
    private String makeCardSuit() {
    	int ran = (int) ((Math.random()*4)+1);
    	if(ran == 1)
    		return  ""+'\u2665';
    	if(ran == 2)
    		return  ""+'\u2666';
    	if(ran == 3)
    		return  "" +'\u2663';
    	if(ran == 4)
    		return "" +'\u2660';
    	return "";
    }
    
    //Write accessor methods for each of the two instance variables
    public int getValue() {
		return value;
	}
    
	public String getCardFace() {
		return cardFace;
	}
	
}