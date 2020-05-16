# Brain_Games
unaware of how much time we are supposed to put into this, I created a project that I can expand if need be
It is called Brain games but the first (and maybe the only) game I am adding will be a reaction time tester. 
There will be three different versions: Color Change, Fakeout, and Circle Blast.
They all follow the same premise: a certain event happens and a timer starts. This timer will wait until you click
and then record your time. You will be tested 5 times and your score will be averaged.
Each game has a different application: Color change has the visuals of the activity change from red to green. There will be
a 0.5 add-on for clicking when it is red. 
Fakeout will have the same premise but instead of just changing from red to green it will change to a whole bunch of colors and you
are only supposed to click if it turns to green. Same penalty as color challenge.
Circle blast will take heavy inspiration from an online reaction test with sheep. The circles will be on the left side of the screen
(all 5) and they will maybe be moving up or down. When one starts moving to the right, you are supposed to click. When you click
the circle will stop moving. Same penalty if you click when they are not moving right. 
When you enter each game from the main screen, there will be a dialog box that appears explaining what is going on.
Each game will have a start button in the center, and when you click it it will go away and the game will start.
At the end of the game your score will be displayed and you will be given the options to retry or go to the main menu.

Core Mechanics Being Used:

1. RecyclerView:
I will need to store the circles in Circle Blast.

2. Dialog:
I will have a dialog pop up at the start of each game.

3. External Library:
In order to make my Dialogs easy to make, I am using (what I believe) to be an external library

4. OnClickListeners:
There are a lot of OnClickListeners, since the main point of the games currently is to click.

5. Buttons:
There are a lot of button on the homescreen.

6. Fragment(?):
Probably not, but maybe my thing titled "IntroDialogFragment" is a fragment.

