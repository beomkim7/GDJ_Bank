<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

			<table class="table table-hover">
				<thead>
					<tr class="table-dark">
						<th>replyNum</th>
						<th>userName</th>
						<th>replyContents</th>
						<th>replyDate</th>
						<th>replyJumsu</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td>${dto.replyNum}</td>
							<td>${dto.userName}</td>
							<td>${dto.replyContents}</td>
							<td>${dto.replyDate}</td>
							<td>${dto.replyJumsu}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>
				<button id="more" data-replyList-page="${pager.page}">더보기(${pager.page}/${pager.totalPage})</button>
			</div>
			
			<div>
				<c:forEach begin="${pager.startNum}" end="${pager.lastNum }" var="i">
					<h3>${i}</h3>
				</c:forEach>
			</div>