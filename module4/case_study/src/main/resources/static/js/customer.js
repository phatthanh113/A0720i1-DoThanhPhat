$(document).ready((e) => {
    $(".customer-view").click(() => {
        $.ajax({
            type:"GET",
            url : "/customer/view",
            data : {
                id : $(".customer-view").val(),
            },
            dataType:'html',
            success : (data) => {
                $(".modal-body").html(data);
                $("#modelId").modal('show');
            }
        })
    });
    $(".customer-delete").click((e) => {
            $.ajax({
                type:"GET",
                url : "/customer/delete",
                data : {
                    id : $(".customer-delete").val(),
                },
                dataType: "html",
                success : (data) => {
                    $(".modal-body").html(data);
                    $("#modelId").modal('show');
                }
            })
    });
    $(".customer-edit").click(() => {
        $.ajax({
            type:"GET",
            url : "/customer/edit",
            data : {
                id : $(".customer-edit").val(),
            },
            dataType:'html',
            success : (data) => {
                $(".modal-body").html(data);
                $("#modelId").modal('show');
            }
        })
    });
});