<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Page Not Found - Brand</title>
    <link rel="stylesheet" href="http://localhost:8080/PFE/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="http://localhost:8080/PFE/assets/fonts/fontawesome-all.min.css">
</head>

<body id="page-top">
    <div id="wrapper">
        <%@ include file="sidebar.jsp" %>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <%@ include file="navbar.jsp" %>
            <div class="container-fluid">
                <div class="text-center mt-5">
                    <div class="error mx-auto" data-text="404">
                        <p class="m-0">404</p>
                    </div>
                    <p class="text-dark mb-5 lead">Page Not Found</p>
                    <p class="text-black-50 mb-0">It looks like you found a glitch in the matrix...</p><a href="index.jsp">Back to Home</a></div>
            </div>
        </div>
    </div>
    <a class="border rounded d-inline scroll-to-top" href="#page-top">
        <i class="fas fa-angle-up"></i></a>
    </div>
    <script type="text/javascript" src='<c:url value="../../assets/js/jquery.min.js" />'></script>
    <script type="text/javascript" src='<c:url value="../../assets/bootstrap/js/bootstrap.min.js" />'></script>
    <script type="text/javascript" src='<c:url value="../../assets/js/chart.min.js" />'></script>
    <script type="text/javascript" src='<c:url value="../../assets/js/bs-init.js" />'></script>
    <script type="text/javascript" src='<c:url value="../../assets/js/myScript.js" />'></script>
    <script type="text/javascript" src='<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js" />'></script>
    <script type="text/javascript" src='<c:url value="../../assets/js/theme.js" />'></script>
</body>

</html>