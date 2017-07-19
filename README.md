#### How to run

deploy on tomcat and go to http://localhost:8080/sia_p219_ch08_spring_web_flow_order_pizza/pizza?

Why `/pizza`?, because the main flow is located at `/WEB-INF/flows/pizza/pizza-flow.xml` and the basePath is set to `/WEB-INF/flows`, so pizza is its ID.

#### Notable files:

- context definition file: `/main/webapp/WEB-INF/spring/flow.xml`
- ​