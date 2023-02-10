import java.util.ArrayList;
 class App {
   static String[] suits = {"♡", "♧", "◇", "♤"};
   static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
   static ArrayList < String > deck = new ArrayList < String >();
   static ArrayList < String > hand = new ArrayList < String >();
   //int, double, and boolean don't work
   public static void main(String[] args) {
       init();
       draw();
       println(hand);
       draw(5);
       println(hand);
   }

   static void init() {
        //fill the deck
        for(String rank : ranks) {  //for each rank in ranks
            for(String suit : suits) {  //for each suit in suits
                //deck.add(suit + rank);  //add a new string to deck (suit + rank)
                String card = suit + rank;
                deck.add(card);
                println(card);
                //print(suit + rank + " ");
            }
        }
   }

   static String draw() {
       //deck.remove(0);
       String card = deck.remove(0);
       hand.add(card);
       return card;
   }
   //draw n cards
   static void draw(int n) {
       for(int i = 0; i < n; i++) {
           draw();
           String card = deck.remove(52);
           deck.add(card);

       }
    static void shuffle =(d);
   }



   public static void println(Object o) {System.out.println(o);}
   public static void print(Object o) {System.out.print(o);}
       /* Should have hand, deck of cards, be able to shuffle,

       array:
       String[array of names] {Sam, Aj, Lauren}
       use an array list to get around array leaving open space if name is deleted
       import java.util.Arraylist; (required)
       ArrayList <String > names = new ArrayList < String > ();
       names.add("Lucas");
       names.add("Sam");
       names.add("Luke");
        to access an array list:

        print(names.get(0)); //Lucas
        print(names.get(1)); //Sam
        print(names.get(2)); //Luke

        print(names.get(3)); //out of bounds

        //remove elements:
        names.remove(1); //removes Sam
        names.remove(Luke); //Searches the list and removes Luke

            to override an element:
            names.set(1, "Samantha"); //changes Sam to Samantha

            Array lists:
            you cant use int, boolean, or double(have to use wrapper class)
            Arrays:
            faster and more commonly understood syntax
       */

}
