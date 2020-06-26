<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
  <c:when test="${ empty sessionScope.connected_ITDesigner && empty sessionScope.connected_user}">
    <c:redirect url="connexion.jsp"/>
  </c:when>
  <c:when test="${ !empty sessionScope.connected_user}">
    <c:redirect url="analyse.jsp"/>
  </c:when>
</c:choose>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <meta name="_token" content="{{ csrf_token() }}">
    <title>PFE</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/select2.min.css" />
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" />
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css" />
    <style>
        .chip {
            display: inline-block;
            padding: 0 10px;
            height: 30px;
            font-size: 16px;
            line-height: 30px;
            border-radius: 25px;
            background-color: #f1f1f1;
        }
    </style>
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
                                            
                                            <form action="" method="post" class="user">
                                                <div id="validateFact"  style="display: block;">
                                                    <div class="text-center">
                                                        <h4 class="text-dark mb-4">Validate Fact Tables</h4>
                                                        <div class="form-group" id="myTabs1"></div>
                                                    </div>
                                                    <div class="form-group">
                                                        <select id="FactTables" class="FactTables" name="states[]" multiple="multiple" >
                                                            <option value=""></option>
                                                        </select>
                                                        <label for="FactTables">Select fact tables</label>
                                                    </div>
                                                    <button onclick="factToMeasures()"
                                                        class="btn btn-primary btn-block text-white" type="button">
                                                        Continue
                                                    </button>
                                                </div>
                                                <div id="validateMeasures"  style="display: none;">
                                                    <div class="text-center">
                                                        <h4 class="text-dark mb-4">Validate Measures</h4>
                                                        <div class="form-group" id="myTabs2">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <select id="Measures" class="Measures" name="states[]" multiple="multiple" >
                                                            <option value=""></option>
                                                        </select>
                                                        <label for="Measures">Select the mesures</label>
                                                    </div>
                                                    <button onclick="measuresToDimensions()"
                                                        class="btn btn-primary btn-block text-white" type="button">
                                                        Continue
                                                    </button>
                                                </div>
                                                
                                                <div id="validateDimensions" style="display: none;">
                                                    <div class="text-center">
                                                        <h4 class="text-dark mb-4">Validate Dimensions</h4>
                                                        <div class="form-group" id="myTabs3">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <select id="SpatialTable" class="SpatialTable" name="states[]" multiple="multiple" >
                                                            <option value=""></option>
                                                        </select>
                                                        <label for="SpatialTable">Select the spatial dimensions </label>
                                                    </div>
                                                    <div class="form-group">
                                                        <select id="TemporalLexion" class="TemporalLexion" name="states[]" multiple="multiple" >
                                                            <option value=""></option>
                                                        </select>
                                                        <label for="TemporalLexion">Select the temporal dimensions</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <select id="AutreTable" class="AutreTable" name="states[]" multiple="multiple" >
                                                            <option value=""></option>
                                                        </select>
                                                        <label for="AutreTable">Select the other dimensions</label>
                                                    </div>
                                                    
                                                    <button onclick="setTables()"
                                                        class="btn btn-primary btn-block text-white" type="button">
                                                        Continue
                                                    </button>
                                                </div>
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
            tables = [];
            attribute = [];
            $(document).ready(function() {
                $.ajax({
                    url: "tables",
                    method: "get",
                    success: function (data) {
                        localStorage.setItem("tables", data);
                    },
                });
                tables = localStorage.getItem("tables");
                localStorage.removeItem("tables");
                if(tables !=="")
                    tables = tables.split("\n");
                let chips1 = "";
                for(i=0;i<tables.length;i++){
                    if(tables[i]!="")
                        chips1+="<div class='chip m-1'>"+tables[i]+"</div>"; 
                }
                $("#myTabs1").html(chips1);
            
                $('.FactTables').select2({
                    placeholder: 'Fact Tables',
                    width:"100%",
                    data:tables
                });
                
            });
            factToMeasures = () =>{
                let factTables = $("#FactTables").val();
                let factTable = factTables.toString();
                if(factTable==""){
                    alert("Please select fact tables");
                }
                else{
                    $.ajax({
                        url: "tables",
                        method: "post",
                        data: {type:"getAttributes",factTable:factTable,measures:"",spatialDimensions:"",temporalDimensions:"",otherDimensions:""},
                        success: function (data) {
                            localStorage.setItem("attribute", data);
                            $('#validateFact').css('display','none');
                            $('#validateMeasures').css('display','block');
                        },
                    });
                }
                
                

                attribute = localStorage.getItem("attribute");
                localStorage.removeItem("attribute");
                if(attribute !=="")
                    attribute = attribute.split("\n");
                let chips1 = "";
                for(i=0;i<attribute.length;i++){
                    if(attribute[i]!=""){
                        chips1+="<div class='chip m-1'>"+attribute[i]+"</div>"; 
                    }
                }
                $("#myTabs2").html(chips1);
                $('.Measures').select2({
                    placeholder: 'Measures',
                    width:"100%",
                    data:attribute
                });
                
            }
            measuresToDimensions = ()=>{
                let factTables = $("#FactTables").val();
                factTables = factTables.toString().split(",");
                var measures = $("#Measures").val();
                measures  = measures.toString();

                for(let i=0;i<factTables.length;i++){
                    if(tables.includes(factTables[i]))
                        remove(tables,factTables[i]);
                }
                if(measures==""){
                    alert("Please select the measures");
                }
                else{
                    $('#validateMeasures').css('display','none');
                    $('#validateDimensions').css('display','block');
                }
                

                let chips1 = "";
                for(i=0;i<tables.length;i++){
                    if(tables[i]!=""){
                        chips1+="<div class='chip m-1'>"+tables[i]+"</div>"; 
                    }
                }
                $("#myTabs3").html(chips1);

                $('.AutreTable').select2({
                    placeholder: 'other dimension Tables',
                    width:"100%",
                    data:tables
                });
                $('.SpatialTable').select2({
                    placeholder: 'Spatial dimension tables',
                    width:"100%",
                    data:tables
                });
                $('.TemporalLexion').select2({
                    placeholder: 'Temporal dimension tables',
                    width:"100%",
                    data:tables
                });

                function remove(arr, what) {
                    var found = arr.indexOf(what);

                    while (found !== -1) {
                        arr.splice(found, 1);
                        found = arr.indexOf(what);
                    }
                }
            }
            const setTables = () => {

                var factTables = $("#FactTables").val();
                var measures = $("#Measures").val();
                var spatialDimensions = $("#SpatialTable").val();
                var temporalDimensions = $("#TemporalLexion").val();
                var otherDimensions = $("#AutreTable").val();
                factTables   = factTables.toString();
                measures  = measures.toString();
                spatialDimensions  = spatialDimensions.toString();
                temporalDimensions  = temporalDimensions.toString();
                otherDimensions  = otherDimensions.toString();
                if(spatialDimensions==""||temporalDimensions==""||otherDimensions==""){
                    alert("There are empty fildes");
                }
                else{
                    $.ajax({
                    url: "tables",
                    method: "post",
                    data: { type:"setConcepts",factTables:factTables,measures:measures,spatialDimensions:spatialDimensions,temporalDimensions:temporalDimensions,otherDimensions:otherDimensions},
                    success: function (data) {
                        setTimeout("window.location.href='analyse.jsp'");
                    },
                    });
                }
                
            }
        </script>
    </body>

</html>