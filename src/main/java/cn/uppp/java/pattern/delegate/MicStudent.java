package cn.uppp.java.pattern.delegate;

public class MicStudent implements Student {
    @Override
    public void handHomework() {
        System.out.println("学生Mic交作业");
    }
}
