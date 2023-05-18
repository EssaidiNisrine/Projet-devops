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
    <link rel="stylesheet" href="css_files/styledashboard2.css">
     <link  rel="stylesheet" href="css_files/stylemarks.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
	<style>
	@media (max-width: 768px) {
		div.box_cont>p{
		 	transform: none !important;
		 }
		 
	}
	
	</style>
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
                        <img src="imgs/download.jpg" alt="image ain't available">
                    </div>
                    <div>
                        <h3>Selina Gom</h3>
                    </div>
                </div>

                <div class="nav_list">
                    <a href="#" class="nav_link active">
                        <i class='bx bx-grid-alt nav_icon'></i>
                        <span class="nav_name">Dashboard</span>
                    </a>
                    <a href="Servlet10" class="nav_link">
                        <i class='bx bx-bookmarks nav_icon'></i>
                        <span class="nav_name">Students' marks</span>
                    </a>
                    <a href="notice2.html" class="nav_link">
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
    <div class="container box_cont">
    <p>Vous avez <span>${sessionScope.listElemProfNV.size()}</span> elements non valides</p>
   	<div class='spec'>
	   	<c:forEach items="${sessionScope.listElemProfNV}" var="element">
		    <div>
			    <a href="Servlet11?name=${element}">
				    <button style='background-color: #ec3754'>
				    <c:out value="${element}"></c:out>
				    </button>
				    <i class="fa fa-scroll"></i>
			    </a>
		    </div>
    </c:forEach>
   	
   	</div>
    </div>
	<!--Container Main End-->

	<!-- Start footer -->
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
    <!-- Endfooter -->
</body>

<!-- jquery  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- js file  -->
<script src="js_files/script_dashboard.js"></script>





</html>