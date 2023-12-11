## Functional requirements.

|id|requirement name|description|observations|
|--|----------------|-----------|------------|
|RF001|Log in|If the program is being opened for the first time or if the user has closed their session, it will prompt for authentication with a profile and password|When opening the application without an active session, the system will display the login interface|
|RF002|User Verification|Upon entering the program, users will be prompted to enter a predefined username and password stored in the database. Users must provide the correct combination of username and password to access the program.|
|RF003|Main interface|The program will allow the worker to review tools and information, such as the laboratories they belong too|Each profile will have its own workshops based on the section or type of worker|
|RF004|Orders list|The main interface will allow workers to review their tasks and orders, including the delivery deadline for each product, the quantity of products, and the assignment date of the task|The main interface should prioritize clarity and user-friendliness to ensure that workers can easily access and comprehend the information related to their tasks and orders. This includes prominently displaying critical details such as the delivery deadlines for each product, product quantities, and task assignment dates. Additionally, it's essential to implement an intuitive navigation system that enables efficient task and order management|
|RF005|Manipulate the orders list|The system allows users to manipulate the orders list, including adding, updating|The system's ability to manipulate the orders list by allowing users to perform actions such as adding and updating that is a crucial feature for enhancing order management flexibility. It is essential to ensure that these operations are well-documented, easily accessible, and include appropriate validation checks to prevent errors. Furthermore, user permissions and access control should be considered to maintain data integrity and security while interacting with the orders list|
|RF006|Review tasks|The 'Review Tasks' function allows users to examine and manage tasks associated with orders, including viewing their status, tracking progress, and making updates when necessary|The 'Review Tasks' function is a valuable tool for users to inspect and oversee tasks related to orders. To enhance its effectiveness, it is essential to design this function with a user-friendly interface that allows for intuitive navigation. The ability to view task statuses, track progress, and make updates when necessary is pivotal for efficient task management. Consider implementing clear visual cues, such as status indicators, to provide users with immediate insights into the state of each task. Furthermore, ensuring that the 'Review Tasks' function integrates seamlessly with other system features can streamline overall order and task management|
|RF007|Complet the tasks|The 'Complete the Tasks' functionality allows users to mark a task as completed, triggering the order to proceed to its next phase in the production process|The 'Complete the Tasks' functionality is a critical component that empowers users to signify task completion, thus advancing the associated order to the subsequent phase of the production process. To ensure seamless workflow management, it's crucial to design this functionality with simplicity and efficiency in mind. Consider incorporating clear and intuitive controls that enable users to mark tasks as completed effortlessly. Furthermore, implementing validation checks to confirm task fulfillment before progression can help maintain order accuracy and integrity within the production process. Additionally, clear notifications or status updates should inform users about the transition of orders to their next phases, providing transparency and clarity in the production workflow|
|RF008|Generate report advances|The 'Generate Report Advances' feature empowers users to create specific or comprehensive reports about orders and their work progress within their part of the process. These reports can encompass product details and any identified defects during the production process|Report generation will be an optional feature of the system|
|RF009|Check users list|The users would see their name on the web to verify that they are using their account.|This option can be any user.|
|RF010|Changes|A bar that notificates the new changes|This option will help the user to see if ther is new orders to produce.|
|RF011|Check produtc by date, name, etc.|An option to view the products by new, oldest, done, not done, name, date|This kind of list can be seen for anyone.|


## Non-functional requirements.

As part of non-functional requirements, we were able to meet the ones proposed at the beginning of the project.

### Security

Security is defined as the way in which the system is protected with the data it contains to prevent loss or data breaches from unauthorized sources.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 1** | Authentication | All users are authenticated to log in and use the system. There is a username and password. |
| **RNF 2**  | Multiple sessions  | The system does not restrict multiple sessions opened in the browser or workstation with the same user.   |
| **RNF 3** | Maintain login | The system maintains the user's login in case of web server failures. |

### Availability

The time in which the system is functional and working.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 4** | High availability | The system is available when the user likes to use it. This quality scenario is met by the infrastructure and deployment proposal presented.|

### Reliability

It refers to the level of confidence that the system offers not to fail in the execution of its function.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 5**| Acceptable data loss |As long as the database is available, data loss does not exist in the system. In case of interruptions in communication between the servers and the client, the system does not continue with the request and the client must resume the request.|

### Portability

The system's ability to run on different technological platforms.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 6** | Browser | The web system is compatible with computers with the goal of providing a consistent and accessible user experience on all these platforms.|

### Flexibility

The software can adapt to changing situations and supports changes in business policies and rules.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 7** |Resource configuration |There is a scheme to manage specific configuration properties of the resources used by the application. For example, the name of the database.|

## Project priorities.

For a successful program implementation, it is required to have a development schedule, through which the most crucial functions required by the software are evaluated. To achieve this, an administrative meeting was conducted involving developers, company administrators, and the employees who will be using the software upon its development. 

During the meeting, agreements were reached, and it was determined that the most pressing need was communication between the laboratories and the administration. As a result, a high priority will be given to the communication between the laboratory and the database, as well as the communication from the database to the laboratory.
