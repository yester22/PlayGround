<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="UTF-8">
	<title>ê³ ê°ëª©ë¡</title>
	<script src="/resources/vue/vue.min.js"></script>
	<link href="/webjars/bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet"> 
	<script src="/webjars/bootstrap/4.1.2/js/bootstrap.min.js?v=iTdcQLdhilorfQsoxwYdUx39Ev8f-pgcBu51zsXdT2o1"></script>
	<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
	
	
	<script src="/js/popup.js"></script> 
</head>
<body>
 	<div id="divList" class="container">
		<div id="btArea" align="right">
			<a class="btn btn-warning" v-on:click="search()" id="searchList" href="#">Search</a>
			<a class="btn btn-warning" v-on:click="write()" href="#">Write</a>
		</div>
		<table id="customerList" class="table table-striped table-bordered table-condensed">
			<colgroup>
				<col width="50px" />
				<col width="80px" />
				<col width="200px" />
				<col width="*" />
				<col width="150px" />
				<col width="150px" />
				<col width="100px" />
			</colgroup>
			<thead>
				<tr>
					<th><input type="checkbox" id="allCheck" name="allCheck" /></th>
					<th>ìë²</th>
					<th>ì ëª©</th>
					<th>ììí¬ì§ì</th>
					<th>ììì¼ì</th>
					<th>ì¢ë£ì¼ì</th>
					<th>ì¬ì©ì ë¬´</th>
				</tr>
			</thead>
			<tbody id="tbPopup">
			
				<template v-if="results.length > 0">
					<tr v-for="item in results">
						<td></td>
						<td>{{ item.popupId }}</td>
						<td>{{ item.popupName }}</td>						
						<td>{{ item.startX + ',' + item.startY }}</td>						
						<td>{{ item.startDate }}</td>						
						<td>{{ item.endDate }}</td>						
						<td>{{ item.useYn }}</td>						
					</tr>
				</template>
				
				<template v-else>
					<tr>
						<td colspan="7" align="center">ë°ì´í°ê° ììµëë¤</td>
					</tr>
				</template>
			
			</tbody>
		</table>
		<form id="actionForm" method="post"></form>
	</div>
	
	
	<div id="divWrite" class="container border" style="display:none;">
		<form id="writeForm" class="form-horizontal" role="form">
			<input type="hidden" id="write_popupId" name="popupId" />
			<input type="hidden" id="mode" name="mode" />
			
			<div style="height:10px;"></div>
			
			<div class="form-group row">
    			<label for="inputPassword" class="col-sm-2 col-form-label">íìëª</label>
    			<div class="col-sm-10">
			    	<input type="text" class="form-control" id="popupName" placeholder="íìëª">
			    </div>
  			</div>
			<div class="form-group row">
    			<label for="divOptions" class="col-sm-2 col-form-label">íì íì</label>
    			<div class="col-sm-10">
    				<select id="divOptions" class="form-control">
    					<template v-if="codeList.length > 0">
	  						<option v-for="item in codeList">{{ item.codeNm }}</option>
						</template>
					</select>
			    </div>
  			</div>
			<div class="form-group row">
    			<label for="divOptions" class="col-sm-2 col-form-label">ë´ì©</label>
    			<div class="col-sm-10">
    				 <div id="summernote"></div>
				</div>
			</div>
						
			<div id="btArea" align="right">
				<a class="btn btn-warning" v-on:click="write()" href="#">ë±ë¡</a>
				<a class="btn btn-warning" v-on:click="cancelWrite()" href="#">ì·¨ì</a>
			</div>
			
		</form>
	</div>
	
	
</body>
</html>			