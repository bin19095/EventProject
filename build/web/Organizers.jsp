<%-- 
    Document   : Organizers
    Created on : Aug 16, 2016, 12:22:48 PM
    Author     : Bipins
--%>

<%@include file="header.jsp" %>
<title>Organizers</title>
<%@include file="Index.jsp" %>


       
            
                <div class=" form-group">
                <div class="form-group col-sm-5">
                    <label for="organizer">Organizer's Name:</label>
                    <input type="text" class="form-control" name="organizer" required="required" placeholder="Enter the name of Organizer">
                </div> 
                 
                    
                <div class="form-group col-sm-5">
                    <label for="address">Address:</label>
                    <input type="password" class="form-control" name="address" required="required" placeholder="Enter address">
                </div>
                
               
                
                <div class="col-sm-5 form-group">
                    <label for="contact_no">Contact No.:</label>
                    <input type="password" class="form-control" name="contact_no" required="required" placeholder="Enter contact no. ">
                </div> 
                                

                <div class="col-sm-5">
                        <input type="submit" value="Save" class="btn btn-sm btn-success" />
                        <input type="submit" value="Cancel" class="btn btn-sm btn-danger" />
                </div>
            
       </div>
        </div>
    
            
   
</body>
</html>
