package app.tree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class App extends Application {

    private static Node start;
    private static Predicate<Integer> condition1;
    private static Predicate<Integer> condition2;
    private static List<Node> allNode;
    private static List<Node> leavesList;

    private static Pane root = new Pane();
    @Override
    public void start(Stage primaryStage)  {

        // Создание узлов и листьев
        List<Integer> leaves = List.of(3, 4, 2, 1, 7, 6, 8, 8, 7, 3, 5, 4, 8, 9, 9, 3, 4, 7, 8, 4, 5, 8, 9, 8, 7, 9, 6, 5, 3, 0, 2, 7, 6, 8, 9, 8);
        leavesList = createLeaves(leaves);

        Node nodeUp2_1 = createNode(1, 50);
        Node nodeUp2_2 = createNode(1,100);
        Node nodeUp2_3 = createNode(1,150);

        Node nodeUp2_4 = createNode(1,350);
        Node nodeUp2_5 = createNode(1,400);
        Node nodeUp2_6 = createNode(1,450);

        Node nodeUp2_7 = createNode(1,550);
        Node nodeUp2_8 = createNode(1,600);

        Node nodeUp2_9 = createNode(1,750);
        Node nodeUp2_10 = createNode(1,800);
        Node nodeUp2_11 = createNode(1,850);

        Node nodeUp2_12 = createNode(1,950);
        Node nodeUp2_13 = createNode(1,1000);

        Node nodeUp2_14 = createNode(1,1100);
        Node nodeUp2_15 = createNode(1,1200);

        Node nodeUp3_1 = createNode(2,100);
        Node nodeUp3_2 = createNode(2,400);
        Node nodeUp3_3 = createNode(2,570);
        Node nodeUp3_4 = createNode(2,800);
        Node nodeUp3_5 = createNode(2,970);
        Node nodeUp3_6 = createNode(2,1150);

        Node nodeUp4_1 = createNode(3,280);
        Node nodeUp4_2 = createNode(3,700);
        Node nodeUp4_3 = createNode(3,1050);

        Node nodeUp5_1 = createNode(4,700);

        Node node1 = leavesList.get(0);
        Node node2 = leavesList.get(1);
        connect(nodeUp2_1,node1,root);
        connect(nodeUp2_1,node2,root);

        Node node3 = leavesList.get(2);
        Node node4 = leavesList.get(3);
        connect(nodeUp2_2,node3,root);
        connect(nodeUp2_2,node4,root);

        Node node5 = leavesList.get(4);
        Node node6 = leavesList.get(5);
        Node node7 = leavesList.get(6);
        connect(nodeUp2_3,node5,root);
        connect(nodeUp2_3,node6,root);
        connect(nodeUp2_3,node7,root);
////////////////////////////////////////////

        Node node8 = leavesList.get(7);
        Node node9 = leavesList.get(8);
        connect(nodeUp2_4,node8,root);
        connect(nodeUp2_4,node9,root);

        Node node10 = leavesList.get(9);
        Node node11 = leavesList.get(10);
        Node node12 = leavesList.get(11);
        connect(nodeUp2_5,node10,root);
        connect(nodeUp2_5,node11,root);
        connect(nodeUp2_5,node12,root);

        Node node13 = leavesList.get(12);
        Node node14 = leavesList.get(13);
        Node node15 = leavesList.get(14);
        connect(nodeUp2_6,node13,root);
        connect(nodeUp2_6,node14,root);
        connect(nodeUp2_6,node15,root);
////////////////////////////////////////////////

        Node node16 = leavesList.get(15);
        Node node17 = leavesList.get(16);
        connect(nodeUp2_7,node16,root);
        connect(nodeUp2_7,node17,root);

        Node node18 = leavesList.get(17);
        Node node19 = leavesList.get(18);
        connect(nodeUp2_8,node18,root);
        connect(nodeUp2_8,node19,root);

        /////////////////////////////////////////////////
        Node node20 = leavesList.get(19);
        Node node21 = leavesList.get(20);
        connect(nodeUp2_9,node20,root);
        connect(nodeUp2_9,node21,root);

        Node node22 = leavesList.get(21);
        Node node23 = leavesList.get(22);
        Node node24 = leavesList.get(23);
        connect(nodeUp2_10,node22,root);
        connect(nodeUp2_10,node23,root);
        connect(nodeUp2_10,node24,root);

        Node node25 = leavesList.get(24);
        Node node26 = leavesList.get(25);
        connect(nodeUp2_11,node25,root);
        connect(nodeUp2_11,node26,root);


/////////////////////////////////////////////////////

        Node node27 = leavesList.get(26);
        Node node28 = leavesList.get(27);
        connect(nodeUp2_12,node27,root);
        connect(nodeUp2_12,node28,root);

        Node node29 = leavesList.get(28);
        Node node30 = leavesList.get(29);
        Node node31 = leavesList.get(30);
        connect(nodeUp2_13,node29,root);
        connect(nodeUp2_13,node30,root);
        connect(nodeUp2_13,node31,root);
        //////////////////////////////////////

        Node node32 = leavesList.get(31);
        Node node33 = leavesList.get(32);
        connect(nodeUp2_14,node32,root);
        connect(nodeUp2_14,node33,root);

        Node node34 = leavesList.get(33);
        Node node35 = leavesList.get(34);
        Node node36 = leavesList.get(35);
        connect(nodeUp2_15,node34,root);
        connect(nodeUp2_15,node35,root);
        connect(nodeUp2_15,node36,root);

        //.......up3
        connect(nodeUp3_1,nodeUp2_1,root);
        connect(nodeUp3_1,nodeUp2_2,root);
        connect(nodeUp3_1,nodeUp2_3,root);

        connect(nodeUp3_2,nodeUp2_4,root);
        connect(nodeUp3_2,nodeUp2_5,root);
        connect(nodeUp3_2,nodeUp2_6,root);
//////////////////////////
        connect(nodeUp3_3,nodeUp2_7,root);
        connect(nodeUp3_3,nodeUp2_8,root);

        connect(nodeUp3_4,nodeUp2_9,root);
        connect(nodeUp3_4,nodeUp2_10,root);
        connect(nodeUp3_4,nodeUp2_11,root);
///////////////////////////
        connect(nodeUp3_5,nodeUp2_12,root);
        connect(nodeUp3_5,nodeUp2_13,root);

        connect(nodeUp3_6,nodeUp2_14,root);
        connect(nodeUp3_6,nodeUp2_15,root);

//.....up4
        connect(nodeUp4_1,nodeUp3_1,root);
        connect(nodeUp4_1,nodeUp3_2,root);

        connect(nodeUp4_2,nodeUp3_3,root);
        connect(nodeUp4_2,nodeUp3_4,root);

        connect(nodeUp4_3,nodeUp3_5,root);
        connect(nodeUp4_3,nodeUp3_6,root);

//....up5
        connect(nodeUp5_1,nodeUp4_1,root);
        connect(nodeUp5_1,nodeUp4_2,root);
        connect(nodeUp5_1,nodeUp4_3,root);


        List<Node> leavesListUp2 = List.of(nodeUp2_1,nodeUp2_2,nodeUp2_3,nodeUp2_4,nodeUp2_5,nodeUp2_6, nodeUp2_7,nodeUp2_8,nodeUp2_9,nodeUp2_10,nodeUp2_11,nodeUp2_12,nodeUp2_13,nodeUp2_14,nodeUp2_15);
        List<Node> leavesListUp3 = List.of(nodeUp3_1,nodeUp3_2,nodeUp3_3,nodeUp3_4,nodeUp3_5,nodeUp3_6);
        List<Node> leavesListUp4 = List.of(nodeUp4_1,nodeUp4_2,nodeUp4_3);
        List<Node> leavesListUp5 = List.of(nodeUp5_1);

        allNode= new ArrayList<>();
        allNode.addAll(leavesListUp2);
        allNode.addAll(leavesListUp3);
        allNode.addAll(leavesListUp4);
        allNode.addAll(leavesListUp5);

        // Добавление узлов и линий на панель
        root.getChildren().addAll(leavesList.stream().map(Node::getTextField).toList());
        root.getChildren().addAll(leavesListUp2.stream().map(Node::getTextField).toList());
        root.getChildren().addAll(leavesListUp3.stream().map(Node::getTextField).toList());
        root.getChildren().addAll(leavesListUp4.stream().map(Node::getTextField).toList());
        root.getChildren().addAll(leavesListUp5.stream().map(Node::getTextField).toList());


        start =node1;
        condition1 = n -> n % 2 == 0;
        condition2 = n -> n % 2 != 0;


        primaryStage.setTitle("Algoritm minMax");
        Scene scene = new Scene(root, 1420, 500);


        scene.setOnKeyPressed(event -> {

            if(event.isControlDown() && event.getCode() == KeyCode.COMMA){
                start=node1;
                System.out.println("Обход слева");
            }

            if(event.isControlDown()&& event.getCode() == KeyCode.PERIOD) {
                start = node36;
                System.out.println("Обход с права");
            }

            if (!event.isControlDown()&& event.getCode() == KeyCode.COMMA){
                clearRecursive(start);
                minMaxRecursive(start,condition1,condition2);
                Node n=allNode.get(allNode.size()-1);
                printPath(n);
            }

            if (!event.isControlDown()&& event.getCode() == KeyCode.PERIOD) {
                clearRecursive(start);
                minMaxRecursive(start, condition2, condition1);
                Node n=allNode.get(allNode.size()-1);
                printPath(n);

            }

            System.out.println("Клавиша нажата "+event.getCode());

        });


        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private static TextField createTextField(double x, double y) {
        TextField textField = new TextField();
        textField.setPrefWidth(25);
        textField.setPrefHeight(25);
        textField.setLayoutX(x);
        textField.setLayoutY(y);
        textField.setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: black;-fx-font-size: 8px;");
        return textField;
    }

    private static Node createNode(int level, int step){
        int up = switch (level) {
            case 0 -> 450;
            case 1 -> 350;
            case 2 -> 300;
            case 3 -> 200;
            case 4 -> 100;
            default -> throw new RuntimeException("Не верный уровень");
        };

        TextField textField = createTextField(step,up);
        textField.setText("null");

        Node node =new Node(textField, null,level);
        node.getTextField().setOnMouseClicked(event -> {
            handleTextFieldClick(node);
        });
        root.setOnMouseClicked(event -> {
            textField.getParent().requestFocus(); // Забираем фокус с TextField
        });
    //    node.getTextField().setOnKeyPressed(event->  changeValue(node));

        return node;
    }

    private static List<Node> createLeaves(List<Integer>leaves){
        List<Node>leavesList=new ArrayList<>();
        int lenAtoB=10;
        for(int i=0;i<leaves.size();i++){
            Node node=createNode(0,lenAtoB);
            node.getTextField().setText(leaves.get(i).toString());
            leavesList.add(node);
            lenAtoB=lenAtoB+35;
        }
        return leavesList;
    }

    private static void connect(Node parent,Node node, Pane pane,Color color){
        if(color==null)
            color=Color.BLACK;

        Line line = new Line();

        double centerRootX = 10+parent.getTextField().getLayoutX() + parent.getTextField().getWidth() / 2;
        double centerRootY = 10+parent.getTextField().getLayoutY() + parent.getTextField().getHeight() / 2;
        double centerX = 10+node.getTextField().getLayoutX() + node.getTextField().getWidth() / 2;
        double centerY = 10+node.getTextField().getLayoutY() + node.getTextField().getHeight() / 2;
        line.setStartX(centerX);
        line.setStartY(centerY);
        line.setEndX(centerRootX);
        line.setEndY(centerRootY);

        line.setStroke(color);
        node.setLine(line);

        node.setParent(parent);
        parent.addChildren(node);
        pane.getChildren().add(line);
    }

    private static void connect(Node parent,Node node, Pane pane){
        connect(parent,node,pane,null);
    }


    private static List<Node>closedList=new ArrayList<>();

    private static void minMaxRecursive(Node node, Predicate<Integer> condition1, Predicate<Integer> condition2) {
        if (node == null)
            return;

            if (node.getParent() != null) {
                Node parent = node.getParent();
                String valueParentString = parent.getTextField().getText();

                if (condition1.test(node.getUp())) {
                    Integer minValue = parentMinChildIsHigher(node);
                    if (!valueParentString.equals("null")) {
                        int valueParentInt = Integer.parseInt(valueParentString);
                        if (minValue != null && minValue < valueParentInt)
                            parent.getTextField().setText(minValue.toString());
                        parent.getTextField().setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: blue;-fx-font-size: 8px;");
                    } else if (minValue != null) {
                        parent.getTextField().setText(minValue.toString());
                        parent.getTextField().setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: blue;-fx-font-size: 8px;");
                    }
                }

                if (condition2.test(node.getUp())) {
                    Integer maxValue = parentMaxChildIsHigher(node);
                    if (!valueParentString.equals("null")) {
                        int valueParentInt = Integer.parseInt(valueParentString);
                        if (maxValue != null && maxValue > valueParentInt) {
                            parent.getTextField().setText(maxValue.toString());
                            parent.getTextField().setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: red;-fx-font-size: 8px;");
                        }
                    } else if (maxValue != null) {
                        parent.getTextField().setText(maxValue.toString());
                        parent.getTextField().setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: red;-fx-font-size: 8px;");
                    }
                }

            }


        // Обходим всех детей узла
        for (Node child : node.getChildren()) {
            if(!closedList.contains(child)){
                closedList.add(child);
                if(node.getParent()!=null)
                node.getParent().getTextField().setText("null");
                node.getTextField().setText("null");
                minMaxRecursive(child,condition1,condition2);
            }
        }

        // После обхода всех детей двигаемся к родителю
        minMaxRecursive(node.getParent(),condition1,condition2);
    }


    private static void clearRecursive(Node node) {
        if (node == null) {
            return;
        }
        closedList.clear();
        leavesList.forEach(n->{
            if(n.getLine()!=null)
                n.getLine().setStroke(Color.BLACK);
        });

        allNode.forEach(n->{
            if(n.getLine()!=null)
                n.getLine().setStroke(Color.BLACK);
        });

        allNode.forEach(e -> {
            e.getTextField().setText("null");
            e.getTextField().setStyle("-fx-background-radius: 20; -fx-border-radius: 20; -fx-border-color: black;-fx-font-size: 8px;");
        });
    }


private static List<Node> getListBrothers(Node node){
        Node parent =  node.getParent();
        return parent.getChildren().stream().filter(n->!n.getTextField().getText().equals("null")).toList();
}

private static Comparator<Node>compareNodeByValue(){
        Comparator<Node> comparator = Comparator.comparingInt(n ->Integer.parseInt(n.getTextField().getText()));
        return comparator;
    }

private static Integer parentMinChildIsHigher(Node node) {
    List<Node> childrensValueNotNull=getListBrothers(node);
    if(childrensValueNotNull.size()!=0)
        return Integer.parseInt(Collections.min(childrensValueNotNull, compareNodeByValue()).getTextField().getText());
    return null;
}

    private static Integer parentMaxChildIsHigher(Node node) {
        List<Node> childrensValueNotNull=getListBrothers(node);
        if(childrensValueNotNull.size()!=0)
            return Integer.parseInt(Collections.max(childrensValueNotNull, compareNodeByValue()).getTextField().getText());
        return null;
    }


    private static void handleTextFieldClick(Node node) {
        System.out.println("Clicked on TextField with ID: " + node.getId());
    }

    private static void changeValue(Node node){
        node.getTextField().textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Текст изменен на: " + newValue);
            if(!newValue.equals("")) {
                clearRecursive(start);
                minMaxRecursive(start,condition1,condition2);
            }
        });

    }

    private static void printPath(Node node){
        if (node==null)
            return;

        Node current = null;
        List<Node>c=node.getChildren();

        if (condition1.test(node.getUp()))
            current = Collections.min(c, compareNodeByValue());


        if(condition2.test(node.getUp()))
            current = Collections.max(c, compareNodeByValue());


        current.getLine().setStroke(Color.ORANGE);
        printPath(current);

    }

    public static void main(String[] args) {
        launch();
    }
}