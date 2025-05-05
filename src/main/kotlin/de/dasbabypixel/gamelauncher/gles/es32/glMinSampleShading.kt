package de.dasbabypixel.gamelauncher.gles.es32

interface glMinSampleShading {
    /**
    * Name
    * ----
    * 
    * glMinSampleShading — specifies minimum rate at which sample shading takes place
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glMinSampleShading**(` | GLfloat value`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`value`_
    * 
    * Specifies the rate at which samples are shaded within each covered pixel.
    * 
    * Description
    * -----------
    * 
    * `glMinSampleShading` specifies the rate at which samples are shaded within a covered pixel. Sample-rate shading is enabled by calling [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] with the parameter `GL_SAMPLE_SHADING`. If the value of `GL_SAMPLE_BUFFERS` is zero, or `GL_SAMPLE_SHADING` is disabled, sample shading has no effect. Otherwise, an implementation must provide at least as many unique color values for each covered fragment as specified by _`value`_ times _`samples`_ where _`samples`_ is the value of `GL_SAMPLES` for the current framebuffer. At least 1 sample for each covered fragment is generated.
    * 
    * A _`value`_ of 1.0 indicates that each sample in the framebuffer should be independently shaded. A _`value`_ of 0.0 effectively allows the GL to ignore sample rate shading. Any value between 0.0 and 1.0 allows the GL to shade only a subset of the total samples within each covered fragment. Which samples are shaded and the algorithm used to select that subset of the fragment's samples is implementation dependent.
    * 
    * Errors
    * ------
    * 
    * None.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MIN_SAMPLE_SHADING`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_SAMPLES`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glMinSampleShading` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2011-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glMinSampleShading.glMinSampleShading
    */
    fun glMinSampleShading(value: Float)
}