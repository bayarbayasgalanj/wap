$(document).ready(function () {
    const apiUrl = "https://jsonplaceholder.typicode.com";
    $('#fetchUserPosts').on('click', function () {
        const userId = $('#userIdInput').val();
        if (!userId) {
            alert('Please enter a User ID');
            return;
        }

        // Fetch user info
        $.get(`${apiUrl}/users/${userId}`, function (user) {
            $('#userInfo').html(`
                <h2>${user.name}</h2>
                <p>Email: ${user.email}</p>
                <p>Address: ${user.address.street}, ${user.address.city}</p>
            `);

            // Fetch user posts
            $.get(`${apiUrl}/posts?userId=${userId}`, function (posts) {
                $('#postsContainer').empty(); // Clear previous posts
                posts.forEach(post => {
                    $('#postsContainer').append(`
                        <div class="post" data-post-id="${post.id}">
                            <h3>${post.title}</h3>
                            <p>${post.body}</p>
                            <button class="showComments">Show Comments</button>
                            <div class="comments"></div>
                        </div>
                    `);
                });
            });
        });
    });

    // Event delegation for dynamically created elements
    $('#postsContainer').on('click', '.showComments', function () {
        const postId = $(this).parent().data('post-id');
        const commentsDiv = $(this).siblings('.comments');

        // Check if comments are already loaded
        if (commentsDiv.is(':empty')) {
            $.get(`${apiUrl}/comments?postId=${postId}`, function (comments) {
                comments.forEach(comment => {
                    commentsDiv.append(`
                        <div>
                            <strong>${comment.name}</strong>: ${comment.body}
                        </div>
                    `);
                });
            });
        }

        commentsDiv.toggle(); // Show/hide comments
    });
});
