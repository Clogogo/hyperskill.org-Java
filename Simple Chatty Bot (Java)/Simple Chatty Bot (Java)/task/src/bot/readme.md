Stage #2: How old are you?

Description

At this stage, you will introduce yourself to the bot. He will greet you by your name and then try to guess your age using arithmetic operations.

Your program must print the following lines:

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
What a great name you have, {yourName}!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is 22; that's a good time to start programming!
You may change the name and the creation year of your bot if you want.

Instead of {yourName}, the bot must print your name entered from the standard input. Instead of {yourAge}, the bot must determine your age according to the following formula:

age = ((age % 3) * 70 + (age % 5) * 21 + (age % 7) * 15) % 105
Here is an example of a dialogue with the bot. Input lines are started with ">" symbol. You do not need to read this symbol.

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Say me remainders of dividing your age by 3, 5 and 7.
> 1 2 1
Your age is 22; that's a good time to start programming!
Use the provided template to simplify your work. You can change the text, but not the number of printed lines.