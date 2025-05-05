package de.dasbabypixel.gamelauncher.gles.es30

interface glGenTransformFeedbacks {
    /**
    * Name
    * ----
    * 
    * glGenTransformFeedbacks — reserve transform feedback object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenTransformFeedbacks**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \*ids`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of transform feedback object names to reserve.
    * 
    * _`ids`_
    * 
    * Specifies an array of into which the reserved names will be written.
    * 
    * Description
    * -----------
    * 
    * `glGenTransformFeedbacks` returns _`n`_ transform feedback object names in _`ids`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenTransformFeedbacks`.
    * 
    * Transform feedback object names returned by a call to `glGenTransformFeedbacks` are not returned by subsequent calls, unless they are first deleted with [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks].
    * 
    * The names returned in _`ids`_ are marked as used, for the purposes of `glGenTransformFeedbacks` only, but they acquire state and type only when they are first bound.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TRANSFORM_FEEDBACK_BINDING`
    * 
    * [glIsTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glIsTransformFeedback.glIsTransformFeedback]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenTransformFeedbacks | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks], [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback], [glIsTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glIsTransformFeedback.glIsTransformFeedback], [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glPauseTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glPauseTransformFeedback.glPauseTransformFeedback], [glResumeTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glResumeTransformFeedback.glResumeTransformFeedback], [glEndTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks
    */
    fun glGenTransformFeedbacks(n: UInt, ids: java.nio.IntBuffer)
}