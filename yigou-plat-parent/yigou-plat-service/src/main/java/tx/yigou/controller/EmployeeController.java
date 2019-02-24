package tx.yigou.controller;

import org.springframework.web.bind.annotation.*;
import tx.yigou.domain.Employee;
import tx.yigou.util.AjaxResult;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getName())&&"123".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登陆成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登陆失败");
        }
    }
}
