# Documentation
## Use cases.

**Actor:** worker
|Use case name|Description|Validations|
|-|-|-|
|Log in|The worker logs in with their own profile.|The system finds the profile. The system matches the profile with its corresponding password. The system validates the password |
|Manipulate the order view|The worker will be able to change the order of the orders list based on their priorities|The system's options for reordering the list will be based on the order's antiquity, the quantity of products in the order, and the order's deadline|
|Check orders|The worker can enter the order and review relevant information for their task, such as the deadline, quantity, and the current phase of the process|The system will display all relevant information when the worker wishes to access the order; this could be done through a window preview or by directly accessing the window order|
|Do tasks|The worker will be able to mark their finished goals in the corresponding task for the production process and then send the process to the next phase. For this feature, workers will have the ability to access workshops and laboratories|The system will provide the task goals to be marked. If the worker doesn't mark all the task goals, the system will prevent the shipment to the next phase|
|Report advances|The worker will have the ability to generate a resume, which will accompany the shipment to the next phase. This resume will contain details about the work performed and information about the product process or the product itsel|The system will allocate space for report generation, and it will have Markdown capabilities|

**Actor:** administrator
|Use case name|Description|Validations|
|-|-|-|
|Review product process|This feature will allow the administrator to review the database|The database it's available in the main program|

**Use cases diagram.**

![image](https://github.com/IrabienMario/POOProject/assets/74621218/f7b62a28-7b4a-4feb-bfb7-0fd626c54fe5)


## Functional requirements.
|id|requirement name|description|observations|
|--|----------------|-----------|------------|
|RF001|Log in|If the program is being opened for the first time or if the user has closed their session, it will prompt for authentication with a profile and password|When opening the application without an active session, the system will display the login interface|
|RF002|Block log in|If the user doesn't enter the correct password after three attempts for their profile, the system will block the login for five minutes|After the five-minute period expires, the system will reset the three login attempts|
|RF003|Main interface|The program will allow the worker to review tools and information according to their profile, such as the workshops and production laboratories they belong to|Each profile will have its own workshops based on the section or type of worker|
|RF004|Orders list|The main interface will allow workers to review their tasks and orders, including the delivery deadline for each product, the quantity of products, and the assignment date of the task||
|RF005|Manipulate the orders list|||
|RF006|Orders preview|||
|RF007|Orders window|||
|RF008|Review tasks|||
||Access workshop|||
||Access laboratories|||
||Complet the tasks|||
||Denegar subir el trabajo|Si no completo todas las tareas no se puede subir|||
||Generate report advances||Report generation will be an optional feature of the system||
