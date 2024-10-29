<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US">
<!-- Mirrored from themesflat.co/html/ecomus/home-sneaker.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 02 Sep 2024 12:32:23 GMT -->
<head>
    <meta charset="utf-8">
    <title>Ecomus - Ultimate HTML</title>

    <meta name="author" content="themesflat.com">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

   <!-- font -->
   <link rel="stylesheet" href="./assets/fonts/fonts.css">
   <link rel="stylesheet" href="./assets/fonts/font-icons.css">
   <link rel="stylesheet" href="./assets/css/bootstrap.min.css">
   <link rel="stylesheet" href="./assets/css/swiper-bundle.min.css">
   <link rel="stylesheet" href="./assets/css/animate.css">
   <link rel="stylesheet"type="text/css" href="./assets/css/styles.css"/>
   <link rel="stylesheet"type="text/css" href="./assets/css/shop.css"/>
    <!-- Favicon an<link rel="stylesheet"type="text/css" href="./assets/css/styles.css"/>d Touch Icons  -->
    <link rel="shortcut icon" href="./assets/images/logo/favicon.png">
<link rel="apple-touch-icon-precomposed" href="./assets/images/logo/favicon.png">
</head>

    <body>

        <%@include file="./inc/header.jsp" %>
        <div class="tf-page-title">
            <div class="container-full">
                <div class="row">
                    <div class="col-12">
                        <div class="heading text-center">New Arrival</div>
                        <p class="text-center text-2 text_black-2 mt_5">Shop through our latest selection of Fashion</p> 
                    </div>
                </div>
            </div>
        </div>

        <section class="flat-spacing-1">
            <div class="container">
                <div class="tf-shop-control grid-3 align-items-center">
                    <div class="tf-control-filter">
                        <a href="#filterShop" data-bs-toggle="offcanvas" aria-controls="offcanvasLeft" class="tf-btn-filter"><span class="icon icon-filter"></span><span class="text">Filter</span></a>
                    </div>
                    <ul class="tf-control-layout d-flex justify-content-center">
                        <li class="tf-view-layout-switch sw-layout-2" data-value-grid="grid-2">
                            <div class="item"><span class="icon icon-grid-2"></span></div>
                        </li>
                        <li class="tf-view-layout-switch sw-layout-3" data-value-grid="grid-3">
                            <div class="item"><span class="icon icon-grid-3"></span></div>
                        </li>
                        <li class="tf-view-layout-switch sw-layout-4 active" data-value-grid="grid-4">
                            <div class="item"><span class="icon icon-grid-4"></span></div>
                        </li>
                        <li class="tf-view-layout-switch sw-layout-5" data-value-grid="grid-5">
                            <div class="item"><span class="icon icon-grid-5"></span></div>
                        </li>
                        <li class="tf-view-layout-switch sw-layout-6" data-value-grid="grid-6">
                            <div class="item"><span class="icon icon-grid-6"></span></div>
                        </li>
                    </ul>
                    
                </div>
                
                
                <div class="grid-layout wrapper-shop" data-grid="grid-4">
                    <c:forEach items="${productList}" var="product">
                    <!-- card product 1 -->
                    <div class="card-product">                       
                        <div class="card-product-wrapper">
                            <a href="ProductServlet?productId=${product.id}" class="product-img">
                                <img src="${product.thumbnail}" alt="image-product">                               
                            </a>
                            <div class="list-product-btn absolute-2">
                                <a href="#quick_add" data-bs-toggle="modal" class="box-icon bg_white quick-add tf-btn-loading">
                                    <span class="icon icon-bag"></span>
                                    <span class="tooltip">Quick Add</span>
                                </a>
                                <a href="javascript:void(0);" class="box-icon bg_white wishlist btn-icon-action">
                                    <span class="icon icon-heart"></span>
                                    <span class="tooltip">Add to Wishlist</span>
                                    <span class="icon icon-delete"></span>
                                </a>
                                <a href="#compare" data-bs-toggle="offcanvas" aria-controls="offcanvasLeft" class="box-icon bg_white compare btn-icon-action">
                                    <span class="icon icon-compare"></span>
                                    <span class="tooltip">Add to Compare</span>
                                    <span class="icon icon-check"></span>
                                </a>
                                <a href="#quick_view" data-bs-toggle="modal" class="box-icon bg_white quickview tf-btn-loading">
                                    <span class="icon icon-view"></span>
                                    <span class="tooltip">Quick View</span>
                                </a>
                            </div>
                        </div>
                                
                        <div class="card-product-info">
                            <a href="product-detail.html" class="title link">${product.name}</a>
                            <span class="price">$16.95</span>
                            <ul class="list-color-product">
                                <li class="list-color-item color-swatch active">
                                    <span class="tooltip">Orange</span>
                                    <span class="swatch-value bg_orange-3"></span>
                                    <img class="lazyload" data-src="images/products/orange-1.jpg" src="images/products/orange-1.jpg" alt="image-product">
                                </li>
                                <li class="list-color-item color-swatch">
                                    <span class="tooltip">Black</span>
                                    <span class="swatch-value bg_dark"></span>
                                    <img class="lazyload" data-src="images/products/black-1.jpg" src="images/products/black-1.jpg" alt="image-product">
                                </li>
                                <li class="list-color-item color-swatch">
                                    <span class="tooltip">White</span>
                                    <span class="swatch-value bg_white"></span>
                                    <img class="lazyload" data-src="images/products/white-1.jpg" src="images/products/white-1.jpg" alt="image-product">
                                </li>
                            </ul>
                        </div>                              
                    </div>   
                    </c:forEach>
                    </div>
                     
                </div>           
                <!-- pagination -->
                <section id="pagination" class="section-p1">
                <c:forEach var="i" begin ="1" end="${numberPage + 1}">
                <ul class="tf-pagination-wrap tf-pagination-list">
                    <li <c:if test ="${i==page}"> class="active" </c:if>>
                        <a href="ShopServlet?page=${i}" class="pagination-link">${i}</a>
                    </li>
                    
                </ul>
                </c:forEach>
               </section>                         
        </section>

        <%@include file="./inc/footer.jsp" %>
<script defer type="text/javascript" src="./assets/js/bootstrap.min.js"></script>
<script defer type="text/javascript" src="./assets/js/jquery.min.js"></script>
<script defer type="text/javascript" src="./assets/js/swiper-bundle.min.js"></script>
<script defer type="text/javascript" src="./assets/js/carousel.js"></script>
<script defer type="text/javascript" src="./assets/js/count-down.js"></script>
<script defer type="text/javascript" src="./assets/js/bootstrap-select.min.js"></script>
<script defer type="text/javascript" src="./assets/js/lazysize.min.js"></script>
<script defer type="text/javascript" src="./assets/js/bootstrap-select.min.js"></script>
<script defer type="text/javascript" src="./assets/js/drift.min.js"></script>
<script defer type="text/javascript" src="./assets/js/wow.min.js"></script>
<script defer type="text/javascript" src="./assets/js/main.js"></script>
<script defer type="module" src="./assets/js/model-viewer.min.js"></script>
<script defer type="module" src="./assets/js/zoom.js"></script>

    </body>

</html>

