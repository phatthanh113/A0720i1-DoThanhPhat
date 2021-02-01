$(document).ready(() => {
    $("#form").validate({
            rules: {
                id: 'required',
                name: 'required'
            },
            messages: {
                id : 'Ban chua nhap ho',
                name : 'Ban chua nhap ten'
            },
        }
    )
});
