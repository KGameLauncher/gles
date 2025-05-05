package de.dasbabypixel.gamelauncher.gles.es32

interface glBlendFunci {
    /**
    * Name
    * ----
    * 
    * glBlendFunc — specify pixel arithmetic
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBlendFunc**(` | GLenum sfactor, |
    * | --- | --- |
    * |   | GLenum dfactor`)`; |
    * 
    * | `void **glBlendFunci**(` | GLuint buf, |
    * | --- | --- |
    * |   | GLenum sfactor, |
    * |   | GLenum dfactor`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`buf`_
    * 
    * For `glBlendFunci`, specifies the index of the draw buffer for which to set the blend function.
    * 
    * _`sfactor`_
    * 
    * Specifies how the red, green, blue, and alpha source blending factors are computed. The initial value is `GL_ONE`.
    * 
    * _`dfactor`_
    * 
    * Specifies how the red, green, blue, and alpha destination blending factors are computed. The following symbolic constants are accepted: `GL_ZERO`, `GL_ONE`, `GL_SRC_COLOR`, `GL_ONE_MINUS_SRC_COLOR`, `GL_DST_COLOR`, `GL_ONE_MINUS_DST_COLOR`, `GL_SRC_ALPHA`, `GL_ONE_MINUS_SRC_ALPHA`, `GL_DST_ALPHA`, `GL_ONE_MINUS_DST_ALPHA`. `GL_CONSTANT_COLOR`, `GL_ONE_MINUS_CONSTANT_COLOR`, `GL_CONSTANT_ALPHA`, and `GL_ONE_MINUS_CONSTANT_ALPHA`. The initial value is `GL_ZERO`.
    * 
    * Description
    * -----------
    * 
    * Pixels can be drawn using a function that blends the incoming (source) RGBA values with the RGBA values that are already in the frame buffer (the destination values). Blending is initially disabled. Use [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] or [glEnablei][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] or [glDisablei][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] with argument `GL_BLEND` to enable and disable blending for all or one draw buffer.
    * 
    * `glBlendFunc` defines the operation of blending for all draw buffers when it is enabled. `glBlendFunci` defines the operation of blending for a single draw buffer specified by _`buf`_ when enabled for that draw buffer. _`sfactor`_ specifies which method is used to scale the source color components. _`dfactor`_ specifies which method is used to scale the destination color components. Both parameters must be one of the following symbolic constants: `GL_ZERO`, `GL_ONE`, `GL_SRC_COLOR`, `GL_ONE_MINUS_SRC_COLOR`, `GL_DST_COLOR`, `GL_ONE_MINUS_DST_COLOR`, `GL_SRC_ALPHA`, `GL_ONE_MINUS_SRC_ALPHA`, `GL_DST_ALPHA`, `GL_ONE_MINUS_DST_ALPHA`, `GL_CONSTANT_COLOR`, `GL_ONE_MINUS_CONSTANT_COLOR`, `GL_CONSTANT_ALPHA`, `GL_ONE_MINUS_CONSTANT_ALPHA`, `GL_SRC_ALPHA_SATURATE`, The possible methods are described in the following table. Each method defines four scale factors, one each for red, green, blue, and alpha. In the table and in subsequent equations, source and destination color components are referred to as R s G s B s A s , and R d G d B d A d , respectively. The color specified by [glBlendColor][de.dasbabypixel.gamelauncher.gles.es20.glBlendColor.glBlendColor] is referred to as R c G c B c A c .
    * 
    * Source and destination scale factors are referred to as s R s G s B s A and d R d G d B d A . The scale factors described in the table, denoted f R f G f B f A , represent either source or destination factors. All scale factors have range 0 1 .
    * 
    * Prior to blending, unsigned normalized fixed-point color components undergo an implied conversion to floating-point using equation 2.1. This conversion must leave the values 0 and 1 invariant. Blending computations are treated as if carried out in floating-point and will be performed with a precision and dynamic range no lower than that used to represent destination components. If the value of `GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING` for the framebuffer attachment corresponding to the destination buffer is `GL_SRGB`, the R, G, and B destination color values (after conversion from fixed-point to floating-point) are considered to be encoded for the sRGB color space and hence must be linearized prior to their use in blending. Each R, G, and B component is converted in the same fashion described for sRGB texture components.
    * 
    * 
    * | **Parameter** | **f R f G f B f A** |
    * | --- | --- |
    * | `GL_ZERO` | 0 0 0 0 |
    * | `GL_ONE` | 1 1 1 1 |
    * | `GL_SRC_COLOR` | R s k R G s k G B s k B A s k A |
    * | `GL_ONE_MINUS_SRC_COLOR` | 1 1 1 1 \- R s k R G s k G B s k B A s k A |
    * | `GL_DST_COLOR` | R d k R G d k G B d k B A d k A |
    * | `GL_ONE_MINUS_DST_COLOR` | 1 1 1 1 \- R d k R G d k G B d k B A d k A |
    * | `GL_SRC_ALPHA` | A s k A A s k A A s k A A s k A |
    * | `GL_ONE_MINUS_SRC_ALPHA` | 1 1 1 1 \- A s k A A s k A A s k A A s k A |
    * | `GL_DST_ALPHA` | A d k A A d k A A d k A A d k A |
    * | `GL_ONE_MINUS_DST_ALPHA` | 1 1 1 1 \- A d k A A d k A A d k A A d k A |
    * | `GL_CONSTANT_COLOR` | R c G c B c A c |
    * | `GL_ONE_MINUS_CONSTANT_COLOR` | 1 1 1 1 \- R c G c B c A c |
    * | `GL_CONSTANT_ALPHA` | A c A c A c A c |
    * | `GL_ONE_MINUS_CONSTANT_ALPHA` | 1 1 1 1 \- A c A c A c A c |
    * | `GL_SRC_ALPHA_SATURATE` | i i i 1 |
    * 
    * In the table,
    * 
    * i \= min ⁡ A s k A \- A d k A
    * 
    * To determine the blended RGBA values of a pixel, the system uses the following equations:
    * 
    * R d \= min ⁡ k R R s ⁢ s R + R d ⁢ d R G d \= min ⁡ k G G s ⁢ s G + G d ⁢ d G B d \= min ⁡ k B B s ⁢ s B + B d ⁢ d B A d \= min ⁡ k A A s ⁢ s A + A d ⁢ d A
    * 
    * If the value of `GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING` for the framebuffer attachment corresponding to the destination buffer is `GL_SRGB`, the R, G, and B values after blending are converted into the non-linear sRGB color space by computing where cl is the R, G, or B element and cs is the result (effectively converted into an sRGB color space). If `GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING` is not `GL_SRGB`, then cs = cl: The resulting cs values for R, G, and B, and the unmodified A form a new RGBA color value. If the color buffer is fixed-point, each component is clamped to the range \[0; 1\] and then converted to a fixed-point value using equation
    * 
    * Examples
    * --------
    * 
    * Transparency is best implemented using blend function (`GL_SRC_ALPHA`, `GL_ONE_MINUS_SRC_ALPHA`) with primitives sorted from farthest to nearest. Note that this transparency calculation does not require the presence of alpha bitplanes in the frame buffer.
    * 
    * Notes
    * -----
    * 
    * Incoming (source) alpha is correctly thought of as a material opacity, ranging from 1.0 ( K A ), representing complete opacity, to 0.0 (0), representing complete transparency.
    * 
    * When more than one color buffer is enabled for drawing, the GL performs blending separately for each enabled buffer, using the contents of that buffer for destination color. (See [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers].)
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if either _`sfactor`_ or _`dfactor`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated by `glBlendFunci` if _`buf`_ is greater than or equal to the value of `GL_MAX_DRAW_BUFFERS`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_BLEND_SRC`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_BLEND_DST`
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_BLEND`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBlendFunc | ✔ | ✔ | ✔ | ✔ |
    * | `glBlendFunci` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBlendColor][de.dasbabypixel.gamelauncher.gles.es20.glBlendColor.glBlendColor], [glBlendEquation][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquation.glBlendEquation], [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate], [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear], [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers], [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc
    * @see de.dasbabypixel.gamelauncher.gles.es32.glBlendFunci.glBlendFunci
    */
    fun glBlendFunci(buf: UInt, sfactor: Int, dfactor: Int)
}