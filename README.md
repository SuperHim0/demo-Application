this is the springboot RestFul api that take input from the contact page and send mail to the spacific mail so the owner can know that anyone want to contact him 
<h5 color="red">send data to localhost:8080/api/webdev/contact</h5>
<h1>Change to make your own</h1>
<p>1. change email to send data from a spacific user Go to Controller--> FormController --> add email to String to = "yourEmail@gmail.com"</p>
<h1>application properties</h1>
<p>spring.mail.username=hkkabaddi63@gmail.com
spring.mail.password=bcfyuqolvxrexdgy</p>
<p>change this username and password for your spacific</p>
<h2>change in sql connection</h2>
<p>  add your detail here in applicaion.properties files
spring.datasource.url=jdbc:mysql://localhost:3306/form
spring.datasource.username=root
spring.datasource.password=
</p>
