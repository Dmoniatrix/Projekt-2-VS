const burgerMenu = document.querySelector(".burger-menu");
const navigation = document.querySelector(".navigation");

burgerMenu.addEventListener("click", function() {

    navigation.classList.toggle("is-open");

    const isOpen = navigation.classList.contains("is-open");

    burgerMenu.setAttribute("aria-expanded", isOpen);

    burgerMenu.setAttribute(
        "aria-label",
        isOpen ? "Luk menu" : "Åbn menu"
    );

});