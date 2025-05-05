package de.dasbabypixel.gamelauncher.gles.es31

interface glDeleteProgramPipelines {
    /**
    * Name
    * ----
    * 
    * glDeleteProgramPipelines — delete program pipeline objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteProgramPipelines**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \*pipelines`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of program pipeline objects to delete.
    * 
    * _`pipelines`_
    * 
    * Specifies an array of names of program pipeline objects to delete.
    * 
    * Description
    * -----------
    * 
    * `glDeleteProgramPipelines` deletes the _`n`_ program pipeline objects whose names are stored in the array _`pipelines`_. Unused names in _`pipelines`_ are ignored, as is the name zero. After a program pipeline object is deleted, its name is again unused and it has no contents. If program pipeline object that is currently bound is deleted, the binding for that object reverts to zero and no program pipeline object becomes current.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PROGRAM_PIPELINE_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glDeleteProgramPipelines` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines
    */
    fun glDeleteProgramPipelines(n: UInt, pipelines: java.nio.IntBuffer)
}