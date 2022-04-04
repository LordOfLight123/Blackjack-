import java.util.Scanner;
public class BlackJack{
    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to blackjack!");
        
        //1. Ask user for name. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();
        
        //2. Create a Hand object named player.
        Hand player = new Hand(name);
        
        
        //This loop run while player is not bust and player does not stay
        while(!player.getBust() && !player.getStay()){ 
            
            //3. Invoke the toString method to see the players hand.
            System.out.println(player);
            
            //4.Prompt the user with a menu of choices to hit (1) or stay(1)
            System.out.print("\nMenu:\n1. Hit\n2. Stay\nEnter choice: ");
            int choice = sc.nextInt();
            /*5. Use an if else to call player.hit("7H", 7) when the user enters 1. 
            *    When the user enters 2 call stay()
            * note: in the 80pt version the only card is 7 of hearts. Use the parameters in the comment above.
            */
           
            if(choice == 1)
            {
            	//player.hit("7H",7);
            	 Card c = new Card();
            	 String card = c.getValue() + "" +c.getCardFace();
            	 player.hit(card,c.getValue());
            }
            	
            	
            else 
            	player.stay();
            System.out.println();
        }
        
        
        //6. Print out the players handTotal()
        System.out.println("Your total: " + player.getHandTotal());
        //7. Print message with win or lose message. If players total is > 21 they lose. 
        if(player.getHandTotal() > 21)
        {
        	System.out.println("Bust! You lose");
        }
        else 
        	System.out.println("You Win");
    }
    
}
