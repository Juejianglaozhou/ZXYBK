# 计G191 2019322035 周新易
# 实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
# 实验要求
1.	利用字符串String及其方法对古诗做对齐处理
2.	设计系统的输入/输出，把处理结果保存在文件中存储
3.	包含异常处理结构
4.	系统的界面采用二选一：
	使用GUI窗体界面，设计各组件，完成用户与系统的交互、控制台（Console）
## 具体实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，达到如下功能：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
4.  在程序界面中输出结果，并把结果保存在文件中
5.  不能将《长恨歌》诗词内容字符串硬编码在程序中，要通过控制台键盘输入或在GUI窗体中输入
## 关键代码
### 输入古诗词内容，io操作
```JAVA
 String changhenge;
 Scanner sc = new Scanner(System.in);
 PrintStream ps = new PrintStream("C:\\ZXY\\cDDDc.txt");
 System.out.print("请输入古诗词："); 
 changhenge = sc.nextLine();
```
### 为古诗词添加标点符号，并写入文件
```JAVA
int i=1;
  	    char[] chang=changhenge.toCharArray();
  	    for(char aaa:chang) {
             System.out.print(aaa);
             ps.print(aaa);
  		  if(i%7==0&&i%14!=0){
                System.out.println("，");
                ps.println("，");
              }
  		  if(i%14==0){
                System.out.println("。");
                ps.println("。");
              }
  		  i++;
        }  
        ps.close();
```
### 查寻输入文字出现次数
```JAVA
Scanner ccc=new Scanner(System.in); 
	     System.out.println("要查询的字："); 
        String s=ccc.next(); 
	     char ddd=s.charAt(0);
	     int a=0;
	     for(int b=0;b<changhenge.length();b++) {
	        if(ddd==chs[b]) {
	         a=a+1;
	        }
	       }
	       System.out.println("该字出现次数："+a);   
```
### 异常处理
```JAVA
try {
 } 
  	  catch (Exception e) {
	        e.printStackTrace();
        }
```
# 流程图
![显示出错](https://github.com/Juejianglaozhou/ZXYBK/blob/master/流程图.png)
# 实验结果
![显示出错](https://github.com/Juejianglaozhou/ZXYBK/blob/master/运行结果.png)
# 实验收获
第一次做我把实验想简单了，直接用了上学期的方法和代码，也没有看清楚老师添加的实验要求。后来我再网络查询学习其他的方法，将原本的for循环改为使用遍历的方法，也成功将古诗词添加标点，使代码更加简洁。查询汉字出现次数没有想到更好的办法，继续采用了之前的代码，尽力了。结果写入文件真的挺难弄的，查找了许多方法都不能实现，网络上大多都是直接将System.out.println的结果写进文件，但是我们的代码是边输出边添加标点符号，不能完整输出，也想过将输出的内容整合到一个字符串中再写进文件，但是不会弄。为了完成这个要求，查询四五个小时并问了学长后，直接将同时输出的内容一起同步写进去，但是后来一直没成功，发现文件关闭位置放错了，提前关闭了。整个实验做下来，感觉最大的困难就是想实现的功能想错了切入点，网上也找不到解决办法，最简单的方法自己却没想到。以后还得多学学，感觉百度查找不如问老师来的干脆，但也让我对文件输入输出有了更深的了解。
