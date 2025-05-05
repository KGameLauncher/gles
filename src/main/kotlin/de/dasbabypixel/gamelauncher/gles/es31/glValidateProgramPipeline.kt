package de.dasbabypixel.gamelauncher.gles.es31

interface glValidateProgramPipeline {
    /**
    * Name
    * ----
    * 
    * glValidateProgramPipeline — validate a program pipeline object against current GL state
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glValidateProgramPipeline**(` | GLuint pipeline`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the name of a program pipeline object to validate.
    * 
    * Description
    * -----------
    * 
    * `glValidateProgramPipeline` instructs the implementation to validate the shader executables contained in _`pipeline`_ against the current GL state. The implementation may use this as an opportunity to perform any internal shader modifications that may be required to ensure correct operation of the installed shaders given the current GL state.
    * 
    * After a program pipeline has been validated, its validation status is set to `GL_TRUE`. The validation status of a program pipeline object may be queried by calling [glGetProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv] with parameter `GL_VALIDATE_STATUS`.
    * 
    * If _`pipeline`_ is a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] but that has not yet been bound by a call to [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], a new program pipeline object is created with name _`pipeline`_ and the default state vector.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv] with parameter `GL_VALIDATE_STATUS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glValidateProgramPipeline` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glValidateProgramPipeline.glValidateProgramPipeline
    */
    fun glValidateProgramPipeline(pipeline: UInt)
}