# Android-Universal-Recycler-View-Adapter

Bored of creating Adapter for each recycler view?

here is a solution, create any type of recycler view using this Adapter

# Single adapter for your all types of recycler view adapter requirements


# Features
1. Add Custom Loading for multiple cell like shimmer
2. Show Load more progress at the end of the listing 
3. Bind to any item using Data Binding
4. Listen to item events using listener, like click, long press, etc.
5. Built in Diff Utils for smooth scrolling and animations.
6. Custom Layout for No Data Found (when list is empty and status is success)
7. Custom binding with any of the layout
8. added concat adapter for joining multiple adapters


Status|	List Size|	Result Behaviour
---|---|---
LOADING	|0	|Show Loading Cells (default 5 items)
SUCCESS	|0	|No Record Found Layout will be displayed
ERROR	|0|	Error Layout Shown
LOADING	|more than 0|	Data Cells + load more at end
SUCCESS	|more than 0|	Data Cells
ERROR	|more than 0|	Data Cells + error cell at end


# Parameters
```kotlin
    @LayoutRes val resource: Int,
    @LayoutRes val resourceLoading: Int? = null,
    val defaultLoadingItems: Int = 5,
    @LayoutRes val loaderFooter: Int? = null,
    private var data: Resource<ArrayList<T>?>?= null,
    @LayoutRes val errorLayout: Int? = null,
    private var errorListener: Any? = null,
    private var mListener: Any? = null,
    @LayoutRes val noDataLayout: Int? = null,
    private var noDataListener: Any? = null
  ```

<a href='https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/app-debug_1_0_0.apk'>Download Sample App</a>


# Setup

#### Step #1. Add the JitPack repository to your build file:
```gradle
allprojects {
    repositories {
	...
    	maven { url "https://jitpack.io" }
    }
}
```
     
#### Step #2. Add the dependency ([See latest release](https://jitpack.io/#yogeshpaliyal/Android-Universal-Recycler-View-Adapter)). 
[![](https://jitpack.io/v/yogeshpaliyal/Android-Universal-Recycler-View-Adapter.svg)](https://jitpack.io/#yogeshpaliyal/Android-Universal-Recycler-View-Adapter)

```groovy
dependencies {
    implementation 'com.github.yogeshpaliyal:Android-Universal-Recycler-View-Adapter:+'
}
```


<h1>Samples</h1>

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/Screenshot_20201019-224331.jpg" width="30%">

<hr/>

<h3>Simple List</h3>

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/Screenshot_20201019-224335.jpg" width="30%">

<h3>Multi Select List</h3>

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/Screenshot_20201019-224344.jpg" width="30%">

<h3>Normal Users list</h3>

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/Screenshot_20201019-224339.jpg" width="30%">


<h3>Users list progress</h3>
show progress when data is fetching then show the users list

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/user-list-progress.gif" width="30%">

<h3>Shimmer list progress</h3>
show shimmer when data is fetching then show the users list

<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/user-list-shimmer.gif" width="30%">

<h3>Shimmer list with load more progress</h3>
show shimmer when data is fetching for first page and load more data when scroll to bottom


<img src="https://github.com/yogeshpaliyal/Android-Universal-Recycler-View-MVVM-DataBinding/blob/master/images/user-list-pagination.gif" width="30%">



<h3> <a href="https://gist.github.com/yogeshpaliyal/dcb381941b9f0dec2cb366c85f8ce15b">Initilize Universal Adapter </a> </h3>


**Create your sample and share with me**

**Happy Coding 😁**


