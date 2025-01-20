<ins>**Task 1**</ins>: (getting Familiar with Git)
I created the code in my VS first and uploaded it on my Repository on GitHub
Screenshot 1: shows that I uploaded my code on GitHub directly (in the previous task) by merging the branch in blue.

<img width="1449" alt="Screenshot 2025-01-10 at 20 37 05" src="https://github.com/user-attachments/assets/72006981-cea0-41ba-97ee-56f731cd4808" />

Screenshot 2:git clone to have a copy of the online repo locally as shown in the highlighted line:

<img width="452" alt="image" src="https://github.com/user-attachments/assets/2196593d-a816-4972-922a-08eb16ace372" />

Screenshot 3:shows I added a commit so I can travel to the commit I created before and pushed it globally (to the online GitHub Repo)

<img width="447" alt="image" src="https://github.com/user-attachments/assets/cbeea2cd-d93d-46db-95e7-b44b4e759a17" />

Screenshot 4: shows that I travelled back to the comment of the commit (add files via upload) using git checkout + it’s ID, after this I created another branch and I made a change and pushed this change online (commit 1 Branch 1)

<img width="452" alt="image" src="https://github.com/user-attachments/assets/4237607c-f303-486f-9125-7a7048eba718" />

Screenshot 5: merging online on GitHub

<img width="452" alt="image" src="https://github.com/user-attachments/assets/2dbc15e1-b3fe-47cb-8623-8fe4c5c47037" />
<img width="452" alt="image" src="https://github.com/user-attachments/assets/ebf1e936-4cef-428d-b485-da1307e10a95" />

Screenshot 6: I used git pull to get the changes I made online saved locally 

<img width="452" alt="image" src="https://github.com/user-attachments/assets/40f65d61-fd3b-4d89-ab89-b589712b0d21" />

<ins>**Task2**</ins>: UML
Design 1: "add task":

<img width="134" alt="image" src="https://github.com/user-attachments/assets/47497500-6db2-4d6f-ac43-af080430712b" />

Design 2: "class Diagram":

<img width="95" alt="image" src="https://github.com/user-attachments/assets/71d3b079-db09-4954-ae0b-786c3f5d0700" />
<img width="117" alt="image" src="https://github.com/user-attachments/assets/ee2e5fbd-f3bb-42be-8bac-83dbf238ee48" />

Design 3: "Activity Diagram for "add task" class:

<img width="101" alt="image" src="https://github.com/user-attachments/assets/925c19ed-1f61-417f-a89a-6e50abbb8a2c" />

<ins>**Task 3**</ins>: Requirments:
"I'll add the link Here"

1.The program shall provide a text-based interface for the users to guide them through the available options. 

2.The program shall allow the user to add a task by specifying the title, description and priority.

3.The program shall allow the user to display all the tasks added sorted by their priority.

4.The program shall allow the user to mark any task as completed.

5.The program shall allow the user to delete any existing task.

<ins>**Task 4**</ins>: Analysis:
I’ll be carrying out the analysis on a start up idea:

Overview:
It’s an application like uber eats and wolt but instead of delivering food from restaurants it will be from individuals offering home cooked meals.
Consumers often seek healthier, affordable, and homemade food alternatives to restaurant meals. Individuals who enjoy cooking at home may want to monetize their culinary skills but lack the platform to do so. This application bridges the gap by connecting home cooks with consumers seeking diverse, homemade meals.


1.Target Audience:
-Individuals who have limited to no-time to cook but prefer home made meals.
-Expats who are craving traditional food from their culture.
-Health consious individuals who are seeking healthier and customizable meal options.
-Home cooks or single Mothers/Fathers who are looking to earn extra income from the comfort of their home.

2.Key Features:
-Profiles for Home cooks including Reviews.
-Meal Types and dietry preferences (Vegan-Gluten Free-Vegeterian-etc)
-Cuisine Type.(Italian-Indian- Mideterrianen -etc)
-option for real time tracking option and eco-friendly packaging
-easy acess for saving your favorite meals and re-ordering
-seamless ordering and payment system

3-Market Analysis:
-Indirect Competitors: Traditional food delivery services like Uber Eats or Wolt.
This app differentiates itself by focusing solely on home-cooked meals.

4- Risks:
-The difficulty of implementing Hygeine precautions and inspections for home cooks.
-The diffficulty to complaint against food safety conern or issue.

5-Marketing Strategy:
-Lavergege social Media to highlight the idea.
-collaborate with food bloggers and influencers for honest reviews and promotions.
-Launch in the USA market as a first step for the availibilty of working and health consious individuals
-launch in Germany next for the high denisty of expats 

6-Legal considerations:
-ensure the food safety standards(labelling the whole ingredients in case of allergic people)
-privacy of user’s information(card-address-etc)

7-Goals:
-Promotes local cooks and promotes cultral exchange through food
-create income opportuities for individuals.
-encourage individuals towards healthier food options.

8-Future opportunities:
-partner with local farms for fresh ingrediants.
-introduce live events or workships by well known cooks.
-use AI for customized meal recommendations

9-Domain Knowledge:
-no need for knowledge and devolpment, the data already exists It needs to be gathered example: cities with high expats, cities with high health consious indiviudals.

10-Stake holders:
-Home Cooks
-end Consumers
-App Devolepors.
-Delivery individuals

<ins>**Task 5**</ins>: DDD:

"Core Diagram I'll put here"
Domains: 
-Task Added (user creates the task)
-Task Deleted(user remove the task)
-Task Marked as completed(user marks task as done)
-Task updated (change priority or due date)



Extra Domains (doesn’t exist just for expansion)
-Notficiation system( program notifies user about deadlines or overdue tasks)
-Team assignemt(allow users to share and assign tasks to others)
-Task Analysis (allows users to view completed or overdue tasks per day)

Mapping:  
<img width="356" alt="image" src="https://github.com/user-attachments/assets/3c677732-afee-4c6d-bf20-7df2c02196d1" />


<ins>**Task 6**</ins>: 
"I'll add it here"

<ins>**Task 7**</ins>: Clean code:

"I'll add the PDF here"

1. Meaningful Naming:
I’ve user clear names for the functions and methods to clearly indicate their purpose and describe what’s the use of each function 
The benefit:
Easy for everyone to read the code and understand it’s functionality without the need for additional comments

2.small methods and functions:
I added Methods like addTask, deleteTask and MarkTaskComplete in Userinterface to handle only specific tasks.
The Benefit: 
it’s easier for testing and debugging

3.Use empty lines:
I used empty lines between functions and methods to create space:
Benefit: 
easier for the reader to understand where the function or method ends

4.Avoided long lines of code:
I used short as possible lines of code that fits into the screen.
The Benefit: 
The reader will be scrolling vertically and not horizontally for easier reading (this could be done by a tool called Clang, but it wasn’t used in this code)


Example for the 4 points are all in the screenshot below:

<img width="189" alt="image" src="https://github.com/user-attachments/assets/27040a82-02e0-4cd3-bdcf-94aaa58ea0b1" />


<ins>**Task 8**</ins>: Refactoring:

Example1:

Screenshot 1 shows the main code eofre refactoring: 

<img width="219" alt="image" src="https://github.com/user-attachments/assets/b58ff164-8b61-4720-b496-6df00e347602" />

Screenshot 2 shows the Code after refactoring:

<img width="214" alt="image" src="https://github.com/user-attachments/assets/f404f9ec-ec42-49f6-8584-6ded98585c6d" />

Function deletTask now focus only on task removal, while handleTaskDeletion in the second screenshot manages user insertion.

Example2:

Screenshot1: Before:

<img width="166" alt="image" src="https://github.com/user-attachments/assets/365888cd-1f1d-4f9a-b80b-40fb9beb8735" />

Screenshot 2: After:

<img width="232" alt="image" src="https://github.com/user-attachments/assets/08524cf2-6973-4f8f-b14e-1f9e31ed419b" />

The method now focuses on listing tasks, delegating sorting and display logic to the other methods.

<ins>**Task 9**</ins>: Build:

I installed Maven using my terminal and created a dummy pom.xml file using chatgpt so I can excersise on how to Buid:

I used the commands: mvn clean, mvn compile, mvn package and mvn test

mvn clean:

<img width="452" alt="image" src="https://github.com/user-attachments/assets/9bd900f4-887b-4f1e-8a88-c03138e49a80" />

mvn compile:

<img width="452" alt="image" src="https://github.com/user-attachments/assets/de207894-4985-4c3a-ba87-b38f3e69b7e0" />

mvn package:

<img width="452" alt="image" src="https://github.com/user-attachments/assets/1241b3d6-c81f-4e54-bc39-672fd90e88b0" />

mvn test:

<img width="452" alt="image" src="https://github.com/user-attachments/assets/53365f5f-7f33-4125-baa4-6e72ffa257e6" />

<ins>**Task 10**</ins>: CI:

I used Github Actions to complete this task, I ran the script for Maven using mvn clean

<img width="357" alt="image" src="https://github.com/user-attachments/assets/fc118b52-eea9-4c40-bc92-6895910c5652" />


<ins>**Task 11**</ins>: unit tests:
"I'll put it here"

<ins>**Task 12**</ins>:Use a good IDE and get fluent with it: e.g. VSCode, IntelliJ. What are your favourite key shortcuts?!

I always used VS code and here are my favoriite shortcuts:

<ins>**Task 13**</ins>: 
I installed ZED: 
"I'll add screenshots here"


