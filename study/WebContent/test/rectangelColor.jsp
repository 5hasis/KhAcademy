<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">  
  <title>색상선택</title>
  <style>
    #box{
      background-color: black;
      width: 100px;
      height: 100px;
    }
    p>span{
      font-weight: bold;
    }
  </style>
</head>
<body>
  <h2>사각형의 색상을 선택하세요</h2>
  <hr>
  <button>red</button>
  <button>orange</button>
  <button>yellow</button>
  <button>green</button>
  <button>blue</button>
  <hr>
  <div id="box"></div>
  <p>선택한 색상은 <span id="color">검정색</span>입니다.</p>
  <script>
    var btn = document.getElementsByTagName('button');    
    for(var i=0;i<btn.length;i++){
      btn.onclick = function(){
        var selectedColor = this.value;
        var box = document.getElementById('box');
        box.style.backgroundColor = selectedColor;
        var color = document.getElementById('color');
        color.innerHTML = selectedColor;        
      }
    }
  </script>
</body>
</html>​