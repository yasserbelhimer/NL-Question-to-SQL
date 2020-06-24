const TypeToConnexion = () =>{
  let type = $( "select#type option:checked" ).val();
  if(type == ''){
    $('#goodInfos').css('display','none');
    $('#badInfos').html('<h3>Please select your type</h3>');
    $('#badInfos').css('display','block');
    $('#myModal').modal('show');
  }
  else{
    $('#choosType').css('display','none');
    $('#connectToDW').css('display','block');
  }
}
const connect = () => {
  let server = $("#server").val();
  let port = $("#port").val();
  let datawarehouse = $("#datawarehouse").val();
  let username = $("#username").val();
  let password = $("#password").val();
  let type = $( "select#type option:checked" ).val();
  
  if(server =='' || port =='' || datawarehouse == ''|| username == ''||password=='' ||type ==''){
    $('#goodInfos').css('display','none');
    $('#badInfos').html('<h3>there are empty fields</h3>');
    $('#badInfos').css('display','block');
    $('#myModal').modal('show');
  }
  else
  {
    $.ajax({
      url:"connect",
      method:'post',
      data:{server:server,port:port,datawarehouse:datawarehouse,username:username,password:password,type:type},
      beforeSend: function(){
        $('#button1').css("display","none");
        $('#button2').css("display","block");
      },
      complete: function(){
        $('#button2').css("display","none");
        $('#button1').css("display","block");
      },
      success:function(data)
      {
        if(data=="1"){
          $('#badInfos').css('display','none');
          $('#goodInfos').html('<h3>Connexion successfully</h3>');
          $('#goodInfos').css('display','block');
          $('#myModal').modal('show');
          $('#myModal').on('hide.bs.modal', function (e) {
            setTimeout("window.location.href='tables.jsp'");
          })
        }
        else if(data=="2"){
          $('#badInfos').css('display','none');
          $('#goodInfos').html('<h3>Connexion successfully</h3>');
          $('#goodInfos').css('display','block');
          $('#myModal').modal('show');
          $('#myModal').on('hide.bs.modal', function (e) {
            setTablesDecisionMaker();
          })
        }
        else{
          $('#goodInfos').css('display','none');
          $('#badInfos').html('<h3>Connexion Failed</h3>');
          $('#badInfos').css('display','block');
          $('#myModal').modal('show');
        }
      }
    });
  }
};

const analyse = ()=>{
  let question = $("#question").val();
  if (question == "") {
    alert("Enter your question");
  } else {
    $.ajax({
      url: "analyse",
      method: "post",
      data: { question: question },
      beforeSend: function(){
        $('#Mysnipper').css('display','block');
      },
      complete: function(){
        $('#Mysnipper').css('display','none');
      },
      success: function (data) {
          $("#info").html(data);
      },
    });
  }
}

const execute = ()=>{
  let query = $("#query").val();
  if (query == "") {
    alert("Enter your query");
  } else {
    $.ajax({
      url: "queryResult",
      method: "post",
      data: { query: query },
      beforeSend: function(){
        $('#Mysnipper2').css('display','block');
      },
      complete: function(){
        $('#Mysnipper2').css('display','none');
      },
      success: function (data) {
        $("#queryResult").html(data);
      },
    });
  }
}
const disconnect = ()=>{
  $.ajax({
    url: "connect",
    method: "get",
    data: { disconnect:"disconnect"},
    success: function (data) {
    },
  });
}
const factToMeasures = () =>{
  $('#validateFact').css('display','none');
  $('#validateMeasures').css('display','block');
}
const measuresToDimensions = ()=>{
  var measures = $("#Measures").val();
  $('#validateMeasures').css('display','none');
  $('#validateDimensions').css('display','block');
}
const setTables = () => {

  var measureTables = $("#FactTables").val();
  var dimensionTable = $("#SpatialTable").val();
  var temporalLexion = $("#TemporalLexion").val();
  measureTables   = measureTables.toString();
  dimensionTable  = dimensionTable.toString();
  temporalLexion  = temporalLexion.toString();

  $.ajax({
    url: "tables",
    method: "post",
    data: { measureTables:measureTables,dimensionTable:dimensionTable,temporalLexion:temporalLexion},
    success: function (data) {
      setTimeout("window.location.href='analyse.jsp'");
    },
  });
}

const setTablesDecisionMaker = ()=>{
  $.ajax({
    url: "tables",
    method: "post",
    data: { measureTables:"",dimensionTable:"",temporalLexion:""},
    success: function (data) {
      setTimeout("window.location.href='analyse.jsp'");
    },
  });
}

$('#badInfos').css('display','none');
$('#goodInfos').css('display','none');
$('#Mysnipper').css('display','none');
$('#Mysnipper2').css('display','none');