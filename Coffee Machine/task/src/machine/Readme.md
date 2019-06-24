Stage #3: Check if there are enough resources

Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

Output example

The program should firstly request for water, then milk, then beans, then amount of cups.

Write how many ml of water the coffee machine has: 300
Write how many ml of milk the coffee machine has: 65
Write how many grams of coffee beans the coffee machine has: 100
Write how many cups of coffee you will need: 1
Yes, I can make that amount of coffee
 Write how many ml of water the coffee machine has: 500
Write how many ml of milk the coffee machine has: 250
Write how many grams of coffee beans the coffee machine has: 200
Write how many cups of coffee you will need: 10
No, I can make only 2 cup(s) of coffee
 Write how many ml of water the coffee machine has: 1550
Write how many ml of milk the coffee machine has: 299
Write how many grams of coffee beans the coffee machine has: 300
Write how many cups of coffee you will need: 3
Yes, I can make that amount of coffee (and even 2 more than that)
 Write how many ml of water the coffee machine has: 0
Write how many ml of milk the coffee machine has: 0
Write how many grams of coffee beans the coffee machine has: 0
Write how many cups of coffee you will need: 1
No, I can make only 0 cup(s) of coffee
 Write how many ml of water the coffee machine has: 0
Write how many ml of milk the coffee machine has: 0
Write how many grams of coffee beans the coffee machine has: 0
Write how many cups of coffee you will need: 0
Yes, I can make that amount of coffee 
 Write how many ml of water the coffee machine has: 200
Write how many ml of milk the coffee machine has: 50
Write how many grams of coffee beans the coffee machine has: 15
Write how many cups of coffee you will need: 0
Yes, I can make that amount of coffee (and even 1 more than that)


Stage #4: Choosing different actions

Description

Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
If the user writes "fill", the program should ask him how much water, milk, coffee beans and how many disposable cups he wants to add into the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 1200 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that. Try to use methods to implement every action that the coffee machine can do.

 

Output example

An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3

The coffee machine has:
1000 of water
440 of milk
108 of coffee beans
8 of disposable cups
556 of money
 The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): fill
Write how many ml of water do you want to add: 2000
Write how many ml of milk do you want to add: 500
Write how many grams of coffee beans do you want to add: 100
Write how many disposable cups of coffee do you want to add: 10

The coffee machine has:
3200 of water
1040 of milk
220 of coffee beans
19 of disposable cups
550 of money
 The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): take
I gave you $550

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
0 of money