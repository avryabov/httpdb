# Многомодульный maven-проект

Проект из задания https://github.com/avryabov/session-6 преобразован в многомодульный:

    <modules>
        <module>util</module>
        <module>model</module>
        <module>repository</module>
        <module>service</module>
        <module>controller</module>
        <module>mainclass</module>
    </modules>
   
А так же имеется зависимость от проекта https://github.com/avryabov/jsongenerator
