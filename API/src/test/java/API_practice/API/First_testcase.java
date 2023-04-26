package API_practice.API;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class First_testcase
{
public static void main(String[] args)
{
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/Seleniumstudents?lastname=Mulugu&id=Anvita1");
	System.out.println("status code is "+res.statusCode());
	System.out.println("respose data is ");
	System.out.println(res.asString());
}
}
