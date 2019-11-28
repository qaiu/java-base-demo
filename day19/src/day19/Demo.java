package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {


	@Test
	public void test1() throws Exception {
		Document doc = Jsoup.connect("https://detail.tmall.com/item.htm?id=605646144218").get();
		Elements es = doc.getElementsByTag("script");
		Class<? extends Jsoup> cc=Jsoup.class;
		List<?extends Number> nums = new ArrayList<>();
//		num.add(111);
		//		String data;
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
					System.out.println(skuList);
					System.out.println(skuMap);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
	}


}
