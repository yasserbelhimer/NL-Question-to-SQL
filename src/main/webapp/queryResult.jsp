<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--display the result of query-->
<div class="card shadow-lg o-hidden border-0 my-5">
  <div class="card-body p-0">
    <div class="list-group">
      <div class="list-group-item list-group-item-action active">Results</div>
        <div class="table-responsive table mt-2" id="dataTable" role="grid" aria-describedby="dataTable_info">
          <table class="table dataTable my-0" id="dataTable">
            <thead>
              <tr>
                <c:forTokens var="morceau" items="${ Head }" delims="$">
                  <c:if test="${ !empty morceau }">
                    <th><c:out value="${ morceau }"/></th>
                  </c:if>
                </c:forTokens>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${ Results }" var="Result" varStatus="status">
                <c:if test="${ !empty Result }">
                  <tr>
                    <c:forTokens var="morceau" items="${ Result }" delims="$">
                      <c:if test="${ !empty morceau }">
                        <td><c:out value="${ morceau }"/></td>
                      </c:if>
                    </c:forTokens>
                  </tr>
                </c:if>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</div>

