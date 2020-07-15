$(document).ready(function () {
    $('#joinBtn').click(function () {
        window.location.href='/join';
    });

    $('#cancel').click(function () {
        window.location.href='/';
    });

    $('#selectcancel').click(function () {
        window.location.href='/';
    });

    $('#loginBtn').click(function () {
        window.location.href='/login';
    });

    $('#writeBtn').click(function () {
        window.location.href='/write';
    });


    $('#updateBtn').click(function () {
        var bno = $('#bno').val();
        window.location.href='/update/'+ bno;
    })


    $('#join').click(function () {
        var data = {
            id : $('#id').val(),
            password : $('#password').val(),
            name : $('#name').val(),
            role : $('#type').val()
        };

        $.ajax({
            type : 'post',
            url : '/rest/join',
            data : data
        }).done(function () {
            alert('회원가입 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#login').click(function () {
        var data = {
            id : $('#loginId').val(),
            password : $('#loginPassword').val(),
        };

        $.ajax({
            type : 'post',
            url : '/rest/login',
            data : data
        }).done(function () {
            alert('로그인 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#update').click(function () {
        var bno = $('#bno').val();

        var data = {
            bno : $('#bno').val(),
            title : $('#title').val(),
            writer : $('#writer').val(),
            content : $('#content').val(),
        };

        $.ajax({
            type : 'post',
            url : '/rest/update',
            data : data
        }).done(function () {
            alert('수정 완료');
            window.location.href='/select/'+bno;
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#reply').click(function () {
        var bno = $('#bno').val();

        var data = {
            bno : $('#bno').val(),
            rwriter : $('#rwriter').val(),
            rcontent : $('#rcontent').val(),
            mbo : $('#mbo').text()
        };

        $.ajax({
            type : 'post',
            url : '/rest/reply',
            data : data
        }).done(function () {
            alert('댓글달기 완료');
            window.location.href='/select/'+bno;
        }).fail(function (error) {
            alert(error);
        });
    });


    $('#delete').click(function () {
        var data = {
            bno : $('#bno').val(),
        };

        $.ajax({
            type : 'post',
            url : '/rest/delete',
            data : data
        }).done(function () {
            alert('삭제 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#reco').click(function () {
        var a = $('#type').text();
        alert("추천 타입 : " + a);
        var data = {
            bno : $('#bno').val(),
            type: $('#type').text(),
            mbo : $('#mbo').text(),
            name : $('#name').text()
        };

        $.ajax({
            type : 'post',
            url : '/rest/reco',
            data : data
        }).done(function () {
            alert('추천 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#write').click(function () {
        var data = {
            title : $('#title').val(),
            writer : $('#writer').val(),
            content : $('#content').val(),
            mbo : $('#mbo').text()
        };

        $.ajax({
            type : 'post',
            url : '/rest/write',
            data : data
        }).done(function () {
            alert('글등록 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });


});
