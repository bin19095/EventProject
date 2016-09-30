<%-- 
    Document   : dashboard.jsp
    Created on : Aug 15, 2016, 1:44:51 PM
    Author     : Bipins
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body>
        <div>    
            
                <div class="header" style="background-color: steelblue;"><left><h3><b>Dashboard</b></h3></left><center><h1><b>Welcome User!</b></h1></center>
                    
                    <a href="http://localhost:8080/Event_Handler/Login.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-log-out"></span>Log out</a></button>
                
                </div>
            
            <div>
                
                <div class="sidemenu" style="background-color: skyblue;">
                    <ul class="nav"><u><a href="Dashboard.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>Home</a></u></br></br>
                    
                        <li><center><u><b>Contacts</b></u></br></center></li>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus-sign"></span></button></center></br>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></button></center></br>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-trash"></span></button></center></br></br>
                    <li><center><u><b>Events</b></u></br></center></li>
                    <center><a href="Add Events.jsp"><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus-sign"></span></button></a></center></br>
                    <center><a href="Edit Events.jsp"><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></button></a></center></br>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-trash"></span></button></center></br></br>
                    <li><center><u><b>Organizers</b></u></br></center></li>
                    <center><a href="Organizers.jsp"><button type class="btn btn-primary"><span class="glyphicon glyphicon-plus-sign"></span></button></a></center></br>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></button></center></br>
                    <center><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-trash"></span></button></center>                   
                    </ul> </div>
          <form action="pdf">
                            <input type="submit" value="Report The Event" class="btn-info" />
                </form>
            </div>
           
            </div>
<div class="pagewrapper">
    