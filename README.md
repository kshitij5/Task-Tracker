# 📝 Task Tracker App

A comprehensive Task Tracker application built using **Spring Boot** for the backend and **Angular** for the frontend. The app allows users to create, manage, and track their tasks efficiently with a seamless user interface and a robust backend architecture.

## 🚀 Features

- ✅ **Task Management**: Add, edit, and delete tasks.
- 🔄 **Task Prioritization**: Set priority levels for tasks.
- 📊 **Task Status**: Track the status of tasks (Pending, In Progress, Completed).
- 🔐 **User Authentication**: Secure login and registration system.
- 🖥️ **RESTful API Integration**: Full backend support with RESTful APIs.
- 🔄 **Real-time Updates**: Automatic task list updates without reloading the page.
- 📱 **Responsive Design**: Works on both desktop and mobile devices.

## 🛠️ Tech Stack

### Frontend
- ⚛️ **Angular**: For building a dynamic and responsive user interface.
- 🟦 **TypeScript**: Primary language used for Angular.
- 🖼️ **HTML/CSS**: For structuring and styling the app.
- 📱 **Bootstrap**: For responsive design.
### Backend
- ☕ **Spring Boot**: For handling backend operations and RESTful APIs.
- 🖥️ **Java**: Backend language.
- 🗃️ **Hibernate/JPA**: For database interaction and ORM.
- 🐬 **MySQL**: Primary database used for storing tasks and user information.

## ⚙️ Installation and Setup

### Backend (Spring Boot)

1.  Clone the repository:
    
        git clone https://github.com/kshitij5/Task-Tracker.git
    
2.  Navigate to the backend directory:
    
        cd task-tracker-backend
    
3.  Configure the `application.properties` file to set up the database connection:
    
        spring.datasource.url=jdbc:mysql://localhost:3306/tasktrackerdb
        spring.datasource.username=root
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
    
4.  Run the backend application:
    
        ./mvnw spring-boot:run
    

### Frontend (Angular)

1.  Clone the frontend repository:
    
        git clone https://github.com/kshitij5/task-tracker/frontend.git
    
2.  Navigate to the frontend directory:
    
        cd frontend
    
3.  Install Angular dependencies:
    
        npm install
    
4.  Start the Angular development server:
    
        ng serve
    
5.  Open the app in your browser:
    
        http://localhost:4200
## 🔗 API Endpoints

### Task Endpoints
- `GET /api/tasks`: Retrieve all tasks.
- `POST /api/tasks`: Create a new task.
- `PUT /api/tasks/{id}`: Update an existing task.
- `DELETE /api/tasks/{id}`: Delete a task.

### User Endpoints
- `POST /api/auth/register`: Register a new user.
- `POST /api/auth/login`: Authenticate and log in a user.

## 🗄️ Database Schema

The application uses a relational database (MySQL) with the following schema:

### Tables
1. **Users**:
   - `id` (Primary Key)
   - `username`
   - `password`
   - `email`

2. **Tasks**:
   - `id` (Primary Key)
   - `title`
   - `description`
   - `priority` (Low, Medium, High)
   - `status` (Pending, In Progress, Completed)
   - `user_id` (Foreign Key)

## 🔮 Future Enhancements

- ⏰ Add task due dates and reminders for upcoming tasks.
- 🗂️ Implement task categorization (e.g., Work, Personal, Urgent).
- 🌐 Add social login options (Google, Facebook).
- 📎 Integrate file upload for task attachments (e.g., documents, images).
- 📅 Calendar view to visualize tasks by due date.

## 🤝 Contributing

Contributions are welcome! To get started:

1. **Fork** the repository.
2. **Create** a new feature branch (`git checkout -b feature/YourFeature`).
3. **Commit** your changes (`git commit -m 'Add YourFeature'`).
4. **Push** to the branch (`git push origin feature/YourFeature`).
5. **Open** a Pull Request, and we'll review it!

## 🛡️ License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Thank you for checking out the Task Tracker App! 😄 Feel free to contribute or provide feedback to help make it even better!

Happy coding! 🚀
