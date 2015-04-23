import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.EOFException;



import netscape.javascript.JSObject;


import static org.json.simple.JSONValue.*;


/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main (String args[]) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException
  {

     // getEmail();
      Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

      Map<String, Object> customerParams = new HashMap<String, Object>();
      customerParams.put("limit", 3);

      System.out.println(Customer.all(customerParams));

  }
//    public static ArrayList<String> getEmail() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException
//    {
//
//        ArrayList<String> emailArray = new ArrayList<String>();
//        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
//
//        Map<String, Object> customerParams = new HashMap<String, Object>();
//        customerParams.put("limit", 3);
//
//
//        //I tried to convert the JSON blob into a String. That didn't work
//        //It suggested using the valueOf, so I did that.
//        String doc = String.valueOf(Customer.all(customerParams));
//        JSONObject customerData = (JSONObject) parse(doc);
//
//        JSONArray data = (JSONArray)customerData.get("data");
//        //Iterate through each item in the data array for "email'
//        //If it has "email" grab it and add it to emailArray
//        for (int i = 0; i< data.size(); i++){
//            JSONObject currentIndex = (JSONObject)data.get(i);
//
//            if (currentIndex.containsKey("email")) {
//                String email = (String)currentIndex.get("email");
//                emailArray.add(email);
//            }
//        }
//        System.out.println(emailArray);
//        return emailArray;
//
//    }
}
