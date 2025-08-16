
Este repositorio contiene mi primera práctica en Android Studio con Kotlin.  
Incluye respuestas de reflexión basadas en la guía de aprendizaje y evidencias en el Logcat.
  

### Variables y Constantes:
**Pregunta:** ¿Por qué no podemos reasignar un `val`?

**Respuesta:** Porque `val` define una constante inmutable, una vez asignado su valor no puede cambiar. asegurando asi que el dato no se modifique.


![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXcceE9JQjzG5tVm3nuQLFFlq10ndgEqvq2ZpBBeolF-czZjiJPwWI7-EG2WzDZY9CkJTzrxvaEQ3AilNzvP2iqw1fU8v6LN8yhB-8n4JYpZ1aL_J0FY7weEzVdjvwdKOwoHe-DE?key=3OD6q6J-zIDgruF3SPRx4Q)

  

Capturas del Logcat

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXeRDGnxYnIWxn7IpUSMWFc2cwlFjyCdxF3HVY4u-FMzp2fmD0PZJ-vvTLTfDJ3VB5-61Og3MkRLBM_dq9PII3N1UsCK_mDc02KOUpuubPB5aj7GkFVADNG6jhjuQqKGEu-sT4kAwA?key=3OD6q6J-zIDgruF3SPRx4Q)

  
  

### Tipos numéricos

**Pregunta:** ¿Cuándo deberías usar `Float` vs `Double`?  

**Respuesta:**  
- Uso `Float` cuando necesito valores decimales simples y quiero ahorrar memoria.
- Uso `Double` cuando necesito mayor precisión en cálculos mas complejos.
  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfcTYiYKPFZQr1WDp-hOBxYyeASZ8LV_7S3I5aUuKtaJZWkKJtbgwPntCI8J1LEAQrYAqPHp4pgqB6wiPtfyHdpSpzdVpOpcXKgnAx91PdEJfloJnrhaM1CWvE9_iW7CSUiApaTdQ?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXc_OKJ2edVRNn9dXo-6xd-9Tk9Rvw7nsFFv0dOq8QZTmzz_hRM0IT6gxCjS4RIYtacJi4B-qt5ik1Ih1QxZU7Hj06yZJWDJbvDnz1QUJ2L5KNL-hzvj9jR_mwHccIOytm0XHpCDGA?key=3OD6q6J-zIDgruF3SPRx4Q)

  
  

### If como expresión

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que en Kotlin el `if`  puede devolver un valor. Esto permite escribir código más conciso, legible y que sirve como una estructura de control.
  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXd1styYCsis7lfvZcAvsNXaKS3uu_nDyg-Ibe5zyWmZ6xFB4NuE4polhY87OYwMStY623o9ocnqFVdGnakIZUHirtpXu5K0UWIo3JPF4I9pwFTDe5g8BFugC-Xmm2keJXheBCHREQ?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXczYdMG4l4AUxii5BxBiKL6F_mAJv_FgrGe2ioe_KhKJDtNhwQIkCTNbTs09Rs-gIQ3dBovFfy3z1L989BIg7LMoLZVvO6dw4I5cj8kJKHvEZ8jRwxRBsQA4PKaQhP2LFaiMh84EA?key=3OD6q6J-zIDgruF3SPRx4Q)

  
  
  

### `when` con rangos

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que `when` en Kotlin reemplaza a `switch` y permite trabajar con rangos, condiciones y valores múltiples de manera más expresiva y clara.

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXc18CrDx7DEXu2Dkmjz-47EiJpAI6KwG7PfZOZRFyxu0RDd1byoRvaiv8gmv60-qY6UA80deedCoZHUkdJBqAwN6YBW7jPaqlZ8fBYGAnCQIOqNC13LreFuyDcBnH9-l-s_93xKCQ?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXczwqfpK_Khj7rvxOBPiDg-NBko_qf24I4iKy9exl3WTXrwvCGRkB1XtOogELQJxpSY3xmnB937A0_lJVtX-UbIQAPh1pCE2KN2aMh4HKg-Sqr6Vy6wCFEiYrWPvwSlimIs8Hjv9A?key=3OD6q6J-zIDgruF3SPRx4Q)

  

### Bucles `while` y `for`

**Pregunta:** ¿Qué enfoque te parece más legible y por qué?  

**Respuesta:** El bucle `for` me parece más legible, porque muestra directamente el rango o la colección sobre la que estoy iterando.

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXeQRFDp8cTOUulwbtM6Lzmo3lgKjkGBny75259kZkm0-J0NGM-y961eFO3qBl4OJ-jknld4WccPt_CwUuzEd7kLAJHL6DWEzeqCQMZJFR1p_umFp9FkGmkrNzAC8D457Exijwbb?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXe4bNc59opggPOGyTfx5XHwYzH_sDFPXaVGffwo63pvxqqomQ_krpRfQlr9Gnu4PEObUJCQMbolLqgL1VqpwO7KlZgmYOYgNeY12i3qFCyH2Fau9AeS62e0QNm8K30feGyBK0ad?key=3OD6q6J-zIDgruF3SPRx4Q)

  

### Colecciones

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que existen diferentes tipos de colecciones en Kotlin: listas, conjuntos y mapas. 

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXd1nsnfygJevwC1yI4JiyzA82DgYQtJCbikEL_GyeksCoadLkdZJVyMGvjonB1GiMIpeXQslyQVpGZ2F_bqj5aJOJP8MKzkuj8A6E-BOsQ7HrqFxEWy_sULXpEWnhmummYbvurXug?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXd07GB_sKvlRWds4LI1u6xpRxGIwCRZxuKVJWarGvZ6JUCzRpmgO-on5LH1FF3Dd7W8XBGokkzNoMojFo7DjWi0PRH5FNZeIrIq6qkc-1qWCNPzaq7xxKBcGarLLsGezT7ru6bS6w?key=3OD6q6J-zIDgruF3SPRx4Q)

  
  

### Null safety en práctica

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que Kotlin obliga a manejar valores nulos de forma segura, esto ayuda a evitar errores.


  
  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXeXq0HOgNuhVo3OM-u863CMLRAXzZwKzjbAAyM-cPCfB9S5VhPLBuZRaPjQmH68PVvi_blmyY_eQj9lqTz1_XPv0qp_y1SMEK-PoGZx0s0dKOy-CZWvWlvXqs4LShLY_U1doPPX-Q?key=3OD6q6J-zIDgruF3SPRx4Q)

  

Capturas del Logcat

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXcs6wNBhe2eN8_WdFRE63HvC8SKlc-ci4phS-Hqt92p_tQU7vXYFTbAMEGrPH9ELbEMJXSMoJ6fxVp3I5chhabsAbLK3dZFhsG3wzBioDOIySOMslnZaDN5qtaiEsakmVso8v32Bw?key=3OD6q6J-zIDgruF3SPRx4Q)

  
  

### Funciones puras

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que una función pura siempre devuelve el mismo resultado con los mismos parámetros y no produce efectos secundarios.


![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfEt5pHwAZS_uHuiry4yIcrKW-HbMqTyEIeuT5OvqSL8AnYReCW1kyV2zMp2WS2wPJXltYYftkiIz55j83L0gYaYoC-lVlRKaCeS1uwGnEF5uirsNm-cahX17dupVsB2cZPrqrDpQ?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXdze-xfvYkf2I_fiGaUHkQQQvSNXjKrzcFmyy_QvDleM0GaU3VtQzD1sY8ObIvT3xIZznycJCNgWMJ6zFeOdI1sstbQ6N-TxWC0070sFDLSsRRCEGY2BS4E4jhavC7YCD-_CtXXbQ?key=3OD6q6J-zIDgruF3SPRx4Q)

  

### Clases vs `data class`

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que una `data class` se utiliza cuando el objetivo principal es almacenar datos. 

  

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfYv5ASudG9v0_8TalcTPgIg-xfklI-c5FU-r_AWGkxxx3L3vTmE9TlRm8l6eORwvRdAmZj_Ka-D2p_325LTgfJv4PlOYdZC9DAkoiE0FgDBRwHbuKzlB9YIDA4JfkGyveYpsoV?key=3OD6q6J-zIDgruF3SPRx4Q)

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXdC1lhmlKxnN_zuTkOrM0ThmKnIB9xUr4iTXvsC-8kP0bD0gpylqneZCqF98UZMvrTH6ZbfAl-rdciJgVRXY4wnFZF-VwRfFi1Y7RuQH_iIbow_U1PNkTUTj1xhuKu1r1id97SR?key=3OD6q6J-zIDgruF3SPRx4Q)

Capturas del Logcat

![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXckKFekfRO_bI1Ex0Xtgidq5GVqZHJnRpNBASMH7TvbXtOgRO8XPMXAZfqYAf0Yo_6X-iEtyMH8WIrJuNWS2EVmtKkJtLosnCbGyrdjX63wECZB94rTmnRS5Vv2U3p51SJotjYVSQ?key=3OD6q6J-zIDgruF3SPRx4Q)

  

### Extensiones y operaciones encadenadas

**Pregunta:** ¿Qué aprendiste?  

**Respuesta:** Que en Kotlin se pueden agregar funciones nuevas a clases existentes sin modificarlas, gracias a las extensiones. 


![](https://lh7-rt.googleusercontent.com/docsz/AD_4nXftVQ0K9CnA-Qd8fxIJd_KLKjuGeBEVhAOxiTPghHGmvvRwpRAQz9xSl1suLZZ1s0fv4Rcz0_9MBuGA-1pztVqn0ZIZo6Mbtqh1eS4_K_yKUluSSRdgccFV85pbddN4Y5gm8B96NQ?key=3OD6q6J-zIDgruF3SPRx4Q)

  
