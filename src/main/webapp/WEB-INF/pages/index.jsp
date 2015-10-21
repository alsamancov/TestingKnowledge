<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Applicant</title>
</head>

<body>

<form:form method="post" action="/" commandName="applicant">
  <table>
    <tr>
      <td><form:label path="firstName">
        First Name
      </form:label></td>
      <td><form:input path="firstName" /></td>
    </tr>
    <tr>
      <td><form:label path="lastName">
        Last Name
      </form:label></td>
      <td><form:input path="lastName" /></td>
    </tr>
    <tr>
      <td><form:label path="email">
        Email
      </form:label></td>
      <td><form:input path="email" /></td>
    </tr>
    <tr>
      <td><form:label path="skype">
        Skype
      </form:label></td>
      <td><form:input path="skype"/></td>
    </tr>
    <tr>

      <td colspan="2"><input type="submit" value="Start Test"/></td>
    </tr>
  </table>
</form:form>

</body>
</html>
