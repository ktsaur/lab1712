package test2012;
//по фундаменту(обьем грунта), стены(количество кирпичей), крыша (площадь), отделка (стоимость)

//переход к следующей стройке
//начало стройки - инициализация
//экземпляр класса наследуемый от стэйдж
public class Node implements IStage{
    private Stage stage;
    private Node next;
    private Node prev;
    //Node head;
    public Node(Stage stage) {
        this.stage = stage;
        this.next = null;
        this.prev = null;
    }
    @Override
    public Stage Stage_next() {
        if (next != null) {
            return next.stage;
        }
        return null;
    }
    @Override
    public Stage Stage_prev() {
        if (prev != null) {
            return prev.stage;
        }
        return null;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Node getNext() {
        return next;
    }

}


