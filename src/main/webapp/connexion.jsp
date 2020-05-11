<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
  <c:when test="${ !empty sessionScope.connected_user }">
    <c:redirect url="tables.jsp"/>
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
                <div class="row" id="connexion" style="display: flexbox">
                  <div class="col-lg-6 d-none d-lg-flex">
                    <div class="flex-grow-1 bg-login-image"
                      style="background-image: url('assets/img/Data-Warehouse.png');">
                    </div>
                  </div>
                  <div class="col-lg-6">
                    <div class="p-5">
                      <div class="text-center">
                        <h4 class="text-dark mb-4">Connect to your data Data-Warehouse !</h4>
                      </div>
                      <form action="" method="POST" class="user">
                        <div class="row">
                          <div class="col">
                            <div class="form-group">
                              <input class="form-control form-control-user" type="text" id="server"
                                placeholder="Server" />
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-group">
                              <input class="form-control form-control-user" type="number" id="port"
                                placeholder="Port" />
                            </div>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col">
                            <div class="form-group">
                              <input class="form-control form-control-user" type="text" id="datawarehouse"
                                placeholder="Datawarehouse Name" />
                            </div>
                          </div>
                          <div class="col">
                            <div class="form-group">
                              <input class="form-control form-control-user" type="text" id="username"
                                placeholder="username" />
                            </div>
                          </div>
                        </div>

                        <div class="form-group">
                          <input class="form-control form-control-user" type="password" id="password"
                            placeholder="Password" />
                        </div>

                        <button id="button1" onclick="connect()" class="btn btn-primary btn-block text-white btn-user" type="button">
                          Connect
                        </button>
                        <button id="button2"  class="btn btn-primary btn-block text-white btn-user" disabled type="button" style="display: none;">
                          <span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
                          Connect...
                        </button>
                        <hr />
                        
                      </form>
                      <div id="info"></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Modal -->
    <%@ include file="model.jsp" %>

    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/chart.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="assets/js/myScript.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src='<c:url value="/assets/js/jquery.min.js" />'></script>
    <script type="text/javascript" src='<c:url value="/assets/bootstrap/js/bootstrap.min.js" />'></script>
    <script src="assets/js/theme.js"></script>

</body>

</html>