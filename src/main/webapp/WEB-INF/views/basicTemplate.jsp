<%-- 
    Document   : classic
    Created on : Apr 15, 2017, 6:16:18 PM
    Author     : Ahmed_Eldeeb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@page import="model.Sub_category"%>
<%@page import="java.util.List"%>
<%@page import="model.Category"%>


<!-- header ============================================ -->

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="view port" content="width=device-width,initial-scale=1">
        <title><tiles:getAsString name="title"/></title>
        <tilesx:useAttribute name="current" />

        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-awesome.min.css"  />" />
        <link rel="stylesheet" href="<c:url value="/resources/css/hover.css" />"/>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css" />" />
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js"/>"></script>
        <link href='https://fonts.googleapis.com/css?family=Lato:400,300,700,900,400italic' rel='stylesheet' type='text/css'>
    </head>

    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img class="img-responsive" src="<c:url value="/resources/img/logo.png"/>"></a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav navbar-right">
                        <li class="${current == 'index' ? 'active':''}"><a href="index.html">home</a></li>
                        <li><a href="#">blog</a></li>
                        <li><a href="#">contact</a></li>
                            <security:authorize access="!isAuthenticated()">
                            <li><a href="signin.html">sign in</a></li>
                            <li><a href="register.html">register</a></li>
                            </security:authorize>

                        <security:authorize access="isAuthenticated()">
                            <li>
                                <form method="post" action="logout">
                                    <a >Logout</a>
                                    <input type="hidden"
                                           name="${_csrf.parameterName}"
                                           value="${_csrf.token}"/>
                                </form>
                            </li>
                        </security:authorize>


                        <button class="btn btn-default add-list"><a href="addlist.html" target="_blank"><i class="fa fa-plus"></i>add listing</a></button>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <!-- body -->
        <tiles:insertAttribute name="body" />

        <!-- Footer -->
        <tiles:insertAttribute name="footer"/> 
