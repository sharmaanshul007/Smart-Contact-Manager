Smart Contact Manager

Smart Contact Manager is a secure and user-friendly Spring Boot application that allows users to efficiently manage their personal or professional contacts. It features authentication, tag-based contact search, a WYSIWYG editor, and a responsive UI built with Thymeleaf.

---

##  Features

-  **User Authentication** using Spring Security
-  **Create, Edit, Delete Contacts**
-  **Tag Contacts** for easier categorization
-  **Search Contacts by Tags**
-  **Rich Text Editor** for notes (powered by TinyMCE)
-  **Thymeleaf Templates** for frontend rendering
-   Structured project with `MVC` architecture
-  **Role-based Access Control**

---

##  Project Structure
src
├── main
│ ├── java
│ │ └── com.smart
│ │ ├── config # Spring Security Configuration
│ │ ├── controller # Controllers (Web Layer)
│ │ ├── dao # Repository Interfaces
│ │ ├── entities # JPA Entities (User, Contact, etc.)
│ │ └── helper # Utility Classes
│ └── resources
│ ├── static # Static files (CSS, JS, Images)
│ ├── templates
│ │ └── normal # Thymeleaf template fragments
│ │ ├── base.html
│ │ ├── home.html
│ │ ├── login.html
│ │ └── signup.html
│ └── application.properties
