$(document).ready(function() {
    var gameStatus = "playing"; // to track if the player is currently playing

    // Function to set the game status
    function setGameStatus(status) {
        gameStatus = status;
        if (status === "lose") {
            $(".boundary").addClass("youlose");
            $("#status").text("You lost! :(");
        } else if (status === "win") {
            $("#status").text("You win! :)");
        }
    }

    // Handle single boundary mouseover
    $("#boundary1").mouseover(function() {
        setGameStatus("lose");
    });

    // Handle all boundaries mouseover
    $(".boundary").mouseover(function() {
        if (gameStatus === "playing") {
            setGameStatus("lose");
        }
    });

    // Handle end mouseover
    $("#end").mouseover(function() {
        if (gameStatus === "playing") {
            setGameStatus("win");
        }
    });

    // Handle start click to reset the game
    $("#start").click(function() {
        gameStatus = "playing";
        $(".boundary").removeClass("youlose");
        $("#status").text("Click the \"S\" to begin.");
    });

    // Handle mouse leaving the maze container to prevent cheating
    $("#maze").mouseleave(function() {
        if (gameStatus === "playing") {
            setGameStatus("lose");
        }
    });
});
