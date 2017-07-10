<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- PATH SECTION ================================================= -->
<section class="path">
    <div class="container">

        <div class="row">
            <ol>
                <li><a href="index.html">home / </a></li>
                <li><a href="register.html"> register</a></li>
            </ol>
        </div>

    </div>
</section>

<!-- SIGNIN SECTION ================================================= -->
<section class="signin">
    <div class="container">
        <div class="row">

            <div class="container">
                <div class="row">

                    <div class="col-sm-push-3 col-md-6 col-sm-6">
                        <h1>register</h1>
                        <c:if test="${!empty message}">
                            <div class="alert alert-success">${message}</div>
                        </c:if>





                        <form method="post" action="registration">
                            <h2 id="error"><form:errors path="profile.*" /></h2>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>First Name</label>
                                    <input type="text" name="First_name" class="form-control" id="exampleInputEmail1" placeholder="First Name">


                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Last Name</label>
                                    <input type="text" class="form-control" name="Last_name" id="exampleInputPassword1" placeholder="Last Name">
                                </div>
                            </div>

                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>First Name</label>
                                    <input type="text" class="form-control" name="Address" id="exampleInputEmail1" placeholder="Address">
                                </div>
                            </div>

                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>Email</label>
                                    <input type="email" class="form-control" name="Email" id="exampleInputPassword1" placeholder="Email">
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Password</label>
                                    <input type="password" name="Password" class="form-control" id="exampleInputEmail1" placeholder="Password">
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Confirm Password</label>
                                    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Confirm Password">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-default btn-lg">register now</button>
                        </form>

                        <hr />

                    </div>
                </div>
            </div>

        </div>
    </div>
</section>

<script>
    var error = $("#error").text().trim();

    if (error != "") {
        // alert("No");
        $("#error").addClass("alert alert-danger");
    } else {
        alert("Yes");
    }
</script>



