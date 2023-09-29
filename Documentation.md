# Documentation

## Introduction

To undertake an Object-Oriented Programming Project, several students from the Universidad Autónoma de Yucatán have embarked on a real-world endeavor within a company.
    
This particular project involves the transformation of an outdated accounting system into a modern one known as 'Comercial Pro.' This adaptable software leverages SQL to efficiently manage the company's data. For this specific company, which we will refer to as DN, there arose a need for an extension to oversee the various orders received daily.

DN specializes in selling a wide range of souvenirs to diverse companies. To facilitate these sales, they must first manufacture the products within their various laboratories, including the carpentry laboratory, sewing laboratory, serigraphy laboratory, and so forth.

<p align="center">
  <img src="assets/LaboratoryComercialPro.png">
</p>


This feature was seamlessly integrated into the new software. However, it necessitated the installation of new computers in all the laboratories planning to utilize this functionality, alongside the acquisition of additional software licenses.

To address this challenge in a cost-effective manner, we proposed the implementation of a new project. This project revolves around the creation of a web-based platform serving as an interface for interaction between the laboratories and the administrative department. Consequently, laboratories can access the company's central database via the web, obviating the need for new computer installations.

## Relevance

The significance of this project is that the problem we are solving is a real necessity in a real company. That's why, besides being a school-related project, all the processes, coding, and documentation done in this project are a depiction of what would happen in a real implementation.

Also, the level of this project would help us in the future to demostrate to the companys how the experencied we have gaind (most related to coding in Java, HTML, SQL, and the process of the development) is used in this deployment. Being able to reach to a level that we could sell this possibility of resolution to the DN company.

## Overall Objective and Specific Objectives:

<p>The general objective of the project is to carry out the implementation of an agile administrative program to replace an outdated administrative system, which is adaptable to the company's needs. The program will utilize SQL to efficiently manage the company's data, featuring an HTML interface that can utilize Java commands for better database management. The project aims to meet an administrative need of the DN company, which is seeking an agile way to enhance its production processes.</p>

<p>The program aims to use a web-based platform that allows the utilization of the tools provided by the old system but with a more user-friendly interface, eliminating the need to purchase new equipment and licenses. This is intended to enable laboratories to notify the administrative department once the products are ready for delivery.</p>

<p>The specific objectives of the project are as follows:</p>

<ol>
  <li><strong>Create an HTML-formatted user interface:</strong> Develop an intuitive user interface using HTML that allows users to interact with the program effortlessly, minimizing the need for extensive training.</li>

  <li><strong>Ensure a well-organized class structure with sustainable development functions:</strong> Implement proper class and function organization within the software to enhance code quality and maintainability, ensuring the long-term sustainability of the project.</li>

  <li><strong>Implement database updates through efficient inserts and updates:</strong> Keep the database current by seamlessly incorporating data updates and inserts, ensuring the accurate representation of company information for informed decision-making.</li>

  <li><strong>Establish efficient communication between the program and the user interface:</strong> Enable effective communication between the software program and the user interface to ensure that user actions are accurately reflected in the system, resulting in a responsive and user-friendly experience.</li>
</ol>

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
|RF004|Orders list|The main interface will allow workers to review their tasks and orders, including the delivery deadline for each product, the quantity of products, and the assignment date of the task|The main interface should prioritize clarity and user-friendliness to ensure that workers can easily access and comprehend the information related to their tasks and orders. This includes prominently displaying critical details such as the delivery deadlines for each product, product quantities, and task assignment dates. Additionally, it's essential to implement an intuitive navigation system that enables efficient task and order management|
|RF005|Manipulate the orders list|The system allows users to manipulate the orders list, including adding, updating, and deleting orders as needed|The system's ability to manipulate the orders list by allowing users to perform actions such as adding, updating, and deleting orders is a crucial feature for enhancing order management flexibility. It is essential to ensure that these operations are well-documented, easily accessible, and include appropriate validation checks to prevent errors. Furthermore, user permissions and access control should be considered to maintain data integrity and security while interacting with the orders list|
|RF006|Orders preview|The Orders Preview feature provides users with a glimpse of upcoming orders, allowing them to review and prepare for upcoming tasks and deliveries|The "Orders Preview" feature serves as a valuable tool to offer users insights into forthcoming orders, fostering better preparedness for tasks and deliveries. To maximize its utility, it's important to design this feature with an intuitive and informative user interface. This should include clear presentation of order details, such as delivery dates and quantities, as well as effective navigation options to facilitate easy access to relevant information. Additionally, considering customization features that enable users to prioritize or filter orders may enhance the usability of this functionality|
|RF007|Orders window|The Orders Window is a dedicated page where users can view and access detailed information about each order, including order status, customer details, product specifications, and delivery information|The creation of a dedicated "Orders Window" page is a valuable addition, providing users with a centralized location to access comprehensive details about individual orders. To optimize user experience, it's essential to ensure that the information presented on this page is well-organized and easily navigable. Key elements, such as order status, customer details, product specifications, and delivery information, should be prominently displayed and intuitively accessible. Additionally, consider incorporating search and filtering functionalities to enable users to efficiently locate specific orders within this dedicated page|
|RF008|Review tasks|The 'Review Tasks' function allows users to examine and manage tasks associated with orders, including viewing their status, tracking progress, and making updates when necessary|The 'Review Tasks' function is a valuable tool for users to inspect and oversee tasks related to orders. To enhance its effectiveness, it is essential to design this function with a user-friendly interface that allows for intuitive navigation. The ability to view task statuses, track progress, and make updates when necessary is pivotal for efficient task management. Consider implementing clear visual cues, such as status indicators, to provide users with immediate insights into the state of each task. Furthermore, ensuring that the 'Review Tasks' function integrates seamlessly with other system features can streamline overall order and task management|
|RF009|Access workshop|The 'Access Workshop' feature provides users with dedicated workspaces to access and view in-depth details of the order processes and task specifics, facilitating a comprehensive understanding of the workflow|The 'Access Workshop' feature introduces dedicated workspaces that offer users the opportunity to delve into comprehensive details regarding order processes and task specifics. To optimize user engagement and productivity, it's imperative to design these workspaces with an emphasis on user-friendliness and accessibility. This includes providing straightforward navigation to the relevant information and ensuring that the presented details are well-organized. To facilitate a comprehensive understanding of the workflow, consider incorporating features such as visual representations or flowcharts that elucidate the order processes. Additionally, offering customizable views and filtering options can further enhance the usability of the 'Access Workshop' feature|
|RF010|Complet the tasks|The 'Complete the Tasks' functionality allows users to mark a task as completed, triggering the order to proceed to its next phase in the production process|The 'Complete the Tasks' functionality is a critical component that empowers users to signify task completion, thus advancing the associated order to the subsequent phase of the production process. To ensure seamless workflow management, it's crucial to design this functionality with simplicity and efficiency in mind. Consider incorporating clear and intuitive controls that enable users to mark tasks as completed effortlessly. Furthermore, implementing validation checks to confirm task fulfillment before progression can help maintain order accuracy and integrity within the production process. Additionally, clear notifications or status updates should inform users about the transition of orders to their next phases, providing transparency and clarity in the production workflow|
|RF011|Deny uploading work|The 'Deny Uploading Work' function restricts the uploading of work or product to the next phase if all tasks in the workshop haven't been completed|The 'Deny Uploading Work' function plays a crucial role in maintaining the integrity of the workflow by preventing the uploading of work or products to the next phase until all tasks in the workshop are completed. To ensure its effectiveness, it's important to implement clear and informative error messages or notifications that clearly convey the reason for the denial. This can help users understand the necessity of completing all tasks before proceeding and prevent inadvertent actions. Additionally, consider incorporating user-friendly prompts or reminders that encourage users to review and finalize any outstanding tasks before attempting to upload work, thus fostering a seamless and organized production process.|
|RF012|Generate report advances|The 'Generate Report Advances' feature empowers users to create specific or comprehensive reports about orders and their work progress within their part of the process. These reports can encompass product details and any identified defects during the production process|Report generation will be an optional feature of the system|
|RF001|Add users|An option to add users to the web||
|RF002|Delete users|An option to delete users to the web||
|RF003|Check users list|An option to view the users list||
|RF004|Check users list by name, new, etc.|An option to view the users list by name, new, oldest||
|RF005|Changes|A bar that notificates the new changes||
|RF006|Check produtc by date, name, etc.|An option to view the products by new, oldest, done, not done, name, date||
## **Non-functional requirements**
_Security._
https://github.com/IrabienMario/POOProject/pull/21
Security is defined as the way in which the system is protected with the data it contains to prevent loss or data breaches from unauthorized sources.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 1** | Authentication | All users will authenticate themselves for system login and usage. They will have a username and password.  |
| **RNF 2**  | Multiple sessions  | The system must not restrict multiple open sessions in different browsers or workstations.   |
| **RNF 3** | Maintain login | The system must maintain the user's login in case of any failures in the web servers. |



_Availability._

The time in which the system is functional and working.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 4** | High availability | The system must be available 99.5% of the time. The fulfillment of this quality scenario depends on the infrastructure and deployment proposal presented.  |


_Reliability._

It refers to the level of confidence that the system offers not to fail in the execution of its function.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 5** | Acceptable data loss | The acceptable data loss must be equal to 0. In the event of communication interruptions between servers and the client, the system does not proceed with the request, and the client must resume the request.  |

_Portability._

The system's ability to run on different technological platforms.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 6** | Browser | The web system must be fully compatible with multiple platforms, including desktop computers, tablets, and mobile devices (cellphones), with the goal of providing a consistent and accessible user experience on all these platforms. |

_Flexibility._

The software should be able to adapt to variable situations and support changes in business policies and rules.
| Requeriment | Name | Description |
|--------------|--------------|--------------|
| **RNF 7** | Resource configuration| There must be a scheme for managing specific configuration properties of the resources used by the application. For example, the database name. |
