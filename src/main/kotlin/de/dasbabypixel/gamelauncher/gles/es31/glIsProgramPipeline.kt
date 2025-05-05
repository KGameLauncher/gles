package de.dasbabypixel.gamelauncher.gles.es31

interface glIsProgramPipeline {
    /**
    * Name
    * ----
    * 
    * glIsProgramPipeline — determine if a name corresponds to a program pipeline object
    * 
    * C Specification
    * ---------------
    * 
    * | `GLboolean **glIsProgramPipeline**(` | GLuint pipeline`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies a value that may be the name of a program pipeline object.
    * 
    * Description
    * -----------
    * 
    * `glIsProgramPipeline` returns `GL_TRUE` if _`pipeline`_ is currently the name of a program pipeline object. If _`pipeline`_ is zero, or if `pipeline` is not the name of a program pipeline object, or if an error occurs, `glIsProgramPipeline` returns `GL_FALSE`. If _`pipeline`_ is a name returned by [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], but that has not yet been bound through a call to [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], then the name is not a program pipeline object and `glIsProgramPipeline` returns `GL_FALSE`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glIsProgramPipeline` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glDeleteProgramPipeline](glDeleteProgramPipeline.xhtml)
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline
    */
    fun glIsProgramPipeline(pipeline: UInt): Boolean
}