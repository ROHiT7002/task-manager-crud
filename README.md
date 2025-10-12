# 🗂️ Task Manager Application

A simple **CRUD-based Task Manager App** built using **Java, Spring Boot, and MySQL**.  
This project helps users manage their daily tasks efficiently by providing APIs to add, view, update, and delete tasks.

---

## 🚀 Features

- ➕ Add new tasks
- 📋 View all tasks
- ✏️ Update existing tasks
- ❌ Delete tasks
- ✅ Mark tasks as completed or pending
- ⚙️ RESTful API structure (Controller → Service → Repository)

---

## 🧰 Tech Stack

| Category | Technology |
|:----------|:------------|
| **Language** | Java 17+ |
| **Framework** | Spring Boot |
| **Database** | MySQL |
| **ORM Tool** | Spring Data JPA |
| **Build Tool** | Maven |
| **Testing** | Postman |

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository
```bash
git clone https://github.com/yourusername/task-manager.git
cd task-manager

### 2️⃣ Create MySQL database
CREATE DATABASE taskdb;

3️⃣ Configure database credentials
Edit the file: src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

4️⃣ Run the application
mvn spring-boot:run
The application will start at http://localhost:8080

🧪 API Endpoints
Method	Endpoint	Description
GET	/tasks	Fetch all tasks
GET	/tasks/{id}	Get task by ID
POST	/tasks	Add new task
PUT	/tasks/{id}	Update a task
DELETE	/tasks/{id}	Delete a task

Example JSON (POST / PUT)
{
  "title": "Learn Spring Boot",
  "description": "Finish CRUD operations",
  "completed": false
}

🧠 Learning Highlights

Practiced Spring Boot RESTful API development

Connected backend with MySQL using JPA

Implemented CRUD operations

Followed Layered Architecture

Tested all endpoints with Postman

🤝 Author
Rohit Biswas
📧 Email: rickbiswas777@gmail.com