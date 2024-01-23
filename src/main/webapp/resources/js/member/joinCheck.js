console.log('join check');


// js
// const password = document.getElementById('password');
// const passwordResult = document.getElementById('passwordResult');
// const passwordCheck = document.getElementById('passwordCheck');
// const passwordCheckResult = document.getElementById('passwordCheckResult');
// const btn = document.getElementById('btn');
// const username=document.getElementById('username');
// const realname=document.getElementById('realname');
// const email=document.getElementById('email');
// const phone=document.getElementById('phone');
// const address=document.getElementById('address');

// let p1 = false;//password check
// let p2 = false;//passwordCheck check

// password.addEventListener('blur',function(){
//     let p = password.value;
//     if(p.length>7){
//         passwordResult.innerHTML="ok";
//         p1=true;
//     }else{
//         passwordResult.innerHTML="비번은 8글자 이상이어야함";
//         p1=false;
//     }
// })

// passwordCheck.addEventListener('keyup',function(){
//     if(password.value==passwordCheck.value){
//         passwordCheckResult.innerHTML="일치";
//         p2=true;
//     }else{
//         passwordCheckResult.innerHTML="일치하지 않음";
//         p2=false;
//     }
// })


// btn.addEventListener('click',function(){
//     if(p1 && p2){
//         alert('ok');
//     }else{
//         alert('pw check');
//     }


//     // // let p = password.value;
//     // // let pc = passwordCheck.value;
//     // // if(p.length>7){
//     // //     if(p==pc){
//     // //         alert('회원가입 완료');
//     // //     }else if(p != pc){
//     // //         alert('비밀번호 동일 확인');
//     // //     }
//     // // }else{
//     // //     alert('비밀번호는 8자리 이상');
//     // }
// })

//----------------------------------------------------

//jquery

let checks = {p1:false,p2:false}

$('#btn').click(function(){
    let flag = true;
    for(p in checks){
        console.log(p);
        console.log(checks[p]);
        if(!checks[p]){
            flag=false;
            break;
        }
    }

    if(flag){
        alert('ok');
    }else{
        alert('no-----');
    }

})

$('#password').blur(function(){
    if($('#password').val().length>7){
        $('#passwordResult').html('ok');
        p1=true;
    }else{
        $('#passwordResult').html('비밀번호는 8글자 이상');
        p1=false;
    }

    $('#passwordCheck').val('');
    checks.p2=false;
    $('#passwordCheckResult').html('');
});

$('#passwordCheck').keyup(()=>{
    if($('#passwordCheck').val()==$('#password')){
        $('#passwordCheckResult').html('일치');
        p2=true;
    }else{
        $('#passwordCheckResult').html('비밀번호확인');
        p2=false;
    }
});


//-------------------------------------------------------------
