package controllers;

import com.google.inject.Inject;
import models.Student;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.student.create;
import views.html.student.index;

import java.util.Set;

public class StudentController extends Controller {

    @Inject
    FormFactory formfactory;

    public Result index() {
        Set<Student> students = Student.allStudent();
        return ok(index.render(students));
    }

    public Result create() {
        Form<Student> studentForm = formfactory.form(Student.class);
        return ok(create.render(studentForm));
       // return TODO();
    }

    public Result save() {
        Form<Student> studentForm = formfactory.form(Student.class);

        if (studentForm.hasErrors()) {
            return ok("error");
        } else {
            Student student = studentForm.get();
            Student.add(student);
            return redirect(routes.StudentController.index());
        }


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
