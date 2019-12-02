# lab10
文件IO与异常处理

## lab目标
掌握文件读写与异常处理

## lab描述
你需要制作一个简易学生数据管理系统。管理员可以通过账号密码登录系统，根据学号修改学生信息，退出登录。

## lab需求
- 在github的lab仓库[https://github.com/Java-A-2019/lab10中已经给出了你需要完成的工程。```src```文件夹下包含三个java类```Student.java```，```NegAgeException.java```，```Main.java```。同级目录下包含两个数据文件```password.txt```，```studenInfo.txt```。
- ```Student.java```中包含类```Student```。
- ```NegAgeException.java```定义了“年龄不能为负”异常。
- ```password.txt```包含了所有管理员账号与其密码（左侧为学号，右侧为密码）。
- ```studentInfo.txt```包含了所有学生的信息。每行从左至右分别为学生学号，学生名称，学生年龄，电话号码。
- 你需要修改```Main.java```类，在有```//your code here```的地方填充你的代码。使代码运行结果与期望一致。

## 期望结果
- 当运行```Main.java```后，提示用户登录。
- 用户输入账户密码后，判断是否与数据库中一致，并给出相应提示。
- 如果管理员正常登录。可以选择四个选项：（1）添加学生信息。（2）修改学生信息。（3）打印所有学生信息。（4）退出。
- 管理员在退出之前可以多次添加、修改、打印学生信息。
- 你可以根据需要自行设计其他异常类：如用户不存在，密码错误，学号重复等等。
> 注意事项：
>
>（1）lab只要求修改```Main.java```，但你可以根据需要设计其他异常类。
>
>（2）学生信息中学号不可以修改。
>
>（3）新增学生信息不可以与其他学生学号重复。
>
>（4）管理员对学生信息的修改最终都应该保存在```studentInfo.txt```中。
## DeadLine与上传
在```12月8日23:59```之前将整个工程打包上传至ftp对应目录下。
