 console.log("FileManager");

// {/* <div class="input-group">                          
// <input class="form-control" type="file" name="attachs">
// <span class="input-group-text text-danger" id="basic-addon2">x</span>
// </div>    */}

let count = 0 ;
let max = 5;

//------------------JS

// let fileList = document.getElementById("fileList");
// let fileAdd = document.getElementById("fileAdd");
// const del = document.getElementsByClassName("del");

// fileList.addEventListener("click",(e)=>{
//     console.log(e);
//     console.log(e.target);
//     console.log(e.currentTarget);
//     if(e.target.classList.contains('del')){
//         //e.target.parentNode.remove();
//         let id = e.target.getAttribute("data-file-id");
//         document.getElementById(id).remove();
//         count--;
//     }
// })


//     let idx = 0;

//     fileAdd.addEventListener("click",()=>{
//     idx++;
//     let div = document.createElement("div");
//     let ac= document.createAttribute("class");
//     ac.value="input-group";
//     div.setAttributeNode(ac);

//     //id 추가
//     ac = document.createAttribute("id");
//     ac.value = "file"+idx;
    
//     div.setAttributeNode(ac);

//     let child = document.createElement("input");
//     ac=document.createAttribute("class");
//     ac.value="form-control";
//     child.setAttributeNode(ac);
    
//     ac=document.createAttribute("type");
//     ac.value="file";
//     child.setAttributeNode(ac);

//     ac=document.createAttribute("name");
//     ac.value="attachs";
//     child.setAttributeNode(ac);

//     div.appendChild(child);

//     let span = document.createElement("span");
//     let span_class=document.createAttribute("class");
//     let span_id=document.createAttribute("id");
//     let x=document.createTextNode("x")
//     span_class.value="input-group-text text-danger del";
//     span_id.value="basic-addon2"

//     span.setAttributeNode(span_class);
//     span.setAttributeNode(span_id);
//     span.appendChild(x);
 
//     div.appendChild(span);
    
//     ac = document.createAttribute("data-file-id")
//     ac.value="file"+idx;

//     span.appendChild(ac);

//     if(count>=max){    
//         return;
//     }
//     count++;
//     fileList.appendChild(div);
// })

//-----------------------------jquery

count =$("#fileList").attr("data-file-count");
max =$("#fileList").attr("data-file-max");

$("#fileList").on("click",".del",function(){
    $(this).parent().remove();
    count--;
})

$("#fileAdd").click(function(){
    if(count>=max){
        alert('파일은 최대 5개');
        return;
    }
    count++;
    // let element = '<div class="input-group">';
    //  element+='<input class="form-control" type="file" name="attachs">';
    //  element+='<span class="input-group-text text-danger" id="basic-addon2">x</span>';
    //  element+='</div>';

    
    
    let element=`
        <div class="input-group my-3">                          
            <input class="form-control" type="file" name="attachs">
            <span class="input-group-text text-danger del" id="basic-addon2">x</span>
        </div>
    `
     $('#fileList').append(element);
    
})

$(".del").click(()=>{
    console.log("del click");
})