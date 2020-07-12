package com.lamp.light;

import com.lamp.light.annotation.Header;
import com.lamp.light.annotation.Headers;
import com.lamp.light.annotation.POST;
import com.lamp.light.annotation.Path;
import com.lamp.light.annotation.Query;

@POST("/testInterface")
public interface TestInterface {

    @Headers({"Connet-Type:laohu"})
    @POST("/testHead}")
    public ReturnObject testHead(@Header({"key","id"}) ReturnObject returnObject, @Header("cccc") String cccc);
    
    @POST("/testHead}")
    public ReturnObject testQuery(@Query({"key","id"}) ReturnObject returnObject, @Query("query") String query);
    
    @POST("/testObject/{key}/{id}/{path}")
    public ReturnObject testPath(@Path({"key","id"}) ReturnObject returnObject, @Path("path") String path);
    
    @POST("/testObject")
    public ReturnObject testObject(ReturnObject returnObject);
}
