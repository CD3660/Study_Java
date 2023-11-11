package pack03.godata;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

public class Ex01_GoData {
	public static void main(String[] args) {
		HttpClient client = HttpClients.createDefault();//요청을 위한 객체 생성
		try {
			//주소와 파라메터를 보내기 위한 객체
			URIBuilder builder = new URIBuilder("https://api.odcloud.kr/api/3082925/v1/uddi:b4759786-c28c-41dd-b600-a9abdbec3ae1");
			builder.addParameter("page", "1");
			builder.addParameter("perPage", "100");
			builder.addParameter("serviceKey", "yr3jI5EoThvd72kwrLTTcRWsLE4KpeKTLkV1jf1YdS9fNSjE8/rWxW+MSAWi5s9ynHvgkP6MHupe16fD8ArVXw==");
			HttpGet request = new HttpGet(builder.build());
			
			HttpResponse response = client.execute(request);
			String responseBody = EntityUtils.toString(response.getEntity());
			
			PojoClass pojo = new Gson().fromJson(responseBody, PojoClass.class);
			//fromJson => StringJson 객체화 한다.
			//toJson => StringJson 객체를 Json으로 변환
			System.out.println(pojo.list.size());
			System.out.println(pojo.list.get(0).storeName);
			
			String pojoJson = new Gson().toJson(pojo);
			System.out.println(pojoJson);
			
			
//			JsonElement jElement = JsonParser.parseString(responseBody);
//			JsonObject jObj = jElement.getAsJsonObject();
//			JsonArray jArray = (JsonArray) jObj.get("data");
//			System.out.println(jArray.size());
//			
//			for(int i=0; i<jArray.size(); i++) {
//				JsonObject tempObject = jArray.get(i).getAsJsonObject();
//				System.out.print(tempObject.get("데이터기준일자")+" ");
//				System.out.print(tempObject.get("비고")+" ");
//				System.out.print(tempObject.get("상호명")+" ");
//				System.out.println(tempObject.get("소재지도로명주소"));
//			}
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public class PojoClass {
		@SerializedName("data")
		ArrayList<PojoInnerData> list;
		
		
		public class PojoInnerData{
			@SerializedName("상호명")//입력 받은 값이 상호명, 변수 이름을 storeName으로 한다.
			public String storeName;
			@SerializedName("기준일자")
			public String infoDate;
			@SerializedName("비고")
			public String comment;
			@SerializedName("소재지도로명주소")
			public String Address;
		}
	}
	
}
