package API;

public class Test4 {
		 @Test
		 public void test_updateUser() {
		  RestAssured.useRelaxedHTTPSValidation();
		  JSONObject request = new JSONObject();
		  request.put("name","kamal");
		  request.put("job","TestEngineer");
		  System.out.println(request.toJSONString());
		  baseURI ="https://reqres.in";
		  given().
		   //header("Content-Type","application/json").
		   body(request.toJSONString()).
		  when(). 
		   put("/api/users/2").
		  then().
		   statusCode(200).
		   log().all();
		}
		 
}
