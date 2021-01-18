$(document).ready(() => {
    $("#delete").click(event => {
        if(!confirm("Are you sure to delete this product ?")) {
            event.preventDefault();
        }
    });
});
