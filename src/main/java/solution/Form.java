package solution;

interface Form{
    default double calculatePerimeter(){
        return 0;
    }
    default double calculateArea(){
        return 0;
    }
}
