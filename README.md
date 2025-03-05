# 📝 To-Do List Application

## 📌 Overview  
The **To-Do List Application** is a simple task manager built using **Spring Boot**. It allows users to efficiently create, update, delete, and manage tasks while following a structured RESTful API.

## ✨ Features  
✔️ **CRUD Operations** – Create, Read, Update, and Delete tasks  
✔️ **Task Completion Tracking** – Mark tasks as **completed** or **pending**  
✔️ **User Authentication** (Optional)  
✔️ **RESTful API** – Designed with best API practices  
✔️ **Database Integration** – Supports **H2 (for testing)** and **MySQL (for production)**  
✔️ **Swagger Documentation** – Explore and test APIs interactively  

---

## 🛠️ Tech Stack  
- **Java 17**  
- **Spring Boot 3** (Spring Web, Spring Data JPA, Spring Security)  
- **MySQL / H2 Database**  
- **Maven** (Build & Dependency Management)  
- **Lombok** (Reduces Boilerplate Code)  
- **Swagger UI** (API Documentation)  

---

## 🚀 Installation & Setup  

### Prerequisites  
Before running the project, ensure you have:  
✅ **Java 17+** installed  
✅ **Maven** installed  
✅ **MySQL** running (if using MySQL)  

### 1⃣ Clone the Repository  
```sh
git clone https://github.com/your-username/todo-list-springboot.git
cd todo-list-springboot
```

### 2⃣ Configure Database  
Modify the `src/main/resources/application.properties` file to set up your database:  

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

*For testing, the project also supports an in-memory **H2 database**.*

### 3⃣ Build & Run the Application  
```sh
mvn clean install
mvn spring-boot:run
```
The application will start on **`http://localhost:8080`** 🎯  

---

## 📼 API Endpoints  
| HTTP Method | Endpoint           | Description                  |
|------------|-------------------|------------------------------|
| **GET**    | `/api/todos`       | Retrieve all to-do items     |
| **GET**    | `/api/todos/{id}`  | Get a specific to-do item    |
| **POST**   | `/api/todos`       | Create a new to-do item      |
| **PUT**    | `/api/todos/{id}`  | Update an existing to-do     |
| **DELETE** | `/api/todos/{id}`  | Delete a to-do item          |

### 🔍 API Testing with Swagger  
Once running, access **Swagger UI** at:  
👉 [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

---

## 🤝 Contributing  
Want to contribute? Follow these steps:  
1. **Fork** the repository  
2. **Create a new branch** (`git checkout -b feature-branch`)  
3. **Commit your changes** (`git commit -m "Added new feature"`)  
4. **Push to your branch** (`git push origin feature-branch`)  
5. **Open a Pull Request** 🎉  

---

## 🐜 License  
This project is licensed under the **MIT License**.

---

## 📞 Contact  
For any inquiries or issues, reach out:  
💎 **Your Name** - [gopi.maganti1998@gmail.com](mailto:gopi.maganti1998@gmail.com)  
🔗 GitHub: [krish-log](https://github.com/krish-log)  

---

### 📌 What’s Improved in This Version?  
✔️ **Better readability & structure**  
✔️ **Emojis for clarity & visual appeal**  
✔️ **Improved formatting for API & installation steps**  
✔️ **Added Swagger documentation link**  
✔️ **Clearer contributing section**  

Let me know if you need further enhancements! 🚀

