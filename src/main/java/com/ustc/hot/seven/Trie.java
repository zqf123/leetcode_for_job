package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 15:56
 */
//208.实现Trie
public class Trie {
    public Trie[] children;
    public boolean isEnd;
    public Trie(){
        children = new Trie[26];
        isEnd = false;
    }
    public void insert(String word){
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null)
                node.children[index] = new Trie();
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word){
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    public boolean startsWith(String prefix){
        return searchPrefix(prefix) != null;
    }
    public Trie searchPrefix(String prefix){
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null)
                return null;
            node = node.children[index];
        }
        return node;
    }
}
