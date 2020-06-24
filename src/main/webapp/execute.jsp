<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
  <c:when test="${ empty sessionScope.connected_user }">
    <c:redirect url="connexion.jsp"/>
  </c:when>
</c:choose>
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
                                <div class="row" id="connexion">
                                    <div class="col-xl-9 mx-auto text-center">
                                        <br><br>
                                        <h1 class="mb-5">Input your query</h1>
                                    </div>
                                    <div class="col-xl-9 mx-auto">
                                        <form action="" method="POST" class="user">

                                            <div class="form-group">
                                                <textarea class="form-control form-control-lg" rows="3" id="query"
                                                name="query" autocomplete="on" autofocus=""
                                                placeholder="Enter your query here ..." >
                                            </textarea>
                                              </div>
                                            <small class="form-text text-left text-body"
                                                style="font-size: 20px;">Exemple : select * from table where
                                                ...<br />
                                            </small>
                                            <div class="col text-center">
                                                <button class="btn btn-primary text-center shadow" type="button"
                                                    id="submitQuery" onclick="execute()"
                                                    style="height: 60px;width: 250px;font-size: 25px;margin-top: 30px;margin-bottom: 30px;">
                                                    Execute
                                                </button>
                                                <br>
                                                <div style="display: none;" id="Mysnipper2">
                                                    <div class="d-flex flex-column justify-content-center mb-2" >
                                                         <div class="p-2">
                                                             <span class="spinner-border" role="status" style="margin-left: 0;width: 4rem; height: 4rem;"></span>
                                                         </div>
                                                         <div class="p-2 ml-3">
                                                             <h3><strong>Processing...</strong></h3>
                                                         </div>
                                                     </div> 
                                                 </div>
                                                <hr>
                                                <br>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="queryResult"></div>
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
        <script>
            $("#query").val("");
            if(localStorage.getItem("pre")==="analyse"){
                document.querySelector("#query").value=localStorage.getItem("query");
                localStorage.removeItem("pre");
                localStorage.removeItem("query");
            }
        </script>
</body>

</html>