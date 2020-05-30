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
    <link rel="stylesheet" href="assets/css/select2.min.css" />
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
                                <div class="row" id="connexion" style="display: flexbox">

                                    <div class="col-lg-6">
                                        <div class="p-5">
                                            <div class="text-center">
                                                <h4 class="text-dark mb-4">Tables</h4>
                                            </div>
                                            <form action="" method="post" class="user">
                                                <div class="form-group">
                                                    <select id="MeasureTables" class="MeasureTables" name="states[]" multiple="multiple" >
                                                        <option value=""></option>
                                                    </select>
                                                </div>
                                                <div class="form-group">
                                                    <select id="DimensionTable" class="DimensionTable" name="states[]" multiple="multiple" >
                                                        <option value=""></option>
                                                    </select>
                                                </div>
                                                <div class="form-group">
                                                    <select id="TemporalLexion" class="TemporalLexion" name="states[]" multiple="multiple" >
                                                        <option value=""></option>
                                                    </select>
                                                </div>
                                                
                                                <button onclick="setTables()"
                                                    class="btn btn-primary btn-block text-white" type="button">
                                                    Conntenue
                                                </button>
                                                <hr />

                                            </form>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 d-none d-lg-flex">
                                        <div class="flex-grow-1 bg-login-image"
                                            style="background-image: url('assets/img/tables.jpeg');">
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
        <script type="text/javascript" src='<c:url value="assets/js/select2.full.min.js" />'></script>
        <script>
            
            $(document).ready(function() {
                $.ajax({
                    url: "tables",
                    method: "get",
                    success: function (data) {
                        localStorage.setItem("tables", data);
                    },
                });
                var tables = localStorage.getItem("tables");
                localStorage.removeItem("tables");
                if(tables !=="")
                    tables = tables.split("\n");
                $('.MeasureTables').select2({
                    placeholder: 'Measure Tables',
                    width:"100%",
                    data:tables
                });
                $('.DimensionTable').select2({
                    placeholder: 'Dimension Tables',
                    width:"100%",
                    data:tables
                });
                $('.TemporalLexion').select2({
                    placeholder: 'Temporal Lexion',
                    width:"100%",
                    data:tables
                });
            });
        </script>
</body>

</html>