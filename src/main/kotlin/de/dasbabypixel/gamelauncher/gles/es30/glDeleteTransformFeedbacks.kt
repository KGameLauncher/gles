package de.dasbabypixel.gamelauncher.gles.es30

interface glDeleteTransformFeedbacks {
    /**
    * Name
    * ----
    * 
    * glDeleteTransformFeedbacks — delete transform feedback objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteTransformFeedbacks**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \*ids`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of transform feedback objects to delete.
    * 
    * _`ids`_
    * 
    * Specifies an array of names of transform feedback objects to delete.
    * 
    * Description
    * -----------
    * 
    * `glDeleteTransformFeedbacks` deletes the _`n`_ transform feedback objects whose names are stored in the array _`ids`_. Unused names in _`ids`_ that have been marked as used for the purposes of [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], are marked as unused again. Unused names in _`ids`_ are ignored, as is the name zero. After a transform feedback object is deleted, its name is again unused and it has no contents. If an active transform feedback object is deleted, its name immediately becomes unused, but the underlying object is not deleted until it is no longer active.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_TRANSFORM_FEEDBACK_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDeleteTransformFeedbacks | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTransformFeedbacks][de.dasbabypixel.gamelauncher.gles.es30.glGenTransformFeedbacks.glGenTransformFeedbacks], [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback], [glIsTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glIsTransformFeedback.glIsTransformFeedback], [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glPauseTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glPauseTransformFeedback.glPauseTransformFeedback], [glResumeTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glResumeTransformFeedback.glResumeTransformFeedback], [glEndTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDeleteTransformFeedbacks.glDeleteTransformFeedbacks
    */
    fun glDeleteTransformFeedbacks(n: UInt, ids: java.nio.IntBuffer)
}