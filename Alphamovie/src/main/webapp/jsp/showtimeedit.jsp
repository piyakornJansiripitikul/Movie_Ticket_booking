<html>
<head>
	<meta charset="UTF-8">
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/resources/jquery-2.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>

	<title>Add Showtime</title>
</head>
<body>
  <style type="text/css">
        body{
          background-color:#CFCFCF;
        }
  </style>

    <div class="page-header">
      <span class="col-sm-1"></span><h1>Add Showtime</h1>
    </div>

          <div class="wrap col-sm-offset-2 col-sm-8">
              <form role="form">
                <div class="form-group">
                  <label for="InputtitleM">Title Movie</label>
                  <input type="text" class="form-control" id="InputtitleM" placeholder="Title Movie">
                </div>
                <div class="form-group">
                  <label for="Inrelease">Cinema</label>
                  <br>
                  <div class="col-sm-3">
                    <select class="form-control" for="select-date">
                      <option>Cinema No.</option>
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                    </select>
                  </div>
                  <br><br>
                </div>
                <div class="form-group">
                  <label for="Intype">Showtime</label>
                  <br>
                  <div class="checkbox">
                    <label class="col-sm-offset-1">
                      <input type="checkbox"> 11.00 - 13.00
                    </label><br>
                    <label class="col-sm-offset-1">
                      <input type="checkbox"> 13.00 - 15.00
                    </label><br>
                    <label class="col-sm-offset-1">
                      <input type="checkbox"> 15.00 - 17.00
                    </label><br>
                    <label class="col-sm-offset-1">
                      <input type="checkbox"> 17.00 - 19.00
                    </label><br>
                  </div>
                </div>
                <p>_________________________________________________________________________________________________________</p>
                <br>
                <span class="col-sm-5"></span><button type="submit" class="btn btn-default"><b>Submit</b></button>
              </form>
          </div>

	
</body>
</html>