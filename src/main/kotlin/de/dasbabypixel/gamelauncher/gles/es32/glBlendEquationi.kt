package de.dasbabypixel.gamelauncher.gles.es32

interface glBlendEquationi {
    /**
    * Name
    * ----
    * 
    * glBlendEquation — specify the equation used for both the RGB blend equation and the Alpha blend equation
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBlendEquation**(` | GLenum mode`)`; |
    * | --- | --- |
    * 
    * | `void **glBlendEquationi**(` | GLuint buf, |
    * | --- | --- |
    * |   | GLenum mode`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`buf`_
    * 
    * for `glBlendEquationi`, specifies the index of the draw buffer for which to set the blend equation.
    * 
    * _`mode`_
    * 
    * specifies how source and destination colors are combined. It must be `GL_FUNC_ADD`, `GL_FUNC_SUBTRACT`, `GL_FUNC_REVERSE_SUBTRACT`, `GL_MIN`, `GL_MAX`.
    * 
    * Description
    * -----------
    * 
    * The blend equations determine how a new pixel (the ''source'' color) is combined with a pixel already in the framebuffer (the ''destination'' color). This function sets both the RGB blend equation and the alpha blend equation to a single equation. `glBlendEquationi` specifies the blend equation for a single draw buffer whereas `glBlendEquation` sets the blend equation for all draw buffers.
    * 
    * Some of these equations use the source and destination blend factors specified by either [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] or [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate]. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] or [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate] for a description of the various blend factors.
    * 
    * In the equations that follow, source and destination color components are referred to as R s G s B s A s and R d G d B d A d , respectively.
    * 
    * The result color is referred to as R r G r B r A r . The source and destination blend factors are denoted s R s G s B s A and d R d G d B d A , respectively. For these equations all color components are understood to have values in the range 0 1 .
    * 
    * 
    * | **Mode** | **RGB Components** | **Alpha Component** |
    * | --- | --- | --- |
    * | `GL_FUNC_ADD` | Rr \= R s ⁢ s R + R d ⁢ d R Gr \= G s ⁢ s G + G d ⁢ d G Br \= B s ⁢ s B + B d ⁢ d B | Ar \= A s ⁢ s A + A d ⁢ d A |
    * | `GL_FUNC_SUBTRACT` | Rr \= R s ⁢ s R \- R d ⁢ d R Gr \= G s ⁢ s G \- G d ⁢ d G Br \= B s ⁢ s B \- B d ⁢ d B | Ar \= A s ⁢ s A \- A d ⁢ d A |
    * | `GL_FUNC_REVERSE_SUBTRACT` | Rr \= R d ⁢ d R \- R s ⁢ s R Gr \= G d ⁢ d G \- G s ⁢ s G Br \= B d ⁢ d B \- B s ⁢ s B | Ar \= A d ⁢ d A \- A s ⁢ s A |
    * | `GL_MIN` | Rr \= min ⁡ R s R d Gr \= min ⁡ G s G d Br \= min ⁡ B s B d | Ar \= min ⁡ A s A d |
    * | `GL_MAX` | Rr \= max ⁡ R s R d Gr \= max ⁡ G s G d Br \= max ⁡ B s B d | Ar \= max ⁡ A s A d |
    * 
    * For the advanced blending equations, the source and destination color components are premultiplied by the alpha component prior to blending. The base source and destination colours are referred to as R' s G' s B' s and R' d G' d' B' d' , respectively, and are calculated as follows: R' s G' s B' s \= 0 0 0 , if A s \== 0, otherwise R' s G' s B' s \= R s A s G s A s B s A s .
    * 
    * All of the advanced blending equations perform the following equations:
    * 
    * R \= f ⁡ R' s R' d \* p0 ⁡ A s A d + R' s \* p1 ⁡ A s A d + R' d \* p2 ⁡ A s A d
    * 
    * G \= f ⁡ G' s G' d \* p0 ⁡ A s A d + G' s \* p1 ⁡ A s A d + G' d \* p2 ⁡ A s A d
    * 
    * B \= f ⁡ B' s B' d \* p0 ⁡ A s A d + B' s \* p1 ⁡ A s A d + B' d \* p2 ⁡ A s A d
    * 
    * A \= p0 ⁡ A s A d + p1 ⁡ A s A d + p2 ⁡ A s A d
    * 
    * Where the weighting functions p0, p1, and p2 are defined as follows:
    * 
    * p0 ⁡ A s A d \= A s \* A d
    * 
    * p1 ⁡ A s A d \= A s \* 1 \- A d
    * 
    * p2 ⁡ A s A d \= A d \* 1 \- A s
    * 
    * 
    * | **Advanced Mode** | **Blend Coefficients:** f ⁡ C s C d | **Conditions** |
    * | --- | --- | --- |
    * | `GL_MULTIPLY` | C s \* C d | `n/a` |
    * | `GL_SCREEN` | C s + C d \- C s \* C d | `n/a` |
    * | `GL_OVERLAY` | 2 \* C s \* C d  1 \- 2 \* 1 \- C s \* 1 \- C d   | C d <= 0.5  otherwise   |
    * | `GL_DARKEN` | min C s C d | `n/a` |
    * | `GL_LIGHTEN` | max C s C d | `n/a` |
    * | `GL_COLORDODGE` | 0  min 1 C d / 1 \- C s  1   | C d <= 0  C d \> 0 and C s < 1  C d \> 0 and C s \>= 1   |
    * | `GL_COLORBURN` | 1  1 \- min 1 1 \- C d / C s  0   | C d \>= 1  C d < 1 and C s \> 0  C d < 1 and C s <= 0   |
    * | `GL_HARDLIGHT` | 2 \* C s \* C d  1 \- 2 \* 1 \- C s \* 1 \- C d   | C s <= 0.5  otherwise   |
    * | `GL_SOFTLIGHT` | C d \- 1 \- 2 \* C s \* C d \* 1 \- C d  C d + 2 \* C s \- 1 \* C d \* 16 \* C d \- 12 \* C d + 3  C d + 2 \* C s \- 1 \* sqrt C d \- C d   | C s <= 0.5  C s \> 0.5 and C d <= 0.25  C s \> 0.5 and C d \> 0.25   |
    * | `GL_DIFFERENCE` | abs C d \- C s | `n/a` |
    * | `GL_EXCLUSION` | C s + C d \- 2 \* C s \* C d | `n/a` |
    * 
    * For the HSL modes, the following functions are defined:
    * 
    * float minv3 vec3 c { return min(min(c.r, c.g), c.b); }
    * 
    * float maxv3 vec3 c { return max(max(c.r, c.g), c.b); }
    * 
    * float lumv3 vec3 c { return dot(c, vec3(0.30, 0.59, 0.11)); }
    * 
    * float satv3 vec3 c { return maxv3(c) - minv3(c); }
    * 
    * vec3 SetLum vec3 cbase vec3 clum {
    * 
    * float lbase = lumv3(cbase);
    * 
    * float llum = lumv3(clum);
    * 
    * float ldiff = llum - lbase;
    * 
    * vec3 color = cbase + vec3(ldiff);
    * 
    * if (minv3(color) < 0.0 ) {
    * 
    * return llum + ((color-llum)\*llum) / (llum-minv3(color));
    * 
    * } else if (maxv3(color) \> 1.0 ) {
    * 
    * return llum + ((color-llum)\*(1-llum)) / (maxv3(color)-llum);
    * 
    * } else {
    * 
    * return color;
    * 
    * }
    * 
    * }
    * 
    * vec3 SetLumSat vec3 cbase vec3 csat vec3 clum {
    * 
    * float minbase = minv3(cbase);
    * 
    * float sbase = satv3(cbase);
    * 
    * float ssat = satv3(csat);
    * 
    * vec3 color;
    * 
    * if (sbase \> 0 ) {
    * 
    * color = (cbase - minbase) \* ssat / sbase;
    * 
    * } else {
    * 
    * color = vec3(0.0);
    * 
    * }
    * 
    * return SetLum(color, clum);
    * 
    * }
    * 
    * 
    * | **HSL Mode** | **Blend Coefficients:** f ⁡ C s C d |
    * | --- | --- |
    * | `GL_HSL_HUE` | SetLumSat C s C d C d |
    * | `GL_HSL_SATURATION` | SetLumSat C d C s C d |
    * | `GL_HSL_COLOR` | SetLum C s C d |
    * | `GL_HSL_LUMINOSITY` | SetLum C d C s |
    * 
    * The results of all these equations are clamped to the range 0 1 .
    * 
    * The `GL_MIN` and `GL_MAX` equations are useful for applications that analyze image data (image thresholding against a constant color, for example). The `GL_FUNC_ADD` equation is useful for antialiasing and transparency, among other things.
    * 
    * Initially, both the RGB blend equation and the alpha blend equation are set to `GL_FUNC_ADD`.
    * 
    * Notes
    * -----
    * 
    * Only the `GL_FUNC_ADD`, `GL_FUNC_SUBTRACT`, and `GL_FUNC_REVERSE_SUBTRACT` equations use the source or destination factors, while the other equations use only the source and destination colors.
    * 
    * Advanced blending equations are supported only when rendering to a single color buffer using fragment color zero. If any non-NONE draw buffer uses an advanced blend equation the error INVALID\_OPERATION is generated by `glDrawArrays` or any other drawing command.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`mode`_ is not one of `GL_FUNC_ADD`, `GL_FUNC_SUBTRACT`, `GL_FUNC_REVERSE_SUBTRACT`, `GL_MAX`, or `GL_MIN`.
    * 
    * `GL_INVALID_VALUE` is generated by `glBlendEquationi` if _`buf`_ is greater than or equal to the value of `GL_MAX_DRAW_BUFFERS`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with an argument of `GL_BLEND_EQUATION_RGB`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with an argument of `GL_BLEND_EQUATION_ALPHA`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBlendEquation | ✔ | ✔ | ✔ | ✔ |
    * | glBlendEquationi | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBlendColor][de.dasbabypixel.gamelauncher.gles.es20.glBlendColor.glBlendColor], [glBlendEquationSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquationSeparate.glBlendEquationSeparate], [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc], [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBlendEquation.glBlendEquation
    * @see de.dasbabypixel.gamelauncher.gles.es32.glBlendEquationi.glBlendEquationi
    */
    fun glBlendEquationi(buf: UInt, mode: Int)
}