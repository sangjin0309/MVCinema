<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../../../include/header.jsp" %>
<script>
$(function(){
  
  $("input:radio[name=type_radio]").click(function(){
    var val= $("input:radio[name=type_radio]:checked").val();
    if (val=='normal'){
      $("#theaterIDX").val('${idx.max+1}');
      $("#theaterName").val("${idx.count+1}관");
    } else {
      $("#theaterIDX").val('${idx.imax+1}');
      $("#theaterName").val('${idx.count+1}관 (IMAX)')
    }
  })
  
  $("#btnAddTheaterDetail").click(function(){
    if ($("#addTheater_cols").val() == ''){
      alert('입력하지 않은 사항이있습니다. 입력후 다시시도해주세요');
      $("#addTheater_cols").focus();
      return;
    }
    if ($("#addTheater_rows").val() == ''){
      alert('입력하지 않은 사항이있습니다. 입력후 다시시도해주세요');
      $("#addTheater_rows").focus();
      return;
    }
    if ($("#addTheater_price").val() == ''){
      alert('입력하지 않은 사항이있습니다. 입력후 다시시도해주세요');
      $("#addTheater_price").focus();
      return;
    }
    if ($("#addTheater_preview").val() == ''){
      alert('입력하지 않은 사항이있습니다. 입력후 다시시도해주세요');
      $("#addTheater_preview").focus();
      return;
    }
    $("#btnAddTheaterDetail").hide();
    $("#insang_spinner").show();
    var idx= document.form1.idx.value;
    var name= document.form1.name.value;
    var cols= document.form1.cols.value;
    var rows= document.form1.rows.value;
    var price= document.form1.price.value;
    var preview= document.form1.preview.value;
    var param= "idx="+idx+"&name="+name+"&cols="+cols+"&rows="+rows+"&price="+price+"&preview="+preview;
    $.ajax({
      type: "post",
      url: "${path}/subMenu/theater_addTheaterDetail.do",
      data: param,
      success: function(result){
        if (result){
          alert("상영관 추가에 성공하였습니다.");
          sub_theater_loadSub('sub_theater_1')
        } else {
          alert("상영관 추가에 실패하였습니다 다시 시도해주세요");
          sub_theater_loadSub('sub_theater_1')
        }
      }
    })
  })
})
</script>
</head>
<body>

  <div>
    <label for="sub_tdeater_subject">
      <p class="wow fadeIn" data-wow-delay="0s">상영관 추가</p>
    </label>
  </div>
  
  <div class="container" style="width: 100%;">
    <form name="form1" id="form1" method="post" action="${path}/subMenu/theater_addTheaterDetail.do">
      <table class="table">
        <tr style="width:80%;">
          <td colspan="2">상영관 타입</td>
          <td>
            <input type="radio" name="type_radio" value="normal" checked> 일반 상영관 &nbsp;
            <input type="radio" name="type_radio" value="imax"> 아이맥스 상영관
          </td>
          <td><input type="hidden" value="${idx.max+1}" id="theaterIDX" name="idx"></td>
          <td><input type="hidden" value="${idx.count+1}관" id="theaterName" name="name"></td>
        </tr>
        <tr>
          <td>가로 좌석</td>
          <td colspan="2"><input type="number" widtd="20px" min="1" id="addTheater_cols" name="cols"></td>
        </tr>
        <tr>
          <td>세로 좌석</td>
          <td colspan="2"><input type="number" widtd="20px" min="1" id="addTheater_rows" name="rows"></td>
        </tr>
        <tr>
          <td>추가 요금</td>
          <td colspan="2"><input type="number" id="addTheater_price" name="price"></td>
        </tr>
        <tr>
          <td>한줄 설명</td>
          <td colspan="2"><textarea id="addTheater_preview" name="preview"></textarea></td>
        </tr>
        <tr>
          <td colspan="3" align="right"><button type="button" id="btnAddTheaterDetail" class="btn btn-success">등록</button>
          <label id="insang_spinner" style="display: none;">
            <img style="width: 30px;" src='${path}/admin/resources/adminImages/loader.gif'>
          </label>
          </td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>