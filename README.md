### Group 10, T03
# ASTROBLAST!
ASTROBLAST! is a single player platform animation side scroller game (gameplay is viewed from a side-view camera angle). The player moves through various platforms, while avoiding objects, to complete an the game. The application asks the user for input on the player’s move and responds appropriately to that movement, as well as checking if any obstacles have been hit/not overcome. Progression to the next level or failure is determined by successful passage of all obstacles (enemies, gaps and meteors) to reach the end of the level. 

### Class Diagram 
! [Class Diagram] (https://github.com/kennedyromick/CrazyCodingClub/blob/master/Astroblast%20UML.png)

## Getting Started
### Installing
1. On the main page of the repository, click **Clone or download**.
2. Copy the https:// link provided.
3. Open the terminal, change the directory to the one you would like the files to be cloned to. 
4. Type `git clone` and paste the URL copied in step 2. Then press **Enter** to create a local clone.
  > `git clone https://github.com/<your-username>/<your-repository>`
5. Launch **Eclipse** workspace, go to **File**, then **Open Projects from File System**, click **Directory**, navigate to the directory the code was saved to, select the folder src from the cloned repository or the whole repository folder.
6. Run the **GameGUI** class as a Java Application and blast off! 
..* **OR** Run the **TextBasedGameGUI** to run the Text-Based version of the game. Explained further in the **Text-Based Version** section below.

### Instructions
The objective of the game is to complete each level without dying by colliding into enemies, getting hit by meteors or falling into gaps on the floor and ceiling. Collisions with enemies or meteors, or falling into gaps is immediate **GAME OVER**, and you will have to restart the game at Level 1. End of Level 3 must be reached to complete the game.
#### Controls
Use the keyboard arrows to control motion: ">" right and "<" left. The up and down arrow keys reverse gravity. Reverse gravity is in effect, so your avatar will move in the direction (up or down) you choose to send it using the up and down arrow keys, and will switch direction according to the keys or stop moving once it hits a platform. For example, if you press the "up" key once, the avatar will continue to float upwards until you change direction using the "down" key or it hits a platform.
#### Level One
Player cannot die. No enemies are presented, only white platforms and walls (obstacles). This level is an opportunity to get use to the movement of the avatar for future levels. To complete the level move right until the final vertical wall is hit, this will bring you to level 2.
#### Level Two
Player can now die by colliding into moving enemies (green aliens). Same movement and objective as level one, however with the addition of avoiding enemies.
#### Level Three
Player can die by colliding with moving enemies (green aliens), being hit by meteors or falling into gaps on the floor and ceiling.

## Text-Based Version
This is a text-based variation of the game.
### Instructions
The objective of the game remains the same - to pass each level without colliding with an enemy and complete Level 3 to win. Enemies are represented by **" # "**, obstacles are **" * "**. To progress through the levels, the avatar must make it to the right side of the text game field on each level without dying.
#### Controls
d, a, w, s on the keyboard are used for movement right, left, up and down respectively. Pressing "e" exits the game.
#### Levels
There are 3 levels. Difficulty increases for each level with the addition of enemies. Dying in any level means the game must be restarted at Level 1.


## Contributors
Kennedy Romick,
Anastasiia Slobodianyk,
Justine Leslie,
Sean Anselmo
