public class Example {

    public static void main(String[] args) {
        // Your amazing code goes here...
        System.out.println("We are making a new Pez Dispenser.");

        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser character is %s\n",
        dispenser.getCharacterName());

        if(dispenser.isEmpty()) {
          System.out.println("It is currently empty");
        }
        System.out.println("loading...");
        dispenser.load();
        if (!dispenser.isEmpty()) {
          System.out.println("It is currently full");
        }

        while (dispenser.dispense()) {
          System.out.println("Chomp!");
        }
        if(dispenser.isEmpty()){
          System.out.println("Ate all the Pez!");
        }
        dispenser.load(4); //for testing purposes
        dispenser.load(2); //for testing purposes
        while (dispenser.dispense()) {
          System.out.println("Chomp!"); //test conclusion here
        }
      try{
        dispenser.load(4300);
        System.out.println("this will never happen");
        } catch (IllegalArgumentException iae) {
          System.out.println("whoa there!");
          System.out.printf("the error was %s\n", iae.getMessage());
      }
    }
}
