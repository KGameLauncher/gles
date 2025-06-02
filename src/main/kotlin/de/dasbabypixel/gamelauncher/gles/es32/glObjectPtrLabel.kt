package de.dasbabypixel.gamelauncher.gles.es32

interface glObjectPtrLabel {
    /**
    * Name
    * ----
    * 
    * glObjectPtrLabel — label a sync object identified by a pointer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glObjectPtrLabel**(` | void \* ptr, |
    * | --- | --- |
    * |   | GLsizei length, |
    * |   | const char \* label`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`ptr`_
    * 
    * A pointer identifying a sync object.
    * 
    * _`length`_
    * 
    * The length of the label to be used for the object.
    * 
    * _`label`_
    * 
    * The address of a string containing the label to assign to the object.
    * 
    * Description
    * -----------
    * 
    * `glObjectPtrLabel` labels the sync object identified by _`ptr`_.
    * 
    * _`label`_ is the address of a string that will be used to label the object. _`length`_ contains the number of characters in _`label`_. If _`length`_ is negative, it is implied that _`label`_ contains a null-terminated string. If _`label`_ is NULL, any debug label is effectively removed from the object.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`ptr`_ is not a valid sync object.
    * 
    * `GL_INVALID_VALUE` is generated if the number of characters in _`label`_, excluding the null terminator when _`length`_ is negative, is greater than the value of `GL_MAX_LABEL_LENGTH`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_LABEL_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glObjectPtrLabel` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup], [glPopDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup], [glObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glObjectPtrLabel.glObjectPtrLabel
    */
    fun glObjectPtrLabel(ptr: de.dasbabypixel.gamelauncher.buffers.Buffer, length: UInt, label: String)
}