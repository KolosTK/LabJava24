# Lab 1 second semester
Description of console interface:<br />
User need to write numbers and text, depending on the case, and by that he/she can manipulate information without adding new methods in the main class.
<br />Program has its own class with initialization and realization of logic by console. Other classes are create to provide correct logic of the program
In UserInterface class exist method Start() which can invoke switch with 7 options :
* Show all products that exist in inventory
* Searching for products by name or category. User input name or category of the product and console show all products that fetch it. Case of letters doesn't matter
* Show info about all products in user's card
* Add products in card by entering their name or category
* Remove product in card by entering its name
* Order products. Show all products in card and total price. After that clear card
* Finish program<br />
For encapsulation add a new package which connects Inventory and Product. So user can't create Product instance without addintin it in Inventory
