 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
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
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
      
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 1000px) {
    .carousel-caption {
      display: none;
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
        <li><a href="#">Donor</a></li>
        <li><a href="#">BloodRequirement</a></li>
         <li><a href="#">BloodRequirement</a></li>
         
  </div> 
</div>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="index.jsp"> Sign out</a></li>
      </ul>
    </div>
  </div>
</nav>
         

<div class="container-wrapper">
    <div class="container">
        <div id="login-box">
            <h2>BLOOD GROUP</h2>

             <form:form class="form-horizontal" modelAttribute="type" action="AddUserToDB2" method="post">
  
   <div class="form-group">
      <label class="control-label col-sm-2" for="BloodGroupName">Blood Group Name:</label>
      <div class="col-sm-10">
         <form:input path="Blood Group Name" type="text" name="Blood Group Name" class="form-control" placeholder="Enter Blood Group Name" ng-model="Blood Group Name" ng-change="CheckBlood Group Name()" />
        <form:errors path="username" class="text text-danger" />
        <label ng-if="Blood Group NameCheck == true" class="text text-danger">Invalid Blood Group Name Value. Cannot Be Empty</label>
      </div>
    </div>
    
    <br>
    
    <div class="form-group">
      <label class="control-label col-sm-2">Blood Unit:</label>
      <div class="col-sm-10">
        <form:input path="Blood Unit" type="Blood Unit" class="form-control" placeholder="Enter Blood Unit" />
        <form:errors path="Blood Unit" class="text text-danger" />
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