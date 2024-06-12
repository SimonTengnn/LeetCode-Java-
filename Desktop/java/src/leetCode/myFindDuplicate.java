package src.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class myFindDuplicate {
    public List <List< String >> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();    //一个文件内容对应多个文件路径
        for(String path : paths){
            String[] tmp =path.split(" ");      // tmp[0]为路径  tmp[1]~tmp[n]为文件（内容）
            for(int i=1;i<tmp.length;i++){
                String[] str = tmp[i].split("\\(");     // str[0]为文件名 str[1]为文件内容)
                String fileName = str[0];
                String fileContent = str[1];
                fileContent.replace(")","");
                String filePath = tmp[0]+"/"+fileName;
                map.computeIfAbsent(fileContent,key->new ArrayList<>()).add(filePath);
            }
    }
        List <List< String >> ans =new ArrayList<>();
        for(String content : map.keySet()){            // 对map遍历，keySet就是key的集合
            if(map.get(content).size() >=2){
                ans.add(map.get(content));
            }
        }
        return ans;
    }
}
