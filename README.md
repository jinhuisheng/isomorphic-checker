Scenario: Implement a checker to determine if two strings are isomorphic
给定两个字符串 s 和 t，判断它们是否是同构的。
如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。

所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。

例如：

* 输入: s = "e", t = "e"; 输出: true

* 输入: s = "e", t = "x"; 输出: true

* 输入: s = "eg", t = "ad"; 输出: true

* 输入: s = "ee", t = "ad"; 输出: false

* 输入: s = "egg", t = "add"; 输出: true

* 输入: s = "foo", t = "bar"; 输出: false

异常：

* 输入: s = "f", t = "oo"; 输出: false 长度不同


## 需求分析

可替换 ？
替换了一个，之后的替换，不能有之前已经替换过的词组

字符顺序不变
两个字符串都是相同位置上的替换
比如： 
"sa"-"tb"  ,s和t可以互换，a和b可以互换；
替换过的只能和之前的互换组合一致，"s"-"t",或者"t"-"s"
"ss"-"tb",因为s已经和t替换过了，s就不能再替换别的字符。
既可以是s->t,也可以是t->s 可替换

如果对应位置上的字符相同，也是可以替换的，但之后就不能再和别的字符替换。


每次测试都要想着驱动出来业务，或者消除坏味道