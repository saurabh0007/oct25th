
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
        <li><a href="#">Donor</a></li>
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
           <center> <h2>Add Requirement Details</h2></center>

            <form role="form">
            <div class="form-group">
              <label for="Blood Group Name"><span class=></span> Blood Group Name:</label>
              <input type="text" class="form-control" id=" Blood Group Name" placeholder="Enter Blood Group Name">
            </div>
            <div class="form-group">
              <label for="Enter Requirement Number Of Unit"><span class=></span> Enter Requirement Number Of Unit:</label>
              <input type="text" class="form-control" id="Requirement Number Of Unit" placeholder="Enter Requirement Number Of Unit">
              </div>
              <div class="form-group">
              <label for="Date Of Requirement."><span class=></span> Date Of Requirement:</label>
              <input type="text" class="form-control" id=" Date Of Requirement" placeholder="Enter Date Of Requirement">
            </div>
               <div class="form-group">
              <label for="Request from"><span class=></span> Request from:</label>
              <input type="text" class="form-control" id=" Request from" placeholder="Enter Request from">
            </div>
             
            <div class="form-group">
              <label for="Requester contact Number."><span class=></span> Requester contact Number:</label>
              <input type="text" class="form-control" id=" Code" placeholder="Enter Requester contact Number">
            </div>
              <input type="submit" value="Submit" class="btn btn-default">
            </div>
            </form>
        </div>
    </div>
</body>
</html>