<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!-- globalise scripting and styling content language  -->
	<meta name="Content-Type-Script" content="text/javascript" />
	<meta name="Content-Type-Style" content="text/css" />

	<!--title -->
	<title>Information sur les villes</title>

	<meta name="keywords" lang="fr" content="Alexandre Lemerle" />

	<link rel="stylesheet" type="text/css" href="index.css" />
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
	<!--Font Awesome Icon -->
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	/>
	<!-- Custom Font family -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
	<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />

	<!-- jQuery library -->
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body data-spy="scroll" data-target="#banner">
	<div class="allPage">

		<!-- !!!!!!! Banner !!!!!!!!! -->
		<div id="banner">
			<nav class="navbar navbar-expand navbar-dark flex-column flex-md-row bd-navbar">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<a class="navbar-brand" href="Accueil.jsp">Information Ville</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">	
						
						<ul class="nav navbar-nav navbar-right">
							<!--THIS IS NEW-->
							<li class="btn btn-link">
								<a class="btn btn-link" href="index.jsp">Accueil</a>
							</li>
							<!--END NEW-->
						</ul>
					</div>
					<!-- /.navbar-collapse -->

				</div>
				<!-- /.container-fluid -->
			</nav>
			<!--end Navigation -->
		</div>
		<!--end banner-->
		
	 <div id="Host" class="content"> <!-- Host  -->
	            <div class="container">        
				  <table class="table table-striped">
				    <thead>
				      <tr>
				        <th>Distance</th>
				      </tr>
				    </thead>
				    <tbody>

				    <tr>   
				        <td>
				        	<%  Double distance = (Double) session.getAttribute("distance"); %>
				   			<%=distance %>	     					   
				        </td>
				  
				      </tr>

				    </tbody>
				  </table>
				</div>
	    </div>  
	    
</body>
</html>