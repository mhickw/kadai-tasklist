package models;

import java.util.ArrayList;
import java.util.List;

public class TasksValidator {
    public static List<String> validate(Tasks t) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String deadline_error = _validateDeadline(t.getDeadline());
        if(!deadline_error.equals("")) {
            errors.add(deadline_error);
        }

        return errors;
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスク名を入力してください。";
        }

        return "";
    }

    private static String _validateDeadline(String deadline) {
        if(deadline == null || deadline.equals("")) {
            return "締め切りを入力してください。";
        }

        return "";
    }
}
