package de.dasbabypixel.gamelauncher.gles.es31

interface glUseProgramStages {
    /**
    * Name
    * ----
    * 
    * glUseProgramStages — bind stages of a program object to a program pipeline
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glUseProgramStages**(` | GLuint pipeline, |
    * | --- | --- |
    * |   | GLbitfield stages, |
    * |   | GLuint program`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pipeline`_
    * 
    * Specifies the program pipeline object to which to bind stages from _`program`_.
    * 
    * _`stages`_
    * 
    * Specifies a set of program stages to bind to the program pipeline object.
    * 
    * _`program`_
    * 
    * Specifies the program object containing the shader executables to use in _`pipeline`_.
    * 
    * Description
    * -----------
    * 
    * `glUseProgramStages` binds executables from a program object associated with a specified set of shader stages to the program pipeline object given by _`pipeline`_. _`pipeline`_ specifies the program pipeline object to which to bind the executables. _`stages`_ contains a logical combination of bits indicating the shader stages to use within _`program`_ with the program pipeline object _`pipeline`_. _`stages`_ must be a logical combination of `GL_VERTEX_SHADER_BIT`, `GL_TESS_CONTROL_SHADER_BIT`, `GL_TESS_EVALUATION_SHADER_BIT`, `GL_GEOMETRY_SHADER_BIT`, `GL_FRAGMENT_SHADER_BIT` and `GL_COMPUTE_SHADER_BIT`. Additionally, the special value `GL_ALL_SHADER_BITS` may be specified to indicate that all executables contained in _`program`_ should be installed in _`pipeline`_.
    * 
    * If _`program`_ refers to a program object with a valid shader attached for an indicated shader stage, `glUseProgramStages` installs the executable code for that stage in the indicated program pipeline object _`pipeline`_. If _`program`_ is zero, or refers to a program object with no valid shader executable for a given stage, it is as if the pipeline object has no programmable stage configured for the indicated shader stages. If _`stages`_ contains bits other than those listed above, and is not equal to `GL_ALL_SHADER_BITS`, an error is generated.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`shaders`_ contains set bits that are not recognized, and is not the reserved value `GL_ALL_SHADER_BITS`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ refers to a program object that was not linked with its `GL_PROGRAM_SEPARABLE` status set.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ refers to a program object that has not been successfully linked.
    * 
    * `GL_INVALID_OPERATION` is generated if _`pipeline`_ is not a name previously returned from a call to [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines] or if such a name has been deleted by a call to [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines].
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glUseProgramStages` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glGenProgramPipelines.glGenProgramPipelines], [glDeleteProgramPipelines][de.dasbabypixel.gamelauncher.gles.es31.glDeleteProgramPipelines.glDeleteProgramPipelines], [glIsProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glIsProgramPipeline.glIsProgramPipeline]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glUseProgramStages.glUseProgramStages
    */
    fun glUseProgramStages(pipeline: UInt, stages: Int, program: UInt)
}