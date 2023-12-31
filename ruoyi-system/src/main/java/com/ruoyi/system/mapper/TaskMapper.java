package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Task;

/**
 * 任务进程
Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-07
 */
public interface TaskMapper 
{
    /**
     * 查询任务进程

     * 
     * @param id 任务进程
主键
     * @return 任务进程

     */
    public Task selectTaskById(Long id);

    /**
     * 查询任务进程
列表
     * 
     * @param task 任务进程

     * @return 任务进程
集合
     */
    public List<Task> selectTaskList(Task task);

    /**
     * 新增任务进程

     * 
     * @param task 任务进程

     * @return 结果
     */
    public int insertTask(Task task);

    /**
     * 修改任务进程

     * 
     * @param task 任务进程

     * @return 结果
     */
    public int updateTask(Task task);

    /**
     * 删除任务进程

     * 
     * @param id 任务进程
主键
     * @return 结果
     */
    public int deleteTaskById(Long id);

    /**
     * 批量删除任务进程

     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTaskByIds(Long[] ids);
}
