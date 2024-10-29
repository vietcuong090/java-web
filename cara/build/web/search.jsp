<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US">
<!-- Mirrored from themesflat.co/html/ecomus/home-sneaker.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 02 Sep 2024 12:32:23 GMT -->
<head>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
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

    <!-- Favicon and Touch Icons  -->
    <link rel="shortcut icon" href="./assets/images/logo/favicon.png">
<link rel="apple-touch-icon-precomposed" href="./assets/images/logo/favicon.png">
</head>

    <body>

        <%@include file="./inc/header.jsp" %>
        <section id="page-header">
            <div class="tf-page-title">
            <div class="container-full">
                <div class="row">
                    <div class="col-12">
                        <div class="heading text-center">#${keyword}</div>
                        <p class="text-center text-2 text_black-2 mt_5">Shop through our latest selection of Fashion</p> 
                    </div>
                </div>
            </div>
        </section>
       
        </div>
        <section class="flat-spacing-1">
    <div class="container">
        <div class="row"> <!-- Thêm l?p 'row' ?? t?o l??i -->
            <c:forEach items="${productList}" var="product">
                <div class="col-lg-3 col-md-4 col-sm-6 mb-4"> <!-- S? d?ng các l?p c?t ?? s?n ph?m n?m ngang -->
                    <div class="card-product style-3">
                        <div class="card-product-wrapper">
                            <a href="ProductServlet?productId=${product.id}" class="product-img">
                                <img class="lazyload img-product" src="${product.thumbnail}" alt="image-product">
                            </a>
                            <div class="list-product-btn column-right">
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
                            <div class="list-product-btn absolute-3">
                                <a href="#quick_add" data-bs-toggle="modal" class="box-icon bg_white quick-add tf-btn-loading style-2">
                                    <span class="icon icon-bag"></span>
                                    <span class="text">QUICK ADD</span>
                                </a>
                            </div>
                            <div class="size-list style-2">
                                <span>S</span>
                                <span>M</span>
                                <span>L</span>
                                <span>XL</span>
                            </div>
                        </div>
                        <div class="card-product-info">
                            <a href="product-detail.html" class="title link">${product.name}</a>
                            <span class="price">$${product.price}</span>
                            <ul class="list-color-product">
                                <li class="list-color-item color-swatch active">
                                    <span class="tooltip">Orange</span>
                                    <span class="swatch-value bg_orange-3"></span>
                                    <img class="lazyload" data-src="./assets/images/products/orange-1.jpg" src="./assets/images/products/orange-1.jpg" alt="image-product">
                                </li>
                                <li class="list-color-item color-swatch">
                                    <span class="tooltip">Black</span>
                                    <span class="swatch-value bg_dark"></span>
                                    <img class="lazyload" data-src="./assets/images/products/black-1.jpg" src="./assets/images/products/black-1.jpg" alt="image-product">
                                </li>
                                <li class="list-color-item color-swatch">
                                    <span class="tooltip">White</span>
                                    <span class="swatch-value bg_white"></span>
                                    <img class="lazyload" data-src="./assets/images/products/white-1.jpg" src="./assets/images/products/white-1.jpg" alt="image-product">
                                </li>
                            </ul>
                        </div>
                    </div>
                </div> <!-- ?óng l?p c?t -->
            </c:forEach>
        </div> <!-- ?óng l?p row -->
    </div>
</section>


        <%@include file="./inc/footer.jsp" %>
    </body>

</html>
