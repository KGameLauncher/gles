package de.dasbabypixel.gamelauncher.gles.es31

interface glGetProgramPipelineInfoLog {
    /**
    * Name
    * ----
    * 
    * glGetProgramPipelineInfoLog — retrieve the info log string from a program pipeline object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetProgramPipelineInfoLog**(` | GLuint pipeline, |
    * | --- | --- |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \*length, |
    * |   | GLchar \*infoLog`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the name of a program pipeline object from which to retrieve the info log.
    * 
    * _`bufSize`_
    * 
    * Specifies the maximum number of characters, including the null terminator, that may be written into _`infoLog`_.
    * 
    * _`length`_
    * 
    * Specifies the address of a variable into which will be written the number of characters written into _`infoLog`_.
    * 
    * _`infoLog`_
    * 
    * Specifies the address of an array of characters into which will be written the info log for _`pipeline`_.
    * 
    * Description
    * -----------
    * 
    * `glGetProgramPipelineInfoLog` retrieves the info log for the program pipeline object _`pipeline`_. The info log, including its null terminator, is written into the array of characters whose address is given by _`infoLog`_. The maximum number of characters that may be written into _`infoLog`_ is given by _`bufSize`_, and the actual number of characters written into _`infoLog`_ is returned in the integer whose address is given by _`length`_. If _`length`_ is `NULL`, no length is returned.
    * 
    * The actual length of the info log for the program pipeline may be determined by calling [glGetProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv] with _`pname`_ set to `GL_INFO_LOG_LENGTH`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv] with parameter `GL_INFO_LOG_LENGTH`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetProgramPipelineInfoLog` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines], [glGetProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineiv.glGetProgramPipelineiv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetProgramPipelineInfoLog.glGetProgramPipelineInfoLog
    */
    fun glGetProgramPipelineInfoLog(pipeline: UInt, bufSize: UInt, length: java.nio.IntBuffer, infoLog: String)
}