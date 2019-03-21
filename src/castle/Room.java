package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();
    
    
    

    public Room(String description) 
    {
        this.description = description;
    }
    
    // 设置单个房间；这样便于扩展
    public void setExit(String dir,Room room)
    {
    	exits.put(dir, room);
    }

    
    @Override
    // 如果这里没有一个toString方法那么类的实例对象打印出来就是一个地址
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc()
    {
//    	String ret = ""; // 
//   	String是不可修改变量，所以每执行一次+，都会产生一个新的变量，所以系统开销会很大，所以一般不用这种方法
//    	if (northExit != null)
//    		ret += "north";
//    	if (northExit != null)
//    		ret += "sourth";
    	StringBuffer sb = new StringBuffer();
    	for (String dir:exits.keySet())
    	{
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    public Room getExit(String direction) 
    {
    	return exits.get(direction);
    }
}
