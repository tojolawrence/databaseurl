# Nuchange
AIM: Develop a program in Java(urldatabase) that can be run in the command line as per given requirements below. Requirements

To start the program: run java urldatabase. Further, the program will wait for the user to enter the following commands. The command storeurl shall take a URL as a parameter and save that into a table with a unique short key and a count(usage count) initialized to 0. a. Use local variables instead of a database to store the data. b. Use any appropriate logic to generate the unique short key. The command get shall take a URL as a parameter and return the unique short key after incrementing the usage count. The command count shall take a URL as a parameter and should return the latest usage count. The command list should return all urls and counts. The return value is in JSON. The command exit should terminate the program STEPS
There are 2 classes created called assignment and Table

All the necessary java packages from the java library are imported. A class called assignment is created for the purpose.A do while loop is used dor the repetition of command reception. First of all get a command from the user To start the program: run java urldatabase. 
Commands: 
a. storeurl google.com 
b. get google.com 
c. count google.com 
d. list 
e. To exit the program enter exit .
A Linkedlist named 'list' is made to store the commands. Spliting the command using space and the command is stored in the Linkedlist.When the command 'storeurl domainname', the domain name we typed will be stored in the arraylist. When we type the command 'get domainname', it will give a unique key to the domain that we get using command and the count is incremented(here it checks with the domain that we get and also in the arraylist). When we type the command 'count domainname', it will check for how many occurences/ how many times that the domainname is entered into the list. When we type the command 'list',it will display the list domainname,count,uniquekey using jsonarray. When we type the command 'exit',it exits from the loop.
