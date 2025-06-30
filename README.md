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
src/
├── main/
│   ├── java/
│   │   └── com.smart/
│   │       ├── config/               # Spring Security configuration (WebSecurityConfigurerAdapter)
│   │       ├── controller/           # Web controllers handling HTTP requests (Home, User, Auth)
│   │       ├── dao/                  # Data Access layer using Spring Data JPA repositories
│   │       ├── entities/             # JPA Entities like User, Contact
│   │       └── helper/               # Utility classes (e.g., Message, ImageUploadHandler)
│   └── resources/
│       ├── static/                   # Static assets like CSS, JS, images
│       ├── templates/
│       │   ├── normal/               # Thymeleaf views for logged-in users
│       │   ├── base.html             # Layout file with fragments
│       │   ├── home.html             # Homepage view
│       │   ├── login.html            # Login form
│       │   └── signup.html           # Signup form
│       └── application.properties    # Spring Boot app configuration
├── test/                             # JUnit tests
│
├── .gitignore                        # Ignored files and directories
├── pom.xml                           # Maven dependencies and project info
└── README.md                         # You're here!
