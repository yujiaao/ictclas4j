
# ICTCLAS4J 中文分词系统使用说明

1. ictclas4j 是在中科院开源分词系统 FreeICTCLAS  的基础上重新实现和改进而来
2. 任何人不得将此用于商业用途，仅限个人学习研究之用
3. 该分词程序的最终解释权张新波（sinboy）和中科院张华平所有
4. 对使用中遇到的问题，请到 ictclas  论坛组内交流
5. 也可直接 Email 给我：sinboy@126.com

ICTCLAS4J 大事记  

2007-06-04
     
   FreeICTCLAS 中文分词系统从 2006 年 3 月就开始接触，之后通过研读相关论文和源代码，写了一系列的学习笔记 ，给很多同样的中文分词爱好者提供了一个可参考的文档资料 。但因为工作及其它原因（嘿嘿，说白就了就是比较偷懒 ，没有坚持下去），把该项目做成一个 java 版的原始想法一度中断 。之后，也曾多次尝试重新拾起，完成我的一个心愿 ，但复杂的工作都让我半途而费。
   
   4 月份的时候，一个爱好才 MSN 上问我相关问题 ，又激起了我的原始想法，同时看到吕震宇老师只用了半个月的时间就完成了 C＃版本的工作，
   并且写了完成的系列文章，又大大刺激我的神 经。想想我的系列文章只到半道，ictclas4j 的程序也是半拉 子工程，真是惭愧之极。于是下定决定，一定要把这个项目完成 ，给自己也给关心 ictclas 的朋友一个交待。        经过三个星期的不懈努力，到现在为止，基本上完整的实现了原 FreeICTCLAS 所实现的功能。原 VC＋＋实现的程序比我想象的更 复杂，中间涉及大量的临时性的数据结构和大量的全局变量 ，搞的我非常头大，好几次都有放弃的想法。不过谢天谢地 ，我这次终于坚持下来了。
   
   从java 程序的角度从出 ，我对原来的数据结构做了大量调整和优化，去掉了很多不必要的中间 变量。经过优化后，在整个分词过后中只用到两个对象：Atom 、SegNode，原子和分词结点，整个分词过程就是对 SegNo de 的不断调整和改进，最终得到分词结果。
   
   因为到现在为止，我只是做了一些简单的测试，可能还有很多的 BUG 在里面（对标点符号的处理就是一问题），并且分词的速度还远远达不 到我的要求，程序还有很多改进的地方，所以暂时源代码还不会放上来 ，但我想最迟一个星期之内，我可以上传到论坛供大家测试。同时 ，

~~我已在 Google Code 上申请了 ictclas4j 的开源项目，期望有兴趣的朋友加入进来共同改进。~~ GitHub here!
      
   附近中的文件是 ictclas4j 程序在分词过程输出的完整分词步 骤记录，对大家直观理解该分词原是应该是一个有益的帮助 。这个想法也得益于吕震宇的 SharpICTCLAS ，在此表示感谢！同时感谢 DanceFire 的几篇精辟入理的分析 文章，给了我很大的帮助。 　
   
   
2019-03-01

   NPE fix   
   
   
