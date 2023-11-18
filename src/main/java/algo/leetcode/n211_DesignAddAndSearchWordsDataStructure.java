package algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class n211_DesignAddAndSearchWordsDataStructure {
    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("word");
        boolean isExist = obj.search("word");
        System.out.println(isExist);
    }


    static class WordDictionary {
        Node root = new Node();

        public WordDictionary() {
        }

        public void addWord(String word) {
            Node now = root;
            for (char key : word.toCharArray()) {
                now.child.putIfAbsent(key, new Node());
                now = now.child.get(key);
            }
            now.isEnd = true;
        }

        public boolean search(String word) {
            return searchHelper(root, word, 0);
        }

        private boolean searchHelper(Node now, String word, int index) {
            if (word.length() == index) return now.isEnd;
            Map<Character, Node> child = now.child;
            char key = word.charAt(index);
            if (child.containsKey(key)) {
                return searchHelper(child.get(key), word, index + 1);
            } else if (key == '.') {
                for (Node value : child.values()) {
                    if (searchHelper(value, word, index + 1)) return true;
                }
            }
            return false;
        }
    }

    static class Node {
        Map<Character, Node> child = new HashMap<>();
        boolean isEnd;
    }
}
