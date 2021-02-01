$(document).ready(() => {
    $("#search").click(event => {
        $.ajax({
            url : $(".path").val(),
            type : "POST",
            data : {
                action : "search",
                name :  $('#name').val(),
            },
            success : respondText =>  $('#result').html(respondText)
        }) ;
    });
    $(".delete").click((event) => {
        if(!confirm("Ban co chac muon xóa không")) {
            event.preventDefault();
        }
    });
});


