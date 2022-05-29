import java.util.*;

public class TreeTraversal {

    //Inorder traversal: // left self right
    public void inorder(TreeNode node, List<Integer> inorderList ) {
        if(node == null)
            return;

        inorder(node.left, inorderList);
        inorderList.add(node.val);
        inorder(node.right, inorderList);

    }

    //Pre order traversal: // self left right
    public void preorder(TreeNode node, List<Integer> preorderList) {
        if(node == null)
            return;

        preorderList.add(node.val);
        preorder(node.left, preorderList);
        preorder(node.right, preorderList);

    }

    //Post order traversal: // left right self
    public void postorder(TreeNode node, List<Integer> postorderList) {
        if(node == null)
            return;

        postorder(node.left, postorderList);
        postorder(node.right, postorderList);
        postorderList.add(node.val);
    }

    //Level Order traversal: n-ary tree
    public List<Integer> levelorder(Node root) {
        List<Integer> result = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                Node curr = queue.poll();
                result.add(curr.val);

                if(curr.children != null){
                    /*
                    add all children to queue
                    for(Node child: curr.children){
                        queue.add(child);
                    }
                    */
                    queue.addAll(curr.children);
                }
            }
        }
        return result;
    }

    //Level Order traversal: binary tree
    public List<Integer> levelorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode curr = queue.poll();
                result.add(curr.val);

                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
        }
        return result;
    }

}
