package com.segment.analytics.internal.http;

import com.segment.analytics.internal.Batch;
import retrofit.http.Body;
import retrofit.http.POST;

public interface SegmentService {
  @POST("/v1/import") UploadResponse upload(@Body Batch batch);
}
