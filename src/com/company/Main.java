package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        data();



//        Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.

//        Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

//        Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

//        Customer 1 finds $10. Print Customer 1 Cash on Hand. (Done)

//        Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.

//        Snack 3 gets 12 more. Print quantity of snack 3. (Done)

//        Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

    }

    private static void data() {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine( "Food");
        VendingMachine v2 = new VendingMachine( "Drink");
        VendingMachine v3 = new VendingMachine( "Office");

        Snack s1 = new Snack( "Chips", 36, 1.75, v1.id);
        Snack s2 = new Snack( "Chocolate", 36, 1, v1.id);
        Snack s3 = new Snack( "Pretzel", 30, 2, v1.id);
        Snack s4 = new Snack( "Soda", 24, 2.50, v2.id);
        Snack s5 = new Snack( "Water", 20, 2.75, v2.id);

        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        System.out.println("Jane has spent $" + jane.buySnack(3, s4.getCost()));
        System.out.println("Jane new balance is $" + jane.getCash());
        System.out.println("Snack 4 has " + s4.getQuantity());
        System.out.println(" ");
        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        System.out.println("Jane has spent $" + jane.buySnack(1, s3.getCost()));
        System.out.println("Jane new balance is $" + jane.getCash());
        System.out.println("Snack 4 has " + s3.getQuantity());
        System.out.println(" ");
        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        System.out.println("Bob has spent $" + bob.buySnack(2, s4.getCost()));
        System.out.println("Bob new balance is $" + bob.getCash());
        System.out.println("Snack 4 has " + s4.getQuantity());
        System.out.println(" ");
        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

        // Customer 1 finds $10. Print Customer 1 Cash on Hand. (Done)
        System.out.println("Jane finds $" + jane.findMoney(10));
        System.out.println("Jane new total is $" + jane.getCash());
        System.out.println(" ");
        // Customer 1 finds $10. Print Customer 1 Cash on Hand. (Done)

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        System.out.println("Jane has spent $" + jane.buySnack(2, s2.getCost()));
        System.out.println("Jane new balance is $" + jane.getCash());
        System.out.println("Snack 4 has " + s4.getQuantity());
        System.out.println(" ");
        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.


        // Snack 3 gets 12 more. Print quantity of snack 3. (Done)
        System.out.println("Filling up snack 3 with " + s3.fill(12) + " snacks");
        System.out.println("Snack 3 new quantity is: " + s3.getQuantity());
        System.out.println(" ");
        // Snack 3 gets 12 more. Print quantity of snack 3. (Done)

    }
}
