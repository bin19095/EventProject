<%-- 
    Document   : Register
    Created on : Aug 15, 2016, 8:55:50 AM
    Author     : Bipins
--%>


<html>
    <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <script src="Assets/js/bootstrap.min.js" type="text/javascript"></script>
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="Assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <head>
        <title>Register Form</title> 
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col col-md-5 col-lg-offset-3">
                    

                        <h1>Register Form</h1>
                        <form action="${pageContext.request.contextPath}/rest/db/insert" method="POST">
                            <input type="hidden" name="form" value="2">
                            <div class="col-sm-12 form-group">
                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="text" class="form-control" name="Email" required="required" placeholder="Enter email">
                                </div>
                                <div class="clearfix"></div>
                                <div class=" form-group">
                                    <label for="password">Password:</label>
                                    <input type="text" class="form-control" name="Password" required="required" placeholder="Enter password">
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-group">
                                    <label for="pwd">Confirm Password:</label>
                                    <input type="password" class="form-control" name="pwd" required="required" placeholder="Re-enter password">
                                </div> 
                        

                        <input type="submit" value="Register" class="btn btn-primary"/><br/><br/>
                    </form>
                </div>
                            </div></div></div>
    </body>
</html>

