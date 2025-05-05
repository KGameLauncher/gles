package de.dasbabypixel.gamelauncher.gles.es20

interface glReleaseShaderCompiler {
    /**
    * Name
    * ----
    * 
    * glReleaseShaderCompiler — release resources consumed by the implementation's shader compiler
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glReleaseShaderCompiler**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glReleaseShaderCompiler` provides a hint to the implementation that it may free internal resources associated with its shader compiler. [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader] may subsequently be called and the implementation may at that time reallocate resources previously freed by the call to `glReleaseShaderCompiler`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glReleaseShaderCompiler | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glReleaseShaderCompiler.glReleaseShaderCompiler
    */
    fun glReleaseShaderCompiler()
}