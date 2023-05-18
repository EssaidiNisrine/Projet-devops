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
    <link rel="stylesheet" href="css_files/normalize.css">
    <!-- main css file  -->
    <link rel="stylesheet" href="css_files/mainstyle.css">
    <!-- font awesome  -->
    <link rel="stylesheet" href="css_files/all.min.css">
    <!-- google font : Cairo  -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;500;600;700;800;900&display=swap"
        rel="stylesheet">
    <!-- bootstrap files  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
    <!-- icons file  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    <!-- correspending css file  -->
    <link rel="stylesheet" href="css_files/styledashboard.css">
    <link rel="stylesheet" href="css_files/stylelisting.css">
    
    <style type="text/css">
   
		
		thead {
			background : var(--page-color-2) ;
			color: #FFF ;
			border-color:#FFF
		}
		
		td ,tr{
		       border-color: #e4e3e3 !important;
		}
    
    </style>
    
    
</head>
<body>
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
                        <a href="#" class="nav_link">
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
            <div class="tree">
                <span><a class="filiere" href="consulting.html">consulting</a></span> <span>/</span>
                <span><a class="filiere" href="consulting.html">filiere section</a></span> <span>/</span>
                <span>plus d'info sur filiere</span>
                <hr class="container-fluid">
            </div>
            <div class="head">
                <h2>infos filiere </h2>
                <p>consulter les information concernanant les filieres avec leurs modules</p>
            </div>

            <div class="outputs">
                <div class="searchBlock loop2">
                    <input type="text"class="filiere" id="search" placeholder="search" onkeyup="searchFunction()">
                </div>
                <table class=" table table-hover" id="myTable">
                  <jsp:useBean id="daoFiliere" class="AccesBD.DAOFiliere"/>
                    <thead >
                        <tr>
                              <th>Nom </th>
                              <th>Module</th>
                        </tr>
                    </thead>
                    <c:forEach items="${listFil}" var="filiere">
                     <tbody>
                              <tr><td>${filiere.getNomFil()}</td>
                                  <td><c:forEach items="${daoFiliere.selectModParFili(filiere)}" var="module"><c:out value="${module } , "></c:out></c:forEach></td>
                              </tr>
                    </tbody>
                    </c:forEach>
               </table>


            </div>

       </div>
        <!--Container Main end-->


        <!-- jquery  -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- js file  -->
        <script src="js_files/script_dashboard.js"></script>
        <script src="js_files/scriptSearch.js"></script>

    </body>

</html>
