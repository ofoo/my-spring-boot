function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return (false);
}

$(function(){
    $(".date").datepicker({
        language: "zh-CN",
        autoclose: true,
        format: 'yyyy-mm-dd',
        todayHighlight: true,
        todayBtn: "linked",
        clearBtn: true,
    });
})