copy的规范
------------
# Android端

 > #### Android端的项目框架以及开发规范

## 项目结构
- network	 `网络请求`
- common	 `公共类`
- contant	 `全局常量`
- model	     `数据模型`
- widget	 `公共控件`
- service	 `服务`
- uiactivity `Activity类`
- adapter	 `适配器`
- uifragment `Fragment类`
- util	     `工具类`

## 7月16版本交接未完成功能列表
- 回帖图片
- 实名认证模块（布局已完成）
- 修改头像
- 设置模块（布局已完成）
- 我的帖子（后边更）
- 首页轮播图文字
- 消息好友列表
- bbs点击头像私聊
- 退出登录
- 网络请求当token过期跳转登录未处理
- 首页大按钮功能
- 日狗

## 用到的开源框架
> 这都是哥长期踩坑踩出的精华啊

- [每日求一签，程序无BUG，产品无需求，美术无变更](http://www.atool.org/qiuqian.php)
- 网络框架
 - [Retrofit](http://code.hrsoft.net/lu/neuqer_android/blob/master/doc/Retrofit.md)
 - [OkHttp](http://code.hrsoft.net/lu/neuqer_android/blob/master/doc/okhttp.md)
- 依赖注入：[ButterKnife](http://jakewharton.github.io/butterknife/)
- 事件总线-bug级组件通信：
 - [Otto](http://square.github.io/otto/)
 - [一篇不错的otto教程](http://my.oschina.net/jack1900/blog/304081)
- 图片控件
 - [Fresco-极为强大](http://fresco-cn.org/)
- 下拉刷新与上拉加载
 - [Ultra-PullToRefresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh/blob/master/README-cn.md)
 - [上拉加载](http://cube-sdk.liaohuqiu.net/cn/load-more/)
 - SwipeRefreshLayout(候选解决方案)
- Json解析：Gson(Retrofit已自带)
- 缓存：[ASimpleData](https://github.com/yangfuhai/ASimpleCache)
- 图片多选: [poly-picker](https://github.com/jaydeepw/poly-picker)

> 以下为备用库,以后可能用到

- 工具类：[LiteCommen](https://github.com/litesuits/android-common)
- 顺便送上：[Lite全家福](http://litesuits.com/)
- 日期选择：[TimeSquare](https://github.com/square/android-times-square)
- 5.0风格控件：[MaterialDesign](https://github.com/navasmdc/MaterialDesignLibrary)


## [Android开发规范](http://code.hrsoft.net/lu/neuqer_android/blob/master/doc/%E7%BC%96%E7%A0%81%E8%A7%84%E8%8C%83.md)

> ## 命名规范

#### 1. 包命名

域名反写+项目名称+模块名称，全部单词用小写字母。
例如，我的KAndroid项目的Model模块包名如下：

```
ren.neuq.android.model
```

#### 2. 类和接口命名

使用大驼峰规则，用名词或名词词组命名，每个单词的首字母大写。
以下为几种常用类的命名：

*   activity类，命名以Activity为后缀，如：LoginActivity
*   fragment类，命名以Fragment为后缀，如：ShareDialogFragment
*   service类，命名以Service为后缀，如：DownloadService
*   adapter类，命名以Adapter为后缀，如：CouponListAdapter
*   工具类，命名以Util为后缀，如：EncryptUtil
*   模型类，命名以BO为后缀，如：CouponBO
*   接口实现类，命名以Impl为后缀，如：ApiImpl

#### 3. 方法命名

使用小驼峰规则，用动词命名，第一个单词的首字母小写，其他单词的首字母大写。
以下为几种常用方法的命名：

*   初始化方法，命名以init开头，例：initView
*   按钮点击方法，命名以to开头，例：toLogin
*   设置方法，命名以set开头，例：setData
*   具有返回值的获取方法，命名以get开头，例：getData
*   通过异步加载数据的方法，命名以load开头，例：loadData
*   布尔型的判断方法，命名以is或has，或具有逻辑意义的单词如equals，例：isEmpty

#### 4. 控件缩写


|控件	|缩写	|控件	|缩写|
|----|----|----|----|
|TextView	|txt	|EditText	|edit|
|Button	|btn	|ImageButton	|ibtn|
|ImageView	|img	|ListView	|list|
|RadioGroup	|group	|RadioButton	|rbtn|
|ProgressBar	|progress	|SeekBar	|seek|
|CheckBox	|chk	|Spinner	|spinner|
|TableLayout	|table	|TableRow	|row|
|LinearLayout	|llayout	|RelativeLayout|	rlayout|
|ScrollView	|scroll	|SearchView	|search|
|TabHost	|host	|TabWidget|widget|

#### 5. 常量命名

全部为大写单词，单词之间用下划线分开。

```java
public final static int PAGE_SIZE = 20;
```

#### 6. 变量命名

{范围描述+}意义描述+类型描述的组合，用驼峰式，首字母小写。

```java
private TextView headerTitleTxt; // 标题栏的标题
private Button loginBtn; // 登录按钮
private CouponBO couponBO; // 券实例
```

#### 7. 控件id命名

控件缩写_{范围_}意义，范围可选，只在有明确定义的范围内才需要加上。

```java
<!-- 这是标题栏的标题 -->
<TextView
    android:id="@+id/txt_header_title"
    ... />

<!-- 这是登录按钮 -->
<Button
    android:id="@+id/btn_login"
    ... />
```

#### 8. layout命名

组件类型_{范围_}功能，范围可选，只在有明确定义的范围内才需要加上。
以下为几种常用的组件类型命名：

*   activity\_\{范围\_\}功能，为Activity的命名格式
*   fragment\_\{范围\_\}功能，为Fragment的命名格式
*   dialog\_\{范围\_\}功能，为Dialog的命名格式
*   item\_list\_\{范围\_\}功能，为ListView的item命名格式
*   item\_grid\_\{范围\_\}功能，为GridView的item命名格式
*   header\_list\_\{范围\_\}功能，为ListView的HeaderView命名格式
*   footer\_list\_\{范围\_\}功能，为ListView的FooterView命名格式

#### 9. strings的命名

类型\_\{范围\_\}功能，范围可选。
以下为几种常用的命名：

*   页面标题，命名格式为：title_页面
*   按钮文字，命名格式为：btn_按钮事件
*   标签文字，命名格式为：label_标签文字
*   选项卡文字，命名格式为：tab_选项卡文字
*   消息框文字，命名格式为：toast_消息
*   编辑框的提示文字，命名格式为：hint_提示信息
*   图片的描述文字，命名格式为：desc_图片文字
*   对话框的文字，命名格式为：dialog_文字
*   menu的item文字，命名格式为：action_文字

#### 10. colors的命名

前缀\{\_控件\}\{\_范围\}\{\_后缀\}，控件、范围、后缀可选，但控件和范围至少要有一个。

*   背景颜色，添加bg前缀
*   文本颜色，添加text前缀
*   分割线颜色，添加div前缀
*   区分状态时，默认状态的颜色，添加normal后缀
*   区分状态时，按下时的颜色，添加pressed后缀
*   区分状态时，选中时的颜色，添加selected后缀
*   区分状态时，不可用时的颜色，添加disable后缀

#### 11. drawable的命名

前缀{_控件}{_范围}{_后缀}，控件、范围、后缀可选，但控件和范围至少要有一个。

*   图标类，添加ic前缀
*   背景类，添加bg前缀
*   分隔类，添加div前缀
*   默认类，添加def前缀
*   区分状态时，默认状态，添加normal后缀
*   区分状态时，按下时的状态，添加pressed后缀
*   区分状态时，选中时的状态，添加selected后缀
*   区分状态时，不可用时的状态，添加disable后缀
*   多种状态的，添加seletor后缀（一般为ListView的selector或按钮的selector）

#### 12. 动画文件命名

动画类型_动画方向。

*   fade_in，淡入
*   fade_out，淡出
*   push_down_in，从下方推入
*   push_down_out，从下方推出
*   slide_in_from_top，从头部滑动进入
*   zoom_enter，变形进入
*   shrink_to_middle，中间缩小

> ## 注释规范

#### 1. 文件头注释

文件顶部统一添加版权声明，声明的格式如下：

```java
/**
 * Copyright (c) 2015. Keegan小钢 Inc. All rights reserved.
 */
```

#### 2. 类和接口注释

类和接口统一添加javadoc注释，格式如下：

```java
/**
 * 类或接口的描述信息
 *
 * @author ${USER}
 * @date ${DATE}
 */
```

#### 3. 方法注释

下面几种方法，都必须添加javadoc注释，说明该方法的用途和参数说明，以及返回值的说明。

*   接口中定义的所有方法
*   抽象类中自定义的抽象方法
*   抽象父类的自定义公用方法
*   工具类的公用方法
```java
/**
 * 登录
 *
 * @param loginName 登录名
 * @param password  密码
 * @param listener  回调监听器
 */
public void login(String loginName, String password, ActionCallbackListener<Void> listener);
```

#### 4. 变量和常量注释

下面几种情况下的常量和变量，都要添加注释说明，优先采用右侧//来注释，若注释说明太长则在上方添加注释。

*   接口中定义的所有常量
*   公有类的公有常量
*   枚举类定义的所有枚举常量
*   实体类的所有属性变量
```java
public static final int TYPE_CASH = 1; // 现金券
public static final int TYPE_DEBIT = 2; // 抵扣券
public static final int TYPE_DISCOUNT = 3; // 折扣券
private int id;                // 券id
private String name;           // 券名称
private String introduce;      // 券简介
```

>##书写规范

#### 1. 编码方式统一用UTF-8. Android Studio默认已是UTF-8，只要不去改动它就可以了。

![](http://keeganlee.me/android/_image/20150709/encodings.png)

#### 2. 缩进统一为4个空格，将Tab size设置为4则可以保证tab键按4个空格缩进。另外，不要勾选上Use tab character，可以保证切换到不同tab长度的环境时还能继续保持统一的4个空格的缩进样式。

![](http://keeganlee.me/android/_image/20150709/tab_size.png)

#### 3. 花括号不要单独一行，和它前面的代码同一行。而且，花括号与前面的代码之间用一个空格隔开。

```java
public void method() { // Good 

}

public void method()
{ // Bad
}

public void method(){ // Bad

}
```

#### 4. 空格的使用

```java
//if、else、for、switch、while等逻辑关键字与后面的语句留一个空格隔开。

// Good
if (booleanVariable) {
    // TODO while booleanVariable is true
} else {
    // TODO else
}

// Bad
if(booleanVariable) {
    // TODO while booleanVariable is true
}else {
    // TODO else
}
```

运算符两边各用一个空格隔开。

```java
int result = a + b; //Good, = 和 + 两边各用一个空格隔开
int result=a+b; //Bad,=和+两边没用空格隔开
```

方法的每个参数之间用一个空格隔开。

```java
public void method(String param1, String param2); // Good，param1后面的逗号与String之间隔了一个空格
method(param1, param2); // Good，方法调用时，param1后面的逗号与param2之间隔了一个空格
method(param1,param2); // Bad，没有用一个空格隔开

```
#### 5. 空行的使用

将逻辑相关的代码段用空行隔开，以提高可读性。空行也只空一行，不要空多行。在以下情况需用一个空行：

*   两个方法之间
*   方法内的两个逻辑段之间
*   方法内的局部变量和方法的第一条逻辑语句之间
*   常量和变量之间

#### 6. 当一个表达式无法容纳在一行内时，可换行显示，另起的新行用8个空格缩进。

```java
someMethod(longExpression1, longExpression2, longExpression3,
        longExpression4, longExpression5);
```

#### 7. 一行声明一个变量，不要一行声明多个变量，这样有利于写注释。

```java
private String param1; // 参数1
private String param2; // 参数2
```

#### 8. 行宽设置为100，设置格式化时自动断行到行宽位置。

![](http://keeganlee.me/android/_image/20150709/right_margin.jpeg)

![](http://keeganlee.me/android/_image/20150709/line_breaks.jpeg)

#### 9. 使用快捷键进行代码自动格式化。

Windows：CTRL+ALT+L
Mac：OPTION+COMMAND+L

#### 10. 一个方法最多不要超过40行代码。

#### 11. 范围型的常量用枚举类定义，而不要直接用整型或字符，这样可以减少范围值的有效性检查。

```java
// 用枚举类定义，Good
public enum CouponType {
    // 现金券
    @SerializedName("1")
    CASH,

    // 抵用券
    @SerializedName("2")
    DEBIT,

    // 折扣券
    @SerializedName("3")
    DISCOUNT
}

// 用整型定义，Bad
public static final int TYPE_CASH = 1; // 现金券
public static final int TYPE_DEBIT = 2; // 抵扣券
public static final int TYPE_DISCOUNT = 3; // 折扣券
```

#### 12. 文字大小的单位统一用sp，元素大小的单位统一用dp。

#### 13. 应用中的字符串统一在strings.xml中定义，然后在代码和布局文件中引用。

#### 14. 颜色值统一在colors.xml中定义，然后在代码和布局文件中引用。另外，不要在代码和布局文件中引用系统的颜色，除了透明。

> ## 结束语
这份开发规范说明比较细，也许还不是非常完整，但里面提到的每一条规范都很有用。按照此规范严格执行，将大大提高代码的可读性和维护性。