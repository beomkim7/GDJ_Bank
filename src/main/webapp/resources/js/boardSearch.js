
//Element = <tag명 속성="속성값" >contents</tag명>
const pager = document.getElementsByClassName("pager");
const searchForm = document.getElementById("searchForm");
const page = document.getElementById("page");
const kind = document.getElementById("kind");
const a = document.getElementsByClassName("a");

let k = kind.getAttribute("data-kind");

for(i=0;i<a.length;i++){
    if(a[i].value==k){
        a[i].setAttribute("selected", true);
        break;
    }
}

for(i=0;i<pager.length;i++){
    pager[i].addEventListener("click", (e)=>{
        e.preventDefault();
        let p=e.target.getAttribute("data-page");
        page.value=p;
        searchForm.submit();
    })
}

// for(p of pager){
//     p.addEventListener("click", (e)=>{
//         e.preventDefault();
//         console.log(this);
//         let page = this.getAttribute("data-page");
//         console.log(page);
//         //searchForm.submit();
//     })
// }