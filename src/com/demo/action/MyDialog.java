package com.demo.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class MyDialog extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        // 获取当前工程对象
        Project project = e.getProject();
        // 调用接口显示弹窗
        Messages.showInputDialog(project
                ,"what is your name?","input your name",Messages.getQuestionIcon());
    }
}
