import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.inesv.digiccy.wallet.EthcoinAPI;

public class ethTest {

	public static void main(String[] args) {
/*       EthcoinAPI eth=new EthcoinAPI("", "123456", "127.0.0.1", "8545", "123456");
	     String balance = eth.getBalance("0xf7F1880Fd7015e634DE4D9E8554E85EDbae1a6F5");
	     System.out.println("balance:"+balance); */
		

 
		
/*		//获取主账户
        Object[] params = new Object[]{""}; //0x407d73d8a49eeb85d32cf465507dd71d507100c1
        String methodName = "eth_coinbase";
        try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://127.0.0.1:8545"));
            Object address = client.invoke(methodName, params, Object.class);
            System.out.println(address);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } */
		
/* 	       Object[] params = new Object[]{"0x47800350DB28Fc6b70971c839D1f4b215250462e", "latest"}; //0x407d73d8a49eeb85d32cf465507dd71d507100c1
	        String methodName = "eth_getBalance";
	        try {
	            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://127.0.0.1:8545"));
	            Object address = client.invoke(methodName, params, Object.class);
	            System.out.println(address);
	        } catch (Throwable throwable) {
	            throwable.printStackTrace();
	        }  */
		
/*	    Float f=9.7f; 
	    String num = Integer.toHexString(Float.floatToIntBits(f));
	    System.out.println(); 
 */
	    
         EthcoinAPI eth=new EthcoinAPI("gyw","gyw","35.200.124.75","8545","gyw");
		 String address = eth.newAccount("123456789");
        // String res = eth.sendTransaction("0x47800350DB28Fc6b70971c839D1f4b215250462e", "0x923F91898AAb23191315c12f832A380ce4fea5E9","0x1");
		 System.out.println(address); 
		
		
		

		
  
		
 //转账
/*		 String unLockMethodName = "personal_unlockAccount";
		Object[] paramsObj = new Object[]{"0x47800350DB28Fc6b70971c839D1f4b215250462e","123456789"};
		
		 callMethod(unLockMethodName,paramsObj);
		
		Map<String,String> reqMap = new HashMap<>();
		reqMap.put("from", "0x47800350DB28Fc6b70971c839D1f4b215250462e");
		reqMap.put("to", "0x2225227a5c702A5abB89e953AAc4d0Ff85c09C11");
		reqMap.put("value", "0x1");
 	   	Object[] params = new Object[]{reqMap};    //0x407d73d8a49eeb85d32cf465507dd71d507100c1
        String methodName = "eth_sendTransaction";
        callMethod(methodName,params); */
        
		//0xada8c9a96be14e0bcbcc876f45a34f358d75995544d211fef5801bc2f86ef75b
        
		//返回从地址发送的事务数。
       /*  String receiptMethodName = "eth_getTransactionCount";
		Object[] paramsTX = new Object[]{"0x47800350DB28Fc6b70971c839D1f4b215250462e","latest"};
		callMethod(receiptMethodName,paramsTX); */
		
        
		//返回有关由事务哈希请求的事务的信息。
/*        String receiptMethodName = "eth_getTransactionByHash";
		Object[] paramsTX = new Object[]{"0xada8c9a96be14e0bcbcc876f45a34f358d75995544d211fef5801bc2f86ef75b"};
		callMethod(receiptMethodName,paramsTX); */
		
		//返回有关由事务哈希请求的事务的信息。
/*        String receiptMethodName = "eth_getTransactionByHash";
		Object[] paramsTX = new Object[]{"0xada8c9a96be14e0bcbcc876f45a34f358d75995544d211fef5801bc2f86ef75b"};
		callMethod(receiptMethodName,paramsTX); */
 
		
/*		//查询主账户
        String receiptMethodName = "eth_coinbase";
		Object[] paramsTX = new Object[]{};
		callMethod(receiptMethodName,paramsTX); 	*/	
		
		 
/*        String receiptMethodName = "eth_getBlockByHash";
		Object[] paramsTX = new Object[]{"0xe670ec64341771606e55d6b4ca35a1a6b75ee3d5145a99d05921026d1527331",true};
		callMethod(receiptMethodName,paramsTX); 
		*/
		 
/*		EthcoinAPI eth=new EthcoinAPI("user","123456","47.89.245.230","8545","123456");
		BigDecimal wei = new BigDecimal("1000000000000000000");
	    BigDecimal truenumZXDW = new BigDecimal(0.1).multiply(wei);
		String from  = "0x022e9Ed89b21EB627F2fA3a39545d5F0880980E5";
	    String to = eth.getMainaccount();
	    String value = "0x" + Long.toHexString(truenumZXDW.longValue());
	   */
	    
		/* String res = eth.sendTransaction(from, to, value);*/
/*	    String res =eth.unlock(eth.getMainaccount(), "123456789");
		 System.out.println("-"+res);
		 */
		  /*List<String> list = new ArrayList<String>();  
	      list = JSONObject.parseArray(res, String.class);  
	  	 System.out.println(list.size());*/
    }
	
/*	
	public static void callMethod(String methodName,Object[] parmas){
		try {
            JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://127.0.0.1:8545"));
            Object res = client.invoke(methodName, parmas, Object.class);
            System.out.println(res);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }   
	}*/
	 
 
     
}
