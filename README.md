# Blackjack Game

## Overview
This is a text-based Blackjack game implemented in JAva. The game allows the player to compete against a dealer in a series of rounds, where the player and dealer take turns drawing cards. The goal is to get a hand value of 21 (or as close as posisble) without exceedihng it. The game includes functionality for handling Blackjacks, busts, and determining the winner of the round based on the hand values.

## Feature
- Blackjack detection: if either dealer or player gets a Blackjack (21 with the first two cards delt), the game handles the situation and dtermines the winner accordingly.
- Hit or Stand: The player can choose to "hit" (draw a card) or "stand" (keep their current hand).
- Dealer Logic: The dealer will automatically draw cards until their hand value reaches 17 or higher.
Bust detection: If either the dealer or the player have a hand whose value exceeds 21, they "bust", and the opponent wins.
_ Multiple Rounds: The game allows for multiple rounds of play, where the scores are tracked across rounds.
- Interactive Interface: The game uses the console to interact with the player, allowing them to make decisions (hit or stand) during their turn.

## Game Flow
1). The game starts with a welcome message.
2). The player is dealt two cards, and the dealer is dealt two cards (with one card hidden).
3). If either the player of the dealer has a Blackjack (21 within the first two cards), the round is 
	immediately decided.
4). The player is prompted to either "hit" (draw a card) or "stand" (end their turn).
5). After the player finishes their turn, the dealer's turn begins. This dealer draws cards until they reach a hand value of 17 or higher.
6). The round ends, and the winner is determined based on the hand values, or if there was a bust.
7). The player is asked if they want to continue playing another round.

## Instructions
- Clone this repo
- Start game by compiling and running BlackJackApplication.java
- Make a move by choosing one of the option:
	- 1: hit (draw a card).
	- 2: Stand (end yout turn).
- The game will continue until you choose to quit.

## Technologies applied
- Java
- Git
- OOP
	- Inheritence
	- Abstraction
	- Encapsulation
	- Polyorphism

## Lessons Learned
- Understanding enumeration in practive
- How methods can be used to encapsulate fields
- Referencing UML diagrams
- Practical application of collections
- Practicing thoughful OOP code design 

## UML Diagram
![Blackjack Game UML Diagram](images/Blackjack.pdf)


