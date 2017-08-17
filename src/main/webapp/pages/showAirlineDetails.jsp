<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setLocale value="en_US" />
<fmt:setBundle basename="Labels"/>
<!DOCTYPE html>
<html>
<head>
    <style>
        .field {
            clear: both;
            text-align: left;
            line-height: 25px;
        }

        label {
            float: left;
            padding-right: 10px;
        }

        .button {
            width: 200px;
        }

        .main {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
        }
        .header {
            font-size: x-large;
        }
    </style>

    <title><fmt:message key="show.airline.details"/></title>
</head>
<body>
<br/>
<div class="header">
    <h1><fmt:message key="show.airline.details"/></h1>
</div>
<br/>
<form name="showAirlineForm" action="controller" method="post">
    <input type="hidden" name="command" value="SHOW_FLEET">
    <input class="button" type="submit" value="Airline fleet">
</form>
<br/>

<jsp:useBean id="airline" scope="request" type="com.sergii.shutyi.model.entity.airline.Airline"/>

    <div class="field">
        <label><fmt:message key="airline.name"/></label>
        <c:out value="${airline.name}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.founded"/></label>
        <c:out value="${airline.founded}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.headquarters"/></label>
        <c:out value="${airline.headquarters}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.hubs"/></label>
        <c:out value="${airline.hubs}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.parent.company"/></label>
        <c:out value="${airline.parentCompany}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.carrying.capacity"/></label>
        <c:out value="${airline.carryingCapacity}"/>
    </div>
    <div class="field">
        <label><fmt:message key="airline.passenger.capacity"/></label>
        <c:out value="${airline.passengerCapacity}"/>
    </div>
    <hr>
    <hr>
<br/>

</body>
</html>

