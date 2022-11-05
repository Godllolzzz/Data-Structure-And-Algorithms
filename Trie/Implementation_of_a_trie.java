class Node{
    Node links[] = new Node[26];
    boolean flag = false;
    
    public Node(){}
    boolean isContainsKey(char ch){
        return (links[ch-'a']!=null);
       }
    void put(Node node,char ch){
      links[ch-'a'] = node;
     }
     boolean isEnd(){
         return flag;
     }
      Node get(char ch) {
        return links[ch-'a']; 
    }
};

class Trie {
    public static Node root;
    public Trie() {
        root =new Node();
    }
    
    public void insert(String word) {
        Node newnode = root;
        for(int i = 0;i < word.length();i++){
            if(!newnode.isContainsKey(word.charAt(i)))
            newnode.put(new Node(),word.charAt(i));
           newnode=newnode.get(word.charAt(i));
        }
        newnode.flag = true;

    }
    
    public boolean search(String word) {
         Node newnode = root;
        for(int i = 0;i < word.length();i++){
            if(!newnode.isContainsKey(word.charAt(i)))
        return false;
        newnode=newnode.get(word.charAt(i));
        }
        
        if(newnode.isEnd()) {
            return true; 
        }
        return false; 
    }
    
    public boolean startsWith(String prefix) {
        Node newnode = root;
        for(int i=0;i<prefix.length();i++){
            if(!newnode.isContainsKey(prefix.charAt(i)))
            return false;
            newnode=newnode.get(prefix.charAt(i));
        }
        return true;
    }
}


	
