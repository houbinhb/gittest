package com.houb.controller.system.basic;


import com.houb.model.Position;
import com.houb.model.RespBean;
import com.houb.service.PostionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {

    @Autowired
    PostionService postionService;


    @GetMapping("/")
    public List<Position> getAllPositions(){
        return postionService.getAllPositions();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if(postionService.addPosition(position)==1){
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }



    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        System.out.println("updatePosition===="+position);
        if(postionService.updatePosition(position)==1){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }


    @DeleteMapping("/{id}")
    public RespBean deletePosition(@PathVariable Integer id){
        if(postionService.deletePosition(id)==1){
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @DeleteMapping("/")
    public RespBean deletePositionsByIds(Integer[] ids){
        if(postionService.deletePositionsByIds(ids)==ids.length){
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
