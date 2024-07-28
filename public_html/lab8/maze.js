$(document).ready(function() {
    var gameStatus = "playing"; 

    function setGameStatus(status) {
        gameStatus = status;
        if (status === "lose") {
            $(".boundary").addClass("youlose");
            $("#status").text("You lost! :(");
        } else if (status === "win") {
            $("#status").text("You win! :)");
        }
    }

    $(".boundary").mouseover(function() {
        if (gameStatus === "playing") {
            setGameStatus("lose");
        }
    });

    $("#end").mouseover(function() {
        if (gameStatus === "playing") {
            setGameStatus("win");
        }
    });

    $("#start").click(function() {
        gameStatus = "playing";
        $(".boundary").removeClass("youlose");
        $("#status").text("Click the \"S\" to begin.");
    });

    $("#maze").mouseleave(function() {
        if (gameStatus === "playing") {
            setGameStatus("lose");
        }
    });
});
