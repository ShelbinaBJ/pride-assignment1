document.getElementById("registrationForm").addEventListener("submit", function(event) {
    event.preventDefault();
    
    // Clear previous error messages
    clearErrors();
    
    // Validate form fields
    const fullName = document.getElementById("fullName").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const department = document.getElementById("department").value;

    let isValid = true;

    // Full Name validation
    if (!fullName) {
        document.getElementById("nameError").textContent = "Full Name is required.";
        isValid = false;
    }

    // Email validation
    if (!validateEmail(email)) {
        document.getElementById("emailError").textContent = "Please enter a valid email.";
        isValid = false;
    }

    // Phone validation
    if (!validatePhone(phone)) {
        document.getElementById("phoneError").textContent = "Please enter a valid phone number.";
        isValid = false;
    }

    // Department validation
    if (!department) {
        document.getElementById("departmentError").textContent = "Please select a department.";
        isValid = false;
    }

    // If valid, submit data to MockAPI
    if (isValid) {
        const data = {
            fullName,
            email,
            phone,
            department
        };

        // Simulate sending data to a MockAPI
        sendToMockAPI(data);
    }
});

// Email validation function
function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

// Phone validation function
function validatePhone(phone) {
    const re = /^[0-9]{10}$/; // Adjust this regex as per your requirements
    return re.test(String(phone));
}

// Clear error messages
function clearErrors() {
    document.getElementById("nameError").textContent = "";
    document.getElementById("emailError").textContent = "";
    document.getElementById("phoneError").textContent = "";
    document.getElementById("departmentError").textContent = "";
}

// Simulate sending data to MockAPI
function sendToMockAPI(data) {
    // This is a placeholder for the actual API call
    console.log("Sending data to MockAPI:", data);
    alert("Registration successful! Data sent to MockAPI.");
}

