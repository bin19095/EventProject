<%-- 
    Document   : edit
    Created on : Aug 23, 2016, 11:10:44 AM
    Author     : Bipins
--%>
<%@page import="com.leapfrog.event.entity.Event"%>
<%@page import="com.leapfrog.event.dao.impl.EventDAOImpl"%>
<%@page import="com.leapfrog.event.dao.EventDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Event event=new Event();
   
%>
<%@include file="../header.jsp" %>
<!DOCTYPE html>

    <body>
        <h1>Edit Event</h1>
        <form method="post" action="update.jsp">
            <div class="form-group">
                <label>Event Id</label>
                <input type="text" name="event_id" class="form-control" required="required" placeholder="Enter Event ID" value="<%=event.getEvent_id()%>"/>
            </div>
            <div class="form-group">
                <label>Event Title</label>
                <input type="text" name="event_title" class="form-control" required="required" placeholder="Enter Event Title" value="<%=event.getEvent_title()%>"/>
            </div>
            <div>
           
            <label>Start (date and time):</label>
            <input type="datetime" name="startdate">
            <input type="submit">
            
            <div>
           
            <label>End (date and time):</label>
            <input type="datetime" name="enddate">
            <input type="submit">
            
            </div>
            <div class="form-group">
                <label>Venue</label>
                <input type="text" name="venue" class="form-control" required="required" placeholder="Enter venue"/>
            </div>
            <div>
            <select name="menu">
            <option value="0" selected>(please select:)</option>
            <option value="1">Done</option>
            <option value="2">Scheduled</option>
            <option value="3">Canceled</option>
            <option value="other">other, please specify:</option>
            </select>
            </div>
           
                <button type="submit" class="btn btn-success">Save</button>
                <a href="admin.jsp" class="btn btn-danger">Cancel</button>
            </div>
        </form>
    </body>
</html>
