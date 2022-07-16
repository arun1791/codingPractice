import java.util.HashMap;
import java.util.Map;

class Test 
{
    public static void main(String[] args) {

        String inputString="Arunpalnehapal";

        HashMap<Character,Integer> map= new HashMap<>();

        char[] strArray=inputString.toCharArray();
        for(char c: strArray)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        
        System.out.println(" hi this new  prpgraming codiing plate fropm ");
    }
}