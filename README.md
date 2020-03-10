### Group 10, T03
# ASTROBLAST!
ASTROBLAST! is a single player platform animation side scroller game (gameplay is viewed from a side-view camera angle). The player moves through various platforms, while avoiding objects, to complete an objective. The application asks the user for input on the player’s move and responds appropriately to that movement, as well as checking if any obstacles have been hit/not overcome. Progression to the next level or failure is determined by time limit or successful passage of all obstacles.

## Foundations
### Class Diagram 
! [Class Diagram] (https://raw.githubusercontent.com/kennedyromick/CrazyCodingClub/master/Astroblast%20UML.png)

## Getting Started
Follow the instructions below to set up the game and rules/directions for gameplay.

### Installing
1. On the main page of the repository, click **Clone or download**.
2. Copy the https:// link provided.
3. Open the terminal, change the directory to the one you would like the files to be cloned to. 
4. Type `git clone` and paste the URL copied in step 2. Then press **Enter** to create a local clone.
  > `git clone https://github.com/<your-username>/<your-repository>`
5. Launch **Eclipse** workspace, create a **New Java Project**, create a **new package**, import cloned repository in the project (exclusing Obstacle1.java and Animation.java). Rename 

### Instructions
The objective of the game is to complete the level with the fewest collisions possible, and without dying in the harder levels.
##### Controls
Use the keyboard arrows to control motion: "^" jump, ">" forward, "<" backward. The avatar cannot move through obstacles (black blocks), and loses velocity upon collision. 
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
Sean Anselmo
