package de.dasbabypixel.gamelauncher.gles.es31

interface glBindProgramPipeline {
    /**
    * Name
    * ----
    * 
    * glBindProgramPipeline — bind a program pipeline to the current context
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindProgramPipeline**(` | GLuint pipeline`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the name of the pipeline object to bind to the context.
    * 
    * Description
    * -----------
    * 
    * `glBindProgramPipeline` binds a program pipeline object to the current context. _`pipeline`_ must be a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines]. If no program pipeline exists with name _`pipeline`_ then a new pipeline object is created with that name and initialized to the default state vector.
    * 
    * When a program pipeline object is bound using `glBindProgramPipeline`, any previous binding is broken and is replaced with a binding to the specified pipeline object. If _`pipeline`_ is zero, the previous binding is broken and is not replaced, leaving no pipeline object bound. If no current program object has been established by [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], the program objects used for each stage and for uniform updates are taken from the bound program pipeline object, if any. If there is a current program object established by [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], the bound program pipeline object has no effect on rendering or uniform updates. When a bound program pipeline object is used for rendering, individual shader executables are taken from its program objects.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not zero or a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glBindProgramPipeline` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glCreateShader][de.dasbabypixel.gamelauncher.gles.es20.glCreateShader.glCreateShader], [glCreateProgram][de.dasbabypixel.gamelauncher.gles.es20.glCreateProgram.glCreateProgram], [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader], [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram], [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines], [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline
    */
    fun glBindProgramPipeline(pipeline: UInt)
}