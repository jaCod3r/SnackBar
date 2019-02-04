package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        data();



//        Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        //jane.buy(3, 4)
        //jane.getBalance
        //vendingMachine.getQuantity(4)

//        Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
//        Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
//        Customer 1 finds $10. Print Customer 1 Cash on Hand.
//          Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
//        Snack 3 gets 12 more. Print quantity of snack 3.
//        Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

    }

    private static void data() {
        Customer jane = new Customer(1, "Jane", 45.25);
        Customer bob = new Customer(2, "Bob", 33.14);

        VendingMachine v1 = new VendingMachine(1, "Food");
        VendingMachine v2 = new VendingMachine(2, "Drink");
        VendingMachine v3 = new VendingMachine(3, "Office");

        Snack s1 = new Snack(1, "Chips", 36, 1.75, 1);
        Snack s2 = new Snack(2, "Chocolate", 36, 1, 1);
        Snack s3 = new Snack(3, "Pretzel", 30, 2, 1);
        Snack s4 = new Snack(4, "Soda", 24, 2.50, 2);
        Snack s5 = new Snack(5, "Water", 20, 2.75, 2);


        System.out.println(jane.getCash());
        System.out.println(bob.getCash());

    }
}
