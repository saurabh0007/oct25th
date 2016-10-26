 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloodBank</title>
</head>
<body>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;s
    }
    
 
  }

  }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">bloodtype</a></li>
        <li><a href="#">BloodRequirement</a></li>
         <li><a href="#">BloodRequirement</a></li>
         
  </div> 
</div>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="index.jsp"> Sign out</a></li>
      </ul>
   
   
</nav>
         

<div class="container-wrapper">
    <div class="container">
        <div id="login-box">
           <center> <h2>Donor</h2></center>
            
<form:form class="form-horizontal" modelAttribute="Donor" action="AddUserToDB1" method="post">
  
   <div class="form-group">
      <label class="control-label col-sm-2" for="username">Donor Name:</label>
      <div class="col-sm-10">
         <form:input path="DonorName" type="text" name="DonorName" class="form-control" placeholder="Enter DonorName" ng-model="DonorName" ng-change="CheckDonorName()" />
        <form:errors path="DonorName" class="text text-danger" />
        <label ng-if="DonorNameCheck == true" class="text text-danger">Invalid DonorName Value. Cannot Be Empty</label>
      </div>
    </div>
    
    <br>
    
    <div class="form-group">
      <label class="control-label col-sm-2">Email Id:</label>
      <div class="col-sm-10">
        <form:input path="EmailId" type="EmailId" class="form-control" placeholder="Enter EmailId" />
        <form:errors path="EmailId" class="text text-danger" />
      </div>
    </div>
    
    <br>
    
    <div class="form-group">
      <label class="control-label col-sm-2">Date Of Donation:</label>
      <div class="col-sm-10">
        <form:input path="DateOfDonation" type="DateOfDonation" class="form-control" placeholder="DateOfDonation" />
        <form:errors path="DateOfDonation" class="text text-danger" />
      </div>
    </div>
    
    <br>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="city">City:</label>
      <div class="col-sm-10">
        <form:input path="city" type="text" name="city" value="" class="form-control" placeholder="Enter City" />
        <form:errors path="city" class="text text-danger" />
      </div>
    </div>
     
     <br>
     
     <div class="form-group">
      <label class="control-label col-sm-2" for="phone no">Phone No:</label>
      <div class="col-sm-10">
        <form:input path="PhoneNO" type="text" name="phoneNO" value="" class="form-control" placeholder="Enter PhoneNo" />
        <form:errors path="PhoneNO" class="text text-danger" />
      </div>
    </div>
    
    <br>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="zip code">Zip Code:</label>
      <div class="col-sm-10">
        <form:input path="ZipCode" type="text" name="ZipCode" value="" class="form-control" placeholder="Enter Zip Code" />
        <form:errors path="ZipCode" class="text text-danger" />
      </div>
    </div>
    
    <br>
    
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-info" ng-disabled="OverallError == true">Submit</button>
      </div>
    </div>
    
    
  </form:form>
</div>

    </div>

</body>
</html>