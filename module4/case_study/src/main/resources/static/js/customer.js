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
        if(!confirm("Bạn có chắc muốn xóa khách hàng này")) {
            e.preventDefault()  ;
        }else {
            $.ajax({
                type:"GET",
                url : "/customer/delete",
                data : {
                    id : $(".customer-delete").val(),
                },
                dataType: "html",
                success : (data) => {
                    $("#list").html(data);
                }
            })
        }
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