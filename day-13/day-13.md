
# 请说出“同步”与“异步”的区别。
同步： 可能是阻塞的，也可能是非阻塞的。
异步： 一定是非阻塞的，调用方法的时候，不用等待方法任务结束，直接返回，后期通过回调函数通知

# 请说出，阻塞和非阻塞的区别
阻塞：调用方法时，等待方法任务结束才返回。
非阻塞，调用方法时，不用等待方法任务结束，直接返回，后期通过其他方式用于判断任务是否结束。

# 请说出Buffer的clear()方法的作用。
用于清空 缓冲数组中的数据

# 请说出Buffer的flip()方法的作用。
读写模式进行切换，由position指针由原先的指向最后的指针，指向头部。进行读写模式的切换。

# 请说出Buffer的allocate()与allocateDirect()方法的区别。
allocate 在堆中申请空间
allocateDirect 在系统内存中直接申请空间。

# 