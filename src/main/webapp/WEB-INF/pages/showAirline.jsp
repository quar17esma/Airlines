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

    <title><fmt:message key="show.airline"/></title>
</head>
<body>
    <br/>
    <div class="header">
        <h1><fmt:message key="airline.fleet"/></h1>
    </div>
    <br/>
    <form name="sortedByFuelConsumptionForm" action="controller" method="post">
        <input type="hidden" name="command" value="SHOW_SORTED_BY_FUEL_CONSUMPTION">
        <input class="button" type="submit" value="Sort by fuel consumption">
    </form>
    <br/>
    <form name="sortedByFlightRangeForm" action="controller" method="post">
        <input type="hidden" name="command" value="SHOW_SORTED_BY_FLIGHT_RANGE">
        <input class="button" type="submit" value="Sort by flight range">
    </form>
    <br/>

    <form name="findByFuelConsumptionForm" action="controller" method="post">
        <input type="hidden" name="command" value="SHOW_FIND_BY_FUEL_CONSUMPTION">
        Min consumption:
        <input type="number" name="min_fuel_consumption" min="0" max="3000" step="50" value="0">
        Max consumption:
        <input type="number" name="max_fuel_consumption" min="0" max="3000" step="50" value="3000">
        <input class="button" type="submit" value="Find by flight range">
    </form>
    <br/>

    <jsp:useBean id="planes" scope="request" type="java.util.List"/>
    <c:forEach items="${planes}" var="plane">
        <div class="field">
            <label><fmt:message key="plane.id"/></label>
            <c:out value="${plane.id}"/>
        </div>
        <div class="field">
            <label><fmt:message key="plane.model"/></label>
            <c:out value="${plane.aircraftModel}"/>
        </div>
        <div class="field">
            <label><fmt:message key="plane.passanger.capacity"/></label>
            <c:out value="${plane.passengerCapacity}"/>
        </div>
        <div class="field">
            <label><fmt:message key="plane.carrying.capacity"/></label>
            <c:out value="${plane.carryingCapacity}"/>
        </div>
        <div class="field">
            <label><fmt:message key="plane.flight.range"/></label>
            <c:out value="${plane.flightRange}"/>
        </div>
        <div class="field">
            <label><fmt:message key="plane.fuel.consumption"/></label>
            <c:out value="${plane.fuelConsumption}"/>
        </div>
        <hr>
        <hr>
    </c:forEach>
    <br/>

</body>
</html>
