package app.tree;

import javafx.scene.control.TextField;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Node{
    private static Long idCounter = 0L;
    private Long id= idCounter++;
    private TextField textField;

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    private Line line;

    private Node parent;
    private List<Node>children;
    private Integer up;

    public Node(Integer up){
        this.up = up;
    }

    public Node(TextField textField, Node parent, Integer up) {
        this.textField = textField;
        this.parent = parent;
        this.up = up;
        this.children=new ArrayList<>();
    }

    public static Long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(Long idCounter) {
        Node.idCounter = idCounter;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addChildren(Node node){
        children.add(node);
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }
}
