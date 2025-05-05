package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramPipelineiv {
    /**
    * Name
    * ----
    * 
    * glGetProgramPipeline — retrieve properties of a program pipeline object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramPipelineiv**(` | GLuint pipeline, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the name of a program pipeline object whose parameter retrieve.
    * 
    * _`pname`_
    * 
    * Specifies the name of the parameter to retrieve.
    * 
    * _`params`_
    * 
    * Specifies the address of a variable into which will be written the value or values of _`pname`_ for _`pipeline`_.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramPipelineiv` retrieves the value of a property of the program pipeline object _`pipeline`_. _`pname`_ specifies the name of the parameter whose value to retrieve. The value of the parameter is written to the variable whose address is given by _`params`_.
    * 
    * If _`pname`_ is `GL_ACTIVE_PROGRAM`, the name of the active program object of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_VERTEX_SHADER`, the name of the current program object for the vertex shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_FRAGMENT_SHADER`, the name of the current program object for the fragment shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_TESS_CONTROL_SHADER`, the name of the current program object for the tessellation control shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_TESS_EVALUATION_SHADER`, the name of the current program object for the tessellation evaluation shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_GEOMETRY_SHADER`, the name of the current program object for the geometry shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_COMPUTE_SHADER`, the name of the current program object for the compute shader type of the program pipeline object is returned in _`params`_.
    * 
    * If _`pname`_ is `GL_INFO_LOG_LENGTH`, the length of the info log, including the null terminator, is returned in _`params`_. If there is no info log, zero is returned.
    * 
    * If _`pname`_ is `GL_VALIDATE_STATUS`, the validation status of _`pipeline`_, as determined by [glValidateProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glValidateProgramPipeline.glValidateProgramPipeline], is returned in _`params`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not zero or a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted values.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramPipelineiv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetProgramPipelines](glGetProgramPipelines.xhtml), [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv
    */
    fun glGetProgramPipelineiv(pipeline: UInt, pname: Int, params: java.nio.IntBuffer)
}