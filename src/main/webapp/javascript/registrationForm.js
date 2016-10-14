$(document).ready(function(){

    $('input#email, textarea#message').unbind().blur( function(){
        var id = $(this).attr('id');
        var val = $(this).val();

        switch(id)
        {
            case 'email':
                var rv_email = /^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
                if(val != '' && rv_email.test(val))
                {
                    $(this).addClass('not_error');
                    $(this).next('.error-box').text('Принято')
                        .css('color','green')
                        .animate({'paddingLeft':'10px'},400)
                        .animate({'paddingLeft':'5px'},400);
                }
                else
                {
                    $(this).removeClass('not_error').addClass('error');
                    $(this).next('.error-box').html('<p>Поле должно содержать правильный email-адрес<p>')
                        .css('color','red')
                        .animate({'paddingLeft':'10px'},400)
                        .animate({'paddingLeft':'5px'},400);
                }
                break;}

    });
});
