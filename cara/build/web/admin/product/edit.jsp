<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>DASHMIN - Bootstrap Admin Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="${pageContext.request.contextPath}/assets/admin/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/admin/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="${pageContext.request.contextPath}/assets/admin/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="${pageContext.request.contextPath}/assets/admin/css/style.css" rel="stylesheet">
    </head>

    <body>
        <div class="container-xxl position-relative bg-white d-flex p-0">
            <!-- Sidebar Start -->
            <%@include file="../inc/sidebar.jsp" %>
            <!-- Sidebar End -->

            <!-- Content Start -->
            <div class="content">
                <!-- Navbar Start -->
                <%@include file="../inc/navbar.jsp" %>
                <!-- Navbar End -->

                <!-- Table Start -->
                <div class="container-fluid pt-4 px-4">
                    <div class="row g-4">
                        <div class="col-12">
                            <div class="bg-light rounded h-100 p-4">
                                <h6 class="mb-4">Product Edit</h6>
                                <c:if test="${not empty error}">
                                    <span class="error text-danger">${error}</span>
                                </c:if>
                                <c:remove var="error" scope="session"/>
                                <form action="EditProductServlet" method="post">
                                     <!--enctype="multipart/form-data"-->
                                    <input type="hidden" name="productId" value="${product.id}" />

                                    <div class="mb-3">
                                        <label for="productName" class="form-label">Name</label>
                                        <input name="name" type="text" value="${product.name}" class="form-control" id="productName" required>
                                    </div>

                                    <div class="mb-3">
                                        <label for="productDescription" class="form-label">Description</label>
                                        <textarea name="description" class="form-control" id="productDescription" required>${product.description}</textarea>
                                    </div>

                                    <div class="mb-3">
                                        <label for="productThumbnail" class="form-label">Thumbnail</label>
                                        <input name="thumbnail" type="text" value="${product.thumbnail}" class="form-control" id="productThumbnail" required>
                                    </div>

                                    <div class="mb-3">
                                        <label for="productPrice" class="form-label">Price</label>
                                        <input name="price" type="number" step="0.01" value="${product.price}" class="form-control" id="productPrice" required>
                                    </div>

                                    <div class="mb-3">
                                        <label for="productQuantity" class="form-label">Quantity</label>
                                        <input name="quantity" type="number" value="${product.quantity}" class="form-control" id="productQuantity" required>
                                    </div>

                                    <div class="mb-3">
                                        <label for="productCategory" class="form-label">Category</label>
                                        <select name="categoryId" class="form-control" id="exampleInputCategoryId" required>
                                            <c:forEach items="${categoryList}" var="category">
                                                <option <c:if test="${category.id == product.categoryId}">selected</c:if> value="${category.id}" >
                                                    ${category.name}
                                                </option>
                                            </c:forEach> 
                                        </select>
                                    </div>

                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Table End -->

                <!-- Footer Start -->
                <%@include file="../inc/footer.jsp" %>
                <!-- Footer End -->
            </div>
            <!-- Content End -->

            <!-- Back to Top -->
            <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/chart/chart.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/easing/easing.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/waypoints/waypoints.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/tempusdominus/js/moment.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

        <!-- Template Javascript -->
        <script src="${pageContext.request.contextPath}/assets/admin/js/main.js"></script>
    </body>

</html>
