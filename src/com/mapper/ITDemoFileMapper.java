package com.mapper;

import com.database.data.TDemoFile;

import java.util.List;

/**
 * 数据库访问的映射接口
 * @author Rojay
 * @version 1.0.0
 * @createTime 2019年11月29日  11:26:56
 */
public interface ITDemoFileMapper {

    /**
     * 查询所有数据
     * @return
     * @throws Exception
     */
    public List<TDemoFile> selectAll(String fileName) throws Exception;

    /**
     * 根据ID获得文件数据
     * @param id
     * @return
     * @throws Exception
     */
    public TDemoFile getById(Integer id) throws Exception;

    /**
     * 添加文件数据
     * @param tdemoFile
     * @throws Exception
     */
    public void insert(TDemoFile tdemoFile) throws Exception;

    /**
     * 修改文件数据
     * @param tdemoFile
     * @throws Exception
     */
    public void update(TDemoFile tdemoFile) throws Exception;

    /**
     * 删除文件数据
     * @param ids
     * @throws Exception
     */
    public void deleteBatch(String[] ids) throws Exception;

}
