<html>
<body>
<table>
<tr>
<td> 
 <canvas id="myCanvas" width="600" height="70"></canvas>
    <script>
      var canvas = document.getElementById('myCanvas');
      var context = canvas.getContext('2d');

      context.font = 'italic 25pt Calibri';
      context.fillText('Java Training Demo', 50, 50);
    </script> 
  </td>
<td><a href=showFaculty.html>Show Faculty</a> | <a href=getProfessorReport.html>Get Professor Report</a>
 | <a href=getProfessors.html>Get Professors</a>
  | <a href=searchProfessor.html>Search Professor</a>
 |  <a href=searchProfessorRecord.html>Search Professor Records</a>
 </td>
</tr>
</table>
<h2>Welcome to the Faculty Site!</h2>



<canvas id="solarCanvas" width="300" height="300"></canvas>

<script>
var r = 50;
var a = 0;
var da = -Math.PI/128;

// create global variables to store the state of planet #2
var r2 = 120;
var a2 = Math.PI;
var da2 = Math.PI/80;

// create global variables to store the state of planet #3
var r3 = 145;
var a3 = Math.PI;
var da3 = Math.PI/200;

// create global variable to store the canvas' drawing context
var ctx;


// declare reusable functions
function init() {
  ctx = document.getElementById('solarCanvas').getContext("2d");
  return setInterval(draw, 10);
}

function drawPlanet(planetRadius, orbitRadius, angle, color)
{
  // draw orbit outline
  ctx.beginPath();
  ctx.arc(150, 150, orbitRadius, 0, Math.PI*2, true); 
  ctx.closePath();
  ctx.stroke();

  // draw planet 2
  ctx.fillStyle = color;
  ctx.beginPath();
  ctx.arc(150+ orbitRadius*Math.cos(angle), 150+Math.sin(angle)* orbitRadius, planetRadius, 0, Math.PI*2, true); 
  ctx.closePath();
  ctx.fill();  
}

function draw() {
  ctx.clearRect(0,0,300,300);
  
  drawPlanet(10, r, a, '#0000FF');
  drawPlanet(16, r2, a2, '#FF0000');
  drawPlanet(5, r3, a3, '#FF31F3');

  // draw sun
  ctx.fillStyle = '#FFFF00';
  ctx.beginPath();
  ctx.arc(150, 150, 20, 0, Math.PI*2, true); 
  ctx.closePath();
  ctx.fill();
  
  
  a += da;
  a2 += da2;
  a3 += da3;
}

    
// start the animation by calling the init function declared earlier
init();
</script>
</body>



</html>
