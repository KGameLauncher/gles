package de.dasbabypixel.gamelauncher.gles.es31

interface glActiveShaderProgram {
    /**
    * Name
    * ----
    * 
    * glActiveShaderProgram — set the active program object for a program pipeline object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glActiveShaderProgram**(` | GLuint pipeline, |
    * | --- | --- |
    * |   | GLuint program`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the program pipeline object to set the active program object for.
    * 
    * _`program`_
    * 
    * Specifies the program object to set as the active program pipeline object _`pipeline`_.
    * 
    * Description
    * -----------
    * 
    * `glActiveShaderProgram` sets the linked program named by _`program`_ to be the active program for the program pipeline object _`pipeline`_. The active program in the active program pipeline object is the target of calls to [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f] when no program has been made current through a call to [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ refers to a program object that has not been successfully linked.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glActiveShaderProgram` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines], [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glActiveShaderProgram.glActiveShaderProgram
    */
    fun glActiveShaderProgram(pipeline: UInt, program: UInt)
}