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

## Non-functional requirements.

### Security

Security is defined as the way in which the system is protected with the data it contains to prevent loss or data breaches from unauthorized sources.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 1** | Authentication | All users will authenticate themselves for system login and usage. They will have a username and password.  |
| **RNF 2**  | Multiple sessions  | The system must not restrict multiple open sessions in different browsers or workstations with the same user.   |
| **RNF 3** | Maintain login | The system must maintain the user's login in case of any failures in the web servers. |

### Availability

The time in which the system is functional and working.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 4** | High availability | The system must be available 99.5% of the time. The fulfillment of this quality scenario depends on the infrastructure and deployment proposal presented.  |

### Reliability

It refers to the level of confidence that the system offers not to fail in the execution of its function.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 5** | Acceptable data loss | The acceptable data loss must be equal to 0. In the event of communication interruptions between servers and the client, the system does not proceed with the request, and the client must resume the request.  |