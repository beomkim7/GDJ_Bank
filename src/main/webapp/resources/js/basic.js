//js
const b1 = document.getElementById("b1");
const b2 = document.querySelector("#b2");

b1.addEventListener("click",()=>{

})
let v= b1.innerHTML;
b1.innerHTML='test';
//jquery
//$("선택자").action()
$("#b1").click(()=>{


});

$("#b2").on("click",()=>{

});

$("#b1").html();//text()
$("#b1").html("test");

$("#b1").sttr("속성명");
$("#b1").sttr("속성명","값");

$("#b1").prop("속성명")