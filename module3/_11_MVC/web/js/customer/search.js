
// $(document).ready(function () {
//     $('#search').click(function(event) {
//         let nameProduct = $('#nameProduct').val();
//         $.post('product', {
//             nameProduct : nameProduct,
//             action : "searchProduct"
//         },function (responseText) {
//             $('#result').html(responseText);
//         });
//     });
// });

$(document).ready(() => {
    $("#search").click(event => {
         $.ajax({
            url : "product",
            type : "POST",
            data : {
                action : "searchProduct",
                nameProduct :  $('#nameProduct').val()
            },
            success : respondText =>  $('#result').html(respondText)
        }) ;
    });
});
