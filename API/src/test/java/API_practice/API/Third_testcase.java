package API_practice.API;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Third_testcase
{
	public static void main(String[] args)
	{
		
	/*JSONObject inner=new JSONObject();
	inner.put("house no", "42");
	inner.put("sector", "harrow");
	
	JSONObject outer=new JSONObject();
	outer.put("firstname", "Anvi");
	outer.put("lastname", "mulugu");
	outer.put("id", "mulun1");
	outer.put("designation", "TL");
	outer.put("address", inner);
	System.out.println(outer.toString());*/
		
		JSONObject obj1=new JSONObject();
		obj1.put("house no", "42");
		obj1.put("sector", "harrow");
		obj1.put("type", "primary address");
		obj1.put("landmark", "kingsbury");
		
		JSONObject obj2=new JSONObject();
		obj2.put("house no", "42");
		obj2.put("sector", "harrow");
		obj2.put("type", "secondary address");
		obj2.put("landmark", "kingsbury");
	
	JSONArray array=new JSONArray();
	array.put(0,obj1);
	array.put(1,obj2);

	JSONObject outer=new JSONObject();
	outer.put("firstname", "Akki");
	outer.put("lastname", "mulugu");
	outer.put("id", "mulua2");
	outer.put("designation", "Lead");
	outer.put("address", array);
	
	System.out.println(outer.toString());
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(outer.toString())
			.when()
			.post("http://localhost:3000/APIstudents");
	System.out.println("status code is ");
	System.out.println(res.statusCode());
	
}
}