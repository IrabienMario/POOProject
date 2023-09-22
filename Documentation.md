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
