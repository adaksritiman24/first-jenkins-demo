var express = require('express');
var app = express();

app.get('/home', (req, res) =>{
  res.send('Hello Jenkins and Docker!');
});
app.get('/myhome', (req, res) =>{
  res.send('Hello Myself!');
});
app.get('/yourhome', (req, res) =>{
  res.send('Hello Boss!');
});

var server = app.listen(3000,  ()=> {
  var host = server.address().address;
  var port = server.address().port;

  console.log('Example app listening at http://%s:%s', host, port);
});
