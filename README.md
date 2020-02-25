### Group 10, T03
# ASTROBLAST!
ASTROBLAST! is a single player platform animation side scroller game (gameplay is viewed from a side-view camera angle). The player moves through various platforms, while avoiding objects, to complete an objective. The application asks the user for input on the player’s move and responds appropriately to that movement, as well as checking if any obstacles have been hit/not overcome. Progression to the next level or failure is determined by time limit or successful passage of all obstacles.

## Foundations
### Class Diagram 
https://github.com/kennedyromick/CrazyCodingClub/blob/master/Astroblast%20Class%20Diagram.png

## Getting Started
Follow the instructions below to set up the game and rules/directions for gameplay.

### Installing
1. Locate the scr folder within the master branch which is where all of the files needed for play are located. 
2. Copy the folder containing the files Animation.java, Avatar1.java, and Obstacle1.java from the aforementioned code repository. 
3. Open the terminal and compile each of the files. This is done by typing "javac <filename>.java" in the terminal. 
4. Once the files have been compiled run the Animation class by typing "java Animation" in the terminal.

### Instructions
The objective of the game is to complete the level with the fewest collisions possible, and without dying in the harder levels.
##### Controls
Use the keyboard to control motion. The text based version of the game is played in a 10 by 10 grid, with “-” representing empty spaces, " * " representing obstacles that the avatar cannot go through, and “^” representing your avatar. The console will prompt you to input a command by outputing "Enter your move", and you may choose any of the following: “a” for right “w” for up “s” for down “d” for right and “e” to exit the game.
##### Level One
Avatar cannot die. Non-moving, non-lethal objects only. 
##### Level Two
Player killed instantly by falling into gaps. All other obstacles, collisions and enemies decrease health (3 hearts). Some moving objects; simple, isolated enemies. 
##### Level Three
Limited number of collisions allowed: health decreases with collisions. Enemies and timed attacks present; one hit = loss of one life. Avatar velocity increased.

## Contributors
Kennedy Romick,
Anastasiia Slobodianyk,
Justine Leslie,
Sean Anselmo.
