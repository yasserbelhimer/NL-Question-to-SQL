<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--display the queries-->
<div class="card shadow-lg o-hidden border-0 my-5">
  <div class="card-body p-0">
    <div id="queries" class="list-group">
      <div class="list-group-item list-group-item-action active">Queries</div>
      <c:forEach items="${ Queries }" var="Query">
        <c:if test="${ !empty Query }">
          <button class="list-group-item list-group-item-action"><c:out value="${ Query }"/></button>
        </c:if>
      </c:forEach>
    </div>
  </div>
</div>

<!--display the Details-->

<div class="card shadow-lg o-hidden border-0 my-5">
  <div class="card-body p-0">
    <!--display the application of StanfordPosTagger-->

    <button class="btn btn-primary btn-lg btn-block text-left" type="button" data-toggle="collapse" 
      data-target="#StanfordPosTagger" aria-expanded="false" aria-controls="StanfordPosTagger">
      the application of StanfordPosTagger
    </button>
    <div class="collapse" id="StanfordPosTagger">
      <div class="card card-body">
        <p>${taggedSentence}</p>
      </div>
    </div>

    <!--display the Measers-->

    <button class="btn btn-primary btn-lg btn-block text-left" type="button" data-toggle="collapse" 
      data-target="#measers" aria-expanded="false" aria-controls="measers">
      Measers
    </button>
    <div class="collapse " id="measers">
      <div class="card card-body p-0">
        <div class="list-group">
          <c:forEach items="${ measers }" var="measer">
            <c:if test="${ !empty measer }">
              <div class="list-group-item list-group-item-action"><c:out value="${ measer }"/></div>
            </c:if>
          </c:forEach>
        </div>
      </div>
    </div>

    <!--display the Dimentions-->

    <button class="btn btn-primary btn-lg btn-block text-left" type="button" data-toggle="collapse" 
      data-target="#dimentions" aria-expanded="false" aria-controls="dimentions">
      Dimentions
    </button>
    <div class="collapse" id="dimentions">
      <div class="card card-body p-0">
        <div class="list-group">
          <c:forEach items="${ dimentions }" var="dimention">
            <c:if test="${ !empty dimention }">
              <div class="list-group-item list-group-item-action"><c:out value="${ dimention }"/></div>
            </c:if>
          </c:forEach>
        </div>
      </div>
    </div>

    <!--display the Filters-->

    <button class="btn btn-primary btn-lg btn-block text-left" type="button" data-toggle="collapse" 
      data-target="#filters" aria-expanded="false" aria-controls="filters">
      Filters
    </button>
    <div class="collapse" id="filters">
      <div class="card card-body p-0">
        <div class="list-group">
          <c:forEach items="${ filters }" var="filter">
            <c:if test="${ !empty filter }">
              <div class="list-group-item list-group-item-action"><c:out value="${ filter }"/></div>
            </c:if>
          </c:forEach>
        </div>
      </div>
    </div>

  </div>
</div>
<script>
  $( "#queries" ).click(function( event ) {
    if(event.target.textContent!=="Queries"){
      localStorage.setItem("pre", "analyse");
      localStorage.setItem("query", event.target.textContent);
      setTimeout("window.location.href='execute.jsp'");
    }
  });
</script>