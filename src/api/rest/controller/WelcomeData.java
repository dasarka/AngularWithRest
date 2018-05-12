package api.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/Welcome")
public class WelcomeData {
	@GET
	@Produces("application/xml")
	public String DefaultXMLData(){
		return "<staticData>"+"Hello Rest API"+"</staticData>";
	}
	@GET
	@Path("/JSON")
	@Produces("application/json")
	public String DefaultJSONData() throws JSONException{
		JSONObject object=new JSONObject();
		object.put("key1", "Hello Rest API");
		object.put("key2", "Developed by ARKA DAS");
		System.out.println("object "+object);
		return  object.toString();
	}
}
