<%-- 
    Document   : test
    Created on : Jul 1, 2017, 11:23:30 PM
    Author     : AhmedEldeeb
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Post"%>
<%@page import="model.Sub_category"%>
<%@page import="java.util.List"%>
<%@page import="service.Sub_CategoryService"%>
<%@page import="org.springframework.beans.factory.annotation.Qualifier"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>



<%
    List<Post> subPosts = (List<Post>) request.getAttribute("SubPosts");

    if (subPosts.size() > 0) {
        for (Post post : subPosts) {
%>




<div class="col-md-3 col-sm-12">

    <div class="item">
        <a href="detail.html" class="fifth" target="_blank">
            <div class="discription">
                <div class="caption">
                    <figcaption>Average Price: $8 - $30</figcaption>
                    <div class="label label-default">restaurant</div>
                    <h3><%= post.getTitle()%></h3>
                     
                    <h4>63 alex Street</h4>
                </div>
            </div>
        </a>

        <div class="additional-info">
            <div class="rating-passive">
                <span class="stars">
                    <figure class="fa fa-star active"></figure>
                    <figure class="fa fa-star"></figure>
                    <figure class="fa fa-star"></figure>
                    <figure class="fa fa-star"></figure>
                    <figure class="fa fa-star"></figure>
                </span>
                <span class="reviews">
                    (11)
                </span>
            </div>
            <div class="control-more fa fa-bars">
                <ul class="">
                    <li><a href="#">Add To Favorite</a></li>
                    <li><a href="#">Quick Detail</a></li>
                </ul>
            </div>
        </div>
    </div>

</div>

<div class="col-md-12 text-center">
    <a href="allPosts/<%= subPosts.get(0).getCategory().getId() %>" class="btn btn-primary btn-rounded">View all listings<i class="fa fa-long-arrow-right"></i></a>
</div>

<div class="col-md-12">
    <hr />
</div>

<% }
} else {%>
<p>No Posts Yet</p>
<% }%>