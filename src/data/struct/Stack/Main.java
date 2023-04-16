package data.struct.Stack;

public class Main {

    public static void main(String[] args){

//        ArrayStack stack = new ArrayStack(10);
        Employee janejones = new Employee("Jane","Jones",1);
        Employee johndoe = new Employee("John","Doe",2);
        Employee marysmith = new Employee("Mary","Smith",3);
        Employee johnwick = new Employee("John","Wick",4);

        LinkedListStack stack = new LinkedListStack();
        stack.push(janejones);
        stack.push(johndoe);
        stack.push(marysmith);
        stack.push(johnwick);

        stack.printStack();

        stack.pop();
        stack.printStack();

        System.out.println(stack.peek());


//        stack.printStack();
//
//        System.out.println(stack.peek());
//
//        System.out.println("Popped : " + stack.pop());
//        stack.printStack();



    }

}
