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

## Development Plan.
### Objectives.
Our main objective is to create a website that can be accessed by any company or individual to record orders and production.

### Resources.
To achieve our goal, we need the necessary development team, in this case, a team of software engineering undergraduate students. Additionally, we need tools for programming, defining objectives, goals, and a channel for team communication.

### Schedule.
Project deliveries will be made for review at the end of each month, with the first delivery scheduled for Friday, September 22nd of the current year.

### Responsibilities.
Responsibilities have been assigned for the project as follows:
  Mario Irabien: Team Leader
  Victor Rosado: Front-End Developer
  Emiliano Arceo: Back-End Developer
  Carlos Ek: Back-End Developer
  Xavier Dzib: Front-End Developer
These responsibilities may change as the project progresses.

### Tracking.
To ensure clear tracking of project development, the project has been divided into three stages: Documentation, Functionality, and Final Design. These stages are followed by daily tasks that have values to quantify the progress and work division.

### Comunication.
To keep the team well-informed and aligned with the project's development, we have adopted the Scrum development methodology, which includes weekly and daily team reviews, project definitions, discussions, etc. We will also use the GitHub platform to manage the project documentation.

## Relevance

The significance of this project is that the problem we are solving is a real necessity in a real company. That's why, besides being a school-related project, all the processes, coding, and documentation done in this project are a depiction of what would happen in a real implementation.

Also, the level of this project would help us in the future to demostrate to the companys how the experencied we have gaind (most related to coding in Java, HTML, SQL, and the process of the development) is used in this deployment. Being able to reach to a level that we could sell this possibility of resolution to the DN company.

## Limitations:

<p>There are several limitations to consider in the context of this project:</p>

<ol>
  <li>
    <p><strong>Academic Nature of the Project:</strong> This project is primarily academic in nature. As a result, the initial focus is on functionality. The emphasis is on learning and gaining practical experience, which may not reach the same level of complexity or scale as a commercial project. Additionally, certain aspects such as security or scalability may not be addressed as extensively during this academic phase.</p>
  </li>
  
  <li>
    <p><strong>Interaction between Interface and Central Database:</strong> The project's initial phase centers around the interaction between the program's interface and the central database. While this is essential for functionality, it may mean that other critical aspects of a real-world project, such as data security and real-time data synchronization, may not be fully explored during this phase.</p>
  </li>

  <li>
    <p><strong>Creation of a Database Copy:</strong> To facilitate software development for the academic project, a copy of the database is being created on a separate computer from the main server. While this practice is common in academic and development settings, it may not be feasible in a production environment due to security and data synchronization considerations.</p>
  </li>
</ol>

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
|RF004|Orders list|The main interface will allow workers to review their tasks and orders, including the delivery deadline for each product, the quantity of products, and the assignment date of the task||
|RF005|Manipulate the orders list|||
|RF006|Orders preview|||
|RF007|Orders window|||
|RF008|Review tasks|||
|RF001|Add users|An option to add users to the web||
|RF002|Delete users|An option to delete users to the web||
|RF003|Check users list|An option to view the users list||
|RF004|Check users list by name, new, etc.|An option to view the users list by name, new, oldest||
|RF005|Changes|A bar that notificates the new changes||
|RF006|Check produtc by date, name, etc.|An option to view the products by new, oldest, done, not done, name, date||
||Access workshop|||
||Access laboratories|||
||Complet the tasks|||
||Denegar subir el trabajo|Si no completo todas las tareas no se puede subir|||
||Generate report advances||Report generation will be an optional feature of the system||

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
