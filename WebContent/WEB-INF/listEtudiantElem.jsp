<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<<meta charset="UTF-8">
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
    <link  rel="stylesheet" href="css_files/styleNotes.css">
   <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js" integrity="sha512-GsLlZN/3F2ErC5ifS5QtgpiJtWd43JWSuIgh7mbzZ8zBps+dvLusV+eNQATqgA/HdeKFVgA5v3S/cIrLF7QnIg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <style>
    	.buto{
	    	display: flex;
		    justify-content: space-evenly;
		    align-items: center;
    	}
    	.container .searchBlock>div:last-of-type button{
    		height: 53px; border-radius: 19px;}
    		
    	.bxs-send {left: 65.5%;}
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
                    <a href="Servlet12" class="nav_link active">
                        <i class='bx bx-grid-alt nav_icon'></i>
                        <span class="nav_name">Dashboard</span>
                    </a>
                    <a href="Servlet10" class="nav_link">
                        <i class='bx bx-bookmarks nav_icon'></i>
                        <span class="nav_name">Students' marks</span>
                    </a>
                    <a href="#" class="nav_link">
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
	<div class='container'>
		<div class="tree">
             <span>elements du professeur</span> <span>/</span> <span>Note section</span>
             <hr class="container-fluid">
	    </div>
	<form method="post" action="Servlet11">
	
	<div class='info'>
	<label>Nom d'Element :<span> ${sessionScope.nomElem }</span></label>
	<label>Le nombre total des etudiants : <span>${listElud.size()}</span></label>
	
	</div>
	
	  <div class="outputs">
                <div class="searchBlock loop2" style='display : block' >
                	<div style='width : 100%'>
	                	<i class='bx bx-search'></i>
	                    <input type="text"class="filiere" id="search" placeholder="search" onkeyup="searchFunction()" >
                	</div>
        
		<table class=" table table-hover container" id="myTable tablo">
			<thead>
				<tr>
					<td style='border-radius: 9px 0 0 0;' >Nom Etudiant</td>
					<td>Prenom Etudiant</td>
					<c:forEach items="${listModaliteElem}" var="modalite">
						<td>note ${modalite.getNomModalite()}</td>
					</c:forEach>
					<td>Note</td>
					<td>IsValide</td>
					<td style='border-radius: 0 9px 0 0;'>IsAbsent</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listElud}" var="etud" varStatus="status1" >
				<tr>
				<td>${etud.getNomEtud()}</td>
				<td>${etud.getPrenomEtud()}</td>
				
				<c:forEach items="${listModaliteElem}" var="modalite" varStatus="status">
				<td>
					<input name="modalite${status1.count-1}${status.count-1}" type="text">
				</td>
				</c:forEach>
					<td>
						<input type="text" name="note${status1.count-1}" >
					</td>
					<td class='isvalid'>
						  <div class="form-check">
							  <input class="form-check-input po" type="radio" name="isV${status1.count-1}" value="V">
							  <label class="form-check-label"><b>V</b></label>
						   </div>
						   
						  <div class="form-check">
							  <input class="form-check-input po" type="radio" name="isV${status1.count-1}" value="NV" >
							  <label class="form-check-label"><b>NV</b></label>
						  </div>
						  
					</td>
					
					<td class='isabsent'> 
						  <div class="form-check" >
						  <input class="form-check-input po" type="radio" name="isA${status1.count-1}" value="P">
						  <label class="form-check-label"><b>P</b></label>
						   </div>
						  <div class="form-check">
						  <input class="form-check-input po" type="radio" name="isA${status1.count-1}" value="A" >
						  <label class="form-check-label"><b>A</b></label>
						  </div>
					</td>
					
					</tr>
				
				</c:forEach>
				</tbody>
		</table>
		<div class='buto'>
			<div style='position :relative'>
				<i class='bx bxs-send' ></i>
				<input type="submit" class='submit0' value="Valider">
			</div>
			<div style='position:relative'>
	                	<i class='bx bxs-file-pdf' ></i>
	                		<button onClick='generatePDF()' >Exporter en PDF</button>
	                	</div>
	         </div>
		</div>
		
	</div>
	</form>
	
	
	
	
	</div>
	<!-- Container Main End -->

	
</body>
<!-- jquery  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- js file  -->
<script src="js_files/script_dashboard.js"></script>
<script src="js_files/scriptSearch.js"></script>
<script type="text/javascript">
	
	function generatePDF (){
		const elem = document.getElementById("tablo");
		html2pdf().form(elem).save();
	}

</script>

</html>