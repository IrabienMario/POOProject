# Documentation


## **Non-functional requirements**
_Security._

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
