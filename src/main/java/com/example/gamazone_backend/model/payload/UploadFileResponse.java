package com.example.gamazone_backend.model.payload;

public class UploadFileResponse {

    private String fileName;
    private String filePath;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String filePath, String fileType, long size) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileType = fileType;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
