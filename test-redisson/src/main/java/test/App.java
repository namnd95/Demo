package test;

import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.RedissonClient;
import org.redisson.core.RMap;
import org.redisson.core.RSet;

class SomeObject {
	public int id;
	public int status;	
	public String name;
	
	public SomeObject(int id, int status){
		this.id = id ;
		this.status = status;
		name = "ABC";
	}
}

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RedissonClient redisson = Redisson.create();
    	RSet<SomeObject> set = redisson.getSet("abc");
    	set.add(new SomeObject(1,1));
    	set.add(new SomeObject(2,2));
    }
}
