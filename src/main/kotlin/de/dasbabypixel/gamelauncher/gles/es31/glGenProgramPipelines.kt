package de.dasbabypixel.gamelauncher.gles.es31

interface glGenProgramPipelines {
    /**
    * Name
    * ----
    * 
    * glGenProgramPipelines — reserve program pipeline object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenProgramPipelines**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*pipelines`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of program pipeline object names to reserve.
    * 
    * _`pipelines`_
    * 
    * Specifies an array of into which the reserved names will be written.
    * 
    * Description
    * -----------
    * 
    * `glGenProgramPipelines` returns _`n`_ previously unused program pipeline object names in _`pipelines`_. These names are marked as used, for the purposes of `glGenProgramPipelines` only, but they acquire program pipeline state only when they are first bound.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PROGRAM_PIPELINE_BINDING`
    * 
    * [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGenProgramPipelines` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines], [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines
    */
    fun glGenProgramPipelines(n: UInt, pipelines: java.nio.IntBuffer)
}