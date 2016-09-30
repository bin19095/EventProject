<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.leapfrog.event.dao.impl.EventDAOImpl"%>
<%@page import="com.leapfrog.event.dao.EventDAO"%>
<%@page import="com.leapfrog.event.entity.Event"%>
<%
    Event e=new Event();
    EventDAO eventDAO=new EventDAOImpl();
    e.setEvent_id(Integer.parseInt(request.getParameter("event_id")));
    e.setEvent_title(request.getParameter("event_title"));
    SimpleDateFormat format=new SimpleDateFormat();
    e.setStart_date(format.parse(request.getParameter("start_date")));
    e.setEnd_date(format.parse(request.getParameter("end_date")));
    e.setVenue(request.getParameter("venue"));
    e.setStatus(Integer.parseInt(request.getParameter("status")));
    
        
    
    
    %>