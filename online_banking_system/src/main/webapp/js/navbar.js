window.addEventListener("scroll",function(){

var header = document.querySelector("header");
header.classList.toggle("scrolfunc", this.window.scrollY > 0);

})