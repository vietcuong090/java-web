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
    <!-- Favicon and Touch Icons  -->
    <link rel="shortcut icon" href="./assets/images/logo/favicon.png">
<link rel="apple-touch-icon-precomposed" href="./assets/images/logo/favicon.png">
</head>

<body>
     <%@include file="./inc/header.jsp" %>  
<section class=" text-center text-lg-start">
  <div class="card mb-3">
    <div class="row g-0 d-flex align-items-center">
      <div class="col-lg-4 d-none d-lg-flex">
        <img src="https://mdbootstrap.com/img/new/ecommerce/vertical/004.jpg" alt="Trendy Pants and Shoes"
          class="w-100 rounded-t-5 rounded-tr-lg-0 rounded-bl-lg-5" />
      </div>
      <div class="col-lg-8">
        <div class="card-body py-5 px-md-5">
          <form action="LoginServlet" method="Post">
              <h1 class="text-center fs-1 mb-4">Login</h1>
              <span class="error"> ${error} </span>
               <c:remove var="error" scope="session"/>
            <div data-mdb-input-init class="form-outline mb-4">
                <input name="email" type="email" id="form2Example1" class="form-control" placeholder="Email" required />
              <label class="form-label" for="form2Example1"></label>
            </div>
            <div data-mdb-input-init class="form-outline mb-4">
                <input name="password" type="password" id="form2Example2" class="form-control" placeholder="Password" required />
              <label class="form-label" for="form2Example2"></label>
            </div>
            <div class="row mb-4">
              <div class="col d-flex justify-content-center">
                <!-- Checkbox -->
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="form2Example31" checked />
                  <label class="form-check-label" for="form2Example31"> Remember me </label>
                </div>
              </div>

              <div class="col">
                <!-- Simple link -->
                <a href="RegisterServlet">Don't have an account yet?</a>
              </div>
            </div>
            <button type="submit" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary w-100 mb-4">Sign in</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- Section: Design Block -->
<%@include file="./inc/footer.jsp" %>
</body>
