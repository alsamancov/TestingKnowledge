<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TEST</title>
</head>
<body>
<div>
  <h1>Test</h1>
  <c:if test="${!empty questions}">
    <table>
      <tr>
        <th>Question</th>
        <th>1.</th>
        <th>2.</th>
        <th>3.</th>
        <th>4.</th>

      </tr>
      <c:forEach items = "${questions}" var = "question">
        <tr>
          <td>${question.textQuestion}</td>
          <td>${question.hisAnswers.get(1).textAnswer}</td>


        </tr>
      </c:forEach>
    </table>
  </c:if>
</div>
</body>
</html>
