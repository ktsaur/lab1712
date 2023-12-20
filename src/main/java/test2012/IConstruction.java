package test2012;

//public class IConstruction implements Construction{
//    private Node stages;
//    private Stage currentStage;
//
//    public IConstruction() {
//        stages = new Node(null);
//        stages.setNext(new Node(new Project()));
//        stages.getNext().setNext(new Node(new Foundation()));
//        stages.getNext().getNext().setNext(new Node(new Wall()));
//        stages.getNext().getNext().getNext().setNext(new Node(new Roof()));
//        stages.getNext().getNext().getNext().getNext().setNext(new Node(new Finishing()));
//        stages.setPrev(stages.getNext().getNext().getNext().getNext());
//        stages.getNext().setPrev(stages.getNext().getNext().getNext());
//        stages.getNext().getNext().setPrev(stages.getNext().getNext());
//        stages.getNext().getNext().getNext().setPrev(stages.getNext());
//        stages.getNext().getNext().getNext().getNext().setPrev(stages);
//    }
//
//    public void start() {
//        while (currentStage != null) {
//            System.out.println("Этап исполнения: " + currentStage.getName()); currentStage.execute();
//            currentStage.setStatus(Status.Выполнен);
//        }
//    }
//
//    public void finish() {
//        System.out.println("Строительство закончено");
//    }
//}
