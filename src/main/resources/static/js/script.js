document.addEventListener('DOMContentLoaded', () => {
    // Set the wedding date
    const weddingDate = new Date('August 16, 2025 18:00:00').getTime();

    // Update the countdown timer every second
    const countdownInterval = setInterval(() => {
        const now = new Date().getTime();
        const distance = weddingDate - now;

        // When the countdown is finished, display a message
        if (distance < 0) {
            clearInterval(countdownInterval);
            document.getElementById('countdown').innerHTML = "<p>The wedding has arrived!</p>";
            return;
        }

        // Calculate days, hours, minutes, and seconds
        const days = Math.floor(distance / (1000 * 60 * 60 * 24));
        const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        const seconds = Math.floor((distance % (1000 * 60)) / 1000);

        // Update the elements with the calculated values
        document.getElementById('days').innerText = days;
        document.getElementById('hours').innerText = hours;
        document.getElementById('minutes').innerText = minutes;
        document.getElementById('seconds').innerText = seconds;
    }, 1000);

    // RSVP form submission handling
    const rsvpForm = document.getElementById('rsvpForm');
    rsvpForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const name = document.getElementById('name').value.trim();
        const email = document.getElementById('email').value.trim();

        if (name && email) {
            document.getElementById('rsvpMessage').innerText = `Thank you for RSVPing, ${name}! We look forward to celebrating with you.`;
            rsvpForm.reset();
        } else {
            document.getElementById('rsvpMessage').innerText = `Please fill in both your name and email.`;
        }
    });
});
