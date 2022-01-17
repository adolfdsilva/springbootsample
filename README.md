### Follow Below Steps To Run This Program


1. Run discovery-server.
2. Run insurance-inventory-service.
3. Run customer-info-service.
4. Run customer-insurance-info.
5. Goto http://localhost:8761.
6. You should find CUSTOMER-INSURANCE-INFO running on port 8081, note the ip for the service.
7. Use Postman or any other REST client and call ${ip}/auth on the ip(JSON POST)
	<br>username: adolf
	<br>password: Adolfd@123
8. You should get jwt token in response.
9. Copy jwt token and call ${ip}/customer/insurance.
10. You should get a response of all the insruances the customer has opted for.
