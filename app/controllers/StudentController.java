package controllers;

import models.Student;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.student.index;

import java.util.Set;

public class StudentController extends Controller {

    public Result index() {
        Set<Student> students = Student.allStudent();
        return ok(index.render(students));
    }

    public Result create() {
        return TODO();
    }

    public Result save() {
        return TODO();
    }

    public Result show(Integer id) {
        return TODO();
    }

    public Result edit(Integer id) {
        return TODO();
    }

    public Result update() {
        return TODO();
    }

    public Result delete(Integer id) {
        return TODO();
    }
}
