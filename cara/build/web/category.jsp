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

<!--        <section id="page-header">
            <h2>#${keyword}</h2>
            <p>Save more with coupons & up to 70% off!</p>
            <form action="SearchServlet" class="search" method="get">
                <div class="form-search">
                    <input name="keyword" class="search w-50 p-2 rounded-top" type="search" placeholder="Search" aria-label="Search">
                </div>
            </form>
        </section>-->

    <section id="product1" class="section-p1">
        <div class="row">
        <form action="CategoryServlet" class="filter d-flex mb-3" style="width: 50%;" method="get">
            <input type="hidden" name="categoryId" value="${category.id}"/>
            <!-- Sort By Dropdown -->
            <select name="property" class="form-select me-2" aria-label="Sort By">
                <option value="name">Sort By Name</option>
                <option value="price">Sort By Price</option>
                <option value="createAt">Sort By Time</option>
            </select>
            <!-- Order By Dropdown -->
            <select name="order" class="form-select me-2" aria-label="Order By">
                <option value="ASC">A->Z</option>
                <option value="DESC">Z->A</option>
            </select>
            <button type="submit" class="filter-submit btn btn-primary">Filter</button>
        </form>   
    </div>
    <section class="flat-spacing-12 pt_0">
        <div class="container">
            <div class="row align-items-center flex-md-row-reverse">
                <div class="col-md-12">
                    <!-- Bootstrap grid system for horizontal layout -->
                    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 g-4">
                        <c:forEach items="${productList}" var="product">
                            <div class="col">
                                <!-- Card structure using Bootstrap -->
                                <div href="ProductServlet?productId=${product.id}" class="card h-100">
                                    <img class="card-img-top img-fluid lazyload" data-src="" src="${product.thumbnail}" alt="image-product">
                                    <div class="card-body">
                                        <h5 class="card-title">${product.name}</h5>
                                        <p class="card-text">$${product.price}</p>
                                        <ul class="list-inline">
                                            <li class="list-inline-item">
                                                <span class="badge bg-dark">Black</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </section>
</section>
    

        <%@include file="./inc/footer.jsp" %>
    </body>

</html>
