package LambdaExpressions2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
