# ☕ JSP, Expression Language (EL) & JSTL

This folder contains JavaServer Pages (JSP), Expression Language (EL), and JSTL examples to understand Java web development.

## 📂 Folder Structure

```text
33-JSP-EL-JSTL/
│
├── README.md
├── FirstJSP.jsp
├── JSPExpression.jsp
├── JSPDeclaration.jsp
├── JSPDirective.jsp
├── Header.jsp
├── JSPImplicitObjects.jsp
├── JSPForm.jsp
├── JSPELExample.jsp
├── JSTLCoreExample.jsp
├── StudentServlet.java
├── student.jsp
├── InterviewQuestions.md
└── PracticePrograms.md
```

## 📚 Topics Covered

- Introduction to JSP
- JSP Expressions
- JSP Declarations
- JSP Directives
- JSP Implicit Objects
- JSP Forms
- Expression Language (EL)
- JSTL Core Tags
- Servlet and JSP Integration
- Dynamic Web Pages

## 🔹 What is JSP?

**JSP stands for JavaServer Pages.**

JSP is a server-side technology used to create dynamic web pages using HTML and Java-related features.

Example:

```jsp
<html>
<body>
    <h1>Welcome to JSP</h1>
    <p>Hello Java Developer!</p>
</body>
</html>
```

## 🔹 JSP vs Servlet

| JSP | Servlet |
|---|---|
| Used mainly to create dynamic web pages | Used mainly to handle requests |
| HTML is easier to write | Java code is easier to write |
| JSP is translated into a Servlet | Servlet is a Java class |
| Supports JSP tags and EL | Uses Java methods and APIs |

## 🔹 JSP Scripting Elements

JSP has three traditional scripting elements:

| Element | Syntax | Purpose |
|---|---|---|
| Expression | `<%= %>` | Displays a value |
| Declaration | `<%! %>` | Declares variables and methods |
| Scriptlet | `<% %>` | Executes Java statements |

Example:

```jsp
<%
    int a = 10;
    int b = 20;
%>

<p>Sum: <%= a + b %></p>
```

Output:

```text
Sum: 30
```

Note: Scriptlets are useful for learning JSP basics, but modern JSP applications should prefer EL, JSTL, and Servlet-based processing.

## 🔹 JSP Directives

JSP provides three main directives:

| Directive | Purpose |
|---|---|
| `page` | Defines page settings and imports |
| `include` | Includes another file during JSP translation |
| `taglib` | Declares a tag library |

Example:

```jsp
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="Header.jsp" %>
```

## 🔹 JSP Implicit Objects

Implicit objects are predefined objects available in JSP without manually creating them.

Important objects:

| Object | Purpose |
|---|---|
| `request` | Reads request information |
| `response` | Sends response information |
| `session` | Stores user session data |
| `application` | Shares application-level data |
| `out` | Writes output |
| `config` | Accesses JSP servlet configuration |
| `pageContext` | Provides access to JSP context |
| `page` | Refers to the current JSP servlet |
| `exception` | Provides exception information on error pages |

## 🔹 What is Expression Language (EL)?

**EL stands for Expression Language.**

It provides a simple way to access data in JSP without writing Java expressions.

Syntax:

```jsp
${expression}
```

Example:

```jsp
<p>Name: ${studentName}</p>
<p>City: ${param.city}</p>
```

Important EL scopes:

- `pageScope`
- `requestScope`
- `sessionScope`
- `applicationScope`

## 🔹 What is JSTL?

**JSTL stands for JavaServer Pages Standard Tag Library.**

It provides ready-made tags for common operations such as conditions, loops, and output.

Important JSTL core tags:

| Tag | Purpose |
|---|---|
| `<c:out>` | Displays output |
| `<c:set>` | Creates or updates a variable |
| `<c:if>` | Checks a condition |
| `<c:choose>` | Provides multiple conditions |
| `<c:when>` | Checks a condition inside choose |
| `<c:otherwise>` | Executes the default condition |
| `<c:forEach>` | Executes a loop |
| `<c:forTokens>` | Iterates through tokens |

Example:

```jsp
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="marks" value="85"/>

<c:if test="${marks >= 40}">
    <p>Student is Pass</p>
</c:if>

<c:forEach var="i" begin="1" end="5">
    <p>Number: ${i}</p>
</c:forEach>
```

## 🔹 Servlet and JSP Integration

Servlets can process client requests and forward data to JSP pages for display.

Example Servlet:

```java
request.setAttribute("studentName", "Samrudhi");

request.getRequestDispatcher("/student.jsp")
       .forward(request, response);
```

Example JSP:

```jsp
<p>Student Name: ${studentName}</p>
```

## 📁 Java and JSP Files

| File | Description |
|---|---|
| `FirstJSP.jsp` | Create your first JSP page |
| `JSPExpression.jsp` | Display values using JSP expressions |
| `JSPDeclaration.jsp` | Declare variables and methods |
| `JSPDirective.jsp` | Understand JSP directives |
| `Header.jsp` | Reusable header file |
| `JSPImplicitObjects.jsp` | Learn JSP implicit objects |
| `JSPForm.jsp` | Accept and display form data |
| `JSPELExample.jsp` | Use Expression Language |
| `JSTLCoreExample.jsp` | Practice JSTL core tags |
| `StudentServlet.java` | Process student information |
| `student.jsp` | Display student information |
| `InterviewQuestions.md` | JSP interview questions |
| `PracticePrograms.md` | JSP practice programs |

## ⚙️ Required Software

- JDK 17 or later
- Apache Tomcat 10.1+
- Eclipse IDE or IntelliJ IDEA
- Maven
- Jakarta Servlet API
- Jakarta JSTL dependencies

### Maven Dependencies

Add these dependencies inside the `pom.xml` file:

```xml
<dependencies>

    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>6.0.0</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
        <version>3.0.0</version>
    </dependency>

    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
        <version>3.0.1</version>
    </dependency>

</dependencies>
```

## ▶️ How to Run

1. Install JDK 17 or later.
2. Install Apache Tomcat 10.1+.
3. Create a Maven Web Application.
4. Add the required dependencies to `pom.xml`.
5. Place JSP files inside `src/main/webapp/`.
6. Place Java Servlet files inside `src/main/java/`.
7. Deploy the application on Tomcat.
8. Start the server.
9. Open the JSP page in your browser.

Example URL:

```text
http://localhost:8080/YourProjectName/FirstJSP.jsp
```

**Important:** JSP files cannot be executed directly using `javac`. They must be deployed on a JSP-compatible server such as Apache Tomcat.

These examples use `jakarta.*` packages and are intended for Tomcat 10+. Tomcat 9 uses the older `javax.*` packages.

## 🎯 Learning Outcomes

After completing this folder, you will understand:

- How JSP works
- Difference between JSP and Servlet
- JSP Expressions, Declarations, and Directives
- JSP Implicit Objects
- How to handle form data
- Expression Language (EL)
- JSTL Core Tags
- How to integrate Servlet with JSP
- How to create dynamic web pages

## 💡 Easy Trick

```text
JSP  → Dynamic Web Pages

EL   → Access Data Easily

JSTL → Ready-Made JSP Tags

Servlet → Request Processing

JSP + Servlet → Java Web Application
```

## 📝 Git Commit

```bash
git add 33-JSP-EL-JSTL/

git commit -m "Add JSP, EL and JSTL learning examples"

git push
```

## 🚀 Next Topic

**Day 34 – Hibernate ORM and JPA Basics**

Learn database operations using Hibernate and Java Persistence API.
