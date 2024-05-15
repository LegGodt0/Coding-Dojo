function Click(){
    alert("Your cart is empty");
}

function aceptarCookies (){
    cajacookies.classList.add('fadeout');
    setTimeout(function (){
        cajacookies.style.display = 'none';
    }, 1000);
}

function openMenu (){
    mainMenu.classList.toggle('main-menu--show');
    toggleMenu.classList.toggle('movement-menu--toggle');
    container.classList.toggle('movement-container--toggle');
    body.classList.toggle('movement-body-height--togle');
}