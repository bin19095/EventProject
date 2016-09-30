<%@include file="header.jsp" %>
<title>Events</title>
</head>
<%@include file="Index.jsp" %>
<div class="col col-lg-9">
                <h1><b>Edit Events</b></h1>
                <div class="col-lg-12 navbar navbar-light" style="background-color: #e3f2fd;">
                    <form method="post">
                        <div class="col-sm-12 form-group">
                            <label for="title">Title:</label>
                            <input type="text" class="form-control" name="title" required="required" placeholder="Enter title">
                       
                        <div class="col-sm-12 form-group">
                            <label for="Date">Date:</label>
                            <form action="action_page.php">
                                <input type="date" class="form-control" name="bday" min="2000-01-01">
                            </form>
                        </div><div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="Time">Time:</label> <input type="time" class="form-control"  name="myTime">
                            <p id="demo"></p>

                            <script>
                                function myFunction() {
                                    document.getElementById("myTime").value = "00:00:00";
                                }
                            </script>

                        </div><div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="address">Address:</label>
                            <input type="password" class="form-control" name="address" required="required" placeholder="Enter address">
                        </div> <div class="clearfix"></div>
                        <div class="col-sm-12 form-group">
                            <label for="organizer">Organizer's Name:</label>
                            <input type="password" class="form-control" name="organizer" required="required" placeholder="Enter the name of Organizer ">
                        </div><div class="clearfix"></div>
                        </br> 
                        <div class="col-sm-12">
                        <input type="submit" value="Save" class="btn btn-sm btn-success" />
                        <input type="submit" value="Cancel" class="btn btn-sm btn-danger" />
                        </div>
                    </form>
                </div>
            </div>
            <%@include file="footer.jsp" %>