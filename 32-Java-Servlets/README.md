# ☕ Java Servlets – HTTP Request & Response

This folder contains Java Servlet examples and practice programs to understand how Java web applications handle HTTP requests and responses.

## 📂 Folder Structure

```text
32-Java-Servlets/
│
├── README.md
├── FirstServlet.java
├── ServletLifecycle.java
├── HttpServletExample.java
├── DoGetExample.java
├── DoPostExample.java
├── RequestParameterExample.java
├── RequestDispatcherExample.java
├── SendRedirectExample.java
├── ServletConfigExample.java
├── ServletContextExample.java
├── InterviewQuestions.md
└── PracticePrograms.md
```

## 📚 Topics Covered

- Introduction to Java Servlets
- Servlet Lifecycle
- HttpServlet
- HTTP GET Request
- HTTP POST Request
- HttpServletRequest
- HttpServletResponse
- Request Parameters
- RequestDispatcher
- sendRedirect()
- ServletConfig
- ServletContext
- Apache Tomcat Server

## 🔹 What is a Servlet?

A **Java Servlet** is a server-side Java component used to handle client requests and generate responses.

Servlets are commonly used to develop dynamic web applications.

Example:

```text
Browser
   ↓
HTTP Request
   ↓
Web Server (Tomcat)
   ↓
Java Servlet
   ↓
Business Logic
   ↓
HTTP Response
   ↓
Browser
```

## 🔹 Servlet Architecture

```text
        Client / Browser
               |
               | HTTP Request
               ↓
       Apache Tomcat Server
               |
               ↓
          Java Servlet
               |
               ↓
        Business Logic
               |
               ↓
           Database
               |
               ↓
         HTTP Response
               |
               ↓
         Client / Browser
```

## 🔹 Servlet Lifecycle

A Servlet has three main lifecycle methods:

| Method | Description |
|---|---|
| `init()` | Called once when the servlet is initialized |
| `service()` | Handles incoming requests |
| `destroy()` | Called when the servlet is taken out of service |

Lifecycle:

```text
Servlet Loading
      ↓
   init()
      ↓
   service()
      ↓
 doGet() / doPost()
      ↓
  destroy()
```

## 🔹 Important Servlet Classes

| Class / Interface | Purpose |
|---|---|
| `HttpServlet` | Base class for HTTP servlets |
| `HttpServletRequest` | Reads client request information |
| `HttpServletResponse` | Sends response to the client |
| `ServletConfig` | Provides servlet-specific configuration |
| `ServletContext` | Shares application-wide information |
| `RequestDispatcher` | Forwards or includes another resource |
| `PrintWriter` | Writes text to the response |

## 🔹 GET vs POST

### GET Request

- Used mainly to retrieve information.
- Parameters commonly appear in the URL.
- Can be bookmarked.
- Should not be used for changing server data.

Example:

```java
protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response) {

    // Handle GET request
}
```

### POST Request

- Used to submit information.
- Form data is sent in the request body.
- Commonly used for registration and login forms.
- Often used for operations that change server data.

Example:

```java
protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response) {

    // Handle POST request
}
```

## 🔹 Request Parameter

The `getParameter()` method reads submitted form values.

Example:

```java
String name = request.getParameter("name");
String city = request.getParameter("city");
```

## 🔹 RequestDispatcher

`RequestDispatcher` is used to forward a request to another server-side resource.

Example:

```java
RequestDispatcher dispatcher =
        request.getRequestDispatcher("/result");

dispatcher.forward(request, response);
```

## 🔹 sendRedirect()

`sendRedirect()` instructs the browser to make a new request to another URL.

Example:

```java
response.sendRedirect("https://www.google.com");
```

## 🔹 ServletConfig vs ServletContext

| ServletConfig | ServletContext |
|---|---|
| Servlet-specific configuration | Application-wide configuration |
| One configuration per servlet | Shared across the web application |
| Used to read servlet init parameters | Used to share application attributes |

## 📁 Java Files

| File | Description |
|---|---|
| `FirstServlet.java` | Create your first Java Servlet |
| `ServletLifecycle.java` | Demonstrate servlet lifecycle methods |
| `HttpServlet
