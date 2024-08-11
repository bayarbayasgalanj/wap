$(document).ready(function () {
    $('#start').click(function () {
        const width = parseInt($('#width').val());
        const growthAmount = parseInt($('#growth-amount').val());
        const growRate = parseInt($('#grow-rate').val());
        const numCircles = parseInt($('#num-circles').val());

        $('#circles-container').empty(); // Clear any existing circles

        for (let i = 0; i < numCircles; i++) {
            const randomColor = getRandomColor();
            const circle = $('<div class="circle"></div>').css({
                width: width + 'px',
                height: width + 'px',
                top: Math.random() * ($('#circles-container').height() - width) + 'px',
                left: Math.random() * ($('#circles-container').width() - width) + 'px',
                backgroundColor: randomColor
            });

            $('#circles-container').append(circle);

            const interval = setInterval(function () {
                let currentWidth = circle.width();
                circle.css({
                    width: currentWidth + growthAmount + 'px',
                    height: currentWidth + growthAmount + 'px',
                });
            }, growRate);

            circle.click(function () {
                clearInterval(interval);
                circle.remove();
            });
        }
    });

    function getRandomColor() {
        const letters = '0123456789ABCDEF';
        let color = '#';
        for (let i = 0; i < 6; i++) {
            color += letters[Math.floor(Math.random() * 16)];
        }
        return color;
    }
});