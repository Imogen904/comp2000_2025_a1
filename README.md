# COMP2000 Assignment 1 - Object Oriented Programming Practices
## Imogen Deins - 47299975

## Timeline
17/09/2025
- Had to change the place where I was making the assignment as I realised what I was doing was incorrect. I created a separate branch for the assignment in the cloned repository I have been working in weekly.

18/09/2025
- I wanted to make some form of enemies, so I created an Enemy class using the Actor class code as a base which I wanted to expand on later. Using this I created the 3 different enemies for the actors that we already have which inherit from the Enemy class. For now I am keeping it simple by using the same polygons as the actors as I attempted making my own but it didn't work out right.
- I then thought of the idea about using some form of items, as suggested in the assignment specification so I made the item class to use for this. I then made the enemies slightly transparent as I thought about making them be the ones who drop the items and wanted to somehow put the items inside of them.
- Because of this I then reworked the enemy class to use generics instead of using the item class. So each enemy has the item within itself. I also added the classes for fish, bone and seed (each of the items).

19/09/2025
- Started creating the sprites for Fish/Bone/Seed, only created the first two.

20/09/2025
- Finished making the images for the items.
- Created a new class called Image in which I could read in the images. I used the Oracle documentation (https://docs.oracle.com/javase/tutorial/2d/images/index.html) on reading and drawing images to achieve this.
- I then adjusted the classes of Bone, Fish and Seed to extend Image and used this to put the individual path's to each respective image within the classes.
- In order to draw these images with the enemies on the grid, I modified the Enemy class so that T extends Image as well. This then allowed me to within the paint method of Enemy, to draw the image using the method from Image: getImage. I played around a few times with the positioning but I feel it looked the best when the item was next to the enemies instead of inside it like I had originally planned.

21/09/2025
- Edited README file to include necessary information.
- Deleted unused Item class.
- Fixed an error in Stage class, by adding Enemy<? extends Image> so that it can hold any of the items.

## Use of inheritance
I have implemented the Enemy class, which all enemies ineherit from i.e. CatEnemy, DogEnemy, BirdEnemy. I have done this so each Enemy can be unique but all still using the main fields that the Enemy class holds. This also allows for more enemies to be made easily. I have also used inheritance with the Image class and each of the food items. This allows me to have a different image per item as each of the item classes use the constructor from Image. All of this makes the code easily extendable if more items or enemies need to be added.

## Use of generics
I utilised generics in the Enemy class where T is an item. It allows specific enemies to be tied with an item. In this case the CatEnemy has a fish, the DogEnemy has a bone, and the BirdEnemy has seed. This use of generics, similar to the way I used inheritance, allows future additions to be made easily. If new items and enemies are made up it is very easy to use the same classes.

## Running the program
There is nothing extra needed to do when compiling/running the program. Just need to press Run.