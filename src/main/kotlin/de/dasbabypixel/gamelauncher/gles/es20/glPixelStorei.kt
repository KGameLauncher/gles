package de.dasbabypixel.gamelauncher.gles.es20

interface glPixelStorei {
    /**
    * Name
    * ----
    * 
    * glPixelStorei — set pixel storage modes
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glPixelStorei**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLint param`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of the parameter to be set. Four values affect the packing of pixel data into memory: `GL_PACK_ROW_LENGTH`, `GL_PACK_SKIP_PIXELS`, `GL_PACK_SKIP_ROWS`, and `GL_PACK_ALIGNMENT`. Six more affect the unpacking of pixel data _from_ memory: `GL_UNPACK_ROW_LENGTH`, `GL_UNPACK_IMAGE_HEIGHT`, `GL_UNPACK_SKIP_PIXELS`, `GL_UNPACK_SKIP_ROWS`, `GL_UNPACK_SKIP_IMAGES`, and `GL_UNPACK_ALIGNMENT`.
    * 
    * _`param`_
    * 
    * Specifies the value that _`pname`_ is set to.
    * 
    * Description
    * -----------
    * 
    * `glPixelStorei` sets pixel storage modes that affect the operation of subsequent [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels] as well as the unpacking of texture patterns (see [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]).
    * 
    * _`pname`_ is a symbolic constant indicating the parameter to be set, and _`param`_ is the new value. Four of the ten storage parameters affect how pixel data is returned to client memory. They are as follows:
    * 
    * `GL_PACK_ROW_LENGTH`
    * 
    * If greater than 0, `GL_PACK_ROW_LENGTH` defines the number of pixels in a row. If the first pixel of a row is placed at location p in memory, then the location of the first pixel of the next row is obtained by skipping
    * 
    * k \= n ⁢ l a s ⁢ s ⁢ n ⁢ l a ⁢ s \>= a s < a
    * 
    * components or indices, where n is the number of components or indices in a pixel, l is the number of pixels in a row (`GL_PACK_ROW_LENGTH` if it is greater than 0, the width argument to the pixel routine otherwise), a is the value of `GL_PACK_ALIGNMENT`, and s is the size, in bytes, of a single component (if a < s , then it is as if a \= s ). In the case of 1-bit values, the location of the next row is obtained by skipping
    * 
    * k \= 8 ⁢ a ⁢ n ⁢ l 8 ⁢ a
    * 
    * components or indices.
    * 
    * The word _component_ in this description refers to the nonindex values red, green, blue, alpha, and depth. Storage format `GL_RGB`, for example, has three components per pixel: first red, then green, and finally blue.
    * 
    * `GL_PACK_SKIP_PIXELS` and `GL_PACK_SKIP_ROWS`
    * 
    * These values are provided as a convenience to the programmer; they provide no functionality that cannot be duplicated simply by incrementing the pointer passed to [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels]. Setting `GL_PACK_SKIP_PIXELS` to i is equivalent to incrementing the pointer by i ⁢ n components or indices, where n is the number of components or indices in each pixel. Setting `GL_PACK_SKIP_ROWS` to j is equivalent to incrementing the pointer by j ⁢ m components or indices, where m is the number of components or indices per row, as just computed in the `GL_PACK_ROW_LENGTH` section.
    * 
    * `GL_PACK_ALIGNMENT`
    * 
    * Specifies the alignment requirements for the start of each pixel row in memory. The allowable values are 1 (byte-alignment), 2 (rows aligned to even-numbered bytes), 4 (word-alignment), and 8 (rows start on double-word boundaries).
    * 
    * The other six of the ten storage parameters affect how pixel data is read from client memory. These values are significant for [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], and [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]
    * 
    * They are as follows:
    * 
    * `GL_UNPACK_ROW_LENGTH`
    * 
    * If greater than 0, `GL_UNPACK_ROW_LENGTH` defines the number of pixels in a row. If the first pixel of a row is placed at location p in memory, then the location of the first pixel of the next row is obtained by skipping
    * 
    * k \= n ⁢ l a s ⁢ s ⁢ n ⁢ l a ⁢ s \>= a s < a
    * 
    * components or indices, where n is the number of components or indices in a pixel, l is the number of pixels in a row (`GL_UNPACK_ROW_LENGTH` if it is greater than 0, the width argument to the pixel routine otherwise), a is the value of `GL_UNPACK_ALIGNMENT`, and s is the size, in bytes, of a single component (if a < s , then it is as if a \= s ). In the case of 1-bit values, the location of the next row is obtained by skipping
    * 
    * k \= 8 ⁢ a ⁢ n ⁢ l 8 ⁢ a
    * 
    * components or indices.
    * 
    * The word _component_ in this description refers to the nonindex values red, green, blue, alpha, and depth. Storage format `GL_RGB`, for example, has three components per pixel: first red, then green, and finally blue.
    * 
    * `GL_UNPACK_IMAGE_HEIGHT`
    * 
    * If greater than 0, `GL_UNPACK_IMAGE_HEIGHT` defines the number of pixels in an image of a three-dimensional texture volume. Where \`\`image'' is defined by all pixel sharing the same third dimension index. If the first pixel of a row is placed at location p in memory, then the location of the first pixel of the next row is obtained by skipping
    * 
    * k \= n ⁢ l ⁢ h a s ⁢ s ⁢ n ⁢ l ⁢ h a ⁢ s \>= a s < a
    * 
    * components or indices, where n is the number of components or indices in a pixel, l is the number of pixels in a row (`GL_UNPACK_ROW_LENGTH` if it is greater than 0, the width argument to [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D] otherwise), h is the number of rows in an image (`GL_UNPACK_IMAGE_HEIGHT` if it is greater than 0, the height argument to [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D] otherwise), a is the value of `GL_UNPACK_ALIGNMENT`, and s is the size, in bytes, of a single component (if a < s , then it is as if a \= s ).
    * 
    * The word _component_ in this description refers to the nonindex values red, green, blue, alpha, and depth. Storage format `GL_RGB`, for example, has three components per pixel: first red, then green, and finally blue.
    * 
    * `GL_UNPACK_SKIP_PIXELS`, `GL_UNPACK_SKIP_ROWS` and `GL_UNPACK_SKIP_IMAGES`
    * 
    * These values are provided as a convenience to the programmer; they provide no functionality that cannot be duplicated by incrementing the pointer passed to [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D] or [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D]. Setting `GL_UNPACK_SKIP_PIXELS` to i is equivalent to incrementing the pointer by i ⁢ n components or indices, where n is the number of components or indices in each pixel. Setting `GL_UNPACK_SKIP_ROWS` to j is equivalent to incrementing the pointer by j ⁢ k components or indices, where k is the number of components or indices per row, as just computed in the `GL_UNPACK_ROW_LENGTH` section. Setting `GL_UNPACK_SKIP_IMAGES` to k is equivalent to incrementing the pointer by k ⁢ p , where p is the number of components or indices per image, as computed in the `GL_UNPACK_IMAGE_HEIGHT` section.
    * 
    * `GL_UNPACK_ALIGNMENT`
    * 
    * Specifies the alignment requirements for the start of each pixel row in memory. The allowable values are 1 (byte-alignment), 2 (rows aligned to even-numbered bytes), 4 (word-alignment), and 8 (rows start on double-word boundaries).
    * 
    * The following table gives the type, initial value, and range of valid values for each storage parameter that can be set with `glPixelStorei`.
    * 
    * 
    * | **_`pname`_** | **Type** | **Initial Value** | **Valid Range** |   |
    * | --- | --- | --- | --- | --- |
    * | `GL_PACK_ROW_LENGTH` | integer | 0 | 0 |   |
    * | `GL_PACK_SKIP_ROWS` | integer | 0 | 0 |   |
    * | `GL_PACK_SKIP_PIXELS` | integer | 0 | 0 |   |
    * | `GL_PACK_ALIGNMENT` | integer | 4 | 1, 2, 4, or 8 |   |
    * | `GL_UNPACK_ROW_LENGTH` | integer | 0 | 0 |   |
    * | `GL_UNPACK_IMAGE_HEIGHT` | integer | 0 | 0 |   |
    * | `GL_UNPACK_SKIP_ROWS` | integer | 0 | 0 |   |
    * | `GL_UNPACK_SKIP_PIXELS` | integer | 0 | 0 |   |
    * | `GL_UNPACK_SKIP_IMAGES` | integer | 0 | 0 |   |
    * | `GL_UNPACK_ALIGNMENT` | integer | 4 | 1, 2, 4, or 8 |   |
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if a negative row length, pixel skip, or row skip value is specified, or if alignment is specified as other than 1, 2, 4, or 8.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PACK_ROW_LENGTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PACK_SKIP_ROWS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PACK_SKIP_PIXELS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PACK_ALIGNMENT`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_ROW_LENGTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_IMAGE_HEIGHT`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_SKIP_ROWS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_SKIP_PIXELS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_SKIP_IMAGES`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_UNPACK_ALIGNMENT`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glPixelStorei | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2020 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei
    */
    fun glPixelStorei(pname: Int, param: Int)
}