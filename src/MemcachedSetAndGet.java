import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcachedSetAndGet {

	   public static void main(String[] args) throws IOException{
	      //Connecting to Memcached server on localhost
	      MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
	      System.out.println("Connection to server sucessfully");
	      System.out.println("set status:" + mcc.set("yiibai", 900, "memcached111").isDone());
	      //Get value from cache
	      System.out.println("Get from Cache:" + mcc.get("yiibai"));
	   }
}
