$(document).ready(function(){
    // Handle RSVP form submission
    $('#rsvpForm').on('submit', function(e) {
        e.preventDefault();

        // Gather form data
        const name = $('#rsvpName').val().trim();
        const email = $('#rsvpEmail').val().trim();
        const attendance = $('#rsvpAttendance').val();

        // Example processing: Display a thank-you message (or send data to a server via AJAX)
        alert(`Thank you, ${name}! We have received your RSVP.`);

        // Reset form and close modal
        this.reset();
        $('#rsvpModal').modal('hide');
    });
});
