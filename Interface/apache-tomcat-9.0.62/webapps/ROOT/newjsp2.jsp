<%--
    Document   : newjsp2
    Created on : Apr 23, 2022, 5:37:14 PM
    Author     : medoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%-- <link rel="stylesheet" href="css/style1.css"/> --%>
    <!--<link rel="stylesheet" href="css/all.min.css" />-->


    <title>Search engine</title>
    <style>
    html{
    height: 100%;
  }
  body {
     /* height: 100%;*/
      box-sizing:border-box;

  }
  main {
    /*height: 100% -50px;*/
    display: flex;
    padding: 50px 50px;
   /* align-items: center;*/
   /* align-content: center;*/

  }
  .urls {

    /* width: 350px; */
   /* margin-left: auto;
    margin-right: auto;*/

    display: flex;
    /*align-items: center;*/
   /* align-content: center;*/
    flex-direction: column;
    /* margin-bottom: 120px; */

}
.urls span {
  margin-bottom: 20px;
}
.urls span a {
  padding-bottom: 5px;
  display: block;
  font-size: larger;
}


    body{
  	/* background: #151515; */
	height: 100%;
	position: absolute;
	text-align: center;
	width: 100%;

    }
    footer{
       display: block;
   }
   ul{
       display: flex;
       flex-direction:row;
       align-content: space-between;
       align-items: center;

   }
   ul li {
    margin-bottom: 10px;
    padding: 10px;
    list-style: none;

   }
   .urls span {
    margin-bottom: 20px;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
}
main div  span label {
  color: black;
    overflow: auto;
}
.autocomplete {
      position: relative;
      display: inline-block;
   }
   input {
      border: none;
      background-color: #f1f1f1;
      padding: 10px;
      font-size: 16px;
      border-radius: 4px;
   }
   input[type="text"] {
      background-color: #e1f6fc;
      width: 100%;
   }
   input[type="submit"] {
      background-color: DodgerBlue;
      color: #fff;
      cursor: pointer;
      margin-left: 15px;
   }
   .autocomplete-items {
      position: absolute;
      border-bottom: none;
      border-top: none;
      z-index: 99;
      top: 100%;
      left: 0;
      right: 0;
   }
   .autocomplete-items div {
      padding: 10px;
      cursor: pointer;
      border: 1px solid #8e26d4;
      border-bottom: 1px solid #d4d4d4;
      background: white;
    z-index: 200;
   }
   .autocomplete-items div:hover {
      background-color: #e9e9e9;
   }
   .autocomplete-active {
      background-color: rgb(30, 255, 169) !important;
      color: #ffffff;
   }
    </style>
</head>
<body>
    <nav>

    </nav>
    <form autocomplete="off" action="/getQuery" method="get">
        <div class="autocomplete" style="width:300px;">
        <input id="searchField" type="text" name="searchquery" placeholder="What are you looking for?" />
        </div>
        <input type="submit" value="Search" />

        </form>
        <form action="/getQuery2"method="get">
          <%-- <button type="submit" name="button">bb</button> --%>
        </form>
    <main>


           <div class="urls">
        <%-- <span>
            <a href="http://google.com" target="_blank">link text</a>
            <label>slcjndkjvnsfnsufnifsnbusfbn
                sfkjvnnnnnnnnnnnnnnnnnnnnnnnnnnnnsfdvunisnv
                slfivnsfuvnsivbnsudvb
            </label>
        </span>
        <span>
            <a href="http://google.com">link text</a>
        </span>
        <span>
            <a href="http://google.com">link text</a>
        </span>
        <span>
            <a href="http://google.com">link text</a>
        </span>
        <span>
            <a href="http://google.com">link text</a>
        </span>
        <span>
            <a href="http://google.com">link1 text</a>
        </span> --%>
<!--        {% for url in urls %}
        <span>
            <a href={{url.ref}} target="_blank">{{url.title}}</a>
            <label>{{url.description}}
            </label>
        </span>
        {% endfor %}-->
         <c:forEach items="${x2}" var="url">
    <span>
          <a href=${url.getname()} target="_blank">${url.gettitle()}</a>
            <label>${url.getdescription()}
            </label>
    </span>
</c:forEach>

           </div>


   </main>
   <footer>
    <ul class="tag_cloud">


        <c:forEach items="${ss}" var="ss1">
            <li><a href="${ss1.url5}" title="" >${ss1.pagenum}</a></li>

</c:forEach>


        <%-- <li><a href="#" title="" >2</a></li>
        <li><a href="#" title="" >3</a></li>
        <li><a href="#" title="" >4</a></li>
        <li><a href="#" title="" >5</a></li>
        <li><a href="#" title="" >6</a></li>    --%>

       </ul>
   </footer>
   <script>
    function autocomplete(searchEle, arr) {
       var currentFocus;
       searchEle.addEventListener("input", function(e) {
          var divCreate,
          b,
          i,
          fieldVal = this.value;
          closeAllLists();
          if (!fieldVal) {
             return false;
          }
          currentFocus = -1;
          divCreate = document.createElement("DIV");
          divCreate.setAttribute("id", this.id + "autocomplete-list");
          divCreate.setAttribute("class", "autocomplete-items");
          this.parentNode.appendChild(divCreate);
          for (i = 0; i <arr.length; i++) {
             if ( arr[i].substr(0, fieldVal.length).toUpperCase() == fieldVal.toUpperCase() ) {
                b = document.createElement("DIV");
                b.innerHTML = "<strong>" + arr[i].substr(0, fieldVal.length) + "</strong>";
                b.innerHTML += arr[i].substr(fieldVal.length);
                b.innerHTML += "<input type='hidden' value='" + arr[i] + "'>";
                b.addEventListener("click", function(e) {
                   searchEle.value = this.getElementsByTagName("input")[0].value;
                   closeAllLists();
                });
                divCreate.appendChild(b);
             }
          }
       });
       searchEle.addEventListener("keydown", function(e) {
          var autocompleteList = document.getElementById(
             this.id + "autocomplete-list"
          );
          if (autocompleteList)
             autocompleteList = autocompleteList.getElementsByTagName("div");
          if (e.keyCode == 40) {
             currentFocus++;
             addActive(autocompleteList);
          }
          else if (e.keyCode == 38) {
             //up
             currentFocus--;
             addActive(autocompleteList);
          }
          else if (e.keyCode == 13) {
             e.preventDefault();
             if (currentFocus > -1) {
                if (autocompleteList) autocompleteList[currentFocus].click();
             }
          }
       });
       function addActive(autocompleteList) {
          if (!autocompleteList) return false;
             removeActive(autocompleteList);
          if (currentFocus >= autocompleteList.length) currentFocus = 0;
          if (currentFocus < 0) currentFocus = autocompleteList.length - 1;
          autocompleteList[currentFocus].classList.add("autocomplete-active");
       }
       function removeActive(autocompleteList) {
          for (var i = 0; i < autocompleteList.length; i++) {
             autocompleteList[i].classList.remove("autocomplete-active");
          }
       }
       function closeAllLists(elmnt) {
          var autocompleteList = document.getElementsByClassName(
             "autocomplete-items"
          );
          for (var i = 0; i < autocompleteList.length; i++) {
             if (elmnt != autocompleteList[i] && elmnt != searchEle) {
                autocompleteList[i].parentNode.removeChild(autocompleteList[i]);
             }
          }
       }
       document.addEventListener("click", function(e) {
          closeAllLists(e.target);
       });
    }
    // var animals = ["giraffe","tiger", "lion", "dog","cow","bull","cat","cheetah"];
 // var fs = require('fs');
 var animals = [];
  let i=0;
 <c:forEach items="${ss2}" var="ss3">
     // <li><a href="${ss1.url5}" title="" >${ss1.pagenum}</a></li>

 animals.push("${ss3}");

 </c:forEach>


    autocomplete(document.getElementById("searchField"), animals);
 </script>
</body>
</html>
