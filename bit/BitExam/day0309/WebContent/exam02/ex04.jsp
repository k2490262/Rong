<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr;
		var input = document.getElementsByTagName("input");

		document.getElementById("btnUpdate").onclick = function() {
			var tot = 0;
			for ( var i in input) {
				arr[i].innerHTML = input[i].value;
				if (i != 0) {
					tot += eval(input[i].value);
				}
				if (i == 3) {
					break;
				}
			}

			var avg = tot / 3;
			arr[4].innerHTML = tot;
			arr[5].innerHTML = avg;
			
			for ( var i in input) {
				input[i].value = "";
			}
		}

		document.getElementById("btnAdd").onclick = function() {

			var tr = document.createElement("tr");
			tr.onclick = function() {
				arr = this.childNodes;
				for (var i in input) {
					input[i].value = arr[i].innerHTML;
				}
			}

			var tot = 0;
			for (var i = 0; i < 4; i++) {
				var td = document.createElement("td");
				var txt = document.createTextNode(input[i].value);
				td.appendChild(txt);
				tr.appendChild(td);
				if (i != 0) {
					tot += eval(input[i].value);
				}
			}
			
			var txtTot = document.createTextNode(tot);
			var txtAvg = document.createTextNode(tot / 3);
			var tdTot = document.createElement("td");
			var tdAvg = document.createElement("td");
			tdTot.appendChild(txtTot);
			tdAvg.appendChild(txtAvg);
			tr.appendChild(tdTot);
			tr.appendChild(tdAvg);
			document.getElementById("tb").appendChild(tr);

			for ( var i in input) {
				input[i].value = "";
			}
		}
	}
</script>
</head>
<body>
	<table border="1" width="80%" id="tb">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
		</tr>
	</table>

	이름 : <input type="text"><br>
	국어 : <input type="text"><br>
	영어 : <input type="text"><br>
	수학 : <input type="text"><br>
	<button id="btnAdd">등록</button>
	<button id="btnUpdate">수정</button>
	<button id="btnDelete">삭제</button>
</body>
</html>