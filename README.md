# Employee Management System (EMS)

A robust backend application for managing employees, attendance, payroll, and authentication using JWT-based security.

---

## Features

* User Registration & Authentication (JWT)
* Secure APIs with Spring Security & JWT
* Employee Management
* Attendance Tracking System
* Payroll Management
* Global Exception Handling
* RESTful API Design


## Authentication Flow

1. User registers via API
2. Logs in with credentials
3. Receives JWT token
4. Uses token to access protected endpoints



## API Endpoints (Sample)

| Method | Endpoint           | Description           |
| ------ | ------------------ | -----------------     |
| POST   | /api/register/user | Register user         |
| POST   | /api/auth/login    | Login user            |
| POST    | /api/employees     | Post employee details |
| POST   | /api/attendance    | Mark attendance       |
| POST   | /api/payroll       | Generate payroll      |

---

## Testing

Use **Postman** or any API client to test endpoints.

---

## Future Improvements

* Frontend Integration (React/Angular)
* Role-Based Access Control (RBAC)
* Reporting & Analytics Dashboard
* Email Notifications

---


## Author

Bidyut Manna
GitHub: https://github.com/Bidyut-Manna

---
