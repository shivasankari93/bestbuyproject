package page.component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import test.component.Base;
import util.WebUtils;

public class LinkTester extends Base{
	public void linkMethod() {
	  String url = "https://www.bestbuy.com/";
      
      try {
          HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
          connection.setRequestMethod("HEAD");
          int responseCode = connection.getResponseCode();
         
          if (responseCode == HttpURLConnection.HTTP_OK) {
              System.out.println("BestBuy link is reachable.");
          } else {
              System.out.println("BestBuy link is broken (HTTP response code: " + responseCode + ").");
          }
      } catch (IOException e) {
          System.out.println("An error occurred while testing the link: " + e.getMessage());
      } 
	}
}
