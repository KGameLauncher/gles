package de.dasbabypixel.gamelauncher.gles.es30

interface glResumeTransformFeedback {
    /**
    * Name
    * ----
    * 
    * glResumeTransformFeedback — resume transform feedback operations
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glResumeTransformFeedback**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glResumeTransformFeedback` resumes transform feedback operations on the currently active transform feedback object. When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the object results in an error. However, a new transform feedback object may be bound while transform feedback is paused.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if the currently bound transform feedback object is not active or is not paused.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glResumeTransformFeedback | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback], [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glPauseTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glPauseTransformFeedback.glPauseTransformFeedback], [glEndTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glDeleteTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glResumeTransformFeedback.glResumeTransformFeedback
    */
    fun glResumeTransformFeedback()
}