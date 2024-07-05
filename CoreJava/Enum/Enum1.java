enum Status{
    Running, Failed, Pending, Success;
}

class Enum1{
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] statusArr = Status.values();
        System.out.println(statusArr[0]);
        for(Status p : Status.values()){
            System.out.println(p + " : " + p.ordinal());
        }
        if(s == Status.Running){
            System.out.println("All Good!");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait!");
        } else if (s == Status.Failed) {
            System.out.println("Try Again!");
        }else{
            System.out.println("Done!");
        }

        switch(s){
            case Running:
                System.out.println("All Good!");
                break;
            case Pending:
                System.out.println("Please Wait!");
                break;
            case Failed:
                System.out.println("Try Again!");
                break;
            default:
                System.out.println("Done!");
                break;
        }
        System.out.println(s.getClass().getSuperclass());
    }
}