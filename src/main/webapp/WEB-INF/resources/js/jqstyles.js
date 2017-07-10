$(document).ready(function() {
  "use strict";

  $(".navbar-default .navbar-nav > li").click(function(){
      $(this).addClass("active").siblings().removeClass("active");
  })

  $('input').focus(function() {
    $(this).css("border", "none");
  });

  $('input').blur(function() {
    $(this).css("border-bottom", "1px solid #ddd");
  });


 /* scrolltop button   */
 $(window).scroll(function(){
   var sc = $(".scrolltop");                                    
   var g = $(window).scrollTop();
   if (g>=700) {
     sc.fadeIn(1500);
 } else{
     sc.fadeOut(1500);
 }
 });

  /*nice scroll */ 
  $("html").niceScroll();

  /*smoth scroll */ 
  smoothScroll.init();
  

})
