<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>School Adiministration management</title>
    <meta name="description"
        content="This website is for managing professors ,departements ,mark standard ,subject and such and such">
    <!-- normalize file  -->
    <link rel="stylesheet" href="css_file/normalize.css">
    <!-- main css file  -->
    <link rel="stylesheet" href="css_files/mainstyle.css">
    <!-- files unknown  -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- bootstrap file cc  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
    <!-- icons file  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    <!-- jquery file and bootstrap js file  -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- personal styling  -->
    <link rel="stylesheet" href="css_files/styledashboard.css">
    <link rel="stylesheet" href="css_files/styleAffectation.css">

</head>
<body id="body-pd">
    <!-- Start header -->
    <header class="header" id="header">
        <div>
            <h3>College Management</h3>
        </div>
        <div class="header_toggle">
            <i class='bx bx-menu' id="header-toggle"></i>
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
            <h2>Affectation </h2>
            <p>fournir un element a un professeur afin de l'enseigner</p>
        </div>
        
        
        
		<form action="Servlet4" method="post" class="container">
		<c:if test="${empty mssg}">
			<div class="row p1" >
			<div  name="prof_name" id="m1">
			<input list="liste1" name="inputliste1" class="form-control "/>
			<datalist id="liste1">
				<c:forEach items="${listProfs}" var="prof">
				<option>${prof.getNomProf()} ${prof.getPrenomProf()}</option>
				</c:forEach>
			</datalist>
			</div>
		
		<div >
		<input list="liste2" name="inputliste2" class="form-control"/>
		<datalist id="liste2">
		<c:forEach items="${listElems}" var="elem">
		<option>${elem.getNomElem()}</option>
		</c:forEach>
		</datalist>
		</div>
		<div >
		<input type="submit" value="Affecter" class="btn btn-info"/>
		</div>
		
		</div>
		</c:if>
		
		<c:if test="${!empty mssg}">
		<div class="row p1">
		<div >
		<input list="liste1" name="inputliste1"  class="form-control dropdown-toggle"/>
		<datalist id="liste1">
		<c:forEach items="${listProfs}" var="prof">
		<option>${prof.getNomProf()} ${prof.getPrenomProf()}</option>
		</c:forEach>
		</datalist>
		</div>
		
		<div >
		<input list="liste2" name="inputliste2" class="form-control dropdown-toggle"/>
		<datalist id="liste2">
		<c:forEach items="${listElems}" var="elem">
		<option>${elem.getNomElem()}</option>
		</c:forEach>
		</datalist>
		</div>
		<div >
		<input type="submit" value="Affecter"/>
		</div>
		</div>
		   <div class="alert alert-info alert-dismissible fade show my_alert">
			    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
			   <i class="fa fa-comment"></i>
			    <strong>Info!</strong><p> ${mssg}<p>
		  </div>
		</c:if>
 </form>
   </div>
   

    <!--Container Main end-->
    <!-- Start Footer  -->
    <footer>
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
    <!-- jquery  -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- js file  -->
    <script src="js_files/script_dashboard.js"></script>
    <script src="js_files/scriptSearch.js"></script>

</body>


</html>