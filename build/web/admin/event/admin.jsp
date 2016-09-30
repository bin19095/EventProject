
<%@page import="com.leapfrog.event.entity.Event"%>
<%@page import="com.leapfrog.event.dao.impl.EventDAOImpl"%>
<%@page import="com.leapfrog.event.dao.EventDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <script src="Assets/js/bootstrap.min.js" type="text/javascript"></script>
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="Assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <link href="Assets/css/styles.css" rel="stylesheet" type="text/css"/>
    
    </head>

<body>
        <div class="container">
            <h1>Events</h1>
            <table class="table table-bordered table-striped">
                <tr>
                    <th>Event Id</th>
                    <th>Event Title</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Venue</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <% 
                    EventDAO eventDAO=new EventDAOImpl();
                    for(Event e: eventDAO.getAll()) {
                %>
                <tr>
                            <td><%=e.getEvent_id()%></td>
                            <td><%=e.getEvent_title()%>()</td>
                            <td><%=e.getStart_date()%></td>
                            <td><%=e.getEnd_date()%></td>
                            <td><%=e.getVenue()%></td>
                            <td><%=e.getStatus()%></td>
                            <td>
                                <a href="" class="btn btn-success">
                                <span class="glyphicon glyphicon-pencil"></span>Edit</a>
                                <a href="" class="btn btn-danger">
                                <span class="glyphicon glyphicon-trash"></span>Delete</a>   
                                    
                            </td>
                </tr>
                <% } %>
            </table>
        </div>

</body>
    
</html>
