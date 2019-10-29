package com.example.controllerapi;


import com.example.mapper.StudentMapper;
import com.example.model.ResultModel;
import com.example.model.Student;
import com.example.util.ResultTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentApi {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public ResultModel selectAll() {
        try {
            List<Student> list = studentMapper.selectStudentAll();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("content", list);
            return ResultTools.result(0, "", map);
        } catch (Exception e) {
            return ResultTools.result(404, e.getMessage(), null);
        }
    }

    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    public ResultModel addUser(Student user) {
        try {
            int code = studentMapper.addStudent(user);
            if (1 == code) {
                return ResultTools.result(0, "", null);
            }
            return ResultTools.result(404, "失败", null);
        } catch (Exception e) {
            return ResultTools.result(404, e.getMessage(), null);
        }
    }

}