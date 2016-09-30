<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <script src="Assets/js/bootstrap.min.js" type="text/javascript"></script>
    <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="Assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <head>
        <title>Log In</title>   
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col col-md-5 col-lg-offset-3">
                    <h1> Log In </h1>
                   <!-- <form action="${pageContext.request.contextPath}/rest/db/insert" method="POST">-->
                    
                        <form action="LogIn" method="GET">
                    
                        <input type="hidden" name="form" value="1">
                        <div class="col-sm-12 form-group">
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="text" class="form-control" name="email" required="required" placeholder="Enter email">
                            </div>
                            <div class="clearfix"></div>
                            <div class=" form-group">
                                <label for="password">Password:</label> 
                                <input type="password" class="form-control" name="password" required="required" placeholder="Enter password">
                            </div>
                            <div class="clearfix"></div>        
                            <input type="checkbox" name="checkbox"> Remember me?
                            <input type="submit" value="login" class="btn btn-success pull-right"/><br/><br/>
                        </form>
                   <!-- <form action="PdfServlet">-->
                   <form action="">
                            <input type="submit" value="Forget Password?" class="btn-info" />
                            <a href="Register.jsp" class="btn btn-default">Sign up</a>
                           
                            <a href="${pageContext.request.contextPath}/rest/db/events">Click Here</a>
                            <br/>
                    </form>

                </div>
            </div>
        </div>
    </div>
</body>
</html>
