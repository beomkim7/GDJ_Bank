console.log("되냐");
const checkAll = document.getElementById("checkAll");
const checks = document.getElementsByClassName("checks");






checkAll.addEventListener('change',function(event){
    const state = event.target.checked;
    for(let i = 0;i<checks.length;i++){
        checks[i].checked=state;
    }
});

for(let c of checks){
    c.addEventListener("click",function(){
        console.log(this.checked);
      
        if(checks[i]!=false){
            checkAll.checked=false;
        }else{
            checkAll.checked=true;
        }
    })
}




//jquery
// $('#checkAll').click(()=>{
//     let v = $('#checkAll').prop("checked");
   
//     $('.checks').prop("checked",v);
// });

// $('.checks').click(function(){
//     console.log($(this).prop("checked"));
// })