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
    <c:if test="${not empty product}">
    <section class="flat-spacing-4 pt_0">
    <div class="tf-main-product section-image-zoom">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="tf-product-media-wrap sticky-top">
                        <div class="thumbs-slider">
                            <div class="swiper tf-product-media-thumbs other-image-zoom" data-direction="vertical">
                                <div class="swiper-wrapper stagger-wrap">                                   
                                    <div class="swiper-slide stagger-item">
                                        <div class="item">
                                            <img class="lazyload" src="${product.thumbnail}" alt="img-compare">
                                        </div>
                                    </div>
                                    <div class="swiper-slide stagger-item">
                                        <div class="item">
                                            <img class="lazyload"  src="./assets/images/products/sneaker-10.png" alt="img-compare">
                                        </div>
                                    </div>
                                    <div class="swiper-slide stagger-item">
                                        <div class="item">
                                            <img class="lazyload" data-src="./assets/images/products/sneaker-9.png" src="./assets/images/shop/products/hmgoepprod3.jpg" alt="img-compare">
                                        </div>
                                    </div>
                                    <div class="swiper-slide stagger-item">
                                        <div class="item">
                                            <img class="lazyload" src="./assets/images/products/sneaker-8.jpg" alt="img-compare">
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                            <div class="swiper tf-product-media-main" id="gallery-swiper-started">
                                <div class="swiper-wrapper" >
                                    <div class="swiper-slide">
                                        <a href="images/shop/products/p-d1.png" target="_blank" class="item" data-pswp-width="770px" data-pswp-height="1075px">
                                            <img class="tf-image-zoom lazyload" src="${product.thumbnail}" alt="">
                                        </a>
                                    </div>
                                    
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
                     
                <div class="col-md-6">
                    <form action="CartServlet" method="post" class="single-pro-details">
                        <input type="hidden" name="action" value="create"/>
                        <input type="hidden" name="product_id" value="${product.id}"/>
                        <input type="hidden" name="price" value="${product.price}"/>
                    <div class="tf-product-info-wrap position-relative">
                        <div class="tf-zoom-main"></div>
                        <div class="tf-product-info-list other-image-zoom">
                            <div class="tf-product-info-title">
                                <h5>${product.name}</h5>
                            </div>
                            <div class="tf-product-info-badges">
                                <div class="badges">Best seller</div>
                                <div class="product-status-content">
                                    <i class="icon-lightning"></i>
                                    <p class="fw-6">Selling fast! 56 people have  this in their carts.</p>
                                </div>
                            </div>
                            <div class="tf-product-info-price">
                                <div class="price-on-sale">$${product.price}</div>
                                <div class="compare-at-price">$10.00</div>
                                <div class="badges-on-sale"><span>20</span>% OFF</div>
                            </div>
                            <div class="tf-product-info-liveview">
                                <div class="liveview-count">20</div>
                                <p class="fw-6">People are viewing this right now</p>
                            </div>
                            <div class="tf-product-info-countdown">
                                <div class="countdown-wrap">
                                    <div class="countdown-title">
                                        <i class="icon-time tf-ani-tada"></i>
                                        <p>HURRY UP! SALE ENDS IN:</p>
                                    </div>
                                    <div class="tf-countdown style-1">
                                        <div class="js-countdown" data-timer="1007500" data-labels="Days :,Hours :,Mins :,Secs"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="tf-product-info-variant-picker">
                                <div class="variant-picker-item">
                                    <div class="variant-picker-label">
                                        Color: <span class="fw-6 variant-picker-label-value">Beige</span>
                                    </div>
                                    <div class="variant-picker-values">
                                        <input id="values-beige" type="radio" name="color1" checked>
                                        <label class="hover-tooltip radius-60" for="values-beige" data-value="Beige">
                                            <span class="btn-checkbox bg-color-beige"></span>
                                            <span class="tooltip">Beige</span>
                                        </label>
                                        <input id="values-black" type="radio" name="color1">
                                        <label class=" hover-tooltip radius-60" for="values-black" data-value="Black">
                                            <span class="btn-checkbox bg-color-black"></span>
                                            <span class="tooltip">Black</span>
                                        </label>
                                        <input id="values-blue" type="radio" name="color1">
                                        <label class="hover-tooltip radius-60" for="values-blue" data-value="Blue">
                                            <span class="btn-checkbox bg-color-blue"></span>
                                            <span class="tooltip">Blue</span>
                                        </label>
                                        <input id="values-white" type="radio" name="color1">
                                        <label class="hover-tooltip radius-60" for="values-white" data-value="White">
                                            <span class="btn-checkbox bg-color-white"></span>
                                            <span class="tooltip">White</span>
                                        </label>
                                    </div>
                                </div>
                                <div class="variant-picker-item">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="variant-picker-label">
                                            Size: <span class="fw-6 variant-picker-label-value">S</span>
                                        </div>
                                        
                                    </div>
                                    <div class="variant-picker-values">
                                        <input type="radio" name="size1" id="values-s" checked>
                                        <label class="style-text" for="values-s" data-value="S">
                                            <p>S</p>
                                        </label>
                                        <input type="radio" name="size1" id="values-m">
                                        <label class="style-text" for="values-m" data-value="M">
                                            <p>M</p>
                                        </label>
                                        <input type="radio" name="size1" id="values-l">
                                        <label class="style-text" for="values-l" data-value="L">
                                            <p>L</p>
                                        </label>
                                        <input type="radio" name="size1" id="values-xl">
                                        <label class="style-text" for="values-xl" data-value="XL">
                                            <p>XL</p>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="tf-product-info-quantity">
                                <div class="quantity-title fw-6">Quantity</div>
                                <div class="wg-quantity">
                                    <span class="btn-quantity minus-btn">-</span>
                                    <input name="quantity" type="number" value="1" min="1">
                                    <span class="btn-quantity plus-btn">+</span>
                                </div>
                            </div>
                            <div class="tf-product-info-buy-button d-flex align-items-center justify-content-between">
                            <!-- Nút "Add to cart" -->
                             <button type="submit" class="tf-btn btn-fill justify-content-center fw-6 fs-16 flex-grow-1 animate-hover-btn btn btn-dark w-100">
                                <span>Add to cart</span>
                            </button>
                            <div class="d-flex ms-2">
                                <a href="javascript:void(0);" class="tf-product-btn-wishlist hover-tooltip btn btn-outline-secondary p-2 me-2 d-flex align-items-center justify-content-center">
                                    <span class="icon icon-heart"></span>
                                </a>
                                <!-- Icon Compare -->
                                <a href="#compare" data-bs-toggle="offcanvas" aria-controls="offcanvasLeft" class="tf-product-btn-wishlist hover-tooltip btn btn-outline-secondary p-2 d-flex align-items-center justify-content-center">
                                    <span class="icon icon-compare"></span>
                                </a>
                            </div>
                            </div>

                            <div class="tf-product-info-extra-link">
                                <a href="#compare_color" data-bs-toggle="modal" class="tf-product-extra-icon">
                                    <div class="icon">
                                        <img src="images/item/compare.svg" alt="">
                                    </div>
                                    <div class="text fw-6">Compare color</div>
                                </a>
                                <a href="#ask_question" data-bs-toggle="modal" class="tf-product-extra-icon">
                                    <div class="icon">
                                        <i class="icon-question"></i>
                                    </div>
                                    <div class="text fw-6">Ask a question</div>
                                </a>
                                <a href="#delivery_return" data-bs-toggle="modal" class="tf-product-extra-icon">
                                    <div class="icon">
                                        <svg class="d-inline-block" xmlns="http://www.w3.org/2000/svg" width="22" height="18" viewBox="0 0 22 18" fill="currentColor"><path d="M21.7872 10.4724C21.7872 9.73685 21.5432 9.00864 21.1002 8.4217L18.7221 5.27043C18.2421 4.63481 17.4804 4.25532 16.684 4.25532H14.9787V2.54885C14.9787 1.14111 13.8334 0 12.4255 0H9.95745V1.69779H12.4255C12.8948 1.69779 13.2766 2.07962 13.2766 2.54885V14.5957H8.15145C7.80021 13.6052 6.85421 12.8936 5.74468 12.8936C4.63515 12.8936 3.68915 13.6052 3.33792 14.5957H2.55319C2.08396 14.5957 1.70213 14.2139 1.70213 13.7447V2.54885C1.70213 2.07962 2.08396 1.69779 2.55319 1.69779H9.95745V0H2.55319C1.14528 0 0 1.14111 0 2.54885V13.7447C0 15.1526 1.14528 16.2979 2.55319 16.2979H3.33792C3.68915 17.2884 4.63515 18 5.74468 18C6.85421 18 7.80021 17.2884 8.15145 16.2979H13.423C13.7742 17.2884 14.7202 18 15.8297 18C16.9393 18 17.8853 17.2884 18.2365 16.2979H21.7872V10.4724ZM16.684 5.95745C16.9494 5.95745 17.2034 6.08396 17.3634 6.29574L19.5166 9.14894H14.9787V5.95745H16.684ZM5.74468 16.2979C5.27545 16.2979 4.89362 15.916 4.89362 15.4468C4.89362 14.9776 5.27545 14.5957 5.74468 14.5957C6.21392 14.5957 6.59575 14.9776 6.59575 15.4468C6.59575 15.916 6.21392 16.2979 5.74468 16.2979ZM15.8298 16.2979C15.3606 16.2979 14.9787 15.916 14.9787 15.4468C14.9787 14.9776 15.3606 14.5957 15.8298 14.5957C16.299 14.5957 16.6809 14.9776 16.6809 15.4468C16.6809 15.916 16.299 16.2979 15.8298 16.2979ZM18.2366 14.5957C17.8853 13.6052 16.9393 12.8936 15.8298 12.8936C15.5398 12.8935 15.252 12.943 14.9787 13.04V10.8511H20.0851V14.5957H18.2366Z"></path></svg>
                                    </div>
                                    <div class="text fw-6">Delivery & Return</div>
                                </a>
                                <a href="#share_social" data-bs-toggle="modal" class="tf-product-extra-icon">
                                    <div class="icon">
                                        <i class="icon-share"></i>
                                    </div>
                                    <div class="text fw-6">Share</div>
                                </a>
                            </div>
                            <div class="tf-product-info-delivery-return">
                                <div class="row">
                                    <div class="col-xl-6 col-12">
                                        <div class="tf-product-delivery">
                                            <div class="icon">
                                                <i class="icon-delivery-time"></i>
                                            </div>
                                            <p>Estimate delivery times: <span class="fw-7">12-26 days</span> (International), <span class="fw-7">3-6 days</span> (United States).</p>
                                        </div>
                                    </div>
                                    <div class="col-xl-6 col-12">
                                        <div class="tf-product-delivery mb-0">
                                            <div class="icon">
                                                <i class="icon-return-order"></i>
                                            </div>
                                            <p>Return within <span class="fw-7">30 days</span> of purchase. Duties & taxes are non-refundable.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tf-product-info-trust-seal">
                                <div class="tf-product-trust-mess">
                                    <i class="icon-safe"></i>
                                    <p class="fw-6">Guarantee Safe <br> Checkout</p>
                                </div>
                                <div class="tf-payment">
                                    <img src="./assets/images/payments/visa.png" alt="">
                                    <img src="./assets/images/payments/img-1.png" alt="">
                                    <img src="./assets/images/payments/img-2.png" alt="">
                                    <img src="./assets/images/payments/img-3.png" alt="">
                                    <img src="./assets/images/payments/img-4.png" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                        </form>
                                <div class="qr-code" style="margin-right: 20px;">
                            <c:set var="thumbnailUrl" value="${product.thumbnail}" />
                            <c:set var="nameUrl" value="${product.name}" />
                            <c:set var="priceUrl" value="${product.price}" />


                            <c:set var="qrCodeUrl" value="${thumbnailUrl} ${nameUrl} ${priceUrl}" />


                            <!-- QR Code Image -->
                            <img src="https://api.qrserver.com/v1/create-qr-code/?data=${qrCodeUrl}&size=100x100" alt="QR Code for ${product.name}" class="img-qr" />

                            <span class="tooltip">Scan for details</span>
                        </div>
                </div>
            </div>
        </div>
    </div>
    
</section>
</c:if>
    <c:if test="${empty product}">
    <h1>No product found</h1>
    </c:if>  

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
