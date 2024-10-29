<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
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
    <!-- Favicon and Touch Icons  -->
    <link rel="shortcut icon" href="./assets/images/logo/favicon.png">
<link rel="apple-touch-icon-precomposed" href="./assets/images/logo/favicon.png">
</head>

<body>

    <%@include file="./inc/header.jsp" %>

    <div class="tf-slideshow slider-effect-fade position-relative">
            <div class="swiper tf-sw-slideshow" data-preview="1" data-tablet="1" data-mobile="1" data-centered="false" data-space="0" data-loop="true" data-auto-play="false" data-delay="0" data-speed="1000">
                <div class="swiper-wrapper">
                    <div class="swiper-slide">
                        <div class="wrap-slider">
                            <img src="./assets/images/slider/sneaker-1.jpg" alt="fashion-slideshow">
                            <div class="box-content">
                                <div class="container">
                                    <p class="fade-item fade-item-1 fw-8 mb_15">MUST HAVES</p>
                                    <h1 class="fade-item fade-item-2 fw-8">SUMMER SHOES</h1>
                                    <a href="shop-default.html" class="fade-item fade-item-3 tf-btn btn-fill animate-hover-btn btn-xl radius-3"><span>Shop collection <i class="icon icon-arrow-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="swiper-slide">
                        <div class="wrap-slider">
                            <img src="./assets/images/slider/sneaker-2.jpg" alt="fashion-slideshow">
                            <div class="box-content">
                                <div class="container">
                                    <p class="fade-item fade-item-1 fw-8 mb_15">FREE SHIPPING</p>
                                    <h1 class="fade-item fade-item-2 fw-8">NIKE AIR MAX 1</h1>
                                    <a href="shop-default.html" class="fade-item fade-item-3 tf-btn btn-fill animate-hover-btn btn-xl radius-3"><span>Shop collection <i class="icon icon-arrow-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="swiper-slide">
                        <div class="wrap-slider">
                            <img src="./assets/images/slider/sneaker-3.jpg" alt="fashion-slideshow">
                            <div class="box-content">
                                <div class="container">
                                    <p class="fade-item fade-item-1 fw-8 mb_15">10% OFF TODAY</p>
                                    <h1 class="fade-item fade-item-2 fw-8">STAN SMITH</h1>
                                    <a href="shop-default.html" class="fade-item fade-item-3 tf-btn btn-fill animate-hover-btn btn-xl radius-3"><span>Shop collection <i class="icon icon-arrow-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="wrap-pagination">
                <div class="container">
                    <div class="sw-dots sw-pagination-slider rectangle-pagination"></div>
                </div>
            </div>
        </div>
   <section class="flat-spacing-9">
    <div class="container">
        <div class="position-relative">
            <div class="sw-pagination-wrapper">
                <div class="swiper tf-sw-collection" data-preview="4" data-tablet="3" data-mobile="1" data-space-lg="30" data-space-md="30" data-space="15" data-loop="false" data-auto-play="false">
                    
                    <div class="swiper-wrapper">
                        <!-- Move the loop outside swiper-slide -->
                        <c:forEach items="${newsProductList}" var="product">
                            <div class="swiper-slide" lazy="true">
                                <div class="collection-item hover-img style-2">
                                    <a href="ProductServlet?productId=${product.id}" class="collection-image img-style radius-10">
                                        <img  data-src="${product.thumbnail}" src="${product.thumbnail}" alt="collection-img">
                                    </a>
                                    <div class="collection-content justify-content-end align-items-center">
                                        <div class="bottom">
                                            <a href="shop-collection-sub.html" class="tf-btn collection-title hover-icon btn-light fs-14 fw-7 rounded-0">
                                                <span>ALL SNEAKERS</span><i class="icon icon-arrow1-top-left"></i>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="box-sw-navigation">
                    <div class="sw-dots style-2 small sw-pagination-collection justify-content-center"></div>
                </div>
            </div>
        </div>
    </div>
</section>

    <section class="flat-spacing-9 pt_0">
            <div class="container">
                <div class="swiper tf-sw-brand" data-loop="false" data-play="false" data-preview="6" data-tablet="3" data-mobile="2" data-space-lg="0" data-space-md="0">
                    <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-01.png" src="images/brand/brand-01.png" alt="image-brand">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-02.png" src="images/brand/brand-02.png" alt="image-brand">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-03.png" src="images/brand/brand-03.png" alt="image-brand">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-04.png" src="images/brand/brand-04.png" alt="image-brand">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-05.png" src="images/brand/brand-05.png" alt="image-brand">
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="brand-item">
                                    <img class="lazyload" data-src="./assets/images/brand/brand-06.png" src="images/brand/brand-06.png" alt="image-brand">
                                </div>
                            </div>
                    </div>
                </div>
                <div class="sw-dots style-2 sw-pagination-brand justify-content-center"></div>
            </div>
        </section>
    <section class="flat-spacing-14 pt_0">
            <div class="container">
                <div class="masonry-layout-v4 wow fadeInUp" data-wow-delay="0s">
                    <div class="item-1 collection-item-v2 hover-img">
                        <a href="shop-collection-sub.html" class="collection-inner">
                            <div class="collection-image img-style">
                                <img class="lazyload" data-src="./assets/images/collections/sneaker-5.jpg" src="images/collections/sneaker-5.jpg" alt="collection-img">
                            </div>
                            <div class="collection-content">
                                <div class="top wow fadeInUp" data-wow-delay="0s">
                                    <h5 class="heading text-white fw-7">MEN COLLECTION</h5>
                                    <p class="subheading text-white">Every piece is made to last beyond the season</p>
                                    <button class="tf-btn btn-line btn-line-light collection-other-link fw-6"><span>SHOP COLLECTION</span><i class="icon icon-arrow1-top-left"></i></button>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="item-2 collection-item-v2 hover-img">
                        <a href="shop-collection-sub.html" class="collection-inner">
                            <div class="collection-image img-style">
                                <img class="lazyload" data-src="./assets/images/collections/sneaker-6.jpg" src="images/collections/sneaker-6.jpg" alt="collection-img">
                            </div>
                            <div class="collection-content justify-content-end">
                                <div class="bottom wow fadeInUp" data-wow-delay="0s">
                                    <h5 class="heading text-white fw-7">WOMEN COLLECTION</h5>
                                    <button class="tf-btn btn-line btn-line-light collection-other-link fw-6"><span>SHOP COLLECTION</span><i class="icon icon-arrow1-top-left"></i></button>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="item-3 collection-item-v2 hover-img">
                        <a href="shop-collection-sub.html" class="collection-inner">
                            <div class="collection-image img-style">
                                <img class="lazyload" data-src="./assets/images/collections/sneaker-7.jpg" src="images/collections/sneaker-7.jpg" alt="collection-img">
                            </div>
                            <div class="collection-content justify-content-end">
                                <div class="bottom wow fadeInUp" data-wow-delay="0s">
                                    <h5 class="heading text-white fw-7">KID COLLECTION</h5>
                                    <button class="tf-btn btn-line btn-line-light collection-other-link fw-6"><span>SHOP COLLECTION</span><i class="icon icon-arrow1-top-left"></i></button>
                                </div>
                            </div>
                        </a>
                    </div> 
                </div>
            </div>
        </section>
     <section class="flat-spacing-12 pt_0">
            <div class="container">
                <div class="row align-items-center flex-md-row-reverse">
                    <div class="col-md-6">
                        <div class="collection-item-v2 hover-img">
                            <a href="shop-collection-sub.html" class="collection-inner">
                                <div class="collection-image img-style">
                                    <img class="lazyload" data-src="./assets/images/collections/sneaker-8.jpg" src="images/collections/sneaker-8.jpg" alt="collection-img">
                                </div>
                                <div class="collection-content justify-content-end">
                                    <div class="bottom wow fadeInUp" data-wow-delay="0s">
                                        <h5 class="heading text-white fw-7">SEASON COLLECTION</h5>
                                        <p class="subheading text-white">Every piece is made to last beyond the season</p>
                                        <button class="tf-btn btn-line btn-line-light collection-other-link fw-6"><span>SHOP COLLECTION</span><i class="icon icon-arrow1-top-left"></i></button>
                                    </div>
                                </div>
                            </a>
                        </div> 
                    </div>
                    <div class="col-md-6">
                        <div class="tf-grid-layout tf-col-2 gap30 row-gap-10">
                            <c:forEach items="${hotProductList}" var="product">
                            <div class="card-product">
                                
                                <div class="card-product-wrapper rounded-0">
                                    <a href="ProductServlet?productId=${product.id}" class="product-img ">
                                        <img class="" src="${product.thumbnail}" alt="image-product">
                                       
                                    </a>
                                    <div class="list-product-btn absolute-2">
                                        <a href="CartServlet" data-bs-toggle="modal" class="box-icon quick-add tf-btn-loading">
                                            <span class="icon icon-bag"></span>
                                            <span class="tooltip">Add to cart</span>
                                        </a>
                                        <a href="javascript:void(0);" class="box-icon wishlist btn-icon-action">
                                            <span class="icon icon-heart"></span>
                                            <span class="tooltip">Add to Wishlist</span>
                                            <span class="icon icon-delete"></span>
                                        </a>
                                        <a href="#compare" data-bs-toggle="offcanvas" aria-controls="offcanvasLeft" class="box-icon compare btn-icon-action">
                                            <span class="icon icon-compare"></span>
                                            <span class="tooltip">Add to Compare</span>
                                            <span class="icon icon-check"></span>
                                        </a>
                                        <a href="#quick_view" data-bs-toggle="modal" class="box-icon quickview tf-btn-loading">
                                            <span class="icon icon-view"></span>
                                            <span class="tooltip">Quick View</span>
                                        </a>
                                    </div>
                                    <div class="on-sale-wrap text-end">
                                        <div class="on-sale-item">-1%</div>
                                    </div>
                                </div>
                                <div class="card-product-info">
                                    <a href="product-detail.html" class="title link fw-8">${product.name}</a>
                                    <span class="price fw-6">$${product.price}</span>
                                    <ul class="list-color-product">
                                        <li class="list-color-item color-swatch active">
                                            <span class="tooltip">Black</span>
                                            <span class="swatch-value bg_dark"></span>
                                            <img class="lazyload" data-src="./assets/images/products/sneaker-3.png" src="images/products/sneaker-3.png" alt="image-product">
                                        </li>
                                       
                                    </ul>
                                </div>
                            </div>         
 
                         </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    <section>
            <div class="container">
                <div class="wrap-lookbook lookbook-sneaker">
                    <div class="image radius-10 o-hidden">
                        <img class="lazyload" data-src="./assets/images/collections/sneaker-lb.jpg" src="images/collections/sneaker-lb.jpg" alt="image-lookbook">
                    </div>
                    <div class="lookbook-item item-1">
                        <div class="inner">
                            <div class="btn-group dropdown dropup dropdown-center">
                                <button class="tf-pin-btn pin-black" data-bs-toggle="dropdown" aria-expanded="false">
                                    <span></span>
                                </button>
                                <ul class="dropdown-menu p-0 border-0">
                                    <li>
                                        <div class="lookbook-product">
                                            <a href="product-detail.html" class="image">
                                                <img class="lazyload" data-src="./assets/images/products/sneaker-2.jpg" src="images/products/sneaker-2.jpg" alt="lookbook-item">
                                            </a>
                                            <div class="content-wrap">
                                                <div class="product-title">
                                                    <a href="product-detail.html" class="fw-8">REGULAR FIT WINDBREAKER</a>
                                                </div>
                                                <div class="price">$130.00</div>
                                            </div>
                                            <a href="#quick_view" data-bs-toggle="modal" class=""><i class="icon-view"></i></a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="lookbook-item item-2">
                        <div class="inner">
                            <div class="btn-group dropdown dropup dropdown-center">
                                <button class="tf-pin-btn pin-black" data-bs-toggle="dropdown" aria-expanded="false">
                                    <span></span>
                                </button>
                                <ul class="dropdown-menu p-0 border-0">
                                    <li>
                                        <div class="lookbook-product">
                                            <a href="product-detail.html" class="image">
                                                <img class="lazyload" data-src="./assets/images/products/sneaker-1.png" src="images/products/sneaker-1.png" alt="">
                                            </a>
                                            <div class="content-wrap">
                                                <div class="product-title">
                                                    <a href="product-detail.html" class="fw-8">POLAR NIGHT PACK 2 FUSION 2.0</a>
                                                </div>
                                                <div class="price">$99.00</div>
                                            </div>
                                            <a href="#quick_view" data-bs-toggle="modal" class=""><i class="icon-view"></i></a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
   
    <%@include file="./inc/footer.jsp" %>
    <!--<script type="text/javascript" src="./assets/js/bootstrap.min.js"></script>-->
    <script type="text/javascript" src="./assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="./assets/js/swiper-bundle.min.js"></script>
    <script type="text/javascript" src="./assets/js/carousel.js"></script>
    <script type="text/javascript" src="./assets/js/bootstrap-select.min.js"></script>
    <script type="text/javascript" src="./assets/js/lazysize.min.js"></script>
    <script type="text/javascript" src="./assets/js/count-down.js"></script>
    <script type="text/javascript" src="./assets/js/wow.min.js"></script>
    <script type="text/javascript" src="./assets/js/multiple-modal.js"></script>
    <script type="text/javascript" src="./assets/js/main.js"></script>
</body>


</body>

</html>