<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>School Adiministration management</title>
    <meta name="description"
        content="This website is for managing professors ,departements ,mark standard ,subject and such and such">
    <!-- normalize file  -->
    <link rel="stylesheet" href="css_file/normalize.css">
    <!-- main css file  -->
    <link rel="stylesheet" href="css_files/mainstyle.css">
    <!-- font awesome  -->
    <link rel="stylesheet" href="css_file/all.min.css">
    <!-- google font : Cairo  -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;500;600;700;800;900&display=swap"
        rel="stylesheet">
    <!-- google font : Montserrat  -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Raleway:300,600" rel="stylesheet">
    <!-- bootstrap files  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
    <!-- icons file  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <!-- correspending css file  -->
    <link rel="stylesheet" href="css_files/styledashboard.css">
    <link rel="stylesheet" href="css_files/styleacc.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
    
  <style type="text/css">
	  .info{
	  	margin-bottom: 19px;
	    font-size: 19px;
	    color: #777;
	    font-weight: bold;
	  }
	  .info span {
	  	color : #000
	  }
	  
	  .box-cont{
		  display: flex;
	    align-items: center;
	    justify-content: flex-start;
	    gap: 17px;
	    margin: 0 0 19px 0;
	   }
	  
	  .box-cont .boxo{
	     margin-left: 12px;
		    font-size: 18px;
		    text-transform: capitalize;
	  }
	  
	  .box-cont .boxo input{
	      background: #edecec;
		    border: none;
		    border-bottom: 1px solid #0d6efd;
		    caret-color: #0d6efd;
		    padding: 2px 0 2px 14px;
		    color: #0853c3;}
		i.mm {transform: translate(48px, 2px);}
.infor{
	    	display: flex;
		    align-items: center;
		    justify-content: flex-start;
		    flex-wrap: wrap;
		    position : relative;
    	}
    
    	.infor p{
    	    text-transform: capitalize;
		    background: #5ea9ff;
		    color: white;
		    padding: 5px 15px;
		    font-size: 19px;
		 }
    	.infor>div{
	    	padding: 19.5px 25px;
		    transform: translate(-15px,-8px) skewX(330deg);
		    z-index: -1;
		    background: #5ea9ff;
    	}	
    	
    	.infor span.p{
    	    transform: translate(-12px,-7px) skewX(330deg);
		    background-color: #1f80ef;
		    border: 1px solid #cdcbcb;
		       padding: 19px 21px;
    	}
    	.infor span.p2{
    	position: absolute;
		    top: 7%;
		    right: 69%;
		    font-size: 21px;
		    color: white;}

    
	
  </style>

</head>

<body id='body-pd'>
	<!-- Start header -->
    <header class="header" id="header">
        <div>
            <h3>College Management</h3>
        </div>
        <div class="header_toggle" onClick=move_footer('up')>
            <i class='bx bx-menu' id="header-toggle" ></i>
        </div>
    </header>
    <!-- end header -->
    <!-- Start navbar  -->
        <div class="l-navbar" id="nav-bar">
            <nav class="nav">
                <div>
                    <div>
                        <div class="header_img">
                            <img src="imgs/person-3.jpg" alt="image ain't available">
                        </div>
                        <div>
                            <h3>Joseph Jostar</h3>
                        </div>
                    </div>

                    <div class="nav_list">
                        <a href="dashboard.html" class="nav_link active">
                            <i class='bx bx-grid-alt nav_icon'></i>
                            <span class="nav_name">Dashboard</span>
                        </a>
                        <a href="consulting.html" class="nav_link">
                            <i class='bx bx-bookmarks nav_icon'></i>
                            <span class="nav_name">consulting</span>
                        </a>
                        <a href="Servlet4" class="nav_link">
                            <i class='bx bxs-group nav_icon'></i>
                            <span class="nav_name">Assigning</span>
                        </a>
                        <a href="Servlet6" class="nav_link">
                            <i class='bx bxs-user-detail nav_icon'></i>
                            <span class="nav_name">Managing Account </span>
                        </a>
                        <a href="notice.html" class="nav_link">
                            <i class='bx bx-message-alt-dots nav_icon'></i>
                            <span class="nav_name">Notice</span>
                        </a>
                    </div>
                </div>
                <a href="index.html" class="nav_link">
                    <i class='bx bx-log-out nav_icon'></i>
                    <span class="nav_name">SignOut</span>
                </a>
            </nav>
        </div>
     <!-- End navbar  -->
     <!--Container Main start-->
     <div class="container">

            <div class="head">
                <h2>infos comptes</h2>
                <p>consulter les information concernanant les comptes des utilisateurs</p>
            </div>
			<div class="outputs">
                <div class="searchBlock loop2">
                    <i class='bx bx-search'></i>
                    <input type="text" class="filiere" id="search" placeholder="rechercher par username"
                        onkeyup="searchFunction()">
                </div>
            </div>

       <!--Container Main end-->
				<div class='infor'>
	              <p >Le nombre total des comptes :</p>
	              <div></div>
	              <span class='p'></span>
	              <span class='p2'>${listcompte.size()}</span>
              </div>
              
              <form class=p1 action="Servlet6" method="post">
				<input type="submit" value="Ajouter"  class="btn btn-primary">
				
			</form>
		     
		     <c:if test="${!empty password}">
				 <form action="Servlet7" method="post" class='box-cont'>
					<div class='boxo'>
						 <label>User Name</label>
					 	<input type="text" name="username">
					</div>
					 <div class='boxo'>
						 <label>Password</label>
						 <input type="password" name="password" value="${password}" readonly="true">
					 </div>
					 <i class="fa fa-check mm"></i>
					 <input type="submit" value="Valider" class="btn btn-primary">
			 	</form>
			</c:if>
		     
		<table  class="table table-striped table-hover" id="myTable" >
		  <thead class="table-dark">
				<tr>
					<th>User Name </th>
					<th>Action</th>
				</tr>
			</thead>
            <tbody>
			<c:forEach items="${listcompte}" var="compte">
				<tr >
					<c:if test="${empty username }">
					    <td id="name_row1">${compte.getUserName()}</td>
					    <td>
						    <a href="Servlet8?username=${compte.getUserName()}">
						    	<i class="fa fa-trash"></i>
						    	<button class="btn btn-danger">Supprimer</button>
						    </a>
					        <a href="Servlet9?username=${compte.getUserName()}&&password=${compte.getPassword()}">
					        	<i class="fa fa-pen"></i>
					        	<button  class="btn btn-secondary">Modifier</button>
					        </a>
					   </td>
					</c:if>
				<c:if test="${!empty username }">
				   <c:if test="${compte.getUserName()==sessionScope.username}">
				    <form action="Servlet9" method="post" >
				    <td><input type="text" name="N_username" value="${compte.getUserName()}"></td>
				    <td><a href="Servlet8?username=${compte.getUserName()}">
				    <i class="fa fa-trash"></i>
				    <button class="btn btn-danger" >Supprimer</button></a>
				        <a href="Servlet9?username=${compte.getUserName()}&&password=${compte.getPassword()}">
				        <i class="fa fa-pen"></i>
				        <button class="btn btn-secondary">Modifier</button></a>
				        <i class="fa fa-check mm"></i>
				       <input type="submit" value="Valider" class= 'btn btn-primary'></td>
				    </form>
				   </c:if>
				     <c:if test="${compte.getUserName()!=sessionScope.username}">
				       <td>${compte.getUserName()}</td>
				       <td>
					       <a href="Servlet8?username=${compte.getUserName()}">
					       <i class="fa fa-trash"></i>
					       <button class="btn btn-danger">Supprimer</button>
					       </a>
					        <a href="Servlet9?username=${compte.getUserName()}&&password=${compte.getPassword()}">
					        <i class="fa fa-pen"></i>
					        <button class="btn btn-secondary">Modifier</button>
					        </a>
				        </td>
				   </c:if>
				</c:if>
				</tr>
			</c:forEach>
			</tbody>
			</table>
			
			
			
			
		</div> 
		
		
			
		
		

</div>
<!-- Start Footer  -->
<footer id='i1'>
    <div class="container">
        <div class="row cont container">
            <div class="col box">
                <h3>Contact</h3>
                <ul class="list-unstyled list-inline">
                    <li>Casablanca city</li>
                    <li>School Eleet : Street 4 Haron </li>
                    <li>phone number : +212456782020</li>
                    <li>mobile number : +212456127820</li>
                </ul>
            </div>
            <div class="col box">
                <h3>Menue</h3>
                <ul class="list-unstyled list-inline">
                    <li>Dashboard</li>
                    <li>consulting</li>
                    <li>Assigning</li>
                    <li>Managing Account</li>
                    <li>Notice</li>
                </ul>
            </div>
            <div class="col box">
                <h3>Get In touch :</h3>
                <form onsubmit="sendEmail(); reset(); return false" class="contact">
                    <input type="email" id="email" placeholder="Enter Your Email" required>
                    <textarea id="comment" placeholder="How Can I help You ?" required></textarea>
                    <button type="submit">Send</button>
                </form>
            </div>
            <div class="col box">
                <h3>Folow us via :</h3>
                <div class="media">
                    <div>
                        <a href="https://www.facebook.com" target="_blank">
                            <i class='bx bxl-facebook'></i>
                        </a>
                    </div>
                    <div>
                        <a href="https://www.twitter.com" target="_blank">
                            <i class='bx bxl-twitter'></i>
                        </a>
                    </div>
                    <div>
                        <a href="https://github.com" target="_blank">
                            <i class='bx bxl-github'></i>
                        </a>
                    </div>
                    <div>
                        <a href="https://fr.linkedin.com" target="_blank">
                            <i class='bx bxl-linkedin'></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- End Footer  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- js file  -->
<script src="js_files/scriptSearch.js"></script>
<script src="js_files/script_dashboard.js"></script>
<script type="text/javascript">
function move_footer(str){
	var x = document.getElementById('i1').offsetTop;
	x = 100px ;
	document.getElementById('i1').style.top = x + "px";
}

</script>
</body>
</html>