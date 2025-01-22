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
Design 1: "Use Case":

<img width="579" alt="Screenshot 2025-01-22 at 00 31 53" src="https://github.com/user-attachments/assets/4c79f360-536f-44f6-aeb7-7f80c8a2d76c" />


Design 2: "class Diagram":


<img width="640" alt="Screenshot 2025-01-21 at 22 46 58" src="https://github.com/user-attachments/assets/279f5140-3731-45b8-9bcb-aba1b4e40e97" />



Design 3: "Activity Diagram":


<img width="925" alt="Screenshot 2025-01-21 at 23 33 39" src="https://github.com/user-attachments/assets/871b031e-83f1-4703-af2e-8a48d2b607f9" />


<ins>**Task 3**</ins>: Requirments:

Link for Jira: https://dohahammouda.atlassian.net/browse/SCRUM-1?atlOrigin=eyJpIjoiNWI3OTIzNjUwOTNkNDc0YTg0YjJmYTE5NWI4YTUyZjkiLCJwIjoiaiJ9)

Link for Notion: https://www.notion.so/Task-3-Requirements-120f16341c8880fa8710f933b16d3ed3

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

A)Event Storming:

Main events: 
Add Task: user creates a task with prorperties like: title, description and priority.
Mark Task as complete: if the user mark a specific to complete, Task's "isComplete" flag is set to true.
Delete task: when the user deletes a task, it's removed from TaskManager list.
List Tasks: All tasks are being shown.

Commands:
addTask(title, description, priortity)
MarkTaskComplete(title)
deleteTask(title)
listTasks()

Aggregates:
Task: represent a single to-do item.
userInterface: hlps user interaction with TaskManager.
TaskManager: manage the operations and inputs in tasks.

Domains: 
TaskManagement: the core domain, responsible for managing tasks, adding, deleting, listing and updating their status. 
userManagment: supporting domain, add user's specific tasks.
Notification system: supporting domain,triggers notifcations from (Task added and Task completed)
Analytics and management: suppporting domain to analyze data from the tasks to generata insights.
Extra supporting Domains (doesn’t exist just for expansion):
Tag Management: it allows user to add tags to the task like work or personal.
Schedueling and deadlines: it allows users to sync the tasks with their calander to keep an eye on the deadlines.
Priority managment:handles tasks viewing to the user based on their priority.
Collaberation and sharing: allows users to share their taks with team mebers and callobarate on them.
Audit and history: keep track of changes on taks.

Core Domain Diagram on Miro: 


<img width="951" alt="Screenshot 2025-01-22 at 20 56 26" src="https://github.com/user-attachments/assets/a5b4db17-749e-447f-a460-f3fdbbdec3a8" />


on LucidChart:


![Blank diagram-3](https://github.com/user-attachments/assets/9c1285dd-ffdb-4b3c-a0ce-1a15ddb56767)



<ins>**Task 6**</ins>: 
"I'll add it here"

<ins>**Task 7**</ins>: Clean code:

[CCD Cheat sheet.pdf](https://github.com/user-attachments/files/18482052/CCD.Cheat.sheet.pdf)

1. Meaningful Naming:
I’ve used clear names for the functions and methods to clearly indicate their purpose and describe what’s the use of each function 
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

5.Meaningful error messages:
I used easy error messages to use in the code, always use a clear error message. Example of good error message “No tasks available” or “Task not found”. Example of a bad one to show “Error 404”
The Benifit: it's easier for the user to understand what's wrong with their input.

6.	Add Comments:
Add comments when necessary to give a short description for why something was done in this way or what was not being done.
The Benifit: so it's easier for your team to understand without the need to ask.



Example for the 4 points shows in the screenshot below:

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

I used Github Actions to complete this task, I ran the script for Maven using mvn clean. 

Link" https://github.com/DohaHammouda/FirstResp/tree/main/.github"

Screenshots:

<img width="716" alt="Screenshot 2025-01-20 at 17 11 47" src="https://github.com/user-attachments/assets/28968d9a-7967-47b6-8d2f-888043fc75c5" />



<img width="357" alt="image" src="https://github.com/user-attachments/assets/fc118b52-eea9-4c40-bc92-6895910c5652" />



<ins>**Task 11**</ins>: unit tests:
"I'll put it here"

<ins>**Task 12**</ins>:favourite key shortcuts in VS on mac:

n+F1 then choose reload window, it reloads the window in case it's frozen

<img width="1259" alt="Screenshot 2025-01-20 at 22 03 48" src="https://github.com/user-attachments/assets/291e2bda-650c-44b2-84d8-fe7bb4619e62" />

option+shift+up or down, it duplicate a line

<img width="1259" alt="Screenshot 2025-01-20 at 22 11 44" src="https://github.com/user-attachments/assets/099be936-ea8c-48ca-9c4b-77027886457d" />

option+shift+K to delete a line

Command+F to search 

<img width="1259" alt="Screenshot 2025-01-20 at 22 16 04" src="https://github.com/user-attachments/assets/07feb49e-fa45-4390-b19c-1552f565e805" />

command+/ to comment the entire line

<img width="1269" alt="Screenshot 2025-01-20 at 22 22 55" src="https://github.com/user-attachments/assets/b8214344-2388-4bb4-bb8f-aa56f4b08b30" />

Shift+option+A to comment an entire block

<img width="1269" alt="Screenshot 2025-01-20 at 22 25 42" src="https://github.com/user-attachments/assets/1734f680-3648-4cd9-a95e-a09664a38bfd" />

Command+S to save

Command+N for a new file

Command+W to close the file

Command+Z to reverse the action

Command+C to copy

Command+V to paste


<ins>**Task 13**</ins>: 
I installed ZED

Command: generate a TicTacToe in python on LLama 3.2


<img width="633" alt="Screenshot 2025-01-20 at 23 15 50" src="https://github.com/user-attachments/assets/c4e0d417-965b-4500-accb-33356b66d67e" />


<img width="645" alt="Screenshot 2025-01-20 at 23 14 59" src="https://github.com/user-attachments/assets/85979304-bfba-42eb-84ee-096768f0daa8" />


<img width="323" alt="Screenshot 2025-01-20 at 23 15 21" src="https://github.com/user-attachments/assets/b19bc01a-ae1c-42bd-ad33-ebea1ee2c7df" />




