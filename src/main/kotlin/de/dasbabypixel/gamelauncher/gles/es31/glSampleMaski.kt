package de.dasbabypixel.gamelauncher.gles.es31

interface glSampleMaski {
    /**
    * Name
    * ----
    * 
    * glSampleMaski — set the value of a sub-word of the sample mask
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glSampleMaski**(` | GLuint maskNumber, |
    * | --- | --- |
    * |   | GLbitfield mask`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`maskNumber`_
    * 
    * Specifies which 32-bit sub-word of the sample mask to update.
    * 
    * _`mask`_
    * 
    * Specifies the new value of the mask sub-word.
    * 
    * Description
    * -----------
    * 
    * `glSampleMaski` sets one 32-bit sub-word of the multi-word sample mask, `GL_SAMPLE_MASK_VALUE`.
    * 
    * _`maskIndex`_ specifies which 32-bit sub-word of the sample mask to update, and _`mask`_ specifies the new value to use for that sub-word. _`maskIndex`_ must be less than the value of `GL_MAX_SAMPLE_MASK_WORDS`. Bit _B_ of mask word _M_ corresponds to sample 32 x _M_ + _B_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`maskIndex`_ is greater than or equal to the value of `GL_MAX_SAMPLE_MASK_WORDS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glSampleMaski | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glSampleMaski.glSampleMaski
    */
    fun glSampleMaski(maskNumber: UInt, mask: Int)
}