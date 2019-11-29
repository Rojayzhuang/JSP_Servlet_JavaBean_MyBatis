package com.database.data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 文件表的持久化类
 * @author Rojay
 * @version 1.0.0
 * @createTime 2019年11月29日  11:26:43
 */
public class TDemoFile implements Serializable {

    private Integer fileId; //文件ID
    private String fileName; //文件名（逻辑名称--展示给用户看到的文件名）
    private String fileUrl; //文件路径（物理名称--磁盘中的名称）
    private String fileType; //文件类型
    private String fileSuffix; //后缀
    private Integer fileSize; //文件长度
    private Timestamp operTime; //操作事件

    public TDemoFile() {

    }

    public TDemoFile(String fileName, String fileUrl, String fileType,
                     Integer fileSize, Timestamp operTime) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.operTime = operTime;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

}
