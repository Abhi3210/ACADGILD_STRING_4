import java.util.*;
public class Assignment4{
	public static void main(String args[]){
String[] strArray = {"listen","pot","part","opt","trap","silent","top","this","hello","what","shit"};
Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
for(int i =0 ; i<strArray.length;i++){
char[] ch = strArray[i].toCharArray();
int total =0;
for(char character : ch){
total+=character;
}
if(map.containsKey(total)){
ArrayList<String> arrayList = map.get(total);
arrayList.add(strArray[i]);
map.put(total, arrayList);
}
else{
ArrayList<String> arrayList = new ArrayList<String>();
arrayList.add(strArray[i]);
map.put(total,arrayList);
}
}

for(Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()){
System.out.println("Anagram Sets:"+entry.getValue());
}
}
}
