
    // $("#form").validate({
    //         rules: {
    //             name : {
    //                 required: true
    //             }
    //         },
    //         messages: {
    //             name : 'Ban chua nhap ten'
    //         },
    //     }
    // );

    $(document).ready(() => {
        let regexName = "^KH-[\\d]{4}$";
        $.validator.addMethod(
            "regexName",
            function(value, element,regexp) {
                var re = new RegExp(regexp);
                return this.optional(element) || re.test(value);
            },
            "Please check your input."
        );
            $("#form").validate({
                    onclick : true ,
                    onmouseleave : true ,
                    rules: {
                        name : {
                            required: true ,
                            regexName : regexName
                        }
                    },
                    messages: {
                        name : {
                            required : 'Ban chua nhap ten',
                            regexName : 'Ban nhap sai dinh dang'
                        }
                    },
                    submitHandler: function (form) {
                        $(form).ajaxSubmit();
                    }
                }
        )
    });

