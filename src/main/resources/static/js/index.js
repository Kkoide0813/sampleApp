$(document).ready(function(){
    inputDataSend();
});

function inputDataSend(){
    $("#itemCreateForm").click(function () {
        $.ajax({
            url: '/create/do',
            type: 'POST',
            data: $("form").serialize(),
            dataType: "json",
            timespan: 1000,
        })
            .done(function (data1, textStatus, jqXHR) { // jqXHR・・・jQueryのXML Http Requestのこと
                // console.log(jqXHR.status); // 200
                // console.log(textStatus); // 成功した時のコンソールログ
                // console.log(data1["name"]); // name さん
                // console.log(data1["price"]); // price
                // //
                // $(".modal-body").find("p").remove();//モダールウィンドウの表示前に<p>タグを削除する
                $(".modal-body").append("name");//<p>タグの追加。
                $(".modal-body").append("price");//<p>タグの追加
                $("#successMsg").modal('show');//モーダルウィンドウを表示する
            })
            .fail(function (jqXHR, textStatus, errorThrown) {
                console.log(jqXHR.status); //例：404
                console.log(textStatus); //例：error
                console.log(errorThrown); //例：NOT FOUND
            })
            .always(function () {
                console.log("complete"); // complete
            });
    });
}