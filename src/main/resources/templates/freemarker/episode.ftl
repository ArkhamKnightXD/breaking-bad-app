<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>${title}</title>

    <link href="../../bootstrap-4.3.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="../../bootstrap-4.3.1/style/style.css" rel="stylesheet">

</head>
<body>
<header>
    <div class="collapse bg-dark" id="navbarHeader">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-md-7 py-4">
                    <h4 class="text-white">About</h4>
                    <p class="text-muted">Full Stack Web Developer, I really enjoy playing videogames and I also like
                        the videogame consoles.</p>
                </div>
                <div class="col-sm-4 offset-md-1 py-4">
                    <h4 class="text-white">Contact</h4>
                    <ul class="list-unstyled">
                        <li><a href="#" class="text-white">Follow on Twitter</a></li>
                        <li><a href="#" class="text-white">Like on Facebook</a></li>
                        <li><a href="#" class="text-white">Email me</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="navbar navbar-dark bg-dark shadow-sm">
        <div class="container d-flex justify-content-between">

            <a href="/cast/" class="navbar-brand d-flex">
                <strong>Cast</strong>
            </a>
            <a href="#" class="navbar-brand d-flex">
                <strong>Episodes</strong>
            </a>

            <a href="#" class="navbar-brand d-flex align-items-center">
                <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor"
                     stroke-linecap="round" stroke-linejoin="round" stroke-width="2" aria-hidden="true" class="mr-2"
                     viewBox="0 0 24 24" focusable="false">
                    <path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/>
                    <circle cx="12" cy="13" r="4"/>
                </svg>
                <strong>Episodes of Breaking Bad</strong>
            </a>


            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader"
                    aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </div>
    </div>
</header>

<main role="main">

    <section class="jumbotron text-center">
        <div class="container">
            <h1 class="jumbotron-heading">Episode Gallery</h1>
            <p class="lead text-muted">gallery of all the Episodes of the Breaking Bad series</p>
            <form action="/episode/">
                <input class="form-control form-control-dark w-100" type="text" name="title" placeholder="Search..." aria-label="Search">
            </form>
        </div>
    </section>

    <div class="album">
        <div class="container">

            <div class="row">

                <#list episodes as episode>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <img src="" width="100%" height="400px">
                            <div class="card-body">
                                <h4 class="card-title">${episode.title}</h4>
                                <p class="card-text">Season: ${episode.season} Episode: ${episode.episode}</p>
                                <p class="card-text">Date of air: ${episode.air_date}</p>
                                <p class="card-text">Character Appearance:</p>
                                <#list episode.characters as character>
                                     ${character},
                                </#list>
                                <div class="d-flex justify-content-between align-items-center">

                                    <small class="text-muted">${episode.series}</small>
                                </div>
                            </div>
                        </div>
                    </div>
                </#list>

            </div>
        </div>
    </div>


</main>

<footer class="footer-container">
    <p class="float-right"><a href="#">Back to top</a></p>
    <p class="logo-info">&copy; Arkham-Store 2019</p>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script>window.jQuery || document.write('<script src="../../bootstrap-4.3.1/dist/js/jquery-3.2.1.slim.min.js"><\/script>')</script>
<script src="../../bootstrap-4.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
