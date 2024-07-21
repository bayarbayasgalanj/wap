document.addEventListener("DOMContentLoaded", () => {
    const textArea = document.getElementById("text-area");
    const startButton = document.getElementById("start");
    const stopButton = document.getElementById("stop");
    const animationSelect = document.getElementById("animation");
    const fontsizeSelect = document.getElementById("fontsize");
    const turboCheckbox = document.getElementById("turbo");

    let timer = null;
    let animationFrames = [];
    let currentFrame = 0;
    let interval = 250;
    let originalText = "";

    startButton.addEventListener("click", () => {
        originalText = textArea.value;
        animationFrames = textArea.value.split("=====\n");
        currentFrame = 0;
        timer = setInterval(showNextFrame, interval);

        startButton.disabled = true;
        stopButton.disabled = false;
        animationSelect.disabled = true;
    });

    stopButton.addEventListener("click", () => {
        clearInterval(timer);
        textArea.value = originalText;

        startButton.disabled = false;
        stopButton.disabled = true;
        animationSelect.disabled = false;
    });

    animationSelect.addEventListener("change", () => {
        textArea.value = ANIMATIONS[animationSelect.value];
    });

    fontsizeSelect.addEventListener("change", () => {
        textArea.style.fontSize = getFontSize(fontsizeSelect.value);
    });

    turboCheckbox.addEventListener("change", () => {
        interval = turboCheckbox.checked ? 50 : 250;
        if (timer) {
            clearInterval(timer);
            timer = setInterval(showNextFrame, interval);
        }
    });

    function showNextFrame() {
        textArea.value = animationFrames[currentFrame];
        currentFrame = (currentFrame + 1) % animationFrames.length;
    }

    function getFontSize(size) {
        switch (size) {
            case "Tiny": return "7pt";
            case "Small": return "10pt";
            case "Medium": return "12pt";
            case "Large": return "16pt";
            case "Extra Large": return "24pt";
            case "XXL": return "32pt";
            default: return "12pt";
        }
    }
});
