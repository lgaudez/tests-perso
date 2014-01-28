<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML>
<style type="text/css">
    <!--
    html, body, .container
    {
        height: 100%;
        min-height: 100%;
    }

    .up {
        /* float: left; */
        margin-left: auto;
        margin-right: auto;
        width: 95%;
        height: 10%;
        border-width:1px 2px 3px 2px;
        border-style:solid dotted;
        border-color:black red;
        padding:0 10px;
        /* background-color: red; */
    }

    .middleFirst{
         float: left;
        margin-bottom: 5%;
        margin-top: 5%;
        text-align: center;
        margin-left: auto;
        margin-right: auto;
        /* width: 15%; */
        height: 70%;
        border: 2px solid black;
        padding:10px 10px;
        /* background-color: green; */
    }

    .middleSecond{
        float: right;
        margin-bottom: 5%;
        margin-top: 5%;
        text-align: center;
        margin-left: auto;
        margin-right: auto;
        width: 80%;
        height: 70%;
        border: 2px solid black;
        padding:10px 10px;
        /* background-color: green; */
    }


    .bottom{
        margin-left: auto;
        margin-right: auto;
         float: left;
        width: 100%;
        height: 10%;
        padding:10px 10px;
        /*  background-color: blue; */
    }

    -->
</style>
<html>
<head>
    <!-- entete -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<!-- corps de la page -->
<body>

<div class="container">
    <div class="up"><tiles:insertAttribute name="header" /></div>
    <div class="middleFirst"><tiles:insertAttribute name="menu" /></div> <div class="middleSecond"><tiles:insertAttribute name="body" /></div>
    <div class="bottom"><tiles:insertAttribute name="footer" /></div>
</div>​
</body>
</html>