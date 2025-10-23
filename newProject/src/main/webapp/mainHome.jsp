<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<jsp:include page="new.jsp"/>

   <header class="bg-indigo-800 py-24 text-white">
    <div class="container mx-auto text-center px-4">
        <h1 class="text-6xl font-extrabold tracking-tight">
            메인로고
        </h1>
        <p class="text-xl mt-4 opacity-80">
             ~
        </p>
    </div>
	</header>
    
    <main class="container mx-auto px-4 mt-12 mb-20">
    <h2 class="text-2xl font-bold text-gray-800 mb-8">
        주요 기능
    </h2>
    
    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8">
        
        <div class="flex flex-col p-6 shadow-lg rounded-lg border border-gray-100 hover:shadow-xl transition duration-300">
            <h3 class="text-xl font-semibold text-gray-900 mb-4">주요기능</h3>
            <div class="w-1/3 h-1 bg-pink-500 mb-4"></div>
            <p class="text-gray-600 text-sm">
            </p>
        </div>
        
        <div class="flex flex-col p-6 shadow-lg rounded-lg border border-gray-100 hover:shadow-xl transition duration-300">
            <h3 class="text-xl font-semibold text-gray-900 mb-4">주요기능</h3>
            <div class="w-1/3 h-1 bg-pink-500 mb-4"></div>
            <p class="text-gray-600 text-sm">
            </p>
        </div>
        
        <div class="flex flex-col p-6 shadow-lg rounded-lg border border-gray-100 hover:shadow-xl transition duration-300">
            <h3 class="text-xl font-semibold text-gray-900 mb-4">주요기능</h3>
            <div class="w-1/3 h-1 bg-pink-500 mb-4"></div>
            <p class="text-gray-600 text-sm">
            </p>
        </div>
        
        <div class="flex flex-col p-6 shadow-lg rounded-lg border border-gray-100 hover:shadow-xl transition duration-300">
            <h3 class="text-xl font-semibold text-gray-900 mb-4">주요기능</h3>
            <div class="w-1/3 h-1 bg-pink-500 mb-4"></div>
            <p class="text-gray-600 text-sm">
            </p>
        </div>
        
    </div>
</main>
</body>
</html>