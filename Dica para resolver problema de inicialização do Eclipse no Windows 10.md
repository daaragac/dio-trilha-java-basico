
# Dica para corrigir inicialização da IDE Eclipse no windows 10.

**Erro:**
***Version 1.8.0_411 of the JVM is not suitable for this product. Version: 17 or greater is required***

Apos instalar a o Eclipse no meu computador com o Windows 10, ao clicar no ícone da área de trabalho não iniciava. Para resolver tive que fazer o passo a passo abaixo:



1. **Localize o seguinte caminho:** javaw.exe (*normalmente fica:* C:\Program Files\Java\jdk-17\bin\javaw.exe)

2. **Cópie o cominho completo:** C:\Program Files\Java\jdk-17\bin\javaw.exe

3. **Vá em:** C:\Users\manager\eclipse\java-2024-03\eclipse\eclipse.ini

4. **Edite o arquivo:** *eclipse.ini.

5. **Adicione logo no inicio do arquivo as duas linhas abaixo:**
*-vm*

*C:\Program Files\Java\jdk-17\bin\javaw.exe*

6. Salve as alterações feito no *eclipse.ini*.
