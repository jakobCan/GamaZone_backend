package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.payload.UploadFileResponse;
import com.example.gamazone_backend.service.FileStorageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

class FileControllerTest {
    @Mock
    Logger logger;
    @Mock
    FileStorageService fileStorageService;
    @InjectMocks
    FileController fileController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testUploadFile() {
/*        when(fileStorageService.storeFile(any())).thenReturn("storeFileResponse");

        UploadFileResponse result = fileController.uploadFile(null);
        Assertions.assertEquals(new UploadFileResponse("fileName", "fileDownloadUri", "fileType", 0L), result);*/
    }

    @Test
    void testDownloadFile() {
/*        when(fileStorageService.loadFileAsResource(anyString())).thenReturn(null);

        ResponseEntity<Resource> result = fileController.downloadFile("fileName", null);
        Assertions.assertEquals(null, result);*/
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme