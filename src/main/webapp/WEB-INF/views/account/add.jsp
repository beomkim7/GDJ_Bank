<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Account Add</title>
    <!-- 사용전 경로를 꼭 수정 하세요 -->
	<c:import url="../temps/head_css.jsp"></c:import>
	<c:import url="../temps/summernote.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 사용전 경로를 꼭 수정 하세요 -->
			<c:import url="../temps/header.jsp"></c:import>
            <section class="py-5">
            
                <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">AccountAdd</span></h1>
                </div>
                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-11 col-xl-9 col-xxl-8">
                        <form method="POST" enctype="multipart/form-data">
                        <div class="mb-3">
                            <label for="accountNum" class="form-label">accountNum</label>
                            <input type="text" class="form-control" id="accountNum" name="accountNum">
                        </div>

                        <div class="mb-3">
                            <label for="accountPW" class="form-label">accountPW</label>
                            <input type="text" class="form-control" id="accountPW" name="accountPW">
                        </div>


                          <div class="mb-3">
                            <button class="btn btn-primary">등록</button>
                          </div>
                        </form>
                    </div>
                </div>
                
            </section>

        </main>
        <!-- Footer-->
        <!-- 사용전 경로를 꼭 수정 하세요 -->
        <c:import url="../temps/footer.jsp"></c:import>
		<script type="text/javascript">
			$("#contents").summernote();
		</script>
    </body>
</html>
    