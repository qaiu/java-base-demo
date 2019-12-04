package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	
	@Test
	public void test1() throws Exception {
		Map<String, Double> map = getPrices("601525039803");
		
//		map.forEach((k,v)->{
//			System.out.println(k);
//			System.out.println(v);
//			
//		});
		System.out.println("ok");
		map = getPrices("607826182160");
		System.out.println("ok");
		
//		map.forEach((k,v)->{
//			System.out.println(k);
//			System.out.println(v);
//			
//		});
		
//		System.out.println(map);
		
		
	}

	private Map<String, Double> getPrices(String id) throws Exception {
		Map<String, Double> map = new HashMap<>();
		Document doc = Jsoup.connect("https://detail.tmall.com/item.htm?id="+id).get();
		Elements es = doc.getElementsByTag("script");
		es.forEach((e) -> {
			String data = e.data();
			if (data.contains("TShop.poc('buyshow');")) {
				data = data.substring(data
						.indexOf("TShop.Setup(") 
						+ "TShop.Setup(".length(), data.length() - 12)
						.trim();
				try {
					JsonNode valItemInfo = new ObjectMapper().readTree(data).get("valItemInfo");
					JsonNode skuList = valItemInfo.get("skuList");
					JsonNode skuMap = valItemInfo.get("skuMap");
					for (int i = 0; i < skuList.size(); i++) {
						String s = skuList.get(i).get("pvs").asText();
						map.put(skuList.get(i).get("names").asText(), 
								Double.parseDouble(skuMap
										.get(";"+s+";").get("price").asText()));
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		return map;
	}


}
