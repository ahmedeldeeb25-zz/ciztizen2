<%@page import="model.Post"%>
<%@page import="model.Sub_category"%>
<%@page import="java.util.List"%>
<%@page import="model.Category"%>


<!-- Java Codes ===================== -->
<!---- Variables --->
<%
    List<Category> main_cat = (List<Category>) request.getAttribute("categories");
    List<Post> FCPosts = (List<Post>) request.getAttribute("FCPosts");
%>

<!--- Ajax Operations ---------->

<script>
    $(document).ready(function () {
        $("#catFilter ").click(function () {

            
             $.ajax({
             
             url: 'test',
             type: 'get',
             cache: false,
             data: {cat: this.value},
             success: function (data) {
              $('.recent-places .row').html(data);
            // console.log(data);
             
             },
             error: function () {
             alert('There is an error');
             }
             });
        });
    });
</script>


<!-- PANNER SECTION ================================================= -->

<section class="panner">

    <div class="panner-back">

        <div class="panner-content">
            <div class="container">
                <div class="row">
                    <div class="page-title">
                        <h1>best deals in one place</h1>
                        <h2>with locations you can find the best deals in your location</h2>
                    </div>

                    <form>

                        <div class="input-group">
                            <input type="text" name="email" class="form-control" placeholder="What are you looking for">
                            <span class="input-group-btn">
                                <button type="submit" class="btn btn-default"><i class="fa fa-long-arrow-right"></i>
                                </button>
                            </span>
                        </div>

                    </form>

                </div>
            </div>
        </div>

    </div>

</section>

<!-- MAP SECTION ========================================= -->
<div class="index-mapa">
    <iframe class="inner-map"
            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d110465.
            56322008088!2d31.246004820040344!3d30.09278725209322!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.
            1!3m3!1m2!1s0x145815edd80fc3d5%3A0x14ef64c031153db7!2sChild+center+of+civilization+and+creativity
            !5e0!3m2!1sen!2seg!4v1485893606805" width="100%" height="450" 
            frameborder="0" style="border:0" allowfullscreen>
    </iframe>
</div>


<!-- BROWSE LISTING SECTION ================================================= -->
<section class="listings">
    <h2 class="text-center">browse our listings</h2>
    <div class="container">
        <div class="row">

            <% for (Category cat : main_cat) { %>
            <div class="col-md-3 col-sm-6">
                <div class="list-item">
                    <div class="list-title">
                        <div class="icon">
                            <i class="fa fa-paint-brush"></i>
                        </div>
                        <h3><a href="#">arts & humanities</a></h3>
                    </div>

                    <ul>
                        <% for (Sub_category sub : cat.getSub()) {%> 
                        <li id="catFilter" value="<%= sub.getId()%>">
                            <a ><%= sub.getName()%></a>
                            <figure class="count"><%= sub.getPosts().size()%></fugure>
                        </li>


                        <% } %>
                    </ul>
                </div>
            </div>
            <% }%>
            <!--                    <div class="clearfix"></div>-->

        </div>
    </div>
</section>

<!-- First Category Section - RECENT PLACES SECTION ================================================= -->
<section class="recent-places">
    <div class="container">
        <div class="recent-title text-center">
            <h2>First Category</h2>
            <h3>Fusce eu mollis dui, varius convallis mauris. Nam dictum id</h3>
        </div>
        <div class="row">

            <%
                if (FCPosts.size() > 0) {
                    for (Post FCposts : FCPosts) {%>
            <div class="col-md-3 col-sm-12">

                <div class="item">
                    <a href="detail.html" class="fifth" target="_blank">
                        <div class="discription">
                            <div class="caption">
                                <figcaption>Average Price: $8 - $30</figcaption>
                                <div class="label label-default">restaurant</div>
                                <h3><%= FCposts.getTitle()%></h3>
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
            <% }
            } else {%>
            <h2>NO Posts Now</h2>
            <% }%>


            <div class="col-md-12 text-center">
                <a href="listing.html" class="btn btn-primary btn-rounded">View all listings<i class="fa fa-long-arrow-right"></i></a>
            </div>

            <div class="col-md-12">
                <hr />
            </div>
        </div>
    </div>
</section>



<!-- SUBSCRIPE SECTION ================================================= -->
<section class="subscripe">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h3>Subscribe and be notified about new locations</h3>
            </div>

            <div class="col-md-6">
                <form role="search">

                    <div class="input-group">
                        <input type="text" name="email" class="form-control" placeholder="What are you looking for">
                        <span class="input-group-btn">
                            <button type="submit" class="btn btn-default"><i class="fa fa-long-arrow-right"></i>
                            </button>
                        </span>
                    </div>

                </form>
            </div>
        </div>
    </div>
</section>


<!-- RECENTLY RATED SECTION ================================================= -->
<section class="recently-rated">
    <div class="container">
        <h2>recent Posts</h2>
        <div class="row">
            <div class="col-md-12 col-sm-12">

                <div class="col-md-4 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="sixth" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $15 - $37</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>homsa’s restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star"></figure>
                                    <figure class="fa fa-star"></figure>
                                </span>
                                <span class="reviews">
                                    (12)
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

                <div class="col-md-5 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="first" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $8 - $20</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>safary restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star"></figure>
                                </span>
                                <span class="reviews">
                                    (37)
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

                <div class="col-md-3 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="fourth" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $8 - $30</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>marky’s restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                </span>
                                <span class="reviews">
                                    (64)
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

            </div>

        </div>
    </div>
</section>

<!-- Most Visited Section -->

<section class="recently-rated">
    <div class="container">
        <h2>Most Visited Posts</h2>
        <div class="row">
            <div class="col-md-12 col-sm-12">

                <div class="col-md-4 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="sixth" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $15 - $37</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>homsa’s restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star"></figure>
                                    <figure class="fa fa-star"></figure>
                                </span>
                                <span class="reviews">
                                    (12)
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

                <div class="col-md-5 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="first" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $8 - $20</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>safary restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star"></figure>
                                </span>
                                <span class="reviews">
                                    (37)
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

                <div class="col-md-3 col-sm-12">

                    <div class="item">
                        <a href="detail.html" class="fourth" target="_blank">
                            <div class="discription">
                                <div class="caption">
                                    <figcaption>Average Price: $8 - $30</figcaption>
                                    <div class="label label-default">restaurant</div>
                                    <h3>marky’s restaurant</h3>
                                    <h4>63 alex Street</h4>
                                </div>
                            </div>
                        </a>

                        <div class="additional-info">
                            <div class="rating-passive">
                                <span class="stars">
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                    <figure class="fa fa-star active"></figure>
                                </span>
                                <span class="reviews">
                                    (64)
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

            </div>

        </div>
    </div>
</section>

