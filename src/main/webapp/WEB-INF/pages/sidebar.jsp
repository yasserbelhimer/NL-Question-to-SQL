<nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0 ">
  <div class="container-fluid d-flex flex-column p-0">
    <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0"  href="index.jsp">
      <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-database"></i></div>
      <div class="sidebar-brand-text mx-3"><span>PFE</span></div>
    </a>
    <hr class="sidebar-divider my-0">
    <ul class="nav navbar-nav text-light" id="accordionSidebar">
      <c:choose>
        <c:when test="${ empty sessionScope.connected_user }">
          <li class="nav-item" role="presentation">
            <a class="nav-link" href="connexion.jsp">
              <i class="fas fa-user-cog"></i>
                <span>Connexion</span>
            </a>
          </li>
          <li class="nav-item" role="presentation" 	>
            <a class="nav-link disabled" href="tables.jsp" >
              <i class="fas fa-table"></i>
              <span>Tables</span>
            </a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link disabled" href="analyse.jsp">
              <i class="fas fa-cogs"></i>
              <span>Analyse</span>
            </a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link disabled" href="execute.jsp">
              <i class="fas fa-cog"></i>
              <span>Execute query </span>
            </a>
          </li>
        </c:when>
        <c:otherwise>
          <c:choose>
            <c:when test="${ empty sessionScope.connected_admin }">
              <li class="nav-item" role="presentation" 	>
                <a class="nav-link" href="tables.jsp" >
                  <i class="fas fa-table"></i>
                  <span>Tables</span>
                </a>
              </li>
            </c:when>
          </c:choose>
          <li class="nav-item" role="presentation">
            <a class="nav-link" href="analyse.jsp">
              <i class="fas fa-cogs"></i>
              <span>Analyse</span>
            </a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link" href="execute.jsp">
              <i class="fas fa-cog"></i>
              <span>Execute query </span>
            </a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link" href="" onclick="disconnect()">
              <i class="fas fa-user-cog"></i>
                <span>Disconnect</span>
            </a>
          </li>
        </c:otherwise>
      </c:choose>
    </ul>
    <div class="text-center d-none d-md-inline">
      <button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button>
    </div>
  </div>
  <div class="active"></div>
</nav>
<script >
  let links = document.getElementsByTagName("a");
  var sPath = window.location.pathname;
  var sPage = sPath.substring(sPath.lastIndexOf('/') + 1);
  for(i= 0;i<links.length;i++){
    if(sPage==links[i].getAttribute("href")){
      links[i].classList.add("active");
    }
    else{
      links[i].classList.remove("active");
    }
  }
</script>