/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    private void helper(TreeNode root, StringBuilder sb){

        if(root == null){
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");

        helper(root.left, sb);
        helper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> queue = new LinkedList<>();

        for(String s : data.split(",")){
            queue.offer(s);
        }

        return build(queue);
    }

    private TreeNode build(Queue<String> queue){

        String val = queue.poll();

        if(val.equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = build(queue);
        root.right = build(queue);

        return root;
    }
}



// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
