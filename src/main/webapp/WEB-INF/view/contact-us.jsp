<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <title>Responsive Contact Us Form | CodingLab</title>
    <link rel="stylesheet" type="text/css" href="/schoolmanagementapp/URLToReachResourceFolder/css/contact-us-css.css">
    <!-- Fontawesome CDN Link -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container">
    <div class="content">
        <div class="left-side">
            <div class="address details">
                <i class="fas fa-map-marker-alt"></i>
                <div class="topic">Address</div>
                <div class="text-one">#44, Koppa</div>
                <div class="text-two">Chikkamagaluru, 577126</div>
            </div>
            <div class="phone details">
                <i class="fas fa-phone-alt"></i>
                <div class="topic">Phone</div>
                <div class="text-one">+91 7760516749</div>
                <div class="text-two">08265 221773</div>
            </div>
            <div class="email details">
                <i class="fas fa-envelope"></i>
                <div class="topic">Email</div>
                <div class="text-one">addmissions@youreschool.com</div>
                <div class="text-two">principal@youreschool.com</div>
            </div>
        </div>
        <div class="right-side">
            <div class="topic-text">Send Us a Message</div>
            <p>If you have any query please let us know through the message. We will be happy to answer you. Thank you</p>
            <form action="#">
                <div class="input-box">
                    <input type="text" placeholder="Enter your name" name="name">
                </div>
                <div class="input-box">
                    <input type="text" placeholder="Enter your email" name="email">
                </div>
                <div class="input-box text-message">
                    <textarea placeholder="Enter Message" name="message"></textarea>
                </div>
                <div class="button">
                    <input type="button" value="Send Message">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
    