<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <title>PFE</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" />
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css" />
</head>

<body class="bg-gradient-primary">
    <div id="wrapper">
        <%@ include file="WEB-INF/pages/sidebar.jsp" %>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <%@ include file="WEB-INF/pages/navbar.jsp" %>
                <div class="row justify-content-center">
                    <div class="col-md-9 col-lg-12 col-xl-10">
                        <div class="card shadow-lg o-hidden border-0 my-5">
                            <div class="card-body p-0">
                              <div style="background: url('assets/img/DBA.jpg') no-repeat center center;
                                  background-size: cover;
                                  border: 1px solid #707070;height: 410px;">
                                <div class="d-flex align-items-center" style="height: 80%;" >
                                  <div class="text-center text-break mx-auto text-white">
                                    <h1 >CONSTRUCT YOUR QUERIES SQL FROM NATURAL LANGUAGE</h1>
                                   
                                  </div>
                                 
                                </div>
                                <div class="" >
                                    <div class="text-center mx-auto text-white">
                                     <a class="btn btn-primary btn-lg" href="connexion.jsp" style="font-size: 2em;">GET STARTED</a>
                                    </div>
                                   
                                  </div> 
                              </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src='<c:url value="/assets/js/jquery.min.js" />'></script>
        <script type="text/javascript" src='<c:url value="/assets/bootstrap/js/bootstrap.min.js" />'></script>
        <script type="text/javascript" src='<c:url value="/assets/js/chart.min.js" />'></script>
        <script type="text/javascript" src='<c:url value="/assets/js/bs-init.js" />'></script>
        <script type="text/javascript" src='<c:url value="/assets/js/myScript.js" />'></script>
        <script type="text/javascript" src='<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js" />'></script>
        <script type="text/javascript" src='<c:url value="assets/js/theme.js" />'></script>
</body>

</html>