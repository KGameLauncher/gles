package de.dasbabypixel.gamelauncher.gles.es20

interface glBlendColor {
    /**
    * Name
    * ----
    * 
    * glBlendColor — set the blend color
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBlendColor**(` | GLfloat red, |
    * | --- | --- |
    * |   | GLfloat green, |
    * |   | GLfloat blue, |
    * |   | GLfloat alpha`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`red`_, _`green`_, _`blue`_, _`alpha`_
    * 
    * specify the components of `GL_BLEND_COLOR`
    * 
    * Description
    * -----------
    * 
    * The `GL_BLEND_COLOR` may be used to calculate the source and destination blending factors. If destination framebuffer components use an unsigned normalized fixed-point representation, the constant color components are clamped to the range 0 1 when computing the blend factors. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] for a complete description of the blending operations. Initially the `GL_BLEND_COLOR` is set to (0, 0, 0, 0).
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with an argument of `GL_BLEND_COLOR`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBlendColor | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBlendEquation][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquation.glBlendEquation], [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBlendColor.glBlendColor
    */
    fun glBlendColor(red: Float, green: Float, blue: Float, alpha: Float)
}