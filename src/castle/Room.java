package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();
    
    
    

    public Room(String description) 
    {
        this.description = description;
    }
    
    // ���õ������䣻����������չ
    public void setExit(String dir,Room room)
    {
    	exits.put(dir, room);
    }

    
    @Override
    // �������û��һ��toString������ô���ʵ�������ӡ��������һ����ַ
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc()
    {
//    	String ret = ""; // 
//   	String�ǲ����޸ı���������ÿִ��һ��+���������һ���µı���������ϵͳ������ܴ�����һ�㲻�����ַ���
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
