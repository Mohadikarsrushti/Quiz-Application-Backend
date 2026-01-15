# ⭐ Quiz Application Backend ⭐

A **Spring Boot REST backend** for a Quiz Application using **JdbcTemplate** (No JPA/Hibernate).  
Serves quiz questions to a React frontend, calculates scores, and manages quiz questions.

---

## 🚀 Features

- Fetch quiz questions (correct answers hidden)  
- Submit quiz answers with server-side score calculation  
- Add new quiz questions (Admin API)  
- Optional: Save results, randomize questions, pagination, difficulty levels  

---

## 💻 Tech Stack

- Java 17  
- Spring Boot  
- Spring Web  
- JdbcTemplate (H2/MySQL)  
- REST APIs  

---

## 📚 Database Schema

### quiz_question
| Column         | Type          |
|----------------|---------------|
| id             | INT (PK, AUTO)|
| question       | VARCHAR(255)  |
| option_a       | VARCHAR(100)  |
| option_b       | VARCHAR(100)  |
| option_c       | VARCHAR(100)  |
| option_d       | VARCHAR(100)  |
| correct_option | CHAR(1)       |

### quiz_result (Optional)
| Column      | Type           |
|-------------|----------------|
| id          | INT (PK, AUTO) |
| username    | VARCHAR(100)   |
| score       | INT            |
| total       | INT            |
| created_at  | TIMESTAMP      |

---

## 🛠️ API Endpoints

**Get Questions:**  
`GET /api/quiz/questions`  
Correct answers are NOT exposed.

**Submit Answers:**  
`POST /api/quiz/submit`  
Request example:
```json
{
  "answers": {
    "1": "B",
    "2": "C",
    "3": "A"
  }
}


