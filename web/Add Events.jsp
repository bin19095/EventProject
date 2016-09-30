<%@include file="header.jsp" %>
<title>Events</title>
</head>
<%@include file="Index.jsp" %>
<div class="col col-lg-9">
                <h1><b>Add Events</b></h1>
                <div class="col-lg-12 navbar navbar-light" style="background-color: #e3f2fd;">
                    <form action="${pageContext.request.contextPath}/rest/db/insetEvent" method="post">
                        <div class="col-sm-12 form-group">
                            <label for="title">Title:</label>
                            
                            <input type="text" class="form-control" name="title" required="required" placeholder="Enter title">
                        </div>
                        <div class="col-sm-12 form-group">
                            <label for="id">id</label>
                            
                            <input type="text" class="form-control" name="id" required="required" placeholder="Enter title">
                        </div>
                        
                    
                        <div class="col-sm-12 form-group">
                           <!-- <label for="Date">Date:</label>
                            <form action="save-event.jsp">
                                
                            </form>
                            <input type="date" class="form-control" name="time">-->
                        </div><div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="Time">Time:</label> <input type="time" class="form-control"  name="time">
                        </div>
                        <div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="address">Address:</label>
                            <input type="text" class="form-control" name="address">
                        </div> <div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="organizer">Organizer's Name:</label>
                        <input type="date" class="form-control" name="organiser">
                        <!--<div class="clearfix"></div> -->
                        </br> 
                        <div class="col-sm-12">
                        <input type="submit" value="Save" class="btn btn-sm btn-success" />
                        <input type="submit" value="Cancel" class="btn btn-sm btn-danger" />
                        </div>
                    </form>
                </div>
            </div>
            <%@include file="footer.jsp" %>