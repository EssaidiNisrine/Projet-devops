function sendEmail() {
    Email.send({
        Host: "smtp.gmail.com",
        Username: "hamzakoutarz@gmail.com",
        Password: "jvcmycfqyvsdghmw",
        To: 'hamzakoutara@gmail.com',
        From: document.getElementById("email").value,
        Subject: "A meesage from the client",
        Body: "Email" + document.getElementById("email").value + "<br> Message : " + document.getElementById("message").value
    }).then(
        message => alert("message sent succesfully")
    );
}