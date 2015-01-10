var cart = [];
function addToCartButton(name) {
    return $("<button>")
        .html("add to cart")
        .click(function () {
            addToCart(name);

        });
}

function addToCart(name) {
 $.ajax({
 type:"post",
 url:"/cart/add",
 data: JSON.stringify(_.omit(disk,name)),
  contentType: "application/json"})
  .success(function(){
           });
 }
/*
function goToCart() {
 $.ajax({
 type:"post",
 url:"/cart",
 contentType: "application/json"
})
 .success(function(result) {
    window.open("cart.html");
  }
 }
*/



